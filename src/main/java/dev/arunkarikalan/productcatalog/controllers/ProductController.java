package dev.arunkarikalan.productcatalog.controllers;

import dev.arunkarikalan.productcatalog.dto.ProductListResponstDTO;
import dev.arunkarikalan.productcatalog.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ProductListResponstDTO getProducts() {
        return new ProductListResponstDTO(List.of());
    }
}
