import java.util.Scanner;

public class GreatestAmongThree {
    public void greatestAmongThree() {
        System.out.println("WELCOME TO GREATEST AMONG THREE ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for first number ");
        int num1 = sc.nextInt();
        System.out.println("enter the value for second number ");
        int num2 = sc.nextInt();
        System.out.println("enter the value for third number ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3 ){
            System.out.println("FIRST NUMBER IS GREATEST ::"+num1);
        }
        else if (num2 > num1 && num2 > num3 ){
            System.out.println("SECOND NUMBER IS GREATEST ::"+num2);
        }
        else {
            System.out.println("THIRD NUMBER IS GREATEST ::"+num3);
        }

    }
}
