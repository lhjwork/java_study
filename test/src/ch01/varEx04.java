package ch01;


class Note {
	int price = 2000;
}

 

public class varEx04 {
	

	public static void main(String[] args) {
		Note note1 = new Note(); // heap ������ Note Ŭ���� ������ �ִ� ��� �����͸� �Ҵ���!! (��� static�� �����ϰ�)
		Note note2 = new Note(); // -> Note type�� �ڷ����� heap ������ �����. 
		Note note3 = new Note();
		int age = 25;
		System.out.println(note1.price);
		System.out.println(note2.price);
		System.out.println(note3.price);
	
		note3.price =30000;
		
		System.out.println(note3.price);
	}

}
