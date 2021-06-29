import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Random rasgele = new Random();
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("1 ila 5 arasýnda bir sayý giriniz");
		int a = scan.nextInt();
		int b = rasgele.nextInt(5);
	   if(a==b) {
		   System.out.println("Tebrikler tahmininiz Tuttu...  "+"Tahmin: "+ a + "  Çýkan sayý: "+b);
	       continue;
	   } else {
		   System.out.println("Maalesef Yanlýþ Tercih...  "+"Tahmin: "+ a + "  Çýkan sayý: "+b);
		   continue;
	   }
		}
	}

}
