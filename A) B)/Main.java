import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        // A
        RandomNum newArray = new RandomNum();

        for (int i = 0; i < 10; i++) {
            System.out.println("Your random number is; " + newArray.getRandomNumber());
        }
*/
        // B

        Scanner cprInput = new Scanner(System.in);
        System.out.println("Please enter your CPR number.");
        String cpr = cprInput.nextLine();

        CprChecker cprCheck = new CprChecker(cpr);
        System.out.println(cprCheck.cprValidator(cpr));



    }
}
