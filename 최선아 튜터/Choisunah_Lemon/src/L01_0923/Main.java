package L01_0923;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int month = 4;
	    String season = "";

	    switch (month){
            case 1:
                season = "겨울";
                break;
            case 2:
                season = "겨울";
                break;
            case 3:
                season = "봄";
                break;
            case 4:
                season = "봄";
                break;
            case 5:
                season = "봄";
                break;
            case 6:
                season = "여름";
                break;
            case 7:
                season = "여름";
                break;
            case 8:
                season = "여름";
                break;
            case 9:
                season = "가을";
                break;
            case 10:
                season = "가을";
                break;
            case 11:
                season = "가을";
                break;
            case 12:
                season = "겨울";
                break;
        }
        System.out.println("지금은 "+month+" 월이고 "+season+" 입니다");

	    int i = 1;
	    while(i<=10){
	        System.out.println(i);
	        i++;
        }

	    int value=0;

        Scanner scan = new Scanner(System.in);//꼭 필요

        do {
            value = scan.nextInt();
            System.out.println("입력받은 수:" + value);
        }while (value != 10);

        System.out.println("반복문 종료");


        for(int N=5; N>=1; N--){
            System.out.println(N);
        }
    }
}
