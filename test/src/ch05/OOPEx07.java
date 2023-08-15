package ch05;


// �߻�Ŭ����
abstract class Animal{
	// body : {}�� ������ ������ �ʼ��� �־�����Ѵ�.-> �ڽĵ��� ������ �����ؾ��ϱ� ������ �������� ��� �ȴ�.
	abstract void speak(); // �߻�޼��� (��ü�� {}�� ����.)
	
	void test() {
		System.out.println("��ü�� �ִ� �޼��嵵 ����� �ִ�.");
	}
	
	
}

class Dog extends Animal {
	
	//�������̵� Animal�� speak�� ��ȿȭ �ȴ�.
	void speak(){
	System.out.println("�۸�");
	}
}

class Cat extends Animal{
	
	//�������̵� Animal�� speak�� ��ȿȭ �ȴ�.
	void speak(){
		System.out.println("�߿�");
	}
}

class Bird extends Animal{

	// �߻�޼��带 �θ� ������ ������ �ڽ��� �߻�޼��带 �ݵ�� �����ؾ��Ѵ�.
	@Override
	void speak() {
		System.out.println("±±");
		
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
