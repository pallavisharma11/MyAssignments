package IntermediateOOPSAssignments;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Scanner;

class Manager extends Q2Polymorphism{
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }

}
class Labour extends Q2Polymorphism{
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
    }
}
public class Q2Polymorphism {
    static int salary =10000;

    public int getSalary() {
        return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int sum =0;
        for(int i :employeeSalaries){
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> employees = new ArrayList<>();
        Manager manager = new Manager();
        Labour labour =new Labour();
        Q2Polymorphism object = new Q2Polymorphism();
        for(int i =0;i<5;i++){
            System.out.println("Employee Category");
            String employeeCategory=sc.next();
            if(employeeCategory.equals("Labour")){
                employees.add(labour.getSalary(salary));
            }
            else if(employeeCategory.equals("Manager")){
                employees.add(manager.getSalary(salary));
            }
            else{
                employees.add(object.getSalary());
            }
        }

        System.out.println("Total salary given to employees :- "+object.totalEmployeesSalary(employees));
    }
}
