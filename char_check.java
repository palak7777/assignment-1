import java.util.Scanner;
public class char_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char a = sc.next().charAt(0);
        if((a >='A'&& a <='Z') || (a>='a' && a<='z')){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Anything else");
        }
    }
}
