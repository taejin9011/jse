package oop04.abstraction;

public class TvInfoClass extends ProducInfoClass{
	private String screenSize;
	private String screenType;
	
	public void setInfo(String company,
			String name, String sid,
			String screenSize, String screenType){
		
		super.setInfo(company, name, sid);
		this.screenSize = screenSize;
		this.screenType = screenType;
	}
	public void displayInfo(){
		super.displayInfo();
		System.out.println("화면크기 : "+this.screenSize);
		System.out.println("화면타입 : "+screenType);
	}
}
