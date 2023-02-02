import java.util.Scanner;

public class FactorOfNumber {
    public int factorOfNumber() {
        System.out.println("WELCOME TO FACTOR OF NUMBER");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Factors of " + number + " are: ");

        int i;
        for (i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + "//");
            }
        }
        return i;
    }
}
