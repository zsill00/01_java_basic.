package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
	
		System.out.println("계좌번호 :");
		int Account = scan.nextInt();
		
		if (yourAcc == Account ) {
			
			System.out.println("이체 금액을 입력하시요");  // 이체 금액 입력
			int transfer = scan.nextInt();				   // 이체 금액 입력
			
			if (transfer <= myMoney) { // 이체할 금액 
				myMoney = myMoney - yourMoney;    // myMoney - 이체할 금액
				yourMoney = yourMoney + transfer; // yourMoney + 이체할 금액
				System.out.println("이체가 완료 되었습니다");
			}
			else {
				System.out.println("계좌잔액이 부족합니다");
			}
			
		}
		else {
			System.out.println("계좌번호를 입력해주세요");
		}
		
		scan.close();
	}

}
