package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		/*
		 * << 배열 >>
		 * - int[] number = new int[5]; -> 가장 많이 사용하는 방법
		 * - int[] number = new int[]{10,20,30,40,50};
		 * - int[] number = {10,20,30,40,50};
		 * 
		 * 한번 정해지면 길이를 늘리거나 줄일수 가 없음 
		 */
		
		
		//배열은 참조형 타입이다.
		int [] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 만들어진다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//array = new int[5]; 이 방법 배열 초기화시 기본값(int타입 기본값 0 )이 저장된다.
		
		 System.out.println(array); //배열의 주소 출력
		 
		 System.out.println(array[0]); //실제값에 접근하기 위해서는 index를 지정해줘야한다.
		 //index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		 //배열의 최대 크기는 int의 최대값(약20억)이다.
		 
		 String arrayStr =Arrays.toString(array); //배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		 
		 
		 System.out.println(arrayStr);
		 
		 int [] iArray1 = new int[]{1,2,3}; // 값의 개수로 배열의 길이가 정해진다.
		 int [] iArray2 = {1,2,3};//선언과 초기화를 동시에 해야한다.
		 int [] iArray3;
		 //iArray3 = {1,2,3}; //컴파일 에러발생
		 
		 array [0] = 10; //인덱스는 0부터 시작한다.
		 array [1] = 20;
		 array [2] = 30;
		 array [3] = 40;
		 array [4] = 50;
		 //array [5] = 50; //-> 배열의 범위를 벗어나면 오류가 오류가 발생한다.
		 //java.lang.ArrayIndexOutOfBoundsException
		 
		 //정수를 저장할수 있는 길이가 10인 배열을 생성 및 초기화 해주세요
		 
		 int num [] = new int[10];
		 
		 //모든 인덱스에 있는 값을 변경해주세요
		 int sum = 0;
		 for(int i = 0; i<10; i++){
			 num[i]=10;
			 sum += num[i];
		 }
		 
		 String num1 = Arrays.toString(num);
		 System.out.println(num1);
		 System.out.println(sum);
		 
		 //index는 1씩 증가하는 규칙이 있어 FOR문과 함께 사용하기 좋다.
		 for(int i = 0; i<num.length; i++){
			 System.out.print(num[i]);
		 }
		 
		 int j=0;
		 
		 while(j<num.length){
			 System.out.println(num[j]);
			 j++;
		 }
		 
		 for(int i = 0; i< num.length; i++){
			 num[i] = i+1;
		 }
		 System.out.println(Arrays.toString(num));
		 
		 //배열에 숫자를 저장하고 합계와 평균을 구해보자
		 
		 int[] numbers = new int[10];
		 double avg = 0;
		 
		 for(int i = 0; i<numbers.length; i++){
			 numbers[i] = (int)(Math.random()*100)+1;
			 sum += numbers[i];
			 
			 if(i==numbers.length-1){
				 avg = (double)sum/numbers.length; 
				 System.out.println(Arrays.toString(numbers));
				 System.out.println("합계입니다."+sum);
				 System.out.println("평균입니다."+avg);
			 }
			 
		 }
		 
		 //향상된 for문
		 for(int number : numbers){//배열에 있는 값을 차례대로 변수에 넣는다. A(변수) : B(배열만 올수 있음) -> B배열에 있는 값을 차례대로 A에 넣는다.
			 //배열에 맞는 타입의 변수를 넣어줘야한다., 향상된 for문은 배열의 값을 읽을때만 사용가능하다.
			 System.out.println(number);
		 }
		 
		 
		 for(int number : numbers){
			 number = 0; // nubmer의 값은 변경되지 않는다.
			 System.out.println(number);
		 }
		 
		 System.out.println(Arrays.toString(numbers));
		 
		 
		 //배열에 저장된 숫자들중 최소값과 최대값을 찾아주세요
		 
		 int max=numbers[1] ,min =numbers[1];
		 for(int i = 0; i<numbers.length; i++){
			 
			 if(max<numbers[i])
				max = numbers[i];
			 else if(min>numbers[i])
				min = numbers[i];
			 
		 }
		 System.out.println("최대값은?"+max);
		 System.out.println("최소값은?"+min);
		 
		 int[] shuffle = new int[30];
		 
		 for(int i =0; i<shuffle.length; i++){
			 shuffle[i] = i+1;
		 }
		 
		 for(int i = 0; i< shuffle.length*100; i++){
			  int k = (int)(Math.random()*29);
			  int temp = 0;
			  
			  temp = shuffle[0];
			  shuffle[0]=shuffle[k];
			  shuffle[k]=temp;
		 }
		 
		 
		 System.out.println(Arrays.toString(shuffle));
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("난수의 최소값을 입력해주세요");
		 int s = Integer.parseInt(sc.nextLine());
		 System.out.println("난수의 최대값을 입력해주세요");
		 int d = Integer.parseInt(sc.nextLine());
		 System.out.println("반복횟수를 입력해주세요");
		 int re = Integer.parseInt(sc.nextLine());
		 
		 //1~10 사이의 난수를 500번 생성하고 각 숫자가 생성된 횟수를 출력해주세요
		 int b [] = new int[d-s+1];
		
		 
		 for(int i = 0; i<re; i++){
			 int a = (int)(Math.random()*(d-s+1))+s;
			 b[a-s]++;
			 
		 }
		
		 System.out.println(Arrays.toString(b));
		 for(int i = 0; i<b.length; i++){
			 System.out.println(s++ +"는 : "+b[i]+"번");
		 }
		 
		 //위 문제의 최소값, 최대값, 반복횟수를 입력받아 각숫자가 생성된 횟수를 출력해주세요 
		 
}
}
