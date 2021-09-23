package L01_0923;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int value;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			value = scan.nextInt();
			System.out.println("입력받은 수 : " + value);
		}while (value != 10);
		
		System.out.println("반복문 종료");
		

	}

}
