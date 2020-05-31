package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import kong.unirest.*;
import kong.unirest.json.JSONObject;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ClientApplication.class, args);
		HttpResponse<JsonNode> response = Unirest
				.get("http://api.openweathermap.org/data/2.5/weather?q=Wroclaw&units=metric&appid=9617766188fcb960192d486a798ad3f7")
				.asJson();
		JSONObject data = response.getBody().getObject();
		String temp = data.getJSONObject("main").getString("temp");
		System.out.print("The temperature in the city of Wrocław is: "+ temp+" Celsius At the moment\n");
		
	}

}
