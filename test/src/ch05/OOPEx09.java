package ch05;

interface MoveAble{
	// public abstract �����ܾ� ���� ��������
	//���� ���� : public abstract void ��();
	void ��();
	void �Ʒ�();
	void ����();
	void ������();
	
	void �����ñ�();
}

interface MoveAble2{
	// public abstract �����ܾ� ���� ��������
	//���� ���� : public abstract void ��();
	void ��();
	void �Ʒ�();
	void ����();
	void ������();
	
	void ���ٴڼ���();
}

abstract class �糪��� implements MoveAble {
	abstract void ����(); //�̿ϼ��� �޼���
	
	// Ctrl + space�� �ߴ°� Ȯ�� �����ϴ�.
	@Override
	public void ��() {
		System.out.println("���� �̵�");
		
	}
	
	@Override
	public void �Ʒ�() {
		System.out.println("�Ʒ��� �̵�");
	}
	
	@Override
	public void ������() {
		System.out.println("���������� �̵�");
		
	}
	
	@Override
	public void ����() {
		System.out.println("�������� �̵�");
		
	}
	
	@Override
	public void �����ñ�() {
		System.out.println("�ڷ� ���� �ñ�");
		
	}
	
	

}


abstract class �¼��ѵ��� implements MoveAble2 {
	abstract void ä��();//�̿ϼ��� �޼���

	@Override
	public void ��() {
		System.out.println("�������� �̵�");
		
	}

	@Override
	public void �Ʒ�() {
		System.out.println("�Ʒ������� �̵�");
		
	}

	@Override
	public void ����() {
		System.out.println("�������� �̵�");
	}

	@Override
	public void ������() {
		System.out.println("���������� �̵�");
		
	}

	@Override
	public void ���ٴڼ���() {
		System.out.println("�������� ����");
		
	}
	
}


// ������ �ڽ� Ŭ������ ����(��, �Ʒ�, ����, ������)
class ������ extends �¼��ѵ���{


	@Override // ������̼� = JVM�� ����ÿ� �м��ؼ� Ȯ�� = JVM�� ��Ʈ
	void ä��() {
		System.out.println("�ٳ��� ä��");
		
	}
	

	
}

class �� extends �¼��ѵ���{

	@Override
	void ä��() {
		System.out.println("Ǯ ä��");
		
	}

	
	
}


class ȣ���� extends �糪���{

	@Override
	void ����() {
		System.out.println("�̻��� ����");
		
	}

	
}

class �ڻԼ� extends �糪���{

	@Override
	void ����() {
		System.out.println("���� ��ġ��� ����");
		
	}

}

// ���Ծ� �� (��� �¼��ѵ���)
class �� extends �¼��ѵ��� {

	@Override
	void ä��() {
		System.out.println("���� Ǯ�� �Դ´�.");
	}
	
}



public class OOPEx09 {
	
	static void ���̽�ƽ(�¼��ѵ��� u1) {
		u1.ä��();
		u1.���ٴڼ���();
		u1.��();
		u1.�Ʒ�();
		u1.������();
		u1.����();
		System.out.println("==================");
	}
	
	static void ���̽�ƽ(�糪��� u1) {
		u1.����();
		u1.��();
		u1.�Ʒ�();
		u1.������();
		u1.����();
		u1.�����ñ�();
		System.out.println("==================");
	}


	public static void main(String[] args) {
		�� u1 = new ��();	
		���̽�ƽ(u1);
		
		������ u2 = new ������();
		���̽�ƽ(u2);
		
		ȣ���� u3 = new ȣ����();
		���̽�ƽ(u3);
		
		�ڻԼ� u4 = new �ڻԼ�();
		���̽�ƽ(u4);
		
		�� u5 = new ��();
		���̽�ƽ(u5);
		
		
	}

}
