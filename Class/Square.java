class Square
{
    public static int sqr(int n)
    {
        return n*n;
    }

    public static void alpha(char s)
    {
        if(s<'Z')
        {
            for(char i=s;i<='Z';i++)
            {
                System.out.println(i);
            }
        }
        else{
          for(char i=s;i<='z';i++)
            {
                System.out.println(i);
            }  
        }
    }

    public static void factorial(int i)
    {
        int fact=1;
        for(int a=i;a>1;a--)
        {
            fact=fact*a;
        }
        System.out.println(fact);
    }
     public static void factor(int i)
    {
        for(int a=1;a<i;a++)
        {
            if(i%a==0)
            {
                System.out.println(a);
            }
        }
    }

    public static int ascii(char ch)
    {
        return (int)ch;
    }
    
    public static void main(String[] args)
    {
        /*for(int i=1;i<=10;i++)
        {
            System.out.println("Suare of "+"5x"+i+"="+sqr(5*i));
        }*/

        //alpha('L');
       // factorial(6);
       //factor(18);
       //System.out.println(ascii('a'));
    }
   
}