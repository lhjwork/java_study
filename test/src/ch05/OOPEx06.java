package ch05;

class �����佺���� {
	
	String name = "�����佺 ����";
	
	void �⺻����(�����佺���� e1) {
	
	}
	
	String �̸�Ȯ��() {
		return "?";
	}
}


class ���� extends �����佺���� {
	String name = "����";
	
	//�������̵� = �θ��� �޼��带 ��ȿȭ�ϴ�.
	void �⺻����(�����佺���� e1) {
		//System.out.println("���� �޼���");
		System.out.println("������ " + e1.�̸�Ȯ��() + "�� �����մϴ�." );
	}
	
	String �̸�Ȯ��() {
		return name;
	}
}

class ��� extends �����佺���� {
	String name = "���";
	
	String �̸�Ȯ��() {
		return name;
	}
	
	//�������̵� = �θ��� �޼��带 ��ȿȭ�ϴ�.
	void �⺻����(�����佺���� e1) {
		//System.out.println("���� �޼���");
		System.out.println(this.name+"�� " + e1.�̸�Ȯ��() + "�� �����մϴ�." );
	}
}

class ��ũ���÷� extends �����佺���� {
	String name = "��ũ���÷�";
	
	
	String �̸�Ȯ��() {
		return name;
	}
	
	//�������̵� = �θ��� �޼��带 ��ȿȭ�ϴ�.
	void �⺻����(�����佺���� e1) {
		//System.out.println("���� �޼���");
		System.out.println(this.name+"�� " + e1.�̸�Ȯ��() + "�� �����մϴ�." );
	}
}
public class OOPEx06 {

	public static void main(String[] args) {
		
		�����佺���� u1 = new ����(); // (����, �����佺����)
		�����佺���� u2 = new ���(); // (���, �����佺����)
		�����佺���� u3 = new ��ũ���÷�(); // (��ũ���÷�, �����佺����)
		
		u1.�⺻����(u1);
		u2.�⺻����(u3);
		u3.�⺻����(u2);
	
	}

}
