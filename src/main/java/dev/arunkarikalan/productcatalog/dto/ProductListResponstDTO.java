package dev.arunkarikalan.productcatalog.dto;

import dev.arunkarikalan.productcatalog.models.Product;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProductListResponstDTO {
    public  List<Product> output;
}
