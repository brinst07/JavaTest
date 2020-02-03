package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 * <<for문>>
		 * - for(int i = 1; i <10; i++){}
		 * - for(1부터 10까지 1씩 증가하면서 반복){} ( 초기화 ; 조건식 ; 증감식)
		 */
		
		for(int i  = 1; i<=10; i++){
			//for(초기화; 조건식; 증감식;){}
			//초기화 : 조건식과 증감식에 사용할 변수 초기화
			//조건식 : 연산결과가 true 이면 블럭안의 내용을 수행한다.
			//증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
			//초기화를 하고 조건식으로 가서 조건을 확인하고 true이면 {}를 실행하고 그다음에 증감식을 수행 이걸 반복
			System.out.println(i + "번째반복");
		}
		
		int sum = 0; //1부터 10까지의 합계를 저장
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i<=100; i++){
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 100; i>=1; i--){
			sum += i;
		}
		System.out.println(sum);
		
		//1부터 100까지 짝수의 합을 구해보자.
		sum = 0;
		for(int i = 2; i<=100; i+=2){
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i<=100; i++){
			if(i%2 ==0){
				sum += i;
			}
		}
		System.out.println(sum);
		
		//1부터 100까지 홀수의 합을 구해주세요
		
		sum = 0;
		for(int i = 1; i<=100; i+=2){
			sum += i;
		}
		System.out.println(sum);
		
		sum =0;
		for(int i=0; i<=100; i++){
			if(i%2 !=0){
				sum += i;
			}
		}
		
		System.out.println(sum);
		
		//구구단을 출력해보자
		for(int i = 1; i<=9; i++){
			System.out.println("2 * " + i + " = " + i * 2);
		}
		
		int a = 3;
		int gu;
		for(int i = 1; i<=9; i++){
			
			gu = a *i;
			System.out.printf("%d * %d = %d \n",a,i,gu);
		}
		
		//구구단 전체를 출력해주세요
		int gu1;
		for(int i = 1; i<10; i++)
			for(int j = 1; j<10; j++){
				gu1 = i*j;
				System.out.printf("%d * %d = %d \n",i,j,gu1);
			}
		
		//구구단 전체의 짝수단 홀수 줄만 출력해주세요
		for(int i = 2; i<10; i+=2){
			System.out.println();
			for(int j = 1; j<10; j+=2){
				gu1 = i*j;
				System.out.printf("%d * %d = %d \n",i,j,gu1);
			}
		}
		
		
		//구구단 전체를 가로로 출력해주세요
		for(int i = 1; i<10; i++){
			System.out.println();
			for(int j = 1; j<10; j++){
				gu1 = i*j;
				System.out.printf("%d * %d = %d ",j,i,gu1);
			}
		}
		
		for(int i =1 ; i<= 5; i++){
			for(int j = 1; j <= 10; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 10; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 10; i >= 1; i--){
			for(int j = 1; j <= i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * <<while문>>
		 * - while(조건식) {}
		 * - 조건식의 결과가 true인 동안 계속해서 반복
		 * - 반복횟수를 알 수 없을때 사용한다.		
		*/
		
		//사용자가 입력한 단구구단을 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		
		
		/*while(true){
			System.out.println("몇단을 출력할까요??(0 : 종료)");
			
			int dan = Integer.parseInt(sc.nextLine());
			
			if(dan == 0){
				System.out.println("종료되었습니다.");
				break; //가까운 반복문 하나를 탈출한다.
			}
			
			for(int i = 1; i <=9; i++){
				System.out.println(dan + "*" + i + " = " + dan*i);
			}
			
		}*/
		
		
		/*
		 * <<do-while문>>
		 * - do{ } while(조건식);
		 * -최소한 한번의 수행을 보장한다.
		 */
		
		//숫자 맞추기 게임을 만들어보자.
		
	/*	int answer = (int)(Math.random() *100)+1;
		int input = 0;
		do{
			System.out.println("1~100 사이의 수를 입력해주세요>");
			input = Integer.parseInt(sc.nextLine());
			
			if(answer<input){
				System.out.println(input + "보다 작습니다.");
			}else if(input < answer){
				System.out.println(input + "보다 큽니다.");
			}else{
				System.out.println("정답입니다!");
			}
			
		}while(input != answer);*/
		
		//이름붙은 반복문
		outer : for(int i =2; i <= 9; i++){
			for(int j =1; j<=9; j++){
				if(j==5){
					//break;//가장 가까운 반복문 하나를 빠져나간다.
					//break outer;//outer라는 이름의 반복문을 빠져나간다.
					//continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다.
					//continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다.
				}
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
		
		
		
	}
}
