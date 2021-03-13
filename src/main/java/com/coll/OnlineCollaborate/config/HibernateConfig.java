package com.coll.OnlineCollaborate.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScans(value= {@ComponentScan("com.coll.OnlineCollaborate"),
		                @ComponentScan("model"),
		                @ComponentScan("controller"),
                        @ComponentScan("dao"),
                        @ComponentScan("daoImpl"),
                        @ComponentScan("config"),
                        @ComponentScan("service"),
                        @ComponentScan("serviceImpl")} )

@EnableAutoConfiguration(exclude = {HibernateJpaAutoConfiguration.class})
@EnableTransactionManagement
public class HibernateConfig {
	
	public static final String DATABASE_URL="jdbc:mysql://localhost:3306/collaboration";
	public static final String DATABASE_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DATABASE_DIALECT="org.hibernate.dialect.MySQLDialect";
	public static final String DATABASE_USERNAME="root";
	public static final String DATABASE_PASSWORD="niit@123";
	
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);		
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setPackagesToScan("com.coll.OnlineCollaborate");
		Properties hibernate=new Properties();
		hibernate.put("hibernate.dialect",DATABASE_DIALECT);
		hibernate.put("hibernate.show_sql","true");
		hibernate.put("hibernate.hbm2ddl.auto","update");
		sessionFactory.setHibernateProperties(hibernate);
		return sessionFactory;
	
		
	}
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager txn=new HibernateTransactionManager();
		txn.setSessionFactory(getSessionFactory().getObject());
		return txn;
	}
	
@Bean
public InternalResourceViewResolver jspViewResolver() {
	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
	viewResolver.setPrefix("/views/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
}
	

}
