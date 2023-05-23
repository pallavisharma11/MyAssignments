package LambdaExpreession;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
interface print{
    void print(int totalPrice,String status);
}
public class Question2 {
    private int totalPrice;
    private String status;
    Question2(int totalPrice,String status){
        this.totalPrice=totalPrice;
        this.status=status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public String toString(){
        return totalPrice + status;
    }

    public static void listOfOrders(ArrayList<Question2> orders) {
        ArrayList<Question2> selectedOrders = new ArrayList<>();
        Stream<Question2> filtered_data = (Stream<Question2>) orders.stream().filter(p -> p.totalPrice > 10000).filter(p->p.status=="Completed" || p.status=="Accepted");
        filtered_data.forEach(
                product -> System.out.println(product.totalPrice+": "+product.status)
        );




    }
    public static void main(String[] args) {
        //Question2 object = new Question2(50000,"Accepted");
        ArrayList<Question2> details = new ArrayList<>();
        details.add(new Question2(4000,"Completed"));
        details.add(new Question2(11000,"Accepted"));
        details.add(new Question2(4000,"Not Completed"));
        details.add(new Question2(34000,"Completed"));
        listOfOrders(details);



    }
}
