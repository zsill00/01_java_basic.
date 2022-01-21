package step1_02_.variable;

/*
 * 
 *  상수 ( constant ) 
 * 
 * 	- 데이터의 보호를 위해 사용한다.
 *  - final 키워드를 사용하여 만든다.
 * 
 * 
 * */

public class VarEx04 {

	public static void main(String[] args) {
		
		// 변수
		int testData1 = 100;
		testData1 = 100; 		// 데이터 변경 가능
		
		// 상수
		final int TEST_DATA2 = 100;
		//TEST_DATA2 = 999; 		// 데이터 변경 불가능
		
		
		

	}

}
