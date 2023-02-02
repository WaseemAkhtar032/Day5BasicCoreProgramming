import java.util.Scanner;

public class PowerOf2 {
    public int powerOfTwo() {
        long result = 1;
        int base = 2;
        System.out.println("WELCOME TO POWER OF 2 ");

        System.out.println("ENTER THE Nth POWER / VALUE OF EXPONENT ");
        Scanner sc = new Scanner(System.in);
        int exponent = sc.nextInt();
        if (exponent <= 31) {
            for (int i = 1; i <= exponent; i++) {
                result = result * base;
                System.out.println("2^" + i + "-->" + result);
            }
        }
            else {
                System.out.println("enter valid value for exponent");
            }
        return (int) result;
        }
    }
