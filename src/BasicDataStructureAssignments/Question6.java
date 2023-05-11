package BasicDataStructureAssignments;

import java.util.Scanner;

class Login1{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        if(user.equals(userId) && pass.equals(password)){
            return "Welcome "+user;
        }
        else if (user.equals(userId) && pass.equals(password)){
            return "You have entered wrong credentials ,please enter the right credentials.";
        }
        else{
            return "You have entered wrong credentials 3 times";
        }
    }

}
public class Question6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login1 object = new Login1();
        int count =3;
        while(count!=3){
            System.out.println("Enter UserId");
            String userId = sc.next();
            System.out.println("Enter Password");
            String password = sc.next();
            System.out.println(object.loginUser(userId,password));
        }


    }
}
