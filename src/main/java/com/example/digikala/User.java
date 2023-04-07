package com.example.digikala;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;
    private String ID;
    private ArrayList<Pair<Product,Integer>>cart = new ArrayList<>();
    private ArrayList<Pair<Product,Integer>>orders=new ArrayList<>();
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void addToCart(Product product, int num){
        if(num>product.getQuantity()){
            //*print "We don't have that number of this product.";
            return;
        }
        cart.add(new Pair<>(product,num));
        //*print "Product added successfully.";
    }
    public void viewCart() {
        if(cart.isEmpty()){
            //*print "Is empty."
            return;
        }
        for(Pair<Product,Integer> cur: cart){
            DigikalaService.ToString(cur.getKey(),cur.getValue());
        }
    }
    public void viewOrders() {
        if(orders.isEmpty()){
            //*print "Is empty."
            return;
        }
        for(Pair<Product,Integer> cur: orders){
            DigikalaService.ToString(cur.getKey(),cur.getValue());
        }
    }
}
class Admin extends User{

}
class Seller extends User{

}