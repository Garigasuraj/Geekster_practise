import java.io.*;
import java.util.*;

public class fabinacco{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();
        //int max; int min;
        // taking array input
        int arr[] = new int[x];
        for(int i=0; i<x; i++){
            arr[i]=Sc.nextInt();
        }
        // inistalising an array
        for(int i=0; i<x;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
            else if (arr[i]%2 != 0){
                //System.out.println();
                System.out.print(arr[i]+ " ");
            }

            }
        }
    }
