package step1_03_.operator;
/*
 * 
 *  증감 연산자
 *	 
 *  +=, -= ,*= , /= ,%= , ++ , --
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class OpEx07 {

	public static void main(String[] args) {
		
		int tempData1 = 100;
		tempData1 -=3;	//tempData1 = tempData1 - 3;
		System.out.println(tempData1);
		
		
		int tempData2 = 10;
		tempData2 += 100;	//tempData2 = tempData2 + 100;
		System.out.println(tempData2);
		
		int tempData3 = 100;
		tempData3 *= 7;	//tempData3 = tempData3 * 7;
		System.out.println(tempData3);
		System.out.println();
		
		int x = 0;
		x++; // x = x + 1 , x += 1
		System.out.println(x);
		++x; // x = x + 1 , x += 1
		System.out.println(x);
		System.out.println();
		
		int  y = 0;
		System.out.println(y++); // 좌측의 명령어를  실행후 y를 증가
		System.out.println(y);
		System.out.println();
		
		int z = 0;
		System.out.println(++z);
		System.out.println(z);
		
		
	}

}
