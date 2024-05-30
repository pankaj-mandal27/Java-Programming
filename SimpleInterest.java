import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args []){

        float principle;
        float time;
        float rate;
        float interest;
        float amount;
        Scanner p = new Scanner(System.in);
        System.out.print("Enetr Principle Amount : ");
        principle = p.nextFloat();

        System.out.print("Enter Time in years: ");
        time = p.nextFloat();
        System.out.print("Enter Rate : ");
        rate = p.nextFloat();

        interest = (principle*time*rate)/100;
        amount = principle + interest;
        System.out.println("The Interest is "+interest);
        System.out.print("And The Amount is "+amount);




    }
}
