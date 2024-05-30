import java.util.Scanner;

public class ArraySum {
    public static void main(String args[])
    {

        int len;
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter The Size of Array : ");
        len = obj.nextInt();
        int [] array = new int[len];
        int sum = 0;
        System.out.print("Enter "+len+" elements : ");
        for (int i = 0; i < len; i++)
        {
            array[i] = obj.nextInt();
            sum += array[i];
        }
        System.out.println("The sum of the elements of the array is : "+sum);



    }

}
