import java.util.Scanner;

public class Factorial {
    public static void main(String arg[]){

        int a;
        int fact;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        a = obj.nextInt();
        fact = a;
        System.out.print("Factorial of "+a+" is :"+a);
        for(int i = a-1;i>0; i--){

            System.out.print("x"+i);
            fact = fact * i;
        }
        System.out.print(" = "+fact);
    }
}
