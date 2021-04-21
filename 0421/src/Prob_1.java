import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("시작숫자");
			int a;
			int b;
			int sum = 0;
			a=scan.nextInt();
			System.out.println("마지막숫자");
			b=scan.nextInt();
			for ( int i=a; i<=b; i++){
				sum = sum+i;
			
			
			}
			System.out.println(a + "부터 " + b + "까지의 합은 " + sum);
		}

}