package oop01.syntax;

public class AverageService {
// VO�� �ִ� avg(), tot() �޼ҵ带 
// ���񽺿��� ó���ϵ��� �Ͻÿ�.
	AverageDVO hulk = new AverageDVO();
	
	void User(String name, int kor, int eng){
		hulk.setName(name);
		hulk.setKor(kor);
		hulk.setEng(eng);
	}
	
	int tot(){
		int tot = hulk.getKor()+hulk.getEng();
		return tot;
	}
	
	double avg(){
		double avg = tot()/2d;
		return avg;
	}
}
