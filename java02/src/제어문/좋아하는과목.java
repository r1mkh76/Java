package 제어문;

import java.util.Date;
import java.util.Scanner;

public class 좋아하는과목 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 과목(선택 : 1)파이썬, 2) 자바, 3) C++    :    ");
		int sub = sc.nextInt();
		
		switch(sub) {
		case 1:
			System.out.println("파이썬은 쉽고 강해요.");
			break;
		case 2:
			System.out.println("자바는 실무에서 쓰여요");
			break;
		case 3:
			System.out.println("C++은 정교해요.");
			break;
		}
		
	}

}
