package com.bermudez.services.cart.client;

import com.bermudez.services.cart.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "product-service")
public interface ProductClient {
    @GetMapping("/")
    List<Product> fetchAll();
    @GetMapping("/{id}")
    Product getById(@RequestParam Long id);
}
