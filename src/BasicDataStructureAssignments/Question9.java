package BasicDataStructureAssignments;

import java.util.Scanner;

class Student {
    private int subjectA,subjectB,subjectC;
    Student(int subjectA,int subjectB,int  subjectC) {
        this.subjectA = subjectA;
        this.subjectB = subjectB;
        this.subjectC = subjectC;
    }



    public static  int studentsTotalMarksInAllSubjects(Student[] students) {
        int sum =0;
        for(int i =0;i<students.length;i++){
            sum = sum+ students[i];
        }
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        double ava=studentsTotalMarksInAllSubjects(students)/9;
        return ava;
    }
    public int[] subjectWiseMarks(Student[] students,String subjectName){

    }
    public int subjectATotalByStudents(int[] marks) {

    }
    public int subjectBTotalByStudents(int[] marks) {}
    public int subjectCTotalByStudents(int[] marks) {}

    public int subjectTotalByStudents(int[] marks)

    public double subjectAAverageByStudents(int[] marks) {}
    public double subjectBAverageByStudents(int[] marks) {}
    public double subjectCAverageByStudents(int[] marks) {}

}
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[9];
        System.out.println("marks of Student 1 in subjects A,B,C");
        //int[] s1 = new int[3];
        int s1A = sc.nextInt();
        int s1B= sc.nextInt();
        int s1C = sc.nextInt();
        students[1] = new Student(s1A,s1B,s1C);
        System.out.println("marks of Student 2 in subjects A,B,C");
        int s2A = sc.nextInt();
        int s2B= sc.nextInt();
        int s2C = sc.nextInt();
        students[2] = new Student(s2A,s2B,s2C);
        System.out.println("marks of Student 3 in subjects A,B,C");
        int s3A = sc.nextInt();
        int s3B= sc.nextInt();










    }
}
