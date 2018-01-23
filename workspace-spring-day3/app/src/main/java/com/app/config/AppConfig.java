package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration // replacement of xml file, telling spring it is configuration file
@ComponentScan(basePackages={"com"})
@EnableWebMvc
@Import(HibernateConfiguration.class)
public class AppConfig extends WebMvcConfigurerAdapter{

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 // Don't forget the ending "/" for location or you will hit 404.
	    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	 
	}
    
	
    
}