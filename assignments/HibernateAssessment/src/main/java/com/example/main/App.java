package com.example.main;

import com.example.dao.CustomerDAO;
import com.example.daoimpl.CustomerDAOImpl;
import com.example.entity.Customer;
import com.example.entity.Order;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        CustomerDAO dao = new CustomerDAOImpl();

        Customer c = new Customer();
        c.setCustomerName("John");
        c.setEmail("john@gmail.com");
        c.setGender("Male");
        c.setPhone(9876543210L);
        c.setRegistrationDate(LocalDate.now());

        Order o = new Order();
        o.setOrderNumber("ORD101");
        o.setProductName("Laptop");
        o.setQuantity(1);
        o.setPrice(75000);
        o.setOrderDate(LocalDate.now());

        c.setOrder(o);

        System.out.println(dao.saveCustomer(c));
    }
}