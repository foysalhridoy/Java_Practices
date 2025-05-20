import java.util.Scanner;
//Mini Project
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do{
            System.out.println("Guess my number:");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("You guessed it right!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Too high!");
            }
            else{
                System.out.println("Too low!");
            }

        } while(userNumber >= 0);
        System.out.println("My number was");
        System.out.println(myNumber);
    }
}
