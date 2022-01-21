package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 놀이기구 이용제한
 * 
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */


public class IfEx09_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("키 입력 :");
		int key = scan.nextInt();
		
		if (key >=120) {
			System.out.println("놀이기구 사용가능합니다");
		}
		
		if (key < 120) {
			System.out.println("놀이기구 사용불가능");
		}
		
		System.out.println("부모님과 함께 오셨나요?(1.yes 2.no");
		int qnah = scan.nextInt();
		
		if  (qnah == 1) System.out.println("입장이 가능합니다");
		if  (qnah == 2) System.out.println("입장이 불가능합니다");
		
	
		
		
	
	}

}
