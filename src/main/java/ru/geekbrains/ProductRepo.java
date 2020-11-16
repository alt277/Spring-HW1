package ru.geekbrains;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;


@Component
public class ProductRepo {
    private List <Product> productList = new ArrayList<Product>();

    public ProductRepo(){
        productList.add(new Product(1,"Iphone_11",50000.00));
        productList.add(new Product(2,"Galaxy_Fold",160000.00));
        productList.add(new Product(3,"Iphone_12",90000.00));
        productList.add(new Product(4,"Galaxy_S20",67000.00));
        productList.add(new Product(5,"Xaoimi_M10",48000.00));
    }
    public List<Product> findAll(){
        return Collections.unmodifiableList(productList);
    }
    public void addProduct(Product product){
      productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productList=" + productList +
                '}';
    }
}
