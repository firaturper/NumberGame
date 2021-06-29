import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Random rasgele = new Random();
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("Enter A Number From 1 To 5");
		int a = scan.nextInt();
		int b = rasgele.nextInt(5);
	   if(a==b) {
		   System.out.println("Congratulations, Your Guess Has Been..."+"Your Guess: "+ a + "Result: "+b);
	       continue;
	   } else {
		   System.out.println("Sorry Wrong Choice..."+"Your Guess: "+ a + "Result: "+b);
		   continue;
	   }
		}
	}

}
