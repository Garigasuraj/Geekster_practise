import java.io.*;
import javax.annotation.processing.SupportedSourceVersion;

public class Plaindrome{
    public static void main(String[] args) 
    {
        // reversing a string
        String x = "MADAM";
        //tring orr =x;
        String sum=" "; // 0 is an integer 
        // " " is f0r string
        int put = x.length();
        System.out.println(put);
        // reversing a string using for loop
        for(int i=put-1; i>=0; i--){
            sum += x.charAt(i);
        }
        System.out.println(sum);
        if(x.compareTo(sum)==0){
            System.out.println(" yes");
        }else{
            System.out.println("no");
        }
    }
    
}
