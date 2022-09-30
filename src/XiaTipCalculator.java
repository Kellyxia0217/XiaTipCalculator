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

        double totaltip = bill * tippercent;
        double tipperperson = totaltip / people;
        double totalamount = bill + totaltip;
        double totalamountperperson = bill / people + tipperperson;

        System.out.println("Total tip: " + totaltip);
        System.out.println("Total bill: " + totalamount);
        System.out.println("Tip per person: " + tipperperson);
        System.out.println("Total cost per person: " + totalamountperperson);


    }
}