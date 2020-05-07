package com.ilyasidorov.libmanager.config;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.ilyasidorov.libmanager.controller",
                                "com.ilyasidorov.libmanager.service",
                                "com.ilyasidorov.libmanager.dao" })
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public JdbcTemplate getJdbcTemplate() {

        return new JdbcTemplate(getDataSource());
    }

    //JDBC config: MySQL
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/librarydb?useUnicode=true&serverTimezone=UTC&useSSL=false");
        dataSource.setUsername("librarian");
        dataSource.setPassword("librarian");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        return dataSource;
    }

    //Template engine config: Freemarker
    @Bean
    public ViewResolver getViewResolver() {
        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
        freeMarkerViewResolver.setOrder(1);
        freeMarkerViewResolver.setSuffix(".ftl");
        freeMarkerViewResolver.setPrefix("");
        return freeMarkerViewResolver;
    }

    @Bean
    public FreeMarkerConfigurer getFreeMarkerConfigurer() {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPaths("/", "/WEB-INF/views/");
        return freeMarkerConfigurer;
    }

    //Logging config
    @Bean
    @Scope("prototype")
    public Logger logger(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass());
    }

}
