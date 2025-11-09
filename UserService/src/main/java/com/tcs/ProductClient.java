package com.tcs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8081/products")
public interface ProductClient {
    @GetMapping("/{id}")
    String getProductById(@PathVariable("id") String id);
}
