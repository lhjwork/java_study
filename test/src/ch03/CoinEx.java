package ch03;

public class CoinEx {

	public static void main(String[] args) {
		//�������ϱ� 500, 100, 50, 10 ¥�� ������ ��� �ʿ�����(�ּҵ�������)?
		int money = 3680;
		int restMoney = money;
		
		int count500 = 0;
		int count100 = 0;
		int count50 = 0;
		int count10 = 0;
		
		
	
	
		
		
		
		// ���� 1
		System.out.println("500�� :"+ (restMoney/500));
		count500 = restMoney/500;
		restMoney = restMoney%500;
		System.out.println("�����ݾ� :"+ restMoney);
		
		
		// ���� 2
		System.out.println("100�� :"+ (restMoney/100));
		count100 = restMoney/100;
		restMoney = restMoney%100;
		System.out.println("�����ݾ� :"+ restMoney);
		
		// ���� 3
		System.out.println("50�� :"+ (restMoney/50));
		count50 = restMoney/50;
		restMoney = restMoney%50;
		System.out.println("�����ݾ� :"+ restMoney);
		
		// ���� 4
		System.out.println("10�� :"+ (restMoney/10));
		count10 = restMoney/10;
		restMoney = restMoney%10;
		System.out.println("�����ݾ� :"+ restMoney);
		
		
		// ������
		System.out.println(money+"�� �ּҵ��� ������?" );
		System.out.println("500�� "+ count500 +"��");
		System.out.println("100�� "+ count100 +"��");
		System.out.println("50�� "+ count50 +"��");
		System.out.println("10�� "+ count10 +"��");
	}

}