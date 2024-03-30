import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FactoringCalculator {

    private static final int PERCENTAGE_DIVISION = 100;
    private static final int DAYS_OF_THE_YEAR = 360;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Invoice amount (EUR): ");
        double invoiceAmount = scanner.nextDouble();

        System.out.println("Advance rate (%): ");
        float advanceRate = scanner.nextFloat() / PERCENTAGE_DIVISION;

        System.out.println("Interest rate (%): ");
        float interestRate = scanner.nextFloat() / PERCENTAGE_DIVISION;

        System.out.println("Payment term (days): ");
        int paymentTerm = scanner.nextInt();

        System.out.println("Commission fee (% per invoice): ");
        float commFee = scanner.nextFloat() / PERCENTAGE_DIVISION;

        //amount advanced
        double amountAdvanced = invoiceAmount * advanceRate;

        //daily interest cost
        double dailyInterestCost = amountAdvanced * paymentTerm * (interestRate / DAYS_OF_THE_YEAR);

        //financing charge
        double financingCharge = dailyInterestCost + (commFee * invoiceAmount);
        double percentOfInvoice = ((financingCharge * PERCENTAGE_DIVISION) / invoiceAmount) / PERCENTAGE_DIVISION;

        //final output
        System.out.println("Invoice financing expenses: ");
        DecimalFormat decimalFormat = new DecimalFormat("##.00%");
        System.out.println(decimalFormat.format(percentOfInvoice));
        System.out.println(NumberFormat.getCurrencyInstance().format(financingCharge));
    }
}
