import java.util.Scanner;

public class VowelConsonant {
    public void vowelConsonant() {
        System.out.println("WELCOME TO VOWEL AND CONSONANT ");
        Scanner sc = new Scanner(System.in);
        char key = sc.next().charAt(0);

        switch (key){
            case 'a':
                System.out.println("IT'S VOWEL");
                break;
            case 'A':
                System.out.println("IT'S VOWEL");
                break;
            case 'e':
                System.out.println("IT'S VOWEL");
                break;
            case 'E':
                System.out.println("IT'S VOWEL");
                break;
            case 'i':
                System.out.println("IT'S VOWEL");
                break;
            case 'I':
                System.out.println("IT'S VOWEL");
                break;
            case 'o':
                System.out.println("IT'S VOWEL");
                break;
            case 'O':
                System.out.println("IT'S VOWEL");
                break;
            case 'u':
                System.out.println("IT'S VOWEL");
                break;
            case 'U':
                System.out.println("IT'S VOWEL");
                break;
            default:
                System.out.println("IT'S CONSONANT");
        }



        }
}
