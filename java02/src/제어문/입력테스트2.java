package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ2 {

	public static void main(String[] args) {
		
		// �Է� ����
		// �Է��� �� �ִ� ��ǰ ����ؾ� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���̴� ");
		int age = sc.nextInt();
		// ��� �Է��� ������ Ÿ���� String!!!
		// Scanner�� nextInt()�� String -> int�� ��ȯ
		System.out.println("����� ���̴� " + age +"�� �ñ���.");
		
		// �̸� �Է�, ���
		Scanner sc2 = new Scanner(System.in);
		System.out.print("����� ���� �Է� : ");
		String name = sc2.next();
		System.out.println("����� ���� : " + name);
		
	}

}
