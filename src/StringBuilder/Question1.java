package StringBuilder;

public class Question1 {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("StringBuffer ");
        sb.append("is a peer class of String ");
        sb.append("that provide much of ");
        sb.append("the functionality of string");
        String message = sb.toString();
        System.out.println(message);
    }
}
