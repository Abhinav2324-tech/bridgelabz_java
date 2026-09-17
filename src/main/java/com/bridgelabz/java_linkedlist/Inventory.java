package com.bridgelabz.java_linkedlist;

public class Inventory {
    static class Node{
        String itemName;
        int itemID;
        int quantity;
        double price;
        Node next;
        Node(String itemName, int itemID, int quantity, double price){
            this.itemName=itemName;
            this.itemID=itemID;
            this.quantity=quantity;
            this.price=price;
            this.next=null;
        }
    }
    Node head;
    public void addAtBeginning(String itemName, int itemID, int quantity, double price){
        Node newNode=new Node(itemName,itemID,quantity,price);
        newNode.next=newNode;
        head=newNode;
    }
    public void addAtEnd(String itemName, int itemID, int quantity, double price){
        Node newNode=new Node(itemName,itemID,quantity,price);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        if(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void addAtPosition(String itemName, int itemID, int quantity, double price,int position){
        Node newNode=new Node(itemName,itemID,quantity,price);
        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node current=head;
        for(int i=1;i<position-1;i++){
            if(current==null){
                System.out.println("Invalid Position");
                return;
            }
            current=current.next;
        }
        if(current==null){
            System.out.println("Invalid Position");
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    public void deleteItem(int itemId){
        if(head==null){
            System.out.println("Item not found");
            return;
        }
        if(head.itemID==itemId){
            head=head.next;
            System.out.println("Item deleted successfully");
        }
        Node current=head;
        while(current.next!=null&&current.next.itemID!=itemId){
            current=current.next;
        }
        if(current.next==null){
            System.out.println("Item not found");
        }
        current.next=current.next.next;
        System.out.println("Student deleted successfully");
    }
    public void updateItem(int itemId, int newQuantity){
        Node current=head;
        while(current!=null){
            if(current.itemID==itemId){
                current.quantity=newQuantity;
                System.out.println("Item update successfully");
                return;
            }
            current=current.next;
        }
        System.out.println("Item not found");
    }
    public void searchItem(int itemId){
        Node current=head;
        while(current!=null){
            if(current.itemID==itemId){
                displayItem(current);
                return;
            }
            current=current.next;
        }
        System.out.println("Item not found");
    }
    public double calculateTotal(){
        Node current=head;
        double total=0;
        while (current!=null){
            total=total+(current.price*current.quantity);
            current=current.next;
        }
        return total;
    }
    public void displayItem(Node current){
        System.out.println("-------------------------");
        System.out.println("Item Name : " + current.itemName);
        System.out.println("Item ID   : " + current.itemID);
        System.out.println("Quantity  : " + current.quantity);
        System.out.println("Price     : " + current.price);
    }

    public void displayInventory(){
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        Node current = head;

        while (current != null) {

            displayItem(current);

            current = current.next;
        }
    }

    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        inventory.addAtBeginning(
                "Laptop", 101, 5, 50000);

        inventory.addAtEnd(
                "Mouse", 102, 20, 500);

        inventory.addAtEnd(
                "Keyboard", 103, 10, 1500);

        inventory.addAtPosition(
                "Monitor", 104, 7, 12000, 2);
        System.out.println("\nSearch by Item ID:");
        inventory.searchItem(103);

        System.out.println("\nUpdating Quantity:");
        inventory.updateItem(102, 25);

        System.out.println("\nTotal Inventory Value:");
        System.out.println(inventory.calculateTotal());

        System.out.println("\nRemoving Item 104:");
        inventory.deleteItem(104);

        inventory.displayInventory();
    }
}
