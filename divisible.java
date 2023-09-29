import java.util.*;
public class divisible {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the value of n:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n%5==0 && n%11==0){
         System.out.println("divisible by both 5 and 11");
        }
        else{
         System.out.println("not divisible by both 5 and 11");
        }
    }
}
