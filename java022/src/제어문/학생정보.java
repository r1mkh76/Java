package ���;

import java.util.Scanner;

public class �л����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� �̸��� �Է� : ");
		String name = sc.next();

		System.out.print("�л��� ������ �Է� : ");
		int a = sc.nextInt();
		
		if (a >= 90) {
			System.out.println("A���� �Դϴ�.");
		} else if (a >= 80) {
			System.out.println("B���� �Դϴ�.");
		} else if (a >= 70) {
			System.out.println("C���� �Դϴ�.");
		} else if (a >= 60) {
			System.out.println("D���� �Դϴ�.");
		} else {
			System.out.println("F���� �Դϴ�.");
		}

	}

}
