package exam.operator;

public class CompareExample {
	public static void main(String[] args) {
		System.out.println(1==1);
		System.out.println('A'==65);
		System.out.println('A'<'B');
		System.out.println(3==3.0);
		System.out.println(0.1==0.1f);
		System.out.println(1.0==1.0f);
		
		String str1 ="대구";
		String str2 ="대구";
//		같은 문자열이면 하나만 만들어서 같이 사용한다
		
		String str3 =new String("대구");
		String str4 =new String("대구");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
//		위 세가지는 주소값을 비교
		
		System.out.println(str3.equals(str1));
//		이건 문자 자체를 비교 이를 위해 equals라는 method를 따로 제공한다.
	}

}
