package ch04;

// ���� �ʱ�ȭ���� �ʴ� ������ new �Ҷ����� �ٸ� ���¸� ���� ����̸� ������ֱ� ���ؼ�
public class Cat {
	String name; //heap �������� ����
	String color;
	
	// Cat() �����ڸ� ����Ʈ(�⺻) �����ڶ�� �Ѵ�.(�Ű������� ���� ��)
	// �����ڰ� ���� ������ �ڵ�
	public Cat() {
		
	}
	
	// �����ڰ� ���� ������ ������ = ����Ʈ �����ڰ� ������ ����.
	public Cat(String n, String c) { // ������(�޼���)
		
		System.out.println("����̰� ź����");
		System.out.println("n : "+n); // stack����
		System.out.println("c : "+c);
		
		//String n, String c�� �������� = Cat() �̶�� ������ (�޼���)�� ���� ��������
		//Stack ������ ������ ������ heap�������� �ű��.
		name = n;
		color = c;
	}
}
