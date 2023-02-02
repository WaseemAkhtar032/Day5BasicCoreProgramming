import java.util.Scanner;
public class LeapYear {

    public int leapYear() {
        int year;
        System.out.println("WELCOME TO LEAP YEAR ");
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year > 1582 ) {

            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Specified year is a leap year");
            }
            else {
                System.out.println("Specified year is not a leap year");
            }
        }
        return year;
    }

}
