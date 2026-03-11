package com.capgemini.repository;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBUtil {

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/companytest",
            "postgres",
            "root"
            );
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
