package ch06;

public class ForEx03 {

	public static void main(String[] args) {
		for(int i=1; i<10 ; i= i+1) {
			System.out.println("������" + i+ "�� �Դϴ�.");
			for (int n=1; n<10; n=n+1) {
				System.out.println(n*i);
			}
		}

	}

}
