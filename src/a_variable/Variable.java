package a_variable;

import java.util.Scanner;



//crtl + shift + o
//import란 다른패키지에 있는 것을 가져올수 있게 하는것

public class Variable {

	int a; //전역변수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		<<변수>>
		-하나의 데이터를 저장할 수 있는 메모리 상의 공간
		-타입(데이터의 종류)과 변수명(변수의 이름)으로 변수를 만들 수 있다.
		
		<<사용 가능한 기본형 데이터의 종류>>
		- 정수 : byte(1byte), short(2byte), int(4byte), long(8 byte)
		- 실수 : float(4byte), double(8byte)
		- 문자 : char(2byte)
		- 논리 : boolean(1byte)
		
		//long이 표현할수 있는 숫자보다 float이 표현할수 있는 숫자가 훨씬 더 크다 왜냐면 float는 실수이기 때문이다.
		<<명명규칙>>
		- 블록안에서 변수명은 중복될 수 없다.
		- 영문 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.(한글 사용은 자제하자)
		- 대소문자가 구분되어 길이에 제한이 없다.
		- 예약어는 사용할 수 없다.
		- [기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
		- [여러 단어로 이루어진 경우 단어의 첫 글자를 대문자로 한다. (상수는 언더바로 구분)]
		- [클래스명의 첫글자는 대문자로 한다.]
		- [패키지명은 모두 소문자로 한다.]
		
		*/
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름
	
		byte _byte;//1
		char _char;//2
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요
		
		
		short _short;//2
		int _int;//4
		long _long;//8
		float _float;//4
		double _double;//8
		boolean _boolean;//1
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용하낟.
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
//		System.out.println(_byte);//컴파일 에러 발생(문법이 틀렸다)
		
//		=(대입연산자) : 대입연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.(오른쪽먼저 연산)
		_byte = 10; // 타입에 맞는 값을 저장해야한다.
		_short = 20;
		_int = 30;
		_long = 40L;//long 접미사 L
		_float =3.14f;//float 접미사 
		_double = 3.14;//double  접미사 생략가능
		_char = '가';
		_boolean = true;
		//초기화 : 변수에 처음으로 값을 저장하는 것
		
		System.out.println(_int);
		//crtl + f11 : 프로그램 실행
		
		//f11 : 디버그 실행 
		System.out.println(_byte);
		System.out.println(_short);
		
		_int = 100;
		System.out.println(_int);
		_int = 100 + 200;
		System.out.println(_int);
		
		_byte = 1;
		_short = 2;
		_int = 4;
		_long = 8L;
		_float = 4.0f;
		_double = 8.0;
		_char = '가';
		_boolean = false;
		
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_char);
		System.out.println(_boolean);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따옴표)로 감싸진 글자
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);

		/*
			<<리터럴의 종류>>
			상수의 의미이나, 프로그래밍에서 상수는 다른의미로 쓰이고 있기에 리터럴이라고 칭한다.
			숫자 : 0,10,-5,3.14
			문자 : '가', 'a', '0', ' '
			문자열 : "가나다", "abc" "123". " ". ""
			그외 : true, false, null
			
			<<참조형 타입>>
			- 기본형 타입을 제외한 모든 데이터 타입(배열 , 클래스)
			- ex) String, AboutClass, Variable
			- 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
			- 변수의 크기는 4byte이다.
		
		
		*/
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을 때 저장되어 있는 값
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L;
		_float = 0.0f;
		_double = 0.0;
		_char = '\u0000'; // 역슬래시u는 유니코드를 의미한다.
		_boolean = false;
		_String = null; // 모든 참조형 타입의 기본값은 null을 의미한다.
		
		//경우에 따라 변수의 타입이 다른 값을 저장하기도 한다.
		_byte = 127; //byte 범위 -128~127
		_int = 128; //int -20억~20억
		_byte = (byte)_int;  //형변환 : 데이터 타입을 반환하는 것
		//byte의 범위를 넘어서는 128이 형변환 되었기 때문에 값이 손실되었고 overflow가 되어 가장 작은 값인 ~128이 된다.
		//128 -> -128 (오버플로우)
		System.out.println(_byte);
		
		_byte = -128;
		_int = -129;
		_byte = (byte)_int;
		System.out.println(_byte);//-129 -> 127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될수 있다.
		//큰쪽에서 작은쪽으로 가는 형변환은 생략할수가 없다... 
		
		_double = 3.14;
		_int = (int)_double;
		System.out.println(_int);
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변환을 생략할 수 있다.
		
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		
		//위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요
		_byte = (byte)_int;
		_byte = (byte)_short;
		_byte = (byte)_long;
		_int = (int)_long;
		_short = (short)_long;
		
		//위에서 만든 변수들을 표현범위가 큰 타입으로 형변환 해주세요
		_long = _short;
		_int = _byte;
		_short = _byte;
		
		/*<<상수>>
		 * -값을 한번 저장하면 변경할 수 없는 저장공간
		 * -final int MAX_NUMBER;
		 * -상수는 구별하기 쉽게 대문자로만 쓴다.
		 * -리터럴에 의미를 부여하기 위해 사용한다.
		 */	
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100;
		
		//콘솔창에서 입력받는 방법
	/*	
		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요 ->");
		String input1 = s.nextLine();
		System.out.println("입력받은 문자열은" +input1+ "입니다.");
		
		
		System.out.println("숫자를 입력해주세요>");
//		int a = s.nextInt();
		int input2 = Integer.parseInt(s.nextLine());
		//nextLine으로 입력은 받으나 nextLine은 문자열을 받는 메소드이므로, 이를 Integer타입으로 변경해주는 것
		System.out.println("입력받은 숫자는"+input2+"입니다.");
		
		System.out.println("문자입력해");
		Scanner a = new Scanner(System.in);
		String a1 = a.nextLine();
		System.out.println(a1);
		
		System.out.println("숫자입력해");
		Scanner b = new Scanner(System.in);
		int b1 = Integer.parseInt(b.nextLine());
		System.out.println(b1);
		
		System.out.println("문자와 숫자의 합"+a1+b1); 
		// String + 다른타입 = String
*/		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자를 입력해주세요");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("세번째 숫자를 입력해주세요");
		int c = Integer.parseInt(sc.nextLine());
		int d = a+b+c;
		System.out.println("세 숫자의 합은" + d + "입니당");
		System.out.println(a+b+c);*/
		
		//아이디 비밀번호 이름 전화번호 이메일을 입력받고  마지막에 입력받은 내용 전체를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("아디를 입력해봐");
		String id = sc.nextLine();
		System.out.println("비번은?");
		String pw = sc.nextLine();
		System.out.println("이름도");
		String name = sc.nextLine();
		System.out.println("전화번호도");
		int tel = Integer.parseInt(sc.nextLine());
		System.out.println("이메일은?");
		String email = sc.nextLine();
		System.out.println("당신의 아이디는"+ id);
		System.out.println("당신의 비밀번호" +pw);
		System.out.println("당신의 이름은" +name);
		System.out.println("당신의 전화번호" +tel);
		System.out.println("당신의 이메일" +email);
		
		
		
	}

}
