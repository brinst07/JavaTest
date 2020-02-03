package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * <<논리연산자>>
		 * -여러개의 비교연산을 이어주는 역할을 한다.
		 * - &&(AND)	: 피연산자 둘다 true이면 true를 결과로 얻는다.
		 * - ||(OR)		: 피연산자중 하나라도 true이면 true를 결과로 얻는다.
		 * - !(NOT)		: 피연산자가 true 이면 false를 false이면 true를 결과로 얻는다.
		 * - 피연산자로 boolean만 허용한다.	
		 */	
		
		int a = 6;
		//a가 0보다 크다
		
		boolean b1 = 0 < a;
		
		//a가 10보다 작거나 같다.
		
		boolean b2 = a <= 10;
		
		//a가 0보다 크고 10보다 작거나 같다.
		
		boolean b = b1 && b2;
		b = 0 < a && a <= 10;
		
		//a가 2의 배수이거나 3의 배수인가??
		b = a % 2 ==0 || a% 3 ==0;
		System.out.println(b);
		
		//a가 2의 배수이거나 3의 배수이고 10이하인가? or 보다 and에 우선권이있음, 우선순위를 바꾸기위해 괄호사용
		b = (a%2 ==0 || a%3 ==0) && a<=10;
		System.out.println(b);
		
		char c = 'l';
		//c는 숫자인가?
		b = c >=0 && c<=9;
		System.out.println(b);
		
		//c는 영문소문자인가?
		b = 'a' <= c && c <= 'z';
		System.out.println(b);
		
		//논리연산자는 효율적인 연산을 한다.
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		b= true && true;
		b = true && false;
		b = false && true; //이미 왼쪽에서 false가 나왔기 때문에 오른쪽을 수행하지 않음 따라서 오른쪽은 deadcode
		b = false && false;
		
		b = true || true; //or는 둘중하나만 true면 true값이 나오는데 따라서 오른쪽을 확인하지 않으므로 deadcode
		b = true || false;
		b = false || true;
		b = false || false;

		int d = 10;
		b = d < 10 && 0< d++;//데드코드로 후연산되지 않는다.
		System.out.println(d);
		
		b =  !b;
		b = !(10 < 20);
		
		int x = 1, y= 2;
		b = x +3 *y >y-2 || x<3 && y>=5; //우선순위는 1. 산술 2.비교 3.논리
		
		//다음의 문장들을 코드로 작성해주세요.
		b= x>=0 && x<10;
		System.out.println("x가 0보다 크거나 같고 10보다 작다->"+ b);
		
		b = (x%2==0 || x%3==0 )&& x<=20;
		System.out.println("x가 2의 배수이거나 3의 배수이고 20이하이다.->" +b);
		
		
		}

}
