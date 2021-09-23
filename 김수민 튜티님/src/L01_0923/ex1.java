package L01_0923;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch (month) {
		case 12, 1, 2: {
			System.out.println("겨울");
			break;
		}case 3, 4, 5: {
			System.out.println("봄");
			break;
		}case 6, 7, 8: {
			System.out.println("여름");
			break;
		}case 9, 10, 11: {
			System.out.println("겨울");
			break;
		}
		default:
			System.out.println("올바른 값이 아닙니다.");
		}

	}

}
