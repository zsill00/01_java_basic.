package step1_02_.variable;

/*
 *  변수의 범위
 * 
 * 
 * 
 * */


public class VarEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 12;
		if (true) {
			int y = 7;
			System.out.println(x);
			System.out.println(y);
			//System.out.println(z);
		}
		
		if (true) {
			int z = 3;
			System.out.println(x);
			//System.out.println(y);
			System.out.println(z);
		}
		
		System.out.println(x);
		//System.out.println(y);
		//System.out.println(z);
		
	}

}

