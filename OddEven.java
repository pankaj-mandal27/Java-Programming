import java.util.Scanner; // we imported scanner library

public class OddEven{
    public static void main(String args[]){

        int a;
        Scanner b = new Scanner(System.in); // this line initiates input process
        System.out.print("Enter Value : ");
        a = b.nextInt(); // this command takes input from keyword and put that value in var a
        if(a%2 == 0) {    // here % gives remender from a divide by 2
                         // if remainder is 0 then it is divisible by 2 i.e even else odd

            System.out.println(a + " is even number");
        }
            else System.out.println(a + " is Odd Number");
        }

    }
