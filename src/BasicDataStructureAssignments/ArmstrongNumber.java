package BasicDataStructureAssignments;

import java.util.Scanner;

class checkArnmstrong{
    public boolean isArmstrong(int num){
        int temp =num,rem=0,sum=0;
        while(num!=0){
            rem = num%10;
            sum +=rem*rem*rem;
            num /=10;
        }
        if(sum == temp){
            return  true;
        }
        return  false;
    }
}
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkArnmstrong objectOfArmstrong=new checkArnmstrong();
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        if(objectOfArmstrong.isArmstrong(number)){
            System.out.println(number+" is a Armstrong number");
        }
        else{
            System.out.println(number+ " is not a armstrong number");
        }
    }
}
