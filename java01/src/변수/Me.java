package 변수;

public class Me {

	public static void main(String[] args) {
		// 변수를 만들어 봅시다.
		int age = 100; //올해 나이
		byte count = 127; // -128~127
		short count2 = 30000; // -3만 ~ 3만
		int last = age - 1; // 작년나이
		long count3 = 1234546454312345464l; 
		
		float eye2 = 0.9f; // 소수점 8자리 까지
		double eye = 0.5;
		char gender = '남';
		boolean food = true; // false
		String name = "임강현";
		
		System.out.println("내 이름은 " + name);
		System.out.println("내 나이는 " + age + "세 입니다.");
		System.out.println("작년 나이는 " + last + "세 였습니다.");
		System.out.println("내 시력은 "+ eye);
		System.out.println("내 성별은 " + gender);
		System.out.println("아침을 먹었나요?? " + food);
		
		
	}

}
