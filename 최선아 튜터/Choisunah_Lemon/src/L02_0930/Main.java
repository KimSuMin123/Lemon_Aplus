package L02_0930;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1,2번 문제 - 필드를 생성하고 생성자에서 초기화 하여 객체생성 연습*/
        school s_s = new school();
        school s_s2 = new school("Seogwipomiddle",1);

        /*3번 문제 - trim 연습*/
        String id;
        String pw;

        Scanner scanner = new Scanner(System.in);
        System.out.println("아이디:");
        id = scanner.next();
        System.out.println("비밀번호:");
        pw = scanner.next();

        System.out.println("id:"+id.trim());
        System.out.println("pw:"+pw.trim());

        /*4번 문제 - Arrays.toString & toCharArray & charAt연습 */
        String s = "hello!";
        String arr_s = Arrays.toString(s.toCharArray());

        char char13 = arr_s.charAt(13);
        char char16 = arr_s.charAt(16);

        System.out.println(arr_s);
        System.out.print(char13);
        System.out.println(char16);

        /*5번 문제 - indextof 연습*/
        String s_s_indexof = "You are a Lucky duck";
        int index_Lucky = s_s_indexof.indexOf("Lucky");
        System.out.println("index:"+index_Lucky);

        /*6번 문제 - split 연습*/
        String s2 = "고양이/강아지/코끼리/개구리";
        String[] arr_animal = s2.split("/");

        for (int i=0;i<arr_animal.length;i++){
            System.out.println(arr_animal[i]);
        }

        /*7번 문제 - endswith 연습*/
        String s3= "text.txt";
        boolean end = s3.endsWith(".txt");
        System.out.println(end);
    }
}
