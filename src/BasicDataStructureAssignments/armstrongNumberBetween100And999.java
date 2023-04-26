package BasicDataStructureAssignments;
class ArmstrongNumBetweenRange{
    int[] arrays = new int[10];
    public int[] armstrongNumbersInRange(int min , int max){
        for(int i =0;i<10;i++){
            for(int j =min;j<=max;j++){
                if(checkArmstrong(j)){
                    if(!containsElements(j)){
                        arrays[i]=j;
                        break;
                    }
                }
            }
        }
    return arrays;


    }
    public boolean containsElements(int num){
        for(int i : arrays){
            if(i==num) {
                return true;
            }
        }
        return false;
    }
    public boolean checkArmstrong(int num){
        int tem = num,rem =0,sum=0;
        while(num!=0){
            rem = num%10;
            sum +=rem*rem*rem;
            num /=10;
        }
        if(sum==tem){
            return true;
        }
        else{
            return false;
        }

    }
}
public class armstrongNumberBetween100And999 {
    public static void main (String [] args) {

        int min = 100;int max = 999;
        ArmstrongNumBetweenRange obj  = new ArmstrongNumBetweenRange();
        int[] arrays = obj.armstrongNumbersInRange(min,max);
        for(int i : arrays){
            if(i!=0)
                System.out.println(i);
        }
    }
}
