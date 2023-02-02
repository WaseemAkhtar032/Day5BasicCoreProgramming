import java.util.Scanner;

public class EvenorOdd {
    public void evenOrOdd() {
        System.out.println("WELCOME TO EVEN ODD ");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number%2 == 0){
            System.out.println("given number is Even ::"+number);
        }
        else {
            System.out.println("given number is Odd ::"+number);
        }
    }
}
