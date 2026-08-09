public class ConstructorChaning {
    //Uring this() call statement and it was only use inside constructor
    //when we use this() call statement inside a constructor it should be first line/instruction of code
    String name;
    int price;
    String language;
    ConstructorChaning()
    {
        System.out.println("no arg constructor");
    } 
    ConstructorChaning(String name,int price)
    {
        this();
        this.name=name;
        this.price=price;
        System.out.println("String and int");
    }
    ConstructorChaning(String name,int price,String language)
    {
        this("Java",200);
        this.name=name;
        this.price=price;
        this.language=language;
        System.out.println("String int String");
    }
    public static void main(String[] args) {
        ConstructorChaning a1=new ConstructorChaning("Java Script",250,"Eng");

    }
}
