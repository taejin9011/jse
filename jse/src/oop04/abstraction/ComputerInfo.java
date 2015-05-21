package oop04.abstraction;

public class ComputerInfo extends ProductInfo{
	
	protected String cpuInfo;
	protected String ramInfo;
	protected String hddInfo;
	
	@Override
	public void displayProductInfo() {
		System.out.println("����ȸ�� : " + this.productCompany);
		System.out.println("������ : " + this.productName);
		System.out.println("������ȣ : " + this.productSerialID);
		System.out.println("cpu ���� : " + this.cpuInfo);
		System.out.println("���θ޸� ���� : " + this.ramInfo);
		System.out.println("�ϵ��ũ ���� : " + this.hddInfo);
	}
	
	public void setComputerInfo(String productCompany,
			String productName,
			String productSerialID,
			String cpuInfo,
			String ramInfo,
			String hddInfo){
		super.setProductInfo(productCompany, productName, productSerialID);
		this.cpuInfo = cpuInfo;
		this.ramInfo = ramInfo;
		this.hddInfo = hddInfo;
	}
}
