package com.demoApplication.Product_Management.controller;

import com.demoApplication.Product_Management.model.Product;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private List<Product> products = new ArrayList<>();

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        products.add(product);
        return product;
    }

    @GetMapping
    public List<Product> product() {
        return products;
    }

    @GetMapping("/id/{id}")
    public Product getProductById(@PathVariable int id){
        return products.get(id);
    }

    @GetMapping("/name/{name}")
        public Product getProductByName(@PathVariable String name){
            for(Product product: products){
                if(product.getName().equalsIgnoreCase(name)){
                    return product;
                }
            }
            return null;

    }

    @GetMapping("/price/{price}")
    public Product getProductByPrice(@PathVariable int price){
        for (Product product : products){
            if(product.getPrice() == price){
                return product;
            }
        }
        return null;
    }
    @GetMapping("/category/{category}")
    public Product getProductByCategory(@PathVariable String category){
        for (Product product : products){
            if(product.getCategory().equalsIgnoreCase(category)){
                return product;
            }
        }
        return null;
    }

    @PutMapping("/id/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product updateProduct){
    for(Product product : products){
        if(product.getId() == id){
            product.setName(updateProduct.getName());
            product.setBrand(updateProduct.getBrand());
            product.setPrice(updateProduct.getPrice());
            product.setCategory(updateProduct.getCategory());
            return product;
        }
    }
    return null;
    }

    @DeleteMapping("/id/{id}")
    public Product deleteProduct(@PathVariable int id){
        return products.remove(id);
    }


}
