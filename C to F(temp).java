import java.util.*;
import javax.sql.rowset.spi.SyncResolver;
import java.io.*;
// using static method
public class suraj{ // caal fibonacci
    // 0,1,1,2,3,5,8,13,21,34
    static int sum(int n){
        if(n==0){
            return -40;
        }else{
            return (n*9/5)+32;
        }

    }
    public static void main(String[] args) {
        // call the function

        int c = sum(5);
        System.out.println(c);
    }
}

