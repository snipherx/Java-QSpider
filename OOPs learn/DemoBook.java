//package OOPs;

public class DemoBook 
{
    //Properties or Attributes
    String bookName;
    String author;
    int price;
    
    //Behaviour
    public void story()
    {
        System.out.println("Once upon a time....");
    }

    public void details()
    {
        System.out.println("Book Name: "+bookName+"\nAuthor Name: "+author+"\nPrice: "+price);
    }

    public static void main(String[] args)
    {
        DemoBook b1=new DemoBook();
        DemoBook b2=new DemoBook();
        System.out.println("Book b1 address: "+b1);
        System.out.println("Book b2 address: "+b2);
        b1.bookName="Atomic habbit";
        b2.bookName="KGF";
        b1.author="Petter";
        b2.author="Chan";
        b1.price=151;
        b2.price=121;
        System.out.println("---------------------------------------------"); 
        b1.details();
        System.out.println("---------------------------------------------");
        b2.details();
    }
}
