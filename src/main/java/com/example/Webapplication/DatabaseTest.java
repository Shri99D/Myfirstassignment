//package com.example.Webapplication;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//
//public class DatabaseTest {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public void testConnection() {
//        String query = "SELECT 1";
//        Integer result = jdbcTemplate.queryForObject(query, Integer.class);
//        System.out.println("Connection test result: " + result);
//    }
//}
