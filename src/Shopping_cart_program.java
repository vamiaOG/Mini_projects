import java.util.Scanner;

public class Shopping_cart_program {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int item_num = 0;
        double price = 0;
        String item_name;


        System.out.print("What item would u like to buy: ");
        item_name = scanner.nextLine();
        System.out.print("What is the price of each item: ");
        price = scanner.nextDouble();
        System.out.print("How many would u like: ");
        item_num = scanner.nextInt();
        double total = item_num * price;

        System.out.println("\nYou have bought " + item_num + " " + item_name + "/s.");
        System.out.println("Your total is $" + total);

        scanner.close();

    }
}
