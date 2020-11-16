package ru.geekbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext( AppConfig. class );
        ProductService productService = context.getBean("productService",ProductService.class);
        System.out.println(productService.getProducts());
        productService.getProducts().toString();

        CartService cartService = context.getBean("cartService",CartService.class);
            cartService.addProductById(productService,1);
            cartService.addProductById(productService,2);
            cartService.addProductById(productService,3);

        System.out.println(cartService.getProducts());
        cartService.getTotalPrice();

        CartService cartService2 = context.getBean("cartService",CartService.class);
            cartService2.addProductById(productService,3);
            System.out.println(cartService2.getProducts());
            cartService2.getTotalPrice();

        cartService.delete(productService,2);
        System.out.println(cartService.getProducts());





    }
}
