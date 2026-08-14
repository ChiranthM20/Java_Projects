package java_programs.OOPS.Practice;

public class Classes_Objects_Practice {
    public static void main(String[] args){

        Book book1 =  new Book("Clean Code","Robert Martin",500);
        Book book2 = new Book();

        book1.changePrice(1000);

        Book book3 = book2;
        book3.title = "Java Programming";
        book1.display();
    }
}
class Book{
    String title;
    String author;
    int price;

    Book(){
        title = "unknown";
        author = "unknown";
        price = 0;
    }
    Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
    void changePrice(int newPrice){
        this.price=newPrice;
    }

}