package BasicDataStructureAssignments;

import java.util.Scanner;

class TaxAmount{
    double taxAmmount;
    public double calculateTaxAmount(int ctc){
        if(ctc >=0 && ctc <=180000){
            taxAmmount = ctc;
        }
        else if (ctc <= 181001 && ctc >=300000)
        return  8.8;
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
