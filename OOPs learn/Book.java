public class Book {
    String title;
    int price;
    String authorName;
    Book()
    {

    }
    void details()
    {
        System.out.println("Book Title: "+title+", Price: "+price+", Author Name: "+authorName);
    }
    public static void main(String[] args) {
        Book b1=new Book();
        b1.title="Hello World";
        b1.price=279;
        b1.authorName="James";
        Book b2=new Book();
        b2.title="Java Basic";
        b2.price=512;
        b2.authorName="Scott";
        b1.details();
        b2.details();
    }
}
