package com.meetingrooms.booking.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;


@Configuration
@EnableMongoRepositories(basePackages = "com.meetingrooms.booking.repository")
public class MongoConfig {
	
	private Logger log = LoggerFactory.getLogger(MongoConfig.class);
	

	@Value("${spring.data.mongodb.uri}")
	private String mongoUri;
	

    @Bean
    public MongoClient mongo() {
    	log.info("Uri for mongoDb: {} ", mongoUri);
		return new MongoClient(new MongoClientURI(mongoUri));
    }
 	

}
