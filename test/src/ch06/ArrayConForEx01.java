package ch06;

public class ArrayConForEx01 {
	
	static void �����ݾװ��(int[] coin, int restMoney) {
	
		for(int i=0; 4 > i; i++) {
			// ���� 
			System.out.println(coin[i]+"�� :"+ (restMoney/coin[i]));
		
			restMoney = restMoney%coin[i];
			System.out.println("�����ݾ� :"+ restMoney);
		}
	}

	public static void main(String[] args) {
		//�������ϱ� 500, 100, 50, 10 ¥�� ������ ��� �ʿ�����(�ּҵ�������)?
		int[] coin = {500, 100, 50, 10};
		int money = 1350;
		int restMoney = money;
		

		//�Ʒ��� ���� 4���� �迭�� for���� �̿��ؼ� �����ϼ���!! - �����丵 (�����)
		�����ݾװ��(coin,restMoney);
	

	
	}


}
