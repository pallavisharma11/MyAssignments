package LambdaExpreession;
interface addition{
    double addition();
}
interface subtraction{
    double subtraction();
}
interface multiplication{
    double multiplication();
}
interface division{
    double division();
}
public class Question1 {
    public double addition(int num1,int num2){
        addition add  = () -> {
            return num1 + num2;
        };
        return num1+num2;
    }
    public double subtraction(int num1,int num2){
        subtraction sub = () -> {
            return num1 - num2;
        };
        return num1-num2;

    }
    public double multiplication(int num1,int num2){
        double multi;
        multiplication mul = () -> {
            return  num1*num2;
        };
        return num1*num2;

    }
    public double division(int num1, int num2){
        division div = () -> num1/num2;
        return num1/num2;

    }
    public static void main(String[] args) {
        int a = 50,b=10;
        Question1 object = new Question1();
        System.out.println("Addition of two number "+object.addition(a,b));
        System.out.println("Subtraction Of Two Number "+object.subtraction(a,b));
        System.out.println("Multiplication of two number "+object.multiplication(a,b));
        System.out.println("Division of two number "+object.division(a,b));


    }

}
