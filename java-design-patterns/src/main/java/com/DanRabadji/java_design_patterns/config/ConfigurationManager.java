package com.DanRabadji.java_design_patterns.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationManager {

    private static ConfigurationManager instance;

    private ConfigurationManager() {
        // Private constructor to prevent instantiation
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Configuration methods go here
}
