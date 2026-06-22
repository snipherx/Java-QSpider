import java.util.Scanner;
public class Switch
{
    public static void main(String[] args)
    {  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char a=sc.next().charAt(0);
        /*switch(a)
        {
            case 'A':
                System.out.println("Vowel");
                break;
            case 'a':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel");
                break;
        }*/
       //----------------------------------------------OR-----------------------------------------------------------------------
       /*switch (a)
       {
        case 'A': case 'a':
        case 'E': case 'e':
        case 'I': case 'i':
        case 'O': case 'o':
        case 'U': case 'u':
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Not a Vowel");
        }*/
        
    }    
}
