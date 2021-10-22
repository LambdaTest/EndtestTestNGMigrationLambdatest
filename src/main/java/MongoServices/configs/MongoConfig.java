package com.pack.configs;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created By: Ankit Agarwal
 **/

@Configuration
@EnableMongoRepositories(basePackages = "com.pack.repository", mongoTemplateRef = "mongoDbReference")
public class MongoConfig {

    @Value("${spring.data.mongodb.host}")
    private String host;

    @Value("${spring.data.mongodb.port}")
    private String port;

    @Value("${spring.data.mongodb.database}")
    private String database;

    @Value("${spring.data.mongodb.username}")
    private String username;

    @Value("${spring.data.mongodb.password}")
    private String password;


    @Bean
    public MongoClient getMongoClient(){
        ServerAddress serverAddress = new ServerAddress(host,Integer.parseInt(port));
        MongoCredential credential = MongoCredential.createCredential(username,database,password.toCharArray());
        MongoClientOptions options = new MongoClientOptions.Builder().build();

        MongoClient mongoClient = new MongoClient(serverAddress,credential,options);
        return mongoClient;
    }

    @Bean
    public MongoDbFactory getMongoDbFactory(){
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(getMongoClient(),database);
        return mongoDbFactory;
    }

    @Bean(name = "mongoDbReference")
    public MongoTemplate getMongoTemplate(){
        MongoTemplate mongoTemplate = new MongoTemplate(getMongoDbFactory());
        return mongoTemplate;
    }}
