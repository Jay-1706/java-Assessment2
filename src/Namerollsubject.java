import java.util.Scanner;
public class Namerollsubject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String first_name=sc.next();
        String second_name=sc.next();
        System.out.println("Enter the name:" +first_name+second_name);
        System.out.println("Enter the roll no");
        int rollno =sc.nextInt();
        System.out.println("Enter the interested subject");
        String interestedsubject =sc.next();
    }
}
