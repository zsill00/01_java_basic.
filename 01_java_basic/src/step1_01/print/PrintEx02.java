package step1_01.print;

public class PrintEx02 {

	public static void main(String[] args) {
		
		
		// 1. 자료형 (data type)에 맞는 출력
		
		// 1-1) 정수	: 소수점이 없는 수
		System.out.println(12);
		
		// 1-2) 실수	: 소수점이 있는 수
		System.out.println(3.14);
		
		// 1-3) 문자	: 단일문자(홑따옴표,싱글쿼테이션,싱글쿼터)
		System.out.println('노');
		
		// 1-4) 문자열	: 글자(쌍따옴표, 더블쿼테이션 , 더블쿼터)
		System.out.println("WEB CLASS");
		
		System.out.println();
		System.out.println();
		System.out.println();

		// 2. 복수의 데이터 출력 ( , 가 아닌 +를 사용하여 사용)
		
		
		System.out.println(1 + 3 + 5);
		System.out.println(1 +" " + 3 + " " + 5);
		System.out.println(1 +", " + 3 + ", " + 5);
		System.out.println(1 +"/ " + 3 + "/ " + 5);
		
		// 2-1) 문자열 + 문자열 = 문자열
		System.out.println("과목명 : " + " 웹 개발");
		
		// 2-2) 숫자 + 숫자 = 숫자
		System.out.println(3 + 7);
		
		// 2-3) 문자열 + 숫자 = 문자열
		System.out.println("이달의 사용요금 : " + 30000);
		
		// 2-4) 숫자 + 문자열 = 문자열
		System.out.println(30000 + "원");
		
		// 생각해보기
		System.out.println("이달의 사용요금 : " + 30000 + 5000);
		System.out.println("이달의 사용요금 : " + (30000 + 5000));
		
		
	}

}
