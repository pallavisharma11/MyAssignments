package CollectionFramework;
import java.util.*;
class Contact{
    Long phoneNumber;
    String name;
    String email;
    String gender;
    Contact(String name,String email,String gender){
//        this.phoneNumber=phoneNumber;
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
}
public class Question1 {
    TreeMap<Long,Contact> map=new TreeMap<Long,Contact>();
    Contact c1 = new Contact("Pallavi","pallavi@gmail.com","Female");
    Contact c2 = new Contact("Parth","parth@gmail.com","Male");
    Contact c3 = new Contact("Kashish","kashish@gmail.com","Female");


}
