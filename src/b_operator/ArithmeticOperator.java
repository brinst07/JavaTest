package b_operator;

public class ArithmeticOperator {
	public static void main(String[] args) {
		/*
		 * <<산술 연산자>
		 * - + : 더하기
		 * - - : 빼기
		 * - * : 곱하기
		 * - / : 나누기
		 * - % : 나머지
		 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		// *, /, % 연산자가 +,- 보다 연산의 우선순위가 높다.
		// 우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
		
		System.out.println(a);
		
		double d = 10 + 20.3; //서로 타입이 다른경우 작은타입이 큰타입으로 변한다.
		System.out.println(d);
		//피연산자의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 형 변환 후 연산이 수행된다.
		//따라서 연산의 결과도 표현범위가 큰 쪽의 타 입이 된다.
		
		byte b = 10;
		short c = 20;
		
		a = c - b;// a는 int타입 c는 short b는 byte이다. 4byte보다 작은 정수타입은 4byte(int)로 형변환 후 연산 수행
		/*c = c - b; 이것은 컴파일 오류가 발생한다. 왜냐하면 자바는 최소 4byte를 가지고 연산을 하는데 short나 byte
		4byte가 안되기 때문이다.
		*/
		System.out.println(a);
		
		long e1 = 1000000 * 1000000; //오버플로우 오류가 나는 이유는 (int)백만 * (int)백만 이기 때문이다.
		System.out.println(e1);
		
		long e2 = 1000000L * 1000000;//피연산자중 하나는 long이어야지 결과로 long을 얻는다.
		System.out.println(e2);
		
		double f1 = 10 / 4;//마찬가지로 둘다 int 타입이기 때문에 소수점자리가 없어진 2가 출력
		System.out.println(f1);
		double f2 = 10 / 4.0;//피연산자 하나를 double형으로 표기해줌으로써 double형이 되었다.
		System.out.println(f2);
		int f3 = 10 % 4;
		System.out.println(f3);
		
		
		//정수는 0으로 나눌 수 없다.
//		int g1 = 10 / 0; //런타임에러
		float g2 = 10.0f / 0;
		System.out.println(g2); //Infinity 무한대
		float g3 = 0/0f;
		System.out.println(g3); //NaN : Not a Number
		
		int h1 = 'A' + 1;
		System.out.println(h1);
		
		int h2 = 'D' - 'A'; //char는 2byte이므로 최소 조건인 4byte인 int로 변환되게 된다.
		System.out.println(h2);
		
		int h3 = '5' - '0';
		System.out.println(h3);
		
		//산술 연산자와 대입 연산자를 합해 연산식으로 줄여서 표현할 수 있다.
		int i = 0;
		i = i +1;
		i += 1;
		i += 2; //복합연산자 +=
		
		i = i -1;
		i -= 1;
		
		i = i * 1;
		i *=1;
		
		i = i/1;
		i /=1;
		
		i = i%1;
		i %=1;
		
		++i; //전위형 : 변수가 참조되기 전 수행
		i++; //후위형 : 변수가 참조된 후 수행
		--i;
		i--;
		
		i = 0;
		System.out.println("++i =" + ++i); //변수의 값을 참조하기 전에 연산을 수행후 참조
		i=0;
		System.out.println("i++ ="+ i++); //변수의 값이 참조된 후에 수행하여 다음 연산시 반영된다.
		System.out.println(i);
		
		//반올림을 하기위해 0.5를 더하고 소수점을 없애기 위해 int로 형변환한다.
		double round = 49.4;
		System.out.println((int)(round + 0.5));
		System.out.println(Math.round(round));//소수점 첫째자리에서 반올림
		System.out.println((int)(round *10 + 0.5)/10.0);// 소수점 둘째자리에서 반올림
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요
		int a1 = 123456;
		int b1 = 654321;
		int c1 = a1+b1;
		System.out.println(c1);
		long d1 = c1 * 123456L;
		System.out.println(d1);
		int d11 = (int) (d1/123456);
		System.out.println(d11);
		int d111 = d11-654321;
		System.out.println(d111);
		int d1111 = d111%123456;
		System.out.println(d1111);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요
		//평균은 소수점 둘째자리에서 반올림해주세요
		
		int z=500;
		int x=420;
		int  v=20;
		
		int sum = z+x+v;
		double avg = ((int)((sum/3.0)*10+0.5))/10.0;//double 형 표현은  0.0 이렇게만 해주면 된다.
		float avg1 = ((int)((sum/3f)*10+0.5)/10.0f);
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(avg1);
	
		
		
		
		
	}
	
}
