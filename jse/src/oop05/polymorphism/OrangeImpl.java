package oop05.polymorphism;

public class OrangeImpl implements FruitInterface{

	@Override
	public void display(String s) {
		System.out.println(s + " �������Դϴ�.");
	}
	public int getCount(){
		return 1000;
	}
	
}
