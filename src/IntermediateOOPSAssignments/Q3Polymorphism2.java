package IntermediateOOPSAssignments;

import java.util.ArrayList;
import java.util.Scanner;

class CurrentAccount extends Q3Polymorphism2 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits+creditLimit;
    }
}
class SavingsAccount extends Q3Polymorphism2 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits+fixedDepositAmount;
    }
}
public abstract class Q3Polymorphism2 {
    public  int getCash(){
        return 10000;
    }
    public static int totalCashInBank(ArrayList<Integer> cash){
        int sum =0;
        for(int i : cash){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        Q3Polymorphism2 q3Polymorphism2 ;
        ArrayList<Integer> cash = new ArrayList<>();
        for(int i = 1;i<=5;i++){
            System.out.println("Bank Type");
            String bankType = sc.nextLine();
            if(bankType.equals("Savings Accounts")){
                cash.add(savingsAccount.getCash());
            }
            else if(bankType.equals("Current Account")){
                cash.add(currentAccount.getCash());
            }
            else{
                cash.add(10000);
            }
        }

        System.out.println("Total Cash in Bank :- "+totalCashInBank(cash));
    }

    
}
