package step1_02_.variable;
/*
 * 
 *  # 변수 ( variable )
 *  
 *  - 단 하나의 값을 저장할 수 있는 메모리 공간
 *  
 *  	1) 변수의 선언 그리고 초기화
 *  	
 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
 *  	변수의 초기화	: nData = 0;    // 값 저장
 *  
 *  	
 *  	2) 변수의 선언과 동시에 초기화
 *  	
 *  	int nData = 0;
 *  	
 *  
 *  	3) 변수의 특징
 *  	
 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
 *  
 * 
 * */

public class VarEx01 {

	public static void main(String[] args) {
		
		
		// 1. 정수 : Integer (int)
		int nData = 3;		// 변수의 선언
		nData = 3;		// 값을 저장
		
		System.out.println(nData);
		
		// 2. 실수 : double
		double fData = 3.14;
		System.out.println(fData);
		
		// 3.. 문자 : character(char)
		char cData = '@';
		System.out.println(cData);
		
		// 4. 문자열 : String
		 String strData = "웹개발";
		 System.out.println(strData);
		 
		 // 5. 참과 거짓 : boolean
		 boolean isChecked = true;
		 System.out.println(isChecked);
		 
		 int tempData = 12;
		 tempData = 7;
		 tempData = 3;
		 System.out.println(tempData); // 가장 마지막 데이터만 저장
		 
		 //	int tempData = 120; // 변수명은 고유(유일)해야 한다. 
		 
		 
		
	}

}
