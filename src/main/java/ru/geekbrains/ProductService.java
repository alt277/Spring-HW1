package ru.geekbrains;//import Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private ProductRepo productRepo;

    public ProductService(){}
    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    @Override
    public String toString() {
        return "ProductService{" +
                "productRepo=" + productRepo +
                '}';
    }
}
