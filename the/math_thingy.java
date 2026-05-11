import java.util.Scanner;

public class math_thingy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;

        System.out.print("Enter the radius of ur circle: ");
        radius = scanner.nextDouble();

        double circ = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume =(4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        //printf() = is a method used to format output
        //% followed by = [flags][width][.precision][specifier-character]
        System.out.printf("\nThe circumference of ur circle = %.2fcm", circ);
        System.out.printf("\nThe area of ur circle = %.1fcm²", area);
        System.out.printf("\nThe volume of ur circle = %.1fcm³", volume);


        scanner.close();

    }
}
