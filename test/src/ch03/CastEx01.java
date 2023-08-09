package ch03;

public class CastEx01 {

	public static void main(String[] args) {
		// 캐스팅 (다운캐스팅, 업캐스팅)
		int n1 = 100; // 4Byte
		double d1 = n1; // 8 Byte (8Byte <- 4Byte)
		System.out.println(d1); // 업캐스팅 : 작은걸 큰 쪽에 넣는 것
		

	}

}
