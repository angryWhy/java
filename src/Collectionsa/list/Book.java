package Collectionsa.list;

import java.util.List;

public class Book {
    public static void main(String[] args) {
        List arr =(List) new Arraylist();
        arr.add(new Book("1",1,"haha"));
        arr.add(new Book("2",2,"hehe"));
        arr.add(new Book("3",3,"gaga"));
    }
    private String name;
    private double price;
    private String author;
    public Book(String name,double price,String author){
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }
    public static void compare(List list){
        for(int i= 0;i<list.size();i++){
            for(int j =0;j<list.size()-i-1;j++){
                Book b1 = (Book)list.get(j);
                Book b2 = (Book)list.get(j+1);
                if(b1.getPrice()>b2.getPrice()){
                    list.set(j,b2);
                    list.set(j+1,b1);
                }
            }
        }
    }
}
