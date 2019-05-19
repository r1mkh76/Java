package 제어문;

import java.util.Scanner;

public class 학생정보 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력 : ");
		String name = sc.next();
		
		System.out.print("학생의 점수를 입력 : ");
		String a = sc2.next();
		
		if(a >= 90) {
			System.out.println(name + "의 점수 " + a + "점은 A학점 입니다.");
		}else if(a >= 80){
			System.out.println(name + "의 점수 " + a + "점은 B학점 입니다.");
		}else if(a >= 70) {
			System.out.println(name + "의 점수 " + a + "점은 C학점 입니다.");
		}else if(a >= 60) {
			System.out.println(name + "의 점수 " + a + "점은 D학점 입니다.");			
		}else {
			System.out.println(name + "의 점수 " + a + "점은 F학점 입니다.");
		}
		
	}

}
