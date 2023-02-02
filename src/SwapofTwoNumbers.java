import java.util.Scanner;

public class SwapofTwoNumbers {
    public void swapTwoNumber() {
        System.out.println("WELCOME TO SWAP OF TWO NUMBERS");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for first number ");
        int num1 = sc.nextInt();
        System.out.println("enter the value for second number ");
        int num2 = sc.nextInt();
        int temp=0;
        System.out.println("numbers value Before Swapping ");
        System.out.println(num1);
        System.out.println(num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("numbers value After Swapping ");
        System.out.println(num1);
        System.out.println(num2);
    }
}
