package ���;

import java.util.Scanner;

public class �л����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է� : ");
		String name = sc.next();
		
		System.out.print("�л��� ������ �Է� : ");
		String a = sc2.next();
		
		if(a >= 90) {
			System.out.println(name + "�� ���� " + a + "���� A���� �Դϴ�.");
		}else if(a >= 80){
			System.out.println(name + "�� ���� " + a + "���� B���� �Դϴ�.");
		}else if(a >= 70) {
			System.out.println(name + "�� ���� " + a + "���� C���� �Դϴ�.");
		}else if(a >= 60) {
			System.out.println(name + "�� ���� " + a + "���� D���� �Դϴ�.");			
		}else {
			System.out.println(name + "�� ���� " + a + "���� F���� �Դϴ�.");
		}
		
	}

}
