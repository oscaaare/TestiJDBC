package fi.haagahelia.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.demo.domain.Customer;
import fi.haagahelia.demo.domain.CustomerDAO;

@SpringBootApplication
public class JDBCHarjoitus {
	private static final Logger log = LoggerFactory.getLogger(JDBCHarjoitus.class);

	public static void main(String[] args) {
		SpringApplication.run(JDBCHarjoitus.class, args);
	}
	   
	@Bean
	public CommandLineRunner demo(CustomerDAO studentDAO) {
		return (args) -> {
			// Database is created by using resources/schema.sql
			
			// Insert some demo data
	        studentDAO.save(new Customer("John", "West"));
	        studentDAO.save(new Customer("Mike", "Mars"));
	        studentDAO.save(new Customer("Kate", "Johnson"));
	       
		};
	}	
}
