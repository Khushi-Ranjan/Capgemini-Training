package com.capgemini;

import com.capgemini.dao.StudentDAO;
import com.capgemini.dao.StudentDAOImpl;
import com.capgemini.entity.Student;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAOImpl();

        Student s = new Student();
        s.setName("Kartik");
        s.setDept("CSE");
        s.setAge(20);
        s.setMarks(89);

        dao.save(s);

        List<Student> list = dao.fetchAll();

        for (Student st : list) {
            System.out.println(st.getName() + " - " + st.getMarks());
        }
    }
}