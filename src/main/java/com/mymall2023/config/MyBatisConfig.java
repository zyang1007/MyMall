package com.mymall2023.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.mymall2023.mbg.mapper")
public class MyBatisConfig {
    // Additional MyBatis configurations can be added here if needed
}
