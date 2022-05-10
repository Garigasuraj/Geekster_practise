import java.util.*;
import javax.sound.midi.Synthesizer;
import java.lang.*;
import java.io.*;
 
public class rock_paper{
    public static void main(String[] args)
    {
        //taking the input from the user
        Scanner Sc =  new Scanner(System.in);
        System.out.println(" please enter: \n 1.stone 2.paper 3.scissor");
        int x, tie = 0, user = 0, comp = 0;
        x = Sc.nextInt();
        for (int i=0; i<=4; i++){
            //System.out.println("plese enter: \n 1.stone 2.paper 3.scissor");
        }
        if (x == 1){
            System.out.println("user choose: stone");
        }else if ( x == 2){
            System.out.println("user choose: paper");
        }else if ( x == 3){
            System.out.println("user choose: scissor");
        }else {
            System.out.println("wrong input");
        }
        // taking random pick
        Random Ra = new Random();
        int computer = Ra.nextInt(3);

        if (computer == 0){
            System.out.println("computer choose: stone");
        }else if (computer == 1){
            System.out.println("computer choose: paper");
        }else {
            System.out.println("computer choose: scissor");
        }// using if statement
        if (x == 1 && computer == 0 || x == 2 && computer == 1 ||
        x == 3 && computer == 2
        ){
            System.out.println("the match is tie");
            tie++;
        }else if( x == 1 && computer == 2 || x == 2 && computer == 0 ||
        x == 3 && computer == 1
        ){
            System.out.println(" the match won by user");
            user++;
        }else {
            System.out.println("computer win");
            comp++;
        }
    }
}