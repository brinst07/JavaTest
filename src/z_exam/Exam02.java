package z_exam;

public class Exam02 {
/*
	[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
	크 기
	종 류
			1 byte 2 byte 4 byte 8 byte
	논리형  boolean
	문자형			char
	정수형	byte	short  int	long
	실수형				   float  double
	[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
	(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
	초기화 하는 한 줄의 코드를 적으시오.
	
	long = 1234561234567L;
	[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
	int i = 100;
	long l =100L;
	final float PI = 3.14f;
	- 리터럴 : 100,100L,3.14f 
	- 변수 : i,l
	- 키워드 : int, long, final, float
	- 상수 : PI
	[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
	a. int
	b. Byte
	c. double
	d. boolean
	
	b번 Byte
	
	[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
	류’라고 적으시오.
	System.out.println(“1” + “2”) → (12)
	System.out.println(true + “”) → (true )
	System.out.println(‘A' + 'B') → (131) 'A'의 문자코드 값은 65 'B' 66
	System.out.println('1' + 2) → ( 51) '1' 49
	System.out.println('1' + '2') → (99) '2' 50
	System.out.println('J' + “ava”) → (Java ) -> String 타입은 다른타입과 연산이 가능하다. 어떤타입과 만나도 String타입으로 바뀜
	System.out.println(true + null) → (오류 ) -> 기본형과 참조형 타입은 연산이 불가능 boolean은 다른 타입과 연산이 불가능
	6 Java의 정석定石 3판 - 연습문제 풀이
	[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
	a. if
	b. True
	c. NULL
	d. Class
	e. System
	
	bcde -> 키워드는 원래 소문자여야 하는데 대문자로 되어있다.
	
	[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
	a. $ystem -> 가능
	b. channel#5 -> 특수문자는 $ _ 만가능
	c. 7eleven -> 숫자로 시작하면 안된다.
	d. If 
	e. 자바
	f. new -> 예약어
	g. $MAX_NUM -> 가능
	h. hello@com -> 불가능
	
	a,d,e,g
	
	
	[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고
	르시오)
	a. int
	b. long
	c. short
	d. float
	e. double
	
	참조형 변수의 크기는 4byte이다. 따라서 int float가 답이된다. 
	a,d
	
	
	[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
	byte b = 10;
	char ch = 'A';
	int i = 100;
	long l = 1000L;
	a. b = (byte)i; -> 생략할수 없음 
	b. ch = (char)b; -> 생략할 수 없음
	c. short s = (short)ch; -> 생략할수 없음 
	d. float f = (float)l; -> 가능 float의 범위가 int보다 더 크기때문
	e. i = (int)ch; ->가능
	
	byte로 따지는게 아니고 표현범위로 따지는 것임
	
	[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
	a. byte b = 256; -> -128~127 까지만 가능
	b. char c = ''; -> char는 한개의 문자만 지정가능하다.
	c. char answer = 'no'; -> 불가
	d. float f = 3.14 -> 접미사f를 붙이지 않았다. ;의 부재
	e. double d = 1.4e3f; -> double형은 접미사를 생략할수 있으나 f를 사용하였지만 오류는 발생하지 않는다.
	왜냐하면 double이 표현할수 있는 범위가 더 크기때문이다.
	
	a,b,c,d
	
	
	[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
	a. boolean - false
	b. char - '\u0000'
	c. float - 0.0 ->0.0f
	d. int - 0
	e. long - 0 -> 0L
	f. String - "" -> null
	c,e,f
*/
}

