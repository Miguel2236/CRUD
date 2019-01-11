
package com.model;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Miguel
 */
public class Conectar {
    public DriverManagerDataSource conectar()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/test");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
}
