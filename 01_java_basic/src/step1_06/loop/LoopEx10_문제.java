package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("dbMoney1 = " + dbMoney1 + "원");
			System.out.println("dbMoney2 = " + dbMoney2 + "원");
			
			System.out.println("*상태  : ");
			
			if(identifier == -1) {
				System.out.println("로그아웃");
			}
			else if (identifier == 1) {
				System.out.println(dbAcc1 + "로그인");
			}
			else if(identifier == 2) {
				System.out.println(dbAcc2 + "로그인");
			}
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				if(identifier == -1) {
					System.out.println("계좌번호 입력 : ");
					int myAcc = scan.nextInt();
					
					System.out.println("비밀번호 입력 : ");
					int myPw = scan.nextInt();
					
					if (dbAcc1 == myAcc && dbPw1 == myPw) {
						identifier = 1;
						System.out.println("dbAcc1 + 님, 환영합니다.");
					}
					else if (dbAcc2 == myAcc && dbPw2 == myPw) {
						identifier = 2;
						System.out.println(dbAcc2 + "님, 환영합니다");
					}
					else {
						System.out.println("계좌번호와 비밀번호를 확인해주세요");
					}
				}
				else {
					System.out.println("이미 로그인 중...");
				}
				
			}
			else if (sel == 2) {
				if(identifier != -1) {
				   identifier = -1;
				   System.out.println("로그아웃 되었습니다.");
				}
				else {
					System.out.println("로그인 후 이용가능합니다");
				}
			}
			else if (sel == 3) {
				if	(identifier != -1) {
					System.out.println("입금할 금액 입력 : ");
					int money = scan. nextInt();
					
					if (identifier == 1) {
						dbMoney1= dbMoney1 + money;
					}
					else if (identifier == 2) {
						dbMoney2 = dbMoney2 + money;
					}
					System.out.println("입금을 완료하였습니다.");
				}
				else {
					System.out.println("로그인 후 이용가능합니다");
				}
			}
			
			else if (sel == 4) {
				if(identifier != -4) {
					System.out.println("출금할 금액 입력 : ");
					int money = scan.nextInt();
					
					if(identifier == 1) {
						if(money <= dbMoney1) {
						   dbMoney1 = dbMoney1 - money;
						   System.out.println("출금을 완료하였습니다 . ");
						}
						else {
							System.out.println("계좌잔액이 부족합니다.");
						}
					}
					else if(identifier == 2) {
						if (money <= dbMoney2) {
							dbMoney2 = dbMoney2 - money;
							System.out.println("출금을 완료하였습니다");
						}
						else {
							System.out.println("계좌잔액이 부족합니다.");
						}
					}
				}
				else {
					System.out.println("로그인 후 이용가능합니다");
				}
			}
			else if (sel == 5) {}
			else if (sel == 6) {}
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
