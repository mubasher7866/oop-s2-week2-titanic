package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/titanicmanifest" , "root", "123Sanamre321");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from passengers");


        System.out.println("Before while");
        while ( rs.next())
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        con.close();

        }catch (Exception e) {
            System.out.println(e.toString());

        }finally {
            System.out.println("finally");
        }
    }
}
