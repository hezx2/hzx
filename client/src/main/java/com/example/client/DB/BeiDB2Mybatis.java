package com.example.client.DB;



import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean;
import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;

import com.example.client.BeiDB;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.sql.SQLException;


/**配置bei数据源
 * Created by hmily on 2017/8/29.
 */
//@Configuration
//@MapperScan(basePackages = "com.example.client.DB" ,sqlSessionTemplateRef = "beiSqlSessionTemplate")
public class BeiDB2Mybatis {
//
//    @Primary
//    @Bean(name = "beiDataSource")
//    public DataSource devDataSource(BeiDB dbConfig) throws SQLException {
//        AtomikosNonXADataSourceBean nonXADataSourceBean = new AtomikosNonXADataSourceBean();
//        nonXADataSourceBean.setUrl(dbConfig.getUrl());
//        nonXADataSourceBean.setDriverClassName(dbConfig.getDriverClass());
//        nonXADataSourceBean.setUser(dbConfig.getUsername());
//        nonXADataSourceBean.setPassword(dbConfig.getPassword());
//        nonXADataSourceBean.setUniqueResourceName("grdm");
//        return nonXADataSourceBean;
//    }
//
//    @Bean(name = "beiSqlSessionFactory")
//    public SqlSessionFactory devSqlSessionFactory(@Qualifier("beiDataSource") DataSource dataSource, @Qualifier("beiGlobalConfiguration") GlobalConfiguration globalConfiguration, BeiDB dbConfig ) throws Exception {
//        MybatisSqlSessionFactoryBean factoryBean = new MybatisSqlSessionFactoryBean();
//        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//        paginationInterceptor.setDialectType(dbConfig.getDialectType());
//        factoryBean.setPlugins(new Interceptor[]{paginationInterceptor});
//        factoryBean.setGlobalConfig(globalConfiguration);
//        factoryBean.setDataSource(dataSource);
//        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/rcsit/qyd/dao/bei/xml/*.xml"));
//        return factoryBean.getObject();
//    }
//
//
//    @Bean(name = "beiGlobalConfiguration")
//    public GlobalConfiguration devGlobalConfiguration(BeiDB dbConfig ){
//        GlobalConfiguration globalConfiguration =  new GlobalConfiguration();
//        globalConfiguration.setDbType(dbConfig.getDbType());
//        globalConfiguration.setIdType(dbConfig.getIdType());
//
//        return globalConfiguration;
//    }
//
//    @Bean(name = "beiSqlSessionTemplate")
//    public SqlSessionTemplate devSqlSessionTemplate(@Qualifier("beiSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
}