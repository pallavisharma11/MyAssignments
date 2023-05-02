package BasicDataStructureAssignments;

import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double simpleinterest = (principalAmount*time*interestRate)/100;
        return simpleinterest;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double compoundinterest = principalAmount*(Math.pow((1+interestRate),time))-principalAmount;
        return compoundinterest;
    }
}
public class Question3 {
    public static void main(String[] args) {
        SiCi object = new SiCi();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        double principalAmount = sc.nextDouble();
        System.out.println("Enter time");
        int time = sc.nextInt();
        System.out.println("Enter interestRate");
        double interestRate = sc.nextDouble();
        double simpleinterest = object.simpleInterest(principalAmount,time,interestRate);
        double compoundinterest = object.compoundInterest(principalAmount,time,interestRate);
        System.out.println("Simple Interest "+simpleinterest);
        System.out.println("Compound Interest "+compoundinterest);
    }
}
