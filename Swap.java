import java.util.Scanner;

public class Swap {
    public static void main(String[] args){

        int a;
        int b;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Two Numbers : ");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Before Swapping");
        System.out.println("a = "+a+" and b = "+b);
        System.out.println("After Swapping");
    // swapping
    a = a + b;
    b = a - b;
    a = a - b;
        System.out.println("a = "+a+" and b = "+b);
}
}
