package ch04;


// this�� �ڱ��ڽ��� heap ������ ����Ų��.
public class People {
	String name;
	int age;
	
	// ����Ʈ �����ڰ� �������? ���� ->.java -? .class �������Ҷ� �ڹٰ� �ڵ����� �ڵ带 �������
	// ���� ���������ؼ� ������ ����Ʈ Ÿ�� ����
	public People(String name, int age) {
		System.out.println("People �޼��� ���� name :" + name);
		System.out.println("People �޼��� ��å age :" + age);
		this.name = name;
		this.age = age; 
	}
}
