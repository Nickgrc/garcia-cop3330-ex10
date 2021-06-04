import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //tax constant
        final double tax = .055;

        System.out.print("Enter the price of item 1: ");
        String price = in.nextLine();

        System.out.print("Enter the quantity of item 1: ");
        String quantity = in.nextLine();

        System.out.print("Enter the price of item 2: ");
        String price2 = in.nextLine();

        System.out.print("Enter the quantity of item 2: ");
        String quantity2 = in.nextLine();

        System.out.print("Enter the price of item 3: ");
        String price3 = in.nextLine();

        System.out.print("Enter the quantity of item 3: ");
        String quantity3 = in.nextLine();

        double a = Double.parseDouble(price);
        double b = Double.parseDouble(quantity);
        double c = Double.parseDouble(price2);
        double d = Double.parseDouble(quantity2);
        double e = Double.parseDouble(price3);
        double f = Double.parseDouble(quantity3);
        double subtotal = a * b + c * d + e * f;
        double taxed = subtotal * tax;
        double total = subtotal + taxed;
        //getting two decimal places
        String s = String.format("%.2f", subtotal);

        System.out.print("Subtotal: $" + s + "\n" + "Tax: $" + taxed + "\n" + "Total: $" + total);


    }
}
