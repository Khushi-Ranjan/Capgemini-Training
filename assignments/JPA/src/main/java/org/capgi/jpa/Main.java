package org.capgi.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("student-unit");

        EntityManager em = emf.createEntityManager();

        // INSERT MULTIPLE
        em.getTransaction().begin();

        Student s1 = new Student("Kartik", 22, "CSE", 89.0);
        Student s2 = new Student("Aman", 21, "IT", 75.5);
        Student s3 = new Student("Riya", 23, "ECE", 91.2);

        em.persist(s1);
        em.persist(s2);
        em.persist(s3);

        em.getTransaction().commit();
        System.out.println("Multiple Students Inserted!");

        // FETCH ALL
        List<Student> students =
                em.createQuery("from Student", Student.class).getResultList();

        System.out.println("\nAll Students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // FETCH BY ID
        Student student = em.find(Student.class, 1);
        System.out.println("\nFetch By ID (1): " + student);

        // UPDATE
        em.getTransaction().begin();

        Student updateStudent = em.find(Student.class, 1);
        if (updateStudent != null) {
            updateStudent.setMarks(95.0);
            updateStudent.setDept("AI");
        }

        em.getTransaction().commit();
        System.out.println("\nStudent Updated!");

        // DELETE
        em.getTransaction().begin();

        Student deleteStudent = em.find(Student.class, 2);
        if (deleteStudent != null) {
            em.remove(deleteStudent);
        }

        em.getTransaction().commit();
        System.out.println("\nStudent Deleted!");

        // FETCH AGAIN
        List<Student> updatedList =
                em.createQuery("from Student", Student.class).getResultList();

        System.out.println("\nFinal Student List:");
        for (Student s : updatedList) {
            System.out.println(s);
        }

        em.close();
        emf.close();
    }
}