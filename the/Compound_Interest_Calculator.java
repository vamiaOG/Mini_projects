import java.util.Scanner;

public class Compound_Interest_Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*char at;
        System.out.println("Enter a character: ");
        at = scanner.next().charAt(2);
        System.out.println(at);*/

        double principal = 0;
        double rate = 0;
        double cpdtime = 0;
        double years = 0;
        double amount;
        double exp;
        double inside;

        System.out.printf("Enter the principal amount: %.0f", principal);
        principal = scanner.nextInt();
        System.out.print("Enter the interest rate (in %): " + rate);
        rate = scanner.nextInt();
        System.out.printf("Enter the # of times compounded per year: %.0f", cpdtime);
        cpdtime = scanner.nextInt();
        System.out.printf("Enter the # of years: %.0f", years);
        years  =scanner.nextInt();

        rate = rate/ 100;
        exp = cpdtime * years;
        inside = 1 + (rate/cpdtime);
        amount = principal * Math.pow(inside , exp);

        System.out.printf("The amount after %.0f years is %,.2f", years, amount);

        scanner.close();
    }
}
