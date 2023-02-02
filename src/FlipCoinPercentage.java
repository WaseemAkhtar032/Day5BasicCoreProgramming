import java.util.Random;
import java.util.Scanner;

public class FlipCoinPercentage {
    public int flipCoinPercentage() {
        int choice;
        double headCount = 0, tailsCount = 0;
        System.out.println("Welcome to the coin flip game!");
        System.out.println("Enter the number of times coin you want to flip ");
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        for (int i = 0; i < n1; i++) {

            double check = Math.floor(Math.random() * 10 % 2);
            if (check == 0) {
                System.out.println("IT'S HEAD");
                headCount++;
            } else {

                System.out.println("IT'S TAILS");
                tailsCount++;
            }

        }
        double percentage = 0 ;
        System.out.println("HEAD COUNT IS :: "+(int)headCount);
        System.out.println("TAILS COUNT IS :: "+(int)tailsCount);
        double headPercentage= (headCount/n1 * 100);
        System.out.println("HEAD PERCENTAGE IS "+headPercentage+"%");
        double tailsPercentage= ((tailsCount/n1)* 100);
        System.out.println("TAILS PERCENTAGE IS "+tailsPercentage+"%");
        if (headPercentage > tailsPercentage) {
            percentage = headPercentage;
            System.out.println("HEAD PERCENT IS GREATER");
        }
        else {
             percentage = tailsPercentage;
            System.out.println("TAILS PERCENT IS GREATER");

        }
        return (int) percentage;
    }
}