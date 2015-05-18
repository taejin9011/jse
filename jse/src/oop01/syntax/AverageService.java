package oop01.syntax;

public class AverageService {
// VO에 있던 avg(), tot() 메소드를 
// 서비스에서 처리하도록 하시오.
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
