import java.util.*;

public class siralama {
    public static void main(String[] args){

        

        int a,b,c;
        Scanner input= new Scanner(System.in);

        System.out.println("3 adet sayi giriniz(a,b,c):");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        if(a>b && a>c)
        {
            if(b>c)
            {
                System.out.println("a>b>c");
            }
            else
            {
                System.out.println("a>c>b");
            }
        }
        
        if(a<b && a<c)
        {
            if(b>c)
            {
                System.out.println("b>c>a");
            }
            else
            {
                System.out.println("c>b>a");
            }   
        }
        if(a>b && a<c)
        {
            System.out.println("c>a>b");

        }
        if(a<b && a>c)
        {
            System.out.println("b>c>a");
        }

    }

}
