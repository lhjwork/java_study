package ch06;

class �ü�{
	String name = "�ü�";
}

class ����{
	String name = "����";
}

public class ObjectEx02 {

	public static void main(String[] args) {
		Object[] s1 = new Object[3];
		s1[0] = new �ü�();
		s1[1] = new �ü�();
		s1[2] = new ����();
		
		// ���� - �ٿ�ĳ����!!
		�ü� g1 = (�ü�)s1[0];
		���� g2 = (����)s1[2];
		
		
		System.out.println(g1.name);
		System.out.println(g2.name);
		
	}
}
