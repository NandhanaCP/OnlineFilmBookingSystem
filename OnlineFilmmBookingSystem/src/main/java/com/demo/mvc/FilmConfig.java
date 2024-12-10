package com.demo.mvc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.demo.mvc.filter.FilmFilter;
@Configuration
public class FilmConfig implements WebMvcConfigurer
{	
	@Bean
	public FilmFilter getFilter()
	{
		return new FilmFilter();
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor(getFilter()).addPathPatterns("/*");
	}
}