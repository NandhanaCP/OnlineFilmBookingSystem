package com.demo.mvc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@SpringBootApplication
@EnableCaching
public class OnlineFilmmBookingSystemApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(OnlineFilmmBookingSystemApplication.class, args);
	}
}
