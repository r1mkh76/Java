package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ5 {

	public static void main(String[] args) {
		
		System.out.print("���� �ð� : ");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		
		if(time <= 10) {
			System.out.println("�¸��");
		}else if(time <= 14) {
			System.out.println("�¿����ʹ�");
		}else if(time <= 20) {
			System.out.println("���̺��");
		}else {
			System.out.println("�³���");
		}
		
		
	}

}
