import java.util.Scanner;

public class RevNum {
    public static void main(String args [])
    {
        int a;
        int rem;
        int revNum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        a = obj.nextInt();
        int n = a;
        do
        {
            rem = n%10 ;
            revNum = revNum *10+rem ;
            n = n/10  ;
        }while (n>0) ;
        System.out.println("=========================================================================================");
        System.out.println("Your Number is "+a);
        System.out.println("The Reverse Number is : "+revNum);
        System.out.println("=========================================================================================");
    }
}
