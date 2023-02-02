import java.util.Scanner;

public class HarmonicSeries {
    public int harmonicSeries() {
        System.out.println("WELCOME TO HARMONIC SERIES ");
        double sum = 0.0;
        System.out.println("EnTER THE NUMBER ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        System.out.println("The harmonic series is: ");

        for (int i = num; i > 0; i--) {
            double harmonic = (double) 1/ num;
            sum = sum + harmonic ;
            System.out.print(sum + ", ");
        }
        return (int) sum;
    }

}
