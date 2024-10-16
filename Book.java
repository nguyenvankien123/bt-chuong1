package EXERCISESPONCOMPOSSITION;

public class Book {
    private String name;
    private Author[] authors;
    private Author author;
    private double price;
    private  int qty=0;
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name ,Author author , double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty=0;
    }
    public String getname(){
        return name;
    };
    public Author[] getauthors(){
        return authors;
    }
    public double getprice(){
        return price ;
    }
    public void setprice(double price){
    }
    public int getqty(){
        return qty;
    }
    public void setqty(int qty){
    }
    public String getauthorname() {
        String authornames = "";//kien
        for (int i = 0; i < authors.length; i++)
            authornames = authornames + authors[i].getName() + " ";
            return getauthorname();

    }
    public String toString () {
        return "Book [name = " + name + ", author = " + getauthorname() + ", price = " + price + ", qty = " + qty + "]";
    }
}
