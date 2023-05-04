package BasicDataStructureAssignments;

import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){

    }
}
public class Q5BasicDataStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CTC");
        int CTC = sc.nextInt();
        double taxAmount = new TaxAmount().calculateTaxAmount(CTC);
        System.out.println("Calculate Tax Amount :- "+ +taxAmount);

    }
}
