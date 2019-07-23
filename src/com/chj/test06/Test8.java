package com.chj.test06;

class Book{
    private String no;
    private String bookName;
    private String isbn;
    private double price;
    private String date;

    public Book(){

    }

    public Book(String no, String bookName, String isbn, double price, String date) {
        this.no = no;
        this.bookName = bookName;
        this.isbn = isbn;
        this.price = price;
        this.date = date;
    }

    public void showBook(){
        System.out.println("最贵的书是：");
        System.out.println("图书编号:"+no);
        System.out.println("书名:"+bookName);
        System.out.println("ISBM编码:"+isbn);
        System.out.println("价格:"+price);
        System.out.println("出版日期:"+date);
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}


public class Test8 {
    public static void main(String[] args) {
        Book book1=new Book("No1111","javaEE","465411544",56.7,"2017.6.7");
        Book book2=new Book("No1112","javaEE实战","465415644641",58.7,"2017.7.9");
        Book book3=new Book("No1113","java","46541445544",60.4,"2017.5.4");

        Book book=book1;

        if(book2.getPrice()>book1.getPrice()){
            book=book2;
        }
        if(book3.getPrice()>book2.getPrice()){
            book=book3;
        }

        book.showBook();

    }

}
