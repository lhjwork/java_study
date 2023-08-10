package ch04;

// 값을 초기화하지 않는 이유는 new 할때마다 다른 상태를 가진 고양이를 만들어주기 위해서
public class Cat {
	String name; //heap 공간에서 생성
	String color;
	
	// Cat() 생성자를 디폴트(기본) 생성자라고 한다.(매개변수가 없는 것)
	// 개발자가 생략 가능한 코드
	public Cat() {
		
	}
	
	// 개발자가 직접 생성자 구현함 = 디폴트 생성자가 생기지 않음.
	public Cat(String n, String c) { // 생성자(메서드)
		
		System.out.println("고양이가 탄생함");
		System.out.println("n : "+n); // stack공간
		System.out.println("c : "+c);
		
		//String n, String c는 지역변수 = Cat() 이라는 생성자 (메서드)가 가진 지역변수
		//Stack 공간에 생성된 값들을 heap공간으로 옮긴다.
		name = n;
		color = c;
	}
}
