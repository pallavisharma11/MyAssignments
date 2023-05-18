package CollectionFramework;

import java.util.Comparator;
import  java.util.TreeSet;
import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name,String department,double salary){
        this.id = id;
        this.name=name;
        this.department=department;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String name) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Employee> map = new TreeSet();
        map.add(new Employee(2,"Pallavi","software",50000));
        map.add(new Employee(5,"Kashish","Engineer",16000));
        map.add(new Employee(1,"Ashish","Engineer",40000));
        map.add(new Employee(9,"Priya","HR",100000));
        map.add(new Employee(8,"Hemlata","Testing",55000));
        map.add(new Employee(2,"Ankit","Testing",580000));
        map.add(new Employee(3,"Ankita","software",5000));
        map.add(new Employee(6,"Govind","HR",10000));
        map.add(new Employee(10,"Laksh","software",67000));
        map.add(new Employee(4,"Pranjali","HR",6700));
        map.add(new Employee(2,"Parth","Testing",500000));
        map.add(new Employee(7,"Prashat","Testing",700000));

        System.out.println("ID");
        System.out.println("Name");
        System.out.println("Department");
        System.out.println("Salary");
        System.out.println("Your choice");
        int choice = sc.nextInt();
        switch (choice){
            case 'a': class MyNameComp implements Comparator<Employee>{

                    @Override
                    public int compare(Employee e1, Employee e2) {
                        return e1.getId().compareTo(e2.getId());
                    }
                    
                }
                break;
            case 'b':class MyNameComp1 implements Comparator<Employee>{

                @Override
                public int compare(Employee e1, Employee e2) {
                    return e1.getName().compareTo(e2.getName());
                }

            }
                break;

            case 'c':
        }

    }
}
