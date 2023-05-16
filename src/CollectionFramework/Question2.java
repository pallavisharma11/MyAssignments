package CollectionFramework;
import java.util.*;
class product {
    int price;
    String name;
    // Constructor
    public product(String name, int price)
    {
        this.price = price;
        this.name = name;
    }
    // Getters and Setters
    public int getMarks() { return price; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void setMarks(int marks) { this.price = marks; }
    @Override public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    // if both the object references are
    // referring to the same object.
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        // type casting of the argument.
        product other = (product)obj;

        // comparing the state of argument with
        // the state of 'this' Object
        if (price != other.price)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        return true;
    }
}
public class Question2 {
    public static void main(String[] args)
    {

        HashSet<product> set = new HashSet<>();


        set.add(new product("cream", 499));
        set.add(new product("Maggie", 12));
        set.add(new product("Nachos", 50));
        set.add(new product("Shampoo", 451));
        set.add(new product("Shampoo", 451));
        for (product std : set) {
            System.out.println(std.name + " " + std.price);
        }
    }
}
