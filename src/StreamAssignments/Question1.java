package StreamAssignments;
import java.util.*;
import java.util.stream.Collectors;

class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;
    public int getCalories(){
        return calories;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    Fruit(String name,int calories,int price,String color){
        this.name=name;
        this.calories=calories;
        this.price=price;
        this.color=color;
    }
}
public class Question1 {
    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        List<String> productPriceList =
                fruits.stream()
                        .filter(fruit->fruit.getCalories() < 100)   // filter product on the base of price
                        .map(Fruit->Fruit.getName())
                        .collect(Collectors.toList());   // collect it as Set(remove duplicate elements)
        Collections.sort(productPriceList);
        Collections.reverse(productPriceList);
        return productPriceList;
//        List<String> sortedListDesc =
//                productPriceList.stream()
//                        .sorted(Comparator.reverseOrder())
//                        .collect(Collectors.toList());
//        return sortedListDesc;

    }



    public static void sort(ArrayList<Fruit> Fruits) {
        Map<String,String> productPriceMap =
                Fruits.stream()
                        .collect(Collectors.toMap(p->p.getName(), p->p.getColor()));

        System.out.println(productPriceMap);

    }
//
    public static List<String> filterRedSortPrice(ArrayList<Fruit> fruits){
        List<String> productPriceList =
                fruits.stream()
                        .filter(fruit->fruit.getColor().equals("Red"))   // filter product on the base of price
                        .map(Fruit->Fruit.getName())
                        .collect(Collectors.toList());

        return productPriceList;
    }

    public static void main(String[] args) {
        ArrayList<Fruit> list = new ArrayList<>();
        list.add(new Fruit("Banana",250,310,"Yellow"));
        list.add(new Fruit("Kiwi",20,130,"Green"));
        list.add(new Fruit("Apple",60,100,"Red"));
        list.add(new Fruit("Orange",50,70,"Orange"));
//        list.add(new Fruit("Pallo",90,678,"Red"));
        List<String> ans = reverseSort(list);
        System.out.println(ans);
        sort(list);
        List<String> ans3 = filterRedSortPrice(list);
        System.out.println(ans3);



    }
}
