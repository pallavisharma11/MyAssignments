package StringBuilder;

public class Question2 {
    public static void main(String[] args)
    {


        StringBuilder str = new StringBuilder("It is used to _ at the specific index position");
        System.out.println("String = " + str.toString());
        StringBuilder strReturn = str.replace(14, 15, "insert text");
        System.out.println("After Replace() String = "
                + strReturn.toString());
    }
}
