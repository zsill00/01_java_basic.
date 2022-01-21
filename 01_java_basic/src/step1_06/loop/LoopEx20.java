package step1_06.loop;
/*
 *  # 보조 제어문
 * 
 * 	- 반복문 안에서만 동작한다.
 *  - 반복문 안에서 반복문의 역할을 보조한다.
 *  
 * 		break	 : 반복문을 종료한다.
 * 		continue : 반복문의 조건시점으로 점프한다.
 * 
 * */

import java.util.Scanner;

public class LoopEx20 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while (true) {
			
			if ( i ==  70) {
					break;
			}
			
			System.out.println(i);
			i++;
			
		}
		
		System.out.println();
		
		int j = 0;
	
		
		while (j < 10) {
			
			j++;
			if ( j % 2 == 0)continue;
			System.out.println(j);
			
			
			
		}
		System.out.println();
		
		// continue 사용예제
				Scanner  scan = new Scanner(System.in);
				
				while (true) {
					
					System.out.println("1. 햄버거");
					System.out.println("2. 콜라");
					System.out.println("3. 감자");
					
					System.out.print("#메뉴입력 : ");
					int getMenu = scan.nextInt();
					
					if (getMenu < 1  || getMenu > 3) {
						System.out.println("1~3번 중에 선택하세요.");
						continue;
					}
					
					System.out.print("#현금 투입 :");
					int getMoney = scan.nextInt();
					
				}
				
				
				
			}

		}


	


