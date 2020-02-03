package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * <<비트연산자>>
		 *- |(OR)		: 피연산자 중 한쪽이라고 값이 1이면, 1을 그외는 0을 결과로 얻는다.
		 *- &(AND)		: 피연산자 양쪽이 모두 1이어야만 1을 그외는 0을 얻는다.
		 *- ^(XOR)		: 피연산자의 값이 서로 다를 때만 1을 같은때는 0을 결과로 얻는다.
		 *- ~(비트전환)	: 피연산자를 0은 1로 1은 0으로 바꾼다
		 *- <<(쉬프트)	: 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
		 *- >>(쉬프트) 	: 피연산자의 각 자리를 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.
		 *
		 *  <<기타 연산자>>
		 *  - .(참조연산자)			: 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다. -> 클래스 안쪽에 있는 메소드나 함수에 접근하기위해 필요
		 *  - (type)				: 형변환(casting)
		 *  (조건식)?:(삼항연산자)	: 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 *  - instanceof			: 참조형타입 확인 -> 인스턴스의 실제 타입을 알아보기 위해 그리고 결과로 boolean값을 반환한다.
		 */
		
		/*
		 * - 10진수 - > 2진수 : 10진수 값을 1이 될때까지 2로 나눈다.
		 * 
		 * 10
		 * 5 ....0
		 * 2 ....1
		 * 1 ....0
		 * # 1010
		 * 
		 * 15
		 * 7 ...1
		 * 3 ...1
		 * 1 ...1
		 * # 1111
		 * 
		 * - 2진수 -> 10진수 : 각 자리에 1, 2, 4, 8, 16, 32... 를 곱한값을 더한다.
		 * 1 0 1 0
		 * 8 4 2 1 = 1
		 * 
		 * 1111 -> 15
		 * 
		 * 		
		 */
		
		
		//00001010 : 10
		//00001111 : 15
		
		//| : 00001111
		System.out.println(10 | 15);
		//& : 00001010
		System.out.println(10 & 15);
		//^ : 000000101
		System.out.println(10^15);
		//~ : 11110101 -> 단항연산자이다.
		System.out.println(~10);
		//<< : 00010100
		System.out.println(10 << 1);
		//>> : 00000101
		System.out.println(10 >>1);
		
		int x = 10;
		int y = 20;
		int result = x<y ? x:y;
		//int reuslt = true ? x : y;
		//int result = x;
		System.out.println(result);
		
		//점수가 60점 이상이면 합격 미만이면 불합격
		
		int score = 50;
		String res = 60 <= score ? "합격" : "불합격" ;
		System.out.println(score + "점은" + res + "입니다");
		
		//주민등록번호 뒷자리의 첫번쨰 숫자가 1이면 남자 2면 여자
		int regNo = 1;
		String gender = regNo ==1 ? "남자" : "여자";
		System.out.println(gender);
		
		gender = regNo == 1 ? "남자" : (regNo ==2 ? "여자" : "확인불가");
		System.out.println("당신의 성별은" + gender + "입니다.");
		
		//두개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요
		int a = 10;
		int b = 20;
		int result2 = (a>b) ? a:b;
		System.out.println(result2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력해줘");
		int good = Integer.parseInt(sc.nextLine());
		System.out.println("수를 입력해줘");
		int bye = Integer.parseInt(sc.nextLine());
		int result3 = (good>bye) ? good:bye;
		System.out.println(result3);
		
		//변수에 저장된 수의 절대값을 출력해주세요
		
		System.out.println("수를 입력해주세요");
		int gel = Integer.parseInt(sc.nextLine());
		int gel1 = (gel>0)? gel : gel * -1;
		System.out.println(gel1);
		
		//변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요
		System.out.println("주민등록번호 뒷자리의 첫번째 숫자를 입력해주세요");
		int ju = Integer.parseInt(sc.nextLine());
		String ju1 = (ju==1)? "남자" : (ju==2)? "여자" : (ju==3)? "남자" : (ju==4)? "여자" : "확인불가";
		//String ju2 = (ju== (1 || 3))? "남자" : (ju==(2 or 4))? "여자" : "확인불가"; 
		//논리 연산자는 두개 이상의 비교연산자나 조건을 결합해줄수 있는 것이다. 위처럼 하면 문법에 맞지 않음
		String ju2 = (ju ==1 || ju ==3)? "남자" : (ju ==2 || ju==4)? "여자" : "확인불가";
		System.out.println(ju2);
		
		
		
		
		}

}
