package ch07;


class �� {
	void shoot() {
		System.out.println("���� �߻��߽��ϴ�.");
	}
}

public class ExceptionEx01 {

	public static void main(String[] args) {
		// ������ ���� (Java�� �� �� ����)
		try {
			
			System.out.println("���ڱ� ����");
			Thread.sleep(3000); // ���ν����� 3�ʵ��� ���� �ܴ�.
			System.out.println("���ڱ� ��");
		} catch (InterruptedException e) { // ����

			e.printStackTrace();
		}
		
		//��Ÿ�� ���� (�����ڰ� �� �� �ִ�.)
		int[] nums = {1,2,3};
		
		try {
			System.out.println(nums[3]); // ���� ����!!
		} catch (ArrayIndexOutOfBoundsException e) {
			// catch�� ������ try(�õ�) �ϴٰ� ���ܰ� �߻��ϸ� ��� ó��
			// ������ �����ϴ� ����
			System.out.println("������ �׳� ������");
			System.out.println(e.getMessage()); // �α� ���� ���� �����Ѵ�.
			e.printStackTrace(); // ������ ���� �α� �� �����
		}
		
		�� s = null;

		
		try {
			s.shoot();
		} catch (NullPointerException e) {
			System.out.println("���� ��� �߻����� ���߽��ϴ�.");
			s = new ��();
			s.shoot();
		}
		
		System.out.println("���� ������ ����");

	}

}