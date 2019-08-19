package com.employeemgt.com.EmployeeMgt.Config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Value("${jdbc.driverClassName}")
    private String dataSourceDriverClassName;
    @Value("${app.datasource.url}")
    private String dataSourceUrl;
    @Value("${app.datasource.username}")
    private String dataSourceUserName;
    @Value("${app.datasource.password}")
    private String dataSourcePassword;


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(value = "mabiSqlDataSource")
    public DataSource datasource() throws Exception {
        DataSourceBuilder builder  = DataSourceBuilder.create();
        builder.driverClassName(dataSourceDriverClassName);
        builder.url(dataSourceUrl);
        builder.username(dataSourceUserName);
        builder.password(dataSourcePassword);
        return builder.build();
    }
}
