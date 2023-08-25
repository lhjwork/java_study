package ch06;

import java.util.ArrayList;

public class CollectionEx01 {

	public static void main(String[] args) {
		
		// int, double, char, boolean => 기본자료형 (값)
		// String, 커스텀자료형(클래스)=> 레퍼런스 자료형 (주소)
		// 래핑클래스 = Integer, Double, Character, Boolean
		ArrayList<Integer> c1 = new ArrayList<>();
		
		
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(9);
		c1.add(10);
		
		// 메소드를 쓸데없이 계속 호출하는 방식은 좋지 않다.
		// 한번만 호출해서 담아서 호출하는 방식을 사용한다.
		// 리팩토링
		int size = c1.size();
		for (int i = 0; i < size; i++) {
			System.out.println(c1.get(i));
		}
	}

}
