package L01_0923;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		int value = 0;
		
		Scanner sc = new Scanner(System.in); //필수
		
		do {
			value =sc.nextInt();
			System.out.println("입력받은 수 : " + value);
		}while(value != 10);
		
			System.out.println("반복문 종료");
	}
}
