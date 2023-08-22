package ch06;

public class ConAndForEx01 {

	public static void main(String[] args) {
		
		for(int i =1; i < 11; i++) {
		
			if(i!=6) {
				System.out.println(i);
			}
		}
		System.out.println("==============================");
		
		for(int n = 10; n > 0; n--) {
			if( n != 3) {
				System.out.println(n);
			}
		}
		System.out.println("==============================");
		for(int n = 1; n < 21; n++) {
			if(n%2==0) {
				System.out.println(n);
			}
		}
		
		System.out.println("=============================");
		for(int n = 2; n < 21; n=n+2) {
			System.out.println(n);
		}
	}

}
