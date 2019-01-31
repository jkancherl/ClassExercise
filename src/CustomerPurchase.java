import java.util.Scanner;

/**
 * INPUTS
 * Customer's name
 * Purchase amount
 * Tax code (0,1,2,3)
 * <p>
 * OUTPUTS
 * Customer's name
 * Purchase amount
 * Sales tax percentage
 * Sales tax amount
 * Total amount due
 * <p>
 * VARIABLES
 * Customer's name
 * Purchase amount
 * Tax code
 * Tax percentage
 * Sales tax amount
 * Total amount due
 * <p>
 * PROCESSING STEPS
 * 1. Get customer's name.
 * 2. Get user's tax code.
 * 3. Get user's purchase amount.
 * 4. Determine tax percentage based on tax code entered (0%, 3%, 5%, 7%).
 * 5. Calculate sales tax = (purchase amount) * (tax percentage)
 * 6. Calculate total amount due = (sales tax) + (purchase amount)
 * 7. Print customer's name, purchase amount, sales tax, and total amount due.
 * <p>
 * - Declare variables for customer's name, tax percentage, purchase amount, sales tax, total amount due.
 * - Enter customer name.
 * - Read in customer's name and store into variable "customer".
 * - Enter tax code.
 * - Read in tax code and store into variable "tax_code".
 * - Enter purchase amount.
 * - Read in purchase amount and store into variable "purchase_amount".
 * if(tax_code = 0)
 * tax_percentage = 0
 * else if(tax_code = 1)
 * tax_percentage = 3
 * else if(tax_code = 2)
 * tax_percentage = 5
 * else if(tax_code = 3)
 * tax_percentage = 7
 * <p>
 * sales_tax = (tax_percentage/100) * (purchase_amount)
 * total_amount_due = sales_tax + purchase_amount
 * <p>
 * Print customer_name, tax_percentage, purchase_amount, sales_tax, total_amount_due
 */

public class CustomerPurchase {
    public static void main(String[] args) {

        int tax_code = 0;
        double tax_percentage = 0;
        double sales_tax =0;

        String customerName;
        double purchaseAmount;
        double totalAmount;

        Scanner keyboard = new Scanner(System.in);
        System.out.print(" Enter your name ");
        customerName = keyboard.next();

        System.out.print(" Enter purchase Amount ");
        purchaseAmount = keyboard.nextDouble();

        System.out.print(" Enter tax_code: 0, 1, 2, 3 ");
        tax_code = keyboard.nextInt();

        if (tax_code == 0)
            tax_percentage = 0;
        else if (tax_code == 1)
            tax_percentage = 3;
        else if (tax_code == 2)
            tax_percentage = 5;
        else if (tax_code == 3)
            tax_percentage = 7;

        sales_tax = (tax_percentage/100) * (purchaseAmount);
        totalAmount = sales_tax + purchaseAmount;
        System.out.print("Name: "+ customerName + " Subtotal " + purchaseAmount + " Sales Tax " + sales_tax + " Total Bill "+ totalAmount);
    }
}
