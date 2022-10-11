import java.util.*;
public class XiaTipCalculator {
    public static void main (String[] args) {
        Scanner  b = new Scanner(System.in);
        Scanner  t = new Scanner(System.in);
        Scanner  n = new Scanner(System.in);

        System.out.print ("Bill : ");
        double bill = b.nextDouble();
        System.out.print("Tip % :");
        double tippercent = t.nextDouble() / 100;
        System.out.print("Amount of people:");
        int people = n.nextInt();

        double totaltip = bill * tippercent; // the total amount of tip by multiplying the bill and the tip %
        double tipperperson = totaltip / people; // The amount of tip that each person needs to pay
        double totalamount = bill + totaltip; // The total bill including tip
        double totalamountperperson = bill / people + tipperperson; // how much each person needs to pay

        System.out.println("Total Tip: $%.2f\n", " + totaltip);
        System.out.println("Total Bill With Tip: $%.2f\n", + totalamount);
        System.out.println("Tip Per Person: $%.2f\n", " + tipperperson);
        System.out.println("Total Cost Per Person: $%.2f\n", + totalamountperperson);


    }
}
