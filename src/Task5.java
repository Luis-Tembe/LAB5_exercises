import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Task5 {
    public static void main(String[] args) throws IOException {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         String str, reverse="",Change_To_Lower;
         System.out.println("Please enter a String: ");
         str= br.readLine();
         Change_To_Lower=str.toLowerCase();
         System.out.println("The string in lowercase: "+Change_To_Lower);

        //this variable i declared is for the length of the string we get from user
         int length=str.length();

         for(int i=length-1;i>=0;i--){
             reverse=reverse+Change_To_Lower.charAt(i);
         }

         //if statement to check if the word satisfies the condition
         if(Change_To_Lower.equals(reverse))
             System.out.println(Change_To_Lower+" is a palindrome");
         else
             System.out.println(Change_To_Lower+" is not a palindrome");

    }
}
