public class Book1 {
    String title;
    int price;
    String authorName;
    Book1(String title,int price,String authorName)  //Paramaterized Constructor
    {
        this.title=title;
        this.price=price;
        this.authorName=authorName;
    }
     void details()
    {
        System.out.println("Book Title: "+title+", Price: "+price+", Author Name: "+authorName);
    }
    public static void main(String[] args) {
        Book1 b1=new Book1("Hello World",279,"James");
        Book1 b2=new Book1("Basic Java", 512, "Scott");
        b1.details();
        b2.details();
    }
}
