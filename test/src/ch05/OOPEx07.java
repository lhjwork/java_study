package ch05;


// 추상클래스
abstract class Animal{
	// body : {}를 가질수 없으며 필수로 넣어줘야한다.-> 자식들은 무조건 구현해야하기 때문데 강제성을 띄게 된다.
	abstract void speak(); // 추상메서드 (몸체가 {}가 없다.)
	
	void test() {
		System.out.println("본체가 있는 메서드도 만들수 있다.");
	}
	
	
}

class Dog extends Animal {
	
	//오버라이드 Animal의 speak가 무효화 된다.
	void speak(){
	System.out.println("멍멍");
	}
}

class Cat extends Animal{
	
	//오버라이드 Animal의 speak가 무효화 된다.
	void speak(){
		System.out.println("야옹");
	}
}

class Bird extends Animal{

	// 추상메서드를 부모가 가지고 있으면 자식은 추삭메서드를 반드시 구현해야한다.
	@Override
	void speak() {
		System.out.println("짹짹");
		
	}
	
}


public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.speak();
		a2.speak();
		
//		Animal a3 = new Animal();

	}

}
