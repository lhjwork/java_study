package ch06;

import java.util.ArrayList;

public class CollectionEx01 {

	public static void main(String[] args) {
		
		// int, double, char, boolean => �⺻�ڷ��� (��)
		// String, Ŀ�����ڷ���(Ŭ����)=> ���۷��� �ڷ��� (�ּ�)
		// ����Ŭ���� = Integer, Double, Character, Boolean
		ArrayList<Integer> c1 = new ArrayList<>();
		
		
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(9);
		c1.add(10);
		
		// �޼ҵ带 �������� ��� ȣ���ϴ� ����� ���� �ʴ�.
		// �ѹ��� ȣ���ؼ� ��Ƽ� ȣ���ϴ� ����� ����Ѵ�.
		// �����丵
		int size = c1.size();
		for (int i = 0; i < size; i++) {
			System.out.println(c1.get(i));
		}
	}

}
