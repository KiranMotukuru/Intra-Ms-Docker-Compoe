package com.tcs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final ProductClient productClient;

    public UserController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping("/{userId}/product/{productId}")
    public String getUserProduct(@PathVariable String userId, @PathVariable String productId) {
        String product = productClient.getProductById(productId);
        return "User " + userId + " requested: " + product;
    }
}
