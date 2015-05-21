package oop01.syntax;
/*
 Date : 2015-05-20
 */
/*
 멤버변수와 접근 제한자
 - 필드나 메소드의 접근 권한을 지정할 수 있다.
 - 효율적인 접근 권한은 컴포넌트의 독립성을 향상시킨다.
 */
/*
 접근 제한자		같은클레스		같은패키지		상속관계다른패키지		무관한패키지
 public				   가능				가능			  가능					가능
 protected	   		   가능				가능			  가능					불가능	
 friendly(default)	   가능				가능			  불가능				불가능			
 private			   가능				불가능			  불가능				불가능
 */
/*
 - 보안성이 활성됨. 콤포넌트의 독립성이 보장됨
 - 콤포넌트 간 간섭을 최소화하여 독립성을 유지할 수 있음
 - 데이터 은닉
 */
public class No10_AccessModifierSyntax {

}
