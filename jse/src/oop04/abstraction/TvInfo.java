package oop04.abstraction;

public class TvInfo extends ProductInfo{

	protected String inchInfo;
	protected String screenRatioInfo;
	
	@Override
	public void displayProductInfo() {
		System.out.println("����ȸ�� : " + this.productCompany);
		System.out.println("������ : " + this.productName);
		System.out.println("������ȣ : " + this.productSerialID);
		System.out.println("��ġ���� : " + this.inchInfo);
		System.out.println("ȭ����� : " + this.screenRatioInfo);		
	}
	// �Ʒ� ������ �ϼ��Ͻÿ�.
	public void setTVInfo(String productCompany,
			String productName,
			String productSerialID,
			String inchInfo,
			String screeenRatioInfo){
		super.setProductInfo(productCompany, productName, productSerialID);
		this.inchInfo = inchInfo;
		this.screenRatioInfo = screeenRatioInfo;		
	}
}
