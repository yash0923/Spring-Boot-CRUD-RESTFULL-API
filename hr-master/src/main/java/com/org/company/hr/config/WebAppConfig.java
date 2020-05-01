package com.org.company.hr.config;
/**
 * Created in Eclipse IDE.
 * Project : hr-master
 * User: yash
 * Date: 18/01/2020
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


@Configuration
public class WebAppConfig
{
    @Value("${spring.datasource.url}")
    private String datasourceUrl;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.profiles.active}")
    private String env;
    @Value("${property.file.loaded}")
    private String propertyFileLoaded;

    private static Logger LOGGER = LoggerFactory.getLogger(WebAppConfig.class);
    @PostConstruct
    public void init()
    {
        LOGGER.info("Starting Application with env: {}",env);
        LOGGER.info("DataSource: {}",datasourceUrl);
        LOGGER.info("Username: {}",username);
        LOGGER.info("Password: {}",password);
        LOGGER.info("Property File Loaded: {}", propertyFileLoaded);
    }
}
