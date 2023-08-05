import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args) {
        //rock+seasor = true
        //seasor+paper = true
        //paper+rock = true
        System.out.println("Rock Paper & Seasor Game \n For Rock=0, Paper=1, Seasor=2");
        Random rn = new Random();
        int cmp = rn.nextInt(3);
        Scanner sc = new Scanner(System.in);
        System.out.print("User take: ");
        Byte user = sc.nextByte();
        if(cmp==user){
            System.out.println("Draw");
        }
        else if((user==0 && cmp==2) || (user==2 && cmp==1) || (user==1 && cmp==0)){
            System.out.println("Winner");
        }
        else{
            System.out.println("Loser");
        }
        System.out.print("Computer take: ");
        if(cmp==0)
            System.out.println("Rock");
        if(cmp==1)
            System.out.println("Paper");
        if(cmp==2)
            System.out.println("Seasor");
    }
}