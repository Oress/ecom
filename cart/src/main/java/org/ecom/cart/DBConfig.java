package org.ecom.cart;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {
    @Value("products.h2.cStr")
    private String h2cStr;

/*    @Bean
    public DataSource dataSource() {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL(h2cStr);
        ds.setUser("sa");
        ds.setPassword("sa");
        return ds;
    }*/
}
