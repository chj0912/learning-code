package com.chj.test07;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    private String title;
    private String isbn;
    private double price;

    public Book() {
    }

    public Book(String title, String isbn, double price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    public Book(double price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void show(){
        System.out.println(title+","+isbn+","+price);
    }

}

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Book> list= new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<3;i++){
            System.out.println("输入第"+(i+1)+"本书的书名：");
            String title=sc.next();
            System.out.println("输入第"+(i+1)+"本书的ISBN：");
            String isbn=sc.next();
            System.out.println("输入第"+(i+1)+"本书的价格：");
            double price=sc.nextDouble();

            Book b=new Book(title,isbn,price);
            list.add(b);
        }

        for(Book b:list){
              b.show();
        }

    }

}
