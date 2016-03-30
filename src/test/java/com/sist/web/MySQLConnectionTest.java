package com.sist.web;


import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by sist on 2016-03-30.
 */
public class MySQLConnectionTest {

    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://127.0.0.1:3306/book_ex";
    private static final String USER="scott";
    private static final String PW="tiger";

    @Test
    public void testConnection() throws Exception{
        Class.forName(DRIVER);

        try(Connection connection= DriverManager.getConnection(URL,USER,PW)){
            System.out.println(connection);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}


































