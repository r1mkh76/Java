package ���;

import java.util.Scanner;

public class �����ֹ� {

	public static void main(String[] args) {
		
		System.out.println("�����!!!");
		System.out.println("-----------------------------------");
		System.out.println("�޴��� ������.");
		System.out.println("-----------------------------------");
		System.out.println("1)¥���, 2) «��, 3) �쵿");
		System.out.println("-----------------------------------");
		System.out.print("����� ������? ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("����� ¥����� �ֹ��ϼ̽��ϴ�.");
		}else if
		(menu == 2) {
			System.out.println("����� «���� �ֹ��ϼ̽��ϴ�.");
		}else if(menu == 3){
			System.out.println("����� �쵿�� �ֹ��ϼ̽��ϴ�.");
		}
		
		
	}

}
