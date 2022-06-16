package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class HelloApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloApplication.class, args);
		System.setProperty("javax.net.ssl.trustStore",
				"C:\\WSO2\\IdentityServer\\5.11.0\\repository\\resources\\security\\client-truststore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "wso2carbon");

	}

}
