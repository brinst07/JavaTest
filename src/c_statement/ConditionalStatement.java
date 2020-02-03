package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * <<if 문>>
		 *  - if		: 조건식의 결과가 true 이면 블럭안의 문장을 수행하낟.
		 *  - else if	: 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 *  - else		: 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */	
		
		int a = 10;
		
		if(a<100){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a<10){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		int regNo = 5; //주민등록번호 첫자리
		String gender = null; // 성별
		
		if(regNo == 1){
			gender = "남자";
		}else if(regNo ==2){ //if 블럭 뒤에 else if로 조건을 추가할 수 있다.
			gender = "여자";
		}else if(regNo ==3){
			gender = "남자";
		}else if(regNo ==4){
			gender = "여자";
		}else{
			gender = "외계인";
		}
		System.out.println("당신의 성별은" + gender + "입니다");
		
		regNo = 1;
		gender = null;
		//수행하ㅏㄹ 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다.
		if(regNo == 1 || regNo ==3)
			gender = "남자";
		else if(regNo ==2 || regNo ==4)
			gender = "여자";
		else
			gender = "확인불가";
		System.out.println("당신의 성별은" + gender + "입니다.");
		
		//성적에 등급을 부여하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요 ->");
//		int score = Integer.parseInt(sc.nextLine());
		int score = 0;
		String grade = null;
		
		if(score>=90){
			grade = "A";
			if(score>=95)
				grade += "+";
			else
				grade += "-";}
		else if(score >= 80){
			grade = "B";
			if(score>=55)
				grade += "+";
			else
				grade += "-";}
		else if(score >= 70){
			grade = "C";
			if(score>=75)
				grade+= "+";
			else
				grade+= "-";}
		else if(score >= 60){
			grade = "D";
			if(score>=65)
				grade += "+";
			else
				grade += "-";}
		else
			grade = "F";
		
		System.out.println("당신의 성적은" + grade + "입니다.");
		
		score = 100;
		grade = null;
		
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade += "+";
			}else if(score<=93){
				grade += "-";
			}
		}
		
		/*
		 * << switch문>>
		 *  - 조건식과 일치하는 case 문 이후의 문장을 수행한다.
		 *  - 조건식의 결과는 정수와 문자열만(JDK 1.7부터 문자열 허용) 허용한다.
		 */
		
		regNo = 1;
		gender = null;
		switch(regNo){
		case 1: case 3:
			gender = "남자";
			break;//break를 만나면 switch문을 빠져나간다.
		case 2 : case 4:
			gender = "여자";
			break;
		default :
			gender = "확인불가";
		}
		System.out.println("당신의 성별은" + gender);
		
		score = 95;
		grade = null;
		switch(score/10){
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default :
			grade = "F"; 
		}
		System.out.println(grade);
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요
		Scanner sc1 = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 ->");
	/*	int a1 = Integer.parseInt(sc1.nextLine());
		if(a1==0){
			System.out.println("0입니다.");
		}else{
			System.out.println("0이 아니다");
		}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요
		if(a1%2==0){
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}*/
		System.out.println("첫번째 숫자를 입력하시오");
		int v = Integer.parseInt(sc1.nextLine());
		System.out.println("두번째 숫자를 입력하시오");
		int s = Integer.parseInt(sc1.nextLine());
		
		if(v>s)
			System.out.println(v);
		else if(v<s)
			System.out.println(s);
		else
			System.out.println("두 값이 동일하네요....");
	
	
		//세게의 숫자를 입력받아 가장 큰 숫자를 출력해주세요
		
		int x = Integer.parseInt(sc1.nextLine());
		
		if(v>s && s>x){
			System.out.println(v);
		}else if(s>v && v>x){
			System.out.println(s);
		}else if(x>s && s>v){
			System.out.println(x);
		}
		}
		
	
		
	
	

}
