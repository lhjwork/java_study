package ch05;

// ��
class ���� {
	String name = "����";
	
	void �⺻����(�ü� e1) {
		System.out.println("������ "+ e1.name +" �����ϱ�");
	}
	
	void �⺻����(������ e1) {
		System.out.println("������ "+ e1.name +" �����ϱ�");
	}
	
	void �⺻����(������ e1) {
		System.out.println("������ "+ e1.name +" �����ϱ�");
	}
	
	void �⺻����(���� e1) {
		System.out.println("������ "+ e1.name +" �����ϱ�");
	}
	
	void �⺻����(�渶���� e1) {
		System.out.println("������ "+ e1.name +" �����ϱ�");
	}
}


// Ȱ
class �ü� {
	String name = "�ü�";
	
	void �⺻����(������ e1) {
		System.out.println("Ȱ�� "+ e1.name +" �����ϱ�");
	}
}

//����
class ������ {
	String name = "������";
	void �⺻����(���� e1) {
		System.out.println("������ "+ e1.name +" �����ϱ�");
	}
}

class ������ {
	String name = "������";
	
	void �⺻����(���� e1) {
		System.out.println("�������� "+ e1.name +" �����ϱ�");
	}
}

class ���� {
	String name = "����";
	
	void �⺻����(���� e1) {
		System.out.println("������ "+ e1.name +" �����ϱ�");
	}
}

class �渶���� {
	String name = "�渶����";
	
	void �⺻����(���� e1) {
		System.out.println("�渶������ "+ e1.name +" �����ϱ�");
	}
}


public class OOPEx05 {
	

	public static void main(String[] args) {
		���� u1 = new ����();
		�ü� u2 = new �ü�();
		������ u3 = new ������();
		������ u4 = new ������();
		���� u5 = new ����();
		�渶���� u6 = new �渶����();
			
		
		// ����ؾ� �� �޼��� �̸��� �⺻����() �̴�. -> ����!!
		u1.�⺻����(u2);
		u2.�⺻����(u3);
		u3.�⺻����(u1);
		u1.�⺻����(u3);
		u1.�⺻����(u4);
		u1.�⺻����(u5);
		u1.�⺻����(u6);
	}

}
