package ���;

import java.util.Date;

public class �ð�����ǰ��� {

	public static void main(String[] args) {

		Date date = new Date();
		
		int y = date.getYear() + 1900; // �ð��� ������.
		System.out.print(y + "�� ");
		
		int mo = date.getMonth() + 1; // �ð��� ������.
		System.out.print(mo + "�� ");
		
		int d = date.getDay() + 19;
		System.out.print(d + "�� ");
		
		int hour = date.getHours() ; // �ð��� ������.
		System.out.print(hour + "�� ");
		
		int m = date.getMinutes();
		// ���� : ��Ʈ�� + alt + ȭ��ǥ(��,�Ʒ�)
		// �̵� : alt + ȭ��ǥ(��,�Ʒ�)
		System.out.print(m + "�� ");
		
		int s = date.getSeconds();
		System.out.println(s + "��");
		
	}

}
