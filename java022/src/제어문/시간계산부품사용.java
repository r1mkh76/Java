package 제어문;

import java.util.Date;

public class 시간계산부품사용 {

	public static void main(String[] args) {

		Date date = new Date();
		
		int y = date.getYear() + 1900; // 시각을 구해줌.
		System.out.print(y + "년 ");
		
		int mo = date.getMonth() + 1; // 시각을 구해줌.
		System.out.print(mo + "월 ");
		
		int d = date.getDay() + 19;
		System.out.print(d + "일 ");
		
		int hour = date.getHours() ; // 시각을 구해줌.
		System.out.print(hour + "시 ");
		
		int m = date.getMinutes();
		// 복사 : 컨트롤 + alt + 화살표(위,아래)
		// 이동 : alt + 화살표(위,아래)
		System.out.print(m + "분 ");
		
		int s = date.getSeconds();
		System.out.println(s + "초");
		
	}

}
