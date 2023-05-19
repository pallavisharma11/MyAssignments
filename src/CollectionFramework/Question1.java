package CollectionFramework;
import java.util.*;
class Contact{
    Long phoneNumber;
    String name;
    String email;
    String gender;
    Contact(Long phoneNumber,String name,String email,String gender){
        this.phoneNumber= phoneNumber;
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public Long getPhoneNumber(){
        return phoneNumber;
    }
    public String toString(){
        return name+" "+email+" "+gender;
    }
}
class SortAccordingPhoneNumber implements Comparator<Contact>{
    @Override
    public int compare(Contact c1, Contact c2) {
        return c2.getPhoneNumber().compareTo(c1.getPhoneNumber());
    }
}
public class Question1 {
    public static void main(String[] args) {

        TreeMap <Contact,Long> map = new TreeMap<>(new SortAccordingPhoneNumber());
        map.put(new Contact(1234567891l ,"Pallavi", "pallavi@gmail.com", "Female"),1234567891l);
        map.put(new Contact(8889993331l,"Parth","parth@gmail.com","Male"),8889993331l);
        map.put(new Contact(9959967006l,"Kashish","kashish@gmail.com","Female"),9959967006l);
        for (Map.Entry<Contact, Long> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

    }


}
