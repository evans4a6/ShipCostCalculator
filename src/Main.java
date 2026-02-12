import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost = 0.0;
        final double shipping = 0.02;
        double salesTax = 0;
        double finalCost = 0;
        String enterPlease = "Enter the cost of your sale: ";
        String trash = "";

        System.out.print(enterPlease);
        cost = in.nextDouble();

        if(cost >= 100)
        {
            System.out.println("Congratulations, you qualify for free shipping! The final cost of your purchase is " + cost);
        }
        else if(cost < 100)
        {
            salesTax = shipping * cost;
            finalCost = salesTax + cost;
            System.out.println("There is a 2% tax on totals less than $100. The tax for your sale was " + salesTax + " dollars, which brings your total cost to " + finalCost);
        }
    }
}