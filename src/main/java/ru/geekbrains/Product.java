package ru.geekbrains;

import java.math.BigDecimal;

public class Product {
    private int Id;
    private String Name;
    private Double Price;


    public Product() {
    }

    public Product(int Id, String Name, Double Price) {
        this.Id = Id;
        this.Name =Name;
        this.Price = Price;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    public void setPrice(Double price) {
        Price = price;
    }
    public Double getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                '}'+'\n';
    }
}
