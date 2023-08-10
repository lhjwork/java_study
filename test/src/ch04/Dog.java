package ch04;

// 클래스 = 여러가지 특징(상태)를 가지고 있다.
public class Dog {
	int age = 20;// 변경가능 
	String name = "콩식이";// 변경가능
	String color= "하얀색"; // 변경가능
	final String type = "말티즈"; // 변경불가능 (final : 상수)
	
	
}

//변수, 필드, 전역변수, 힙변수, 상태 -> 상태, 필드, 전역변수(지역변수가 아니다(메서드 내부에서 만들어진 변수가 아니다.))
