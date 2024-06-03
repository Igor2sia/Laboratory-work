package oop.lab_9.demo;

public class Book {
    protected String title;
    protected String author;
    protected Double price;

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public Double getPrice() {return price;}

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder();
//        sb.append("Type: ").append(this.getClass().getSimpleName())
//                .append(System.lineSeparator()
//    }
}
