package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class CartService {

    private List<Product> myProducts;
    private ProductRepo productRepo;
private  ProductService productService;

//@Autowired
//public CartService(List<Product> myProducts,ProductRepo productRepo) {
//        this.myProducts = myProducts;
//        this.productRepo=productRepo;
//    }
@Autowired
public CartService(List<Product> myProducts,ProductService productService) {
    this.myProducts = myProducts;
    this.productService=productService;
}

    public void addProductById  (ProductService service,int id){
        for (Product p:service.getProducts()) {
           if (p.getId()==id)
                 myProducts.add(p);
        }
    }
    public void delete  (ProductService service,int id){
        for (Product p:service.getProducts()) {
            if (p.getId()==id)
                myProducts.remove(p);
        }
    }
    public List<Product> getProducts() {
        return myProducts;
    }
    public void getTotalPrice(){
        double sum=0;
        for (Product p:myProducts) {
            sum+=p.getPrice();
        }
        System.out.println("Total price=" +sum);
    }
    @Override
    public String toString() {
        return "CartService{" +
                "myProducts=" + myProducts +
                '}';
    }
}
