import java.util.Scanner;

public class NegOrPositive {
    public static void main (String args[]){

        int a;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        a = obj.nextInt();
        if(a > 0){
            System.out.print(a+" is Positive Number.");
        } else if (a < 0) {
            System.out.print(a+" is Negative Number.");

        }
        else System.out.print(a+ " is a Zero");
    }
}
