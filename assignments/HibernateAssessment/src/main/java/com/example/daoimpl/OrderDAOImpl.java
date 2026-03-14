package com.example.daoimpl;

import com.example.dao.OrderDAO;
import com.example.entity.Order;
import jakarta.persistence.*;

public class OrderDAOImpl implements OrderDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
    EntityManager em = emf.createEntityManager();

    public String saveOrder(Order order) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(order);

        tx.commit();

        return "Order Saved";
    }

    public String updateOrder(Order order) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.merge(order);

        tx.commit();

        return "Order Updated";
    }

    public String deleteOrderById(int id) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Order o = em.find(Order.class, id);

        if(o != null){
            em.remove(o);
        }

        tx.commit();

        return "Order Deleted";
    }

    public Order getOrderById(int id) {

        return em.find(Order.class, id);
    }
}