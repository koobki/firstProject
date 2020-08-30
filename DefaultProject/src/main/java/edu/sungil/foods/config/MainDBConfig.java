package edu.sungil.foods.config;

import com.zaxxer.hikari.HikariConfig; 
import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException; 
import java.lang.annotation.Documented; 
import java.lang.annotation.ElementType; 
import java.lang.annotation.Retention; 
import java.lang.annotation.RetentionPolicy; 
import java.lang.annotation.Target; 
import java.util.Properties; 
import javax.persistence.EntityManagerFactory; 
import javax.sql.DataSource; 
import org.apache.ibatis.session.SqlSessionFactory; 
import org.mybatis.spring.SqlSessionFactoryBean; 
import org.mybatis.spring.annotation.MapperScan; 
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.beans.factory.annotation.Value; 
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties; 
import org.springframework.boot.context.properties.ConfigurationProperties; 
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder; 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource; 
import org.springframework.core.io.support.PathMatchingResourcePatternResolver; 
import org.springframework.data.jpa.repository.config.EnableJpaRepositories; 
import org.springframework.orm.jpa.JpaTransactionManager; 
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean; 
import org.springframework.transaction.PlatformTransactionManager;

@Slf4j
@Configuration
@PropertySource("classpath:/application.properties")
public class MainDBConfig {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}

	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new HikariDataSource(hikariConfig());
		logger.info("datasource : {}", dataSource);
		return dataSource;
	}
}