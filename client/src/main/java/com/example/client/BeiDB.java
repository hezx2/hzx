package com.example.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


//@Configuration
@Component
//@ConfigurationProperties(prefix = "spring.datasource.grdm")
public class BeiDB extends BaseDB{

}

