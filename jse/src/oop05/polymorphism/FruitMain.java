package oop05.polymorphism;

public class FruitMain {
	public static void main(String[] args) {
		// �������̽��� ��ü�� ����� ����.
		// ��, FruitInterface fi = new FruitInterface();
		// ������ �߻���Ų��.
		FruitInterface apple = new AppleImpl();
		FruitInterface banana;
		// FruitInterface Ÿ���� ���������� ����.
		banana = new BananaImpl();
		// Ŭ���� BananImple�� ��ü�� �����Ͽ�
		// banana �� �Ҵ��Ѵ�.
		FruitInterface orange = new OrangeImpl();
		apple.display("���ִ�");
		banana.display("������");
		orange.display("���");
		//orange.getCount();
		// �������̽����� ����� �޼ҵ常 ȣ���� �����ϴ�.
	}
}
