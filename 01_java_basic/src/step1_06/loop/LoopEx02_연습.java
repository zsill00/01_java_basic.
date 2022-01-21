package step1_06.loop;

public class LoopEx02_연습 {

	public static void main(String[] args) {
		
		int i = 1;

		while (i <= 10) {
			
			if (i >= 5 && i < 9) {
				System.out.println(i);
			}
			i++;
			
		}
		
		System.out.println();
		
		i = 10;
		
		while (i >= 1) {
			if (i >=3 	&&  i <= 6) {
				System.out.println(i);
				
			}
			i--;
		}
		
		System.out.println();
		
		i = 1;
		int cnt = 0;		// 3의배수를 기억하는 변수
		
		while (i <= 10000) {
			
			if ( i % 3 == 0) {
				//System.out.println(i);
				cnt++;
			}
			i++;
		}
		
		System.out.println("3의 배수 : " + cnt);
	}

}


	

	
