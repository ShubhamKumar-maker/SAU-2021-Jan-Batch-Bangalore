package employeeSpringMVC.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
	    "employeeSpringMVC"
	})
public class WebMvcConfig implements WebMvcConfigurer{
	
	 @Bean
	    public InternalResourceViewResolver resolver() {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setViewClass(JstlView.class);
	        resolver.setPrefix("/WEB-INF/views/");
	        resolver.setSuffix(".jsp");
	        return resolver;
	    }
	 
	 @Bean
	 JdbcTemplate jdbcTemplate()
	 {
		 JdbcTemplate jdbctemplate=new JdbcTemplate(dataSource());
		 return jdbctemplate;
		 
	 }
	
	 
	DataSource dataSource()
	{
		DriverManagerDataSource drivermgr=new DriverManagerDataSource();
		drivermgr.setUsername("root");
		drivermgr.setPassword("root123456789");
		drivermgr.setUrl("jdbc:mysql://127.0.0.1:3306/auassignment");
		drivermgr.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return drivermgr;
	}
}
