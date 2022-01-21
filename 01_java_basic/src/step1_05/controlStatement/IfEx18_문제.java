package step1_05.controlStatement;



import java.util.Random;

import java.util.Scanner;


/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		
		
		 com = scan.nextInt(3);
		 
		 System.out.print( "가위(0),바위(1),보(2)");
		 me = scan.nextInt();
		 
		 if (me == com) {
			 System.out.println("비겼다");
		 }
		 
		 else if (com == 0 && me == 2) {
			 System.out.println("이겼다");
		 }
		 
		 else if (com == 2 && me == 1 ) {
			 System.out.println("이겼다");
		 }
		 
		 else if (com == 1 && me == 0) {
			 System.out.println("이겼다");
		 }
		 
		 else {
			 System.out.println("졌다");
		 }
		 
		 scan.close();
		
	}

}
