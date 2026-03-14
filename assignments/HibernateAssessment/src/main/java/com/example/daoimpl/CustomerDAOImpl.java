package com.example.daoimpl;

import com.example.dao.CustomerDAO;
import com.example.entity.Customer;
import jakarta.persistence.*;

import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
    EntityManager em = emf.createEntityManager();

    public String saveCustomer(Customer customer) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(customer);

        tx.commit();

        return "Customer Saved";
    }

    public String updateCustomer(Customer customer) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.merge(customer);

        tx.commit();

        return "Customer Updated";
    }

    public String deleteCustomerById(int id) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Customer c = em.find(Customer.class, id);

        if(c != null){
            em.remove(c);
        }

        tx.commit();

        return "Customer Deleted";
    }

    public Customer getCustomerById(int id) {

        return em.find(Customer.class, id);
    }

    public List<Customer> getAllCustomers() {

        return em.createQuery("FROM Customer", Customer.class)
                .getResultList();
    }

    public Customer getCustomerByEmail(String email) {

        return em.createQuery(
                        "SELECT c FROM Customer c WHERE c.email = :email",
                        Customer.class)
                .setParameter("email", email)
                .getSingleResult();
    }
}