package ch02;

/*
 * ���� : Stack(�������� = �޼��尡 ����� �� �޸𸮿� �Ҵ�ǿ� = �޼��尡 ����� �� �޸𸮿��� �������)
 * 		  : Heap(�������� = new�Ҵ� �޸𸮿� �Ҵ�ǿ� = �� �̻� �������� ���� �� �޸𸮿��� �������)
 * 		  :  Static(�������� = main�޼��尡 ����Ǳ� ���� �޸𸮿��� �Ҵ�ǿ� = main �޼��尡 ����Ǹ� �޸𸮿��� �������)
 */


public class StackEx02 {
	
	
	static int sum = 20; // ��������(static) main�޼��尡 ���۵Ǳ����� sum�� �Ҵ�ȴ�. 
	int value = 50; // ��������(heap) // �� �̻� �������� ���� �� �ڵ����� �������. 
	
	static void a() {
		// a �޼��尡 ����� �� stack ������ n1�� �Ҵ�ǰ� a�޼��尡 ����Ǹ� �޸𸮿� �������.
		int n1 = 1;//-> ȣ��ȵ� a() �޼ҵ��� stack ������ ����� (��������)
		System.out.println(n1); 
		
		// 21�� ������ ����Ƿ��� �� �� static ������ �Ҵ��ؾ� �ϴµ� �Ұ����ؿ�!! static���� �Ҵ��� main�޼��� ���������� �����ؿ�.
//		static int n2 = 2;
		
	}

	public static void main(String[] args) {
		a();
//		System.out.println(n1); --> ȣ�� �ȵ�
		System.out.println(sum); 
		StackEx02 s = new StackEx02(); // 17�� ���ο��� heap������ value�� �Ҵ�ȴ�.
		System.out.println(s.value);
		System.out.println("test - ���̻� s ������ �������� �ʱ� ������ �޸𸮿��� �������.");
		System.out.println("test2");
	}

}