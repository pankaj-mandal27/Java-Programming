import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String args[])
    {
        Scanner string = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char s = string.next().charAt(0);
        if (s == 'a' ||  s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U')
        {
            System.out.println(s +" is vowel. ");

        }
        else System.out.println(s+ " is consonant ");
    }
}
