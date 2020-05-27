package exam.operator;

import java.util.Scanner;

public class AppleBox {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("사과 갯수를 입력하세요");
			int apple = scan.nextInt();
			System.out.println("한 박스에 들어갈 갯수를 입력하세요");
			int box = scan.nextInt();
			int emptybox = apple/box;
			int remainder = apple % box;
			System.out.println("사과의 총 갯수는"+apple);
			System.out.println(emptybox+"박스"+remainder+"개");
		}
	}


