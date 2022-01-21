package step1_02_.variable;

// 산술 연산자 하고 와서 진행
public class VarEx02_정답 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
			int salary = 100;    // 월급 
			int beforeTaxSalary = salary * 12;  // 연봉 + 월급
			double tax = beforeTaxSalary / 10.0; // 세금 + 개월 
			double afterTaxSalary = beforeTaxSalary - tax; //  연봉 + 개월 + 세금 
			System.out.println("세후연봉 = " + beforeTaxSalary + "원");
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
			int score1 = 30;
			int score2 = 50;
			int score3 = 4;
			int total = score1 + score2 + score3;
			
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		
		//문제4) 100초를 1분 40초로 출력
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원(1개) 100원(3개) 


	}

}
