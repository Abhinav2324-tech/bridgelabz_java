package com.bridgelabz.java_generics;
import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name){
        this.name=name;
    }
    public void display(){
        System.out.println(name);
    }
}
class Electronics extends WarehouseItem{
    Electronics(String name){
        super(name);
    }
}
class Groceries extends WarehouseItem{
    Groceries(String name){
        super(name);
    }
}
class Furniture extends WarehouseItem{
    Furniture(String name){
        super(name);
    }
}
class Storage<T extends WarehouseItem>{
    private List<T> list=new ArrayList<>();
    public void setList(T item){
        list.add(item);
    }
    public List<T> getList(){
        return list;
    }
}
 class SmartWarehouse{
    public static void displayItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item : items){
            item.display();
        }
    }

    public static void main(String[] args) {
        Storage<Electronics>electronicsStorage=new Storage<>();
        electronicsStorage.setList(new Electronics("Laptop"));
        electronicsStorage.setList(new Electronics("Mobile"));

        Storage<Groceries>groceriesStorage=new Storage<>();
        groceriesStorage.setList(new Groceries("Rice"));
        groceriesStorage.setList(new Groceries("Wheat"));

        Storage<Furniture>furnitureStorage=new Storage<>();
        furnitureStorage.setList(new Furniture("Table"));
        furnitureStorage.setList(new Furniture("Bed"));

        displayItems(electronicsStorage.getList());
        displayItems(groceriesStorage.getList());
        displayItems(furnitureStorage.getList());
    }
}
