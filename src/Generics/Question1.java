package Generics;

import java.util.HashSet;

class Employee{
    private int id;
    private String name;
    private double salary;
    private String Department;
    Employee (int id,String name,double salary,String Department){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.Department=Department;
    }
    void Displayetails(){
        System.out.println(id+" "+name+" "+salary+" "+Department);
    }
}
public class Question1 {
    HashSet<Employee> set =new HashSet<>();
    Employee E1 = new Employee(1,"Pallavi",90000,"CSE");
    Employee E2 = new Employee(3,"Prachi",5000,"IT");
    Employee E3 = new Employee(1,"Priya",40000,"Commerce");





}
