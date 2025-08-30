package com.infuq;

import com.alibaba.druid.pool.DruidConnectionHolder;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.SQLException;

public class DruidExample {


    public static void main(String[] args) throws Exception {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://rm-bp1349lz8ic76gru50o.mysql.rds.aliyuncs.com:3306/wisp_test?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai&allowMultiQueries=true");
        dataSource.setUsername("bd_test_user");
        dataSource.setPassword("nhpG4N5VA3Sz");
        dataSource.setInitialSize(3);
        dataSource.setMaxActive(16);

        // 手动初始化连接池
        dataSource.init();

        DruidConnectionHolder[] connections = dataSource.connections;

        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println("线程[" + Thread.currentThread().getName() + "]从连接池获取一个连接(@" + Integer.toHexString(connection.getConnectionHolder().getConnection().hashCode()) + ")");


        int read = System.in.read();


    }


}
