package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        Configuration configuration = new Configuration()
                .configure()
                .addAnnotatedClass(Player.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // ---------------- INSERT ----------------
        Transaction transaction = session.beginTransaction();

        Player pr = new Player();
        pr.setId(1);
        pr.setName("Aman");

        session.persist(pr);

        transaction.commit();
        System.out.println("Inserted successfully!");

        // ---------------- UPDATE ----------------
        Transaction tx2 = session.beginTransaction();

        Player playerToUpdate = session.get(Player.class, 1);
        if (playerToUpdate != null) {
            playerToUpdate.setName("Aman Updated");
            session.merge(playerToUpdate);
        }

        tx2.commit();
        System.out.println("Updated successfully!");

        // ---------------- DELETE ----------------
        Transaction tx3 = session.beginTransaction();

        Player playerToDelete = session.get(Player.class, 1);
        if (playerToDelete != null) {
            session.remove(playerToDelete);
        }

        tx3.commit();
        System.out.println("Deleted successfully!");

        session.close();
        sessionFactory.close();
    }
}