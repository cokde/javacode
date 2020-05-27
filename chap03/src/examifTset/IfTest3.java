package examifTset;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		System.out.println("주사위 숫자를 입력하세요");
		Scanner scan= new Scanner(System.in);
		int count=0;
		while(count<=4) {

			int com=((int)(Math.random()*6)+1);
			System.out.println(com);
			int player=scan.nextInt();
			if(player>=1 && player<=6) {
				//			조건을 2개 걸어줄 것.
				if(com==player) {
					System.out.println("OK");
					count=++count;
				}else {
					System.out.println("Try Agan");
				}
			}
			else {
				System.out.println("Out of Number");
			}


			System.out.println(count + "번 맞았습니다");

		}
	}
}

