import java.util.Locale;
import java.util.Scanner;
public class SumOfInput {
public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int input = scanner.nextInt();
    System.out.println(sumNumbers(input));
    System.out.println("Guassian Method:");
    System.out.println(guassMethod(input));
    }
static int sumNumbers(int n) {
    int i = 1;
    int sum = 0;
    while (i <= n) {
        sum = sum + i;
        i++;
    }
    return sum;
}
static int guassMethod(int n) {
    return = (n * (n+1))/2;
}
}