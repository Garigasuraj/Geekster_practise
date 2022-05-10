import java.util.*;
import java.io.*;
import java.lang.*;

// using method in inhertance
public class kittu{
    static void fab(int N){
        //print 1st fab numbers
        // 0 1 1 2 3 5 8 13 21 34
        int n1 =0; int n2=1;
        int sum =0;

        // itresting using while loop
        while(sum<N){
            System.out.print(n1+" ");
            int n3 = n2 +n1;
            n1 = n2;
            n2 =n3;
            sum += 1;
        }
    }
    public static void main(String[] args) {
        //kittu obh = new kittu();
        //int c = obh.fab(5);
        int N =5;
        fab(N);
    }
}

