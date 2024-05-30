import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String args [])
    {
        int a;
        int count = 0;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number : ");
        a = n.nextInt();
        for (int i = 1; i <= a; i++)
        {
            if(a%i == 0)
            {
                count++;
            }

        }
        if(count > 2)
        {
            System.out.println(a+" is a composite Number.");
        } else if (count < 2)
        {
            System.out.println("You might have entered 1 or 0.");
        }
        else System.out.println(a+" is a Prime number.");
    }
}
