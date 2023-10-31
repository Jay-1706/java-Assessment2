import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principle");
        float principle=sc.nextFloat();
        System.out.println("Enter the rate");
        float rate=sc.nextFloat();
        System.out.println("Enter the time");
        float time=sc.nextFloat();
        float SI=(principle*rate*time)/100;
        System.out.println("Simple Interest is :" +SI);
    }
}
