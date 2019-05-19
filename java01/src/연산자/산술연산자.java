package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 한 줄 삭제 : 컨트롤 + d
		// 들여쓰기 : tab
		// 자동정리 : 컨트롤 + 쉬프트 + f(format)
		int x = 5;
		int y = 3;
		System.out.println(x + y);
		
		int z = x + y;
		System.out.println("두 수의 합은 " + z);
		System.out.println(x + " + " + y + " = " + z);
		// 복사 : 컨트롤 + 알트 + 화살표 방향 (복사)
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
		System.out.println(x + " % " + y + " = " + (x % y));
		// 이동 : 알트 + 화살표 방향
		
		
	}

}
