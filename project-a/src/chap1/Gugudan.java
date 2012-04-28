package chap1;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		System.out.print("gugudanfrom:");

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		//
		for (; i<9; i++){
			printDan(i);
		}
	}

	public static void printDan(int i) {
		for (int j = 1; j < 10; j++) {
			int k=i*j;
			System.out.print(i + "*" + j + "=" +k+ "\n");
		}
	}
}
 