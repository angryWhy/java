package NormalClass.Wrapper.arr;

import java.util.Arrays;
import java.util.Comparator;

public class exercise {
    public static void main(String[] args) {
        Book[] arr = new Book[4];
        Book b1= new Book("1",1);
        Book b2= new Book("2",2);
        Book b3= new Book("3",3);
        Book b4= new Book("4",4);
        Arrays.sort(arr, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double d = o1.getPrice()-o2.getPrice();
                 if(d>0){
                     return 1;
                 }
                else if(d<0){
                     return -1;
                 }else{
                    return 0;
                 }
            }
        });
    }
}
class Book{
    private String name;
    private int price;
    public Book(String name, int price){
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
}
