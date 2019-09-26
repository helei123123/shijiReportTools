package com.shiji.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.shiji.mapper.outlet", sqlSessionTemplateRef = "outletSqlSessionTemplate")
public class DataSource1Config {

	@Bean(name = "outletDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.outlet")
	@Primary
	public DataSource outletDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "outletSqlSessionFactory")
	@Primary
	public SqlSessionFactory outletSqlSessionFactory(@Qualifier("outletDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		//添加XML目录
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		try {
			bean.setMapperLocations(resolver.getResources("classpath*:mapper/outlet/*.xml"));
			return bean.getObject();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	@Bean(name = "outletTransactionManager")
	@Primary
	public DataSourceTransactionManager outletTransactionManager(@Qualifier("outletDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "outletSqlSessionTemplate")
	@Primary
	public SqlSessionTemplate outletSqlSessionTemplate(@Qualifier("outletSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}