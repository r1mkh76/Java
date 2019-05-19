package 제어문;

import java.util.Scanner;

public class 사칙연산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자 [ 1) +, 2) -, 3) *, 4) /] : ");
		int a = sc.nextInt();
		
		System.out.print("숫자 1 : ");
		int a1 = sc.nextInt();
		
		System.out.print("숫자 2 : ");
		int a2 = sc.nextInt();
		
		//String opwer = sc.next();
		//char op = oper.charAt(0);
		
		if(a == 1) {
			System.out.println(a1 + " + " + a2 + " = " + (a1 + a2));
		} else if(a == 2){
			System.out.println(a1 + " - " + a2 + " = " + (a1 - a2));
		} else if(a == 3){
			System.out.println(a1 + " * " + a2 + " = " + (a1 * a2));
		} else if(a == 4){
			System.out.println(a1 + " / " + a2 + " = " + (a1 / a2));
		}
		
	}
	

}