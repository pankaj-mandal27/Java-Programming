import java.util.Scanner;
public class Tables {
    public static void main(String args []){

        int a;
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter A Number For Table : ");
        a = obj.nextInt();
        System.out.println("Table of "+a+" is :");
        for (int i = 1; i <=10;i++){

            System.out.println(a+" x "+i+" = "+a*i);
        }
    }
}
