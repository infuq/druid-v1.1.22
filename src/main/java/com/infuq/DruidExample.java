package com.infuq;

import com.alibaba.druid.pool.DruidConnectionHolder;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.SQLException;

public class DruidExample {


    public static void main(String[] args) throws Exception {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test_0?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true");
        dataSource.setUsername("root");
        dataSource.setPassword("9527");
//        dataSource.setInitialSize(3);
        dataSource.setMaxActive(16);

        // 手动初始化连接池
        dataSource.init();

        DruidConnectionHolder[] connections = dataSource.connections;

        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println("线程[" + Thread.currentThread().getName() + "]从连接池获取一个连接(@" + Integer.toHexString(connection.getConnectionHolder().getConnection().hashCode()) + ")");


        int read = System.in.read();


    }


}
