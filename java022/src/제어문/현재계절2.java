package ���;

import java.util.Date;

public class �������2 {

	public static void main(String[] args) {

		Date date = new Date();
		int month = date.getMonth() + 1;
		
		if(month == 3 || month == 4 || month == 5) {
			System.out.println("��");
		}else if(month == 6 || month == 7 || month == 8) {
			System.out.println("����");
		}else if(month == 9 || month == 10 || month == 9) {
			System.out.println("����");
		}else
			System.out.println("�ܿ�");
		
	}

}
