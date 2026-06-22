import java.util.Scanner;
public class If_conditon
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         
         //If Condition:-

         //Q1-WAJV to print square of the number if it is positive.
         /*System.out.print("Enter a number:"); 
         int a=sc.nextInt();
         if(a>0)
         {
            System.out.println("Square of number "+a+"="+a*a);
         }*/

        //Q2-WAJP to print valid answer if price of the product is greater than 1000 it should be selected otherwise not.
        /*System.out.print("Enter the price of product:");
        int price=sc.nextInt();
        if(price>1000)
        {
            System.out.println("Product is selected");
        }*/

        //-------------------------------------------------------------------------------------------------------------------

        //If Else Condition

        //Q1-WAJP to check wheather the number is positive or negative.
        /*System.out.print("Enter the number:");
        int num=sc.nextInt();
        if(num>=0)
        {
            System.out.println("Number "+num+" is= Positive");
        }
        else
        {
          System.out.println("Number "+num+" is= Negative");  
        }*/

        //Q2-WAJP to print smallest of two number.
       /*System.out.print("Enter 1st number:");
        int num1=sc.nextInt();
       // System.out.println();
        System.out.print("Enter 2nd number:");
        int num2=sc.nextInt();
        if(num1<num2)
        {
            System.out.println("Smallest Number is: "+num1);
        }
        else
        {
            System.out.println("Smallest Number is: "+num2);
        }*/

        //Q3-WAJP to check wheather the alphabate character is in upper case or lower case.
       /* System.out.print("Enter a Alphabte:");
        char c=sc.next().charAt(0);
        if (c>='A' && c<='Z')
        {
            System.out.println("Upper Case");
        }
        else
        {
            System.out.println("Lower Case");
        }*/
        //-----------------------------------------------------------------------------------------------------------------------
        
        //Else if:

        //Q1-WAJV to check wheather a number is single digit, double digit number or multi digit number.
        /*System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(num/10==0)
        {
            System.out.println("Number is single digit");
        }
        else if(num/100==0)
        {
            System.out.println("Number is double digit");
        }
        else
        {
            System.out.println("Number is three digit");
        }*/

            //Q2-WAJP to check wheather a character is alphabet,number or special character.
            /*System.out.print("Enter something:");
            char s1=sc.next().charAt(0);
            if(s1>='a' && s1<='z' ||s1>'A' && s1<='Z')
            {
                System.out.println("Alphabet");
            }
            else if(s1>=1 && s1<=9)
            {
                System.out.println("Number");
            }
            else
            {
                System.out.println("Speacial character");
            }*/
         //--------------------------------------------------------------------------------------------------------------------------------
        
        //Nested If Else:-

        //Q1-WAJP to check wheather a character is alphabet or not and if it is alphabet check it is upper case or lower case.
       /*System.out.print("Enter a character:");
       char x=sc.next().charAt(0);
       if(x>='a'&&x<='z'||x>='A'&&x<='Z')
       {
        if(x>='a'&&x<='z')
        {
            System.out.println("Lower Case Alphabet");
        }
        else
        {
            System.out.println("Upper Case Alphabet");
        }
        }
        else
        {
            System.out.println("Not a Alphabet");
        }*/
        
        

    }    
}
