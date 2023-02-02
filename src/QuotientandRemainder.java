import java.util.Scanner;

public class QuotientandRemainder {
    public void quotientAndRemainder() {
        int dividend, divisor;
        System.out.println("WELCOME TO QUOTIENT AND REMAINDER");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for dividend ");
        dividend = sc.nextInt();
        System.out.println("enter the value for divisor ");
        divisor = sc.nextInt();

        double quotient = dividend / divisor;
        double remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

    }
}
