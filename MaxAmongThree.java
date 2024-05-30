import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxAmongThree {
    public static void main(String args []) {

        int num1;
        int num2;
        int num3;
        int max;

        Scanner n1 = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        num1 = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        System.out.print("Enter Number2 : ");
        num2 = n2.nextInt();
        Scanner n3 = new Scanner(System.in);
        System.out.print("Enter Number3 : ");
        num3 = n3.nextInt();

        if(num1>num2 && num1>num3)
        {
            max = num1;
        } else if (num2 > num3)
        {
            max = num2;

        }
        else {
            max = num3;
        }
        System.out.print("The maximum number is : "+max);
    }
}
