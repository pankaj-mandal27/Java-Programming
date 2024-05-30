import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]) {
        int n;
        int rem = 0;
        int sum = 0;
        int arm = 0;
        System.out.print("Enter a number more than having 1 digits");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        int newNum = n;


        do {
            rem = n % 10;
            arm += (rem ^ 3);
            n = n / 10;
        } while (n != 0);
        if (arm == newNum)
        {
            System.out.println(newNum+" is armstrong.");
        } else System.out.println(" Not Armstrong");
    }
}
