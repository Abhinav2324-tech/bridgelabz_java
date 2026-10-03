package com.bridgelabz.java_generics;
import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    String categoryName;
    ProductCategory(String categoryName){
        this.categoryName=categoryName;
    }
}
class BookCategory extends ProductCategory{
    BookCategory(){
        super("Books");
    }
}
class ClothingCategory extends ProductCategory{
    ClothingCategory(){
        super("Shirt");
    }
}
class GadgetCategory extends ProductCategory{
    GadgetCategory(){
        super("Mobile");
    }
}
class Product<T extends ProductCategory>{
    String name;
    double price;
    T category;
    Product(String name,double price,T category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
    public void display(){
        System.out.println(name+", "+category.categoryName+", "+price+" Rs");
    }
}
class ProductCatalog{
    public static<T extends Product<?>> void applyDiscount(T product,double percentage){
        product.price=product.price-(product.price*percentage/100);
    }

    public static void main(String[] args) {
        Product<BookCategory>book=new Product<>("Java",1000, new BookCategory());
        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1500, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 30000, new GadgetCategory());

        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        applyDiscount(phone, 5);

        List<Product<?>> catalog = new ArrayList<>();

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        for (Product<?> product : catalog) {
            product.display();
        }
    }
}