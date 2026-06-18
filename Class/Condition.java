import java.util.Scanner;
class Condition 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter a Number to check Even or Odd: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=a%2==0?"Even":"Odd";
        System.out.println("Number is: "+s);
    }
    
}
