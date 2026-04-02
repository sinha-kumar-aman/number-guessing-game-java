import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random rand=new Random();
        int rand1=rand.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int attempts=3;
        boolean gussed=false;
        System.out.println("You have only "+ attempts +" chances");
        for(int i=1;i<=attempts;i++){
            System.out.print("Guess the number between 1 to 100 : ");
            int num = sc.nextInt();
            System.out.println();
            if(num>100 || num<1){
                System.out.println("Number exceeds 100");
                System.out.println("Please choose number between 1 to 100");
                continue;
            }
            if(rand1==num){
            System.out.println("You gussed right "+rand1);
            System.out.println();
            gussed=true;
            break;
        }
            else if(num>rand1){
                System.out.println("Number too high, Try a smaller number");
                System.out.println();
            }
            else if(num<rand1){
                System.out.println("Number too low, Try a larger number");
                System.out.println();
            }
            
            }
            if(gussed==false){
                System.out.println("OOPS ! ");
                System.out.println();
                System.out.println("You are out of chances");
                System.out.println();
                System.out.println("Right number was : "+rand1);
            }
        
    }   
}
