import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1, str2,result,result2;
        System.out.println("Please enter the first string: ");
        str1= br.readLine();
        System.out.println("Please enter the second string: ");
        str2= br.readLine();

        result=str1.concat(str2);
        System.out.println("The first concatenated string is: " +result);

        result2=str2.concat(str1);
        System.out.println("The second concatenated string is: "+ result2);

        if(result.equals(result2)){
            System.out.println("The concatenated words or strings are equal!");
        }else{
            System.out.println("The concatenated words or strings are not equal!");
        }





    }
}
