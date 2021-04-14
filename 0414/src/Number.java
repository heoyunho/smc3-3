import java.util.Scanner;
public class Number {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("10개의 렌덤 숫자 중 하나를 맞춰보세요.(1에서 50까지):");
		
		int a=sc.nextInt(); //입력받은 숫자
		int c=0; //같은 값을 확인해주는 변수
		for(int i=0;i<10;i++){ //FOR문
			int b =(int)(Math.random()*50+1);   //랜덤값 50까지
			System.out.print(b+" ");
			if(a==b){// 맞는게 있으면 1로 선언
				c=1;
			}
		}
		if(c==1){
			System.out.println("\n정답"); 
		}else{
			System.out.println("\n오답");
		
		}
	}		
}
	


