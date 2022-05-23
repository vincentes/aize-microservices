package com.bermudez.services.product;

import com.bermudez.services.product.repository.ProductRepository;
import com.bermudez.services.product.model.Product;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info =
	@Info(title = "Product API", version = "1.0", description = "Documentation Product API v1.0")
)
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	
	@Bean
	ProductRepository repository() {
		ProductRepository repository = new ProductRepository();
		repository.add(new Product("Product A", "Desc A", 30.0));
		repository.add(new Product("Product B", "Desc B", 20.0));
		repository.add(new Product("Product C", "Desc C", 24.0));
		repository.add(new Product("Product D", "Desc D", 12.5));
		return repository;
	}
	
}
