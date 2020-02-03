package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	System.out.println("심리테스트를 시작합니다 Y/N");
	String a = sc.nextLine();
	String type = null;
	
	if(a.equals("Y")){
		System.out.println("나는 금사빠다");
		String b = sc.nextLine();
		if(b.equals("Y")){
			
			System.out.println("연애할 때 끌려다니는 타입이다.");
			String c = sc.nextLine();
			if(c.equals("Y")){
				System.out.println("감정 표현에 솔직한 편이다.");
				String d = sc.nextLine();
				if(d.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.");
					String a1 = sc.nextLine();
					if(a1.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						String b1 = sc.nextLine();
						if(b1.equals("Y")){
							type = "D";
							System.out.println("당신의 타입은" +type);
						}else if(b1.equals("N")){
							type = "C";
							System.out.println("당신의 타입은" + type);
						}
					}else if(a1.equals("N")){
						type = b;
						System.out.println("당신의 타입은"+type);
					}
					
				}else if(d.equals("N")){
					
				}
			}else if(c.equals("N")){
				System.out.println("데이트 코스는 미리짜는게 편하다.");
				String i = sc.nextLine();
				if(i.equals("Y")){
					System.out.println("활동적인 데이트가 좋다.");
					String j = sc.nextLine();
					if(i.equals("Y")){
						System.out.println("이성친구는 존재할 수 없다");
						String l = sc.nextLine();
						if(l.equals("Y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							String n = sc.nextLine();
							if(n.equals("Y")){
								type = "D";
								System.out.println("당신의 타입은" +type);
							}else if(n.equals("N")){
								type = "C";
								System.out.println("당신의 타입은" + type);
							}
						}
					}else if(i.equals("N")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						String p = sc.nextLine();
						if(p.equals("Y")){
							type = "D";
							System.out.println("당신의 타입은" +type);
						}else if(p.equals("N")){
							type = "C";
							System.out.println("당신의 타입은" +type);
						}
						
					}
				}else if(i.equals("N")){
					System.out.println("감정표현에 솔직한 편이다.");
					String o = sc.nextLine();
				}
			}
		}else if(b.equals("N")){
			System.out.println("감정 기복이 크지 않다.");
			String e = sc.nextLine();
			if(e.equals("Y")){
				System.out.println("연락이 없어도 믿고 기다리는 편이다.");
				String d1 = sc.nextLine();
				if(d1.equals("Y")){
					type = "A";
					System.out.println("당신의 타입은" +type);
				}else if(d1.equals("N")){
					System.out.println("이성친구는 존재할 수 없다.");
					String e1 = sc.nextLine();
					if(e1.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						String f1 = sc.nextLine();
						if(f1.equals("Y")){
							type = "D";
							System.out.println("당신의 타입은" + type);
						}else if(f1.equals("N")){
							type = "C";
							System.out.println("당신의 타입은" + type);
						}
					
					
					}else if(d1.equals("N")){
						type = "B";
						System.out.println("당신의 타입은" + type);
					}
				}
				}
			else if(e.equals("N")){
				System.out.println("이성친구는 존재할 수 없다.");
				String g = sc.nextLine();
				if(g.equals("Y")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					String h = sc.nextLine();
					if(h.equals("Y")){
						type = "D";
						System.out.println("당신의 타입은" + type);
					}else if(h.equals("N")){
						type = "C";
						System.out.println("당신의 타입은"+type);
					}
				}else if(g.equals("N")){
					type = "B";
					System.out.println("당신의 타입은" +type);
					
				}
			}
		}
	}else if(a.equals("N")){
		System.out.println("테스트를 종료합니다.");
	}
	

	
	}

}
