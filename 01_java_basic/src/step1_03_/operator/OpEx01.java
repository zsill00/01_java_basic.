package step1_03_.operator;
/*
 * 
 *  # 산술 연산자
 * 
 * ( +,-,*,/,%)
 * 
 * */

public class OpEx01 {

	public static void main(String[] args) {
		
		System.out.println(10 + 3); // 더하기
		System.out.println(10 - 3); // 빼기
		System.out.println(10 * 3); // 곱하기
		System.out.println(10 / 3); // 나누기
		System.out.println(10 % 3); // 나머지
		
		/*
		 * 
		 *  [ 중요 ]
		 *  
		 *  정수 / 정수 = 정수
		 *  정수 / 실수 = 실수
		 *  실수 / 정수 = 실수
		 *  실수 / 실수 = 실수
		 *  
		 *  - 최소 1개이상 실수형태의 모습을 가지고 있어야 한다.
		 *  - 프로그래밍 언어마다 약간씩 차이가 있다.
		 * 
		 * */
		
		System.out.println(10 / 3); // 나누기
		System.out.println(10.0 / 3); // 나누기
		System.out.println(10 / 3.0); // 나누기
		System.out.println(10.0 / 3.0); // 나누기
		
		

		
	}

}
