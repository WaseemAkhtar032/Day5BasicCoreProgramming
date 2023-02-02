import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isexit = false;
        do {
            System.out.println("\t BASIC CORE PROGRAMMING ");
            System.out.println("\t MENU");
            System.out.println("\t 1.FlipCoinPercentage \n\t 2.LeapYear\n\t 3.PowerOf2\n\t 4.HarmonicSeries\n\t 5.FactorOfNumber \n");
            System.out.println("\t 6.QuotientandRemainder\n\t 7.SwapTwoNumbers\n\t 8.EvenOrOdd\n\t 9.VowelOrConsonant\n\t 10.LargestAmongThree\n\t 11.exit");
            System.out.println("ENTER YOUR CHOICE ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    FlipCoinPercentage f = new FlipCoinPercentage();
                    f.flipCoinPercentage();
                    break;
                case 4:
                    HarmonicSeries h = new HarmonicSeries();
                    h.harmonicSeries();
                    break;
                case 2:
                    LeapYear l = new LeapYear();
                    l.leapYear();
                    break;
                case 3:
                    PowerOf2 p = new PowerOf2();
                    p.powerOfTwo();
                    break;
                case 5:
                    FactorOfNumber f1 = new FactorOfNumber();
                    f1.factorOfNumber();
                    break;
                case 6:
                    QuotientandRemainder q = new QuotientandRemainder();
                    q.quotientAndRemainder();
                    break;
                case 7:
                    SwapofTwoNumbers s = new SwapofTwoNumbers();
                    s.swapTwoNumber();
                    break;
                case 8:
                    EvenorOdd num = new EvenorOdd();
                    num.evenOrOdd();
                    break;
                case 9:
                    VowelConsonant v = new VowelConsonant();
                    v.vowelConsonant();
                    break;
                case 10:
                    GreatestAmongThree great = new GreatestAmongThree();
                    great.greatestAmongThree();
                    break;
                case 11:
                    isexit = true;
                     break;
                default:
                    System.out.println("ENter Valid Choice");
                    break;
            }
        } while(!isexit);
    }
}