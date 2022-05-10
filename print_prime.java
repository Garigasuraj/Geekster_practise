import java.util.*;
import java.io.*;

public class print_prime{
    //printing prime numbers
    public static void main(String[] args) {
        int sum;
        for(int i=2; i<=100; i++){
            sum=0;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    sum++;
                    break;
                }
            }
            if(sum==0)
            System.out.print(i+" ");
        }
    }
}