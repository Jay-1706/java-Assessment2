import java.util.Scanner;
public class Threesubject
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark1=sc.nextInt();
        int mark2=sc.nextInt();
        int mark3=sc.nextInt();
        int total_marks=mark1+mark2+mark3;
        System.out.println(total_marks);
        int percentage=total_marks/3;
        System.out.println(percentage +"%");


    }
}
