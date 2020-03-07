package com.cy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcDemo1 {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy", "root", "root");
        PreparedStatement pstm = conn.prepareStatement("select * from account");
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        rs.close();
        pstm.close();
        rs.close();

    }

}
