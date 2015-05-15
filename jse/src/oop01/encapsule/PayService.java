package oop01.encapsule;

public class PayService {
	
	PayVO vo = new PayVO();
	
	
	public int inputSalary( String name, int salary){
		vo.setName(name);
		vo.setSalary(salary);
		return (int) (vo.getSalary()*(1-vo.TAX));
	}

	public int showTax(){
		return  (int) (100  * vo.TAX);
	}
}