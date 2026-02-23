// USE CASE 1
import java.util.Scanner;
public class PallindroneCheckerApp {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s;
         System.out.println("Welcome to Palindrone Checker App Management System");
         System.out.println("Enter a string(lower case):");
         s=sc.nextLine();
         String text="";
     for (int i=s.length()-1;i>=0;i--){
         text=text + s.charAt(i);
     }
     if(s.equals(text)){
         System.out.println(" Palindrone");
     }else{
         System.out.println(" Not Palindrone");

     }
     sc.close();


    }
}
