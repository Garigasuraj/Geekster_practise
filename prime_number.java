import java.util.*;

public class prime_number{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int sum=0;

        for(int i=2; i<=n/2 ; i++){
            //sum=0;
            for(int j=2; j<i; j++){
                if(n%i==0){
                    sum++;
                    break;
                }
            }
        }
        if(sum==0){
            System.out.println("pime");
        }else{
            System.out.println("not prime");
        }
    }
    
}
