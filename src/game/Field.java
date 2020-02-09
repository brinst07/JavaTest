package game;

import java.util.Scanner;


import game.Char.hero;




public class Field {
	Scanner sc = new Scanner(System.in);
	Char ch = new Char();
	String a;
	
	
	//동굴
	void cave() {
		
		ch.info();
		System.out.println("이곳은 동굴입니다. 잠을 자거나 음식을 먹을수 있습니다.");
		System.out.println("잠을 자려면 1, 음식을 먹으려면 2, 나가려면 3을 눌러주세요");
		if(hero.hunger>=70) {
			System.out.printf("%s가 배가 고픕니다... hp가 감소했습니다.\n",hero.name);
			hero.hp-=5;
		}
		
		if(hero.sleep>=70) {
			System.out.printf("%s가 졸립니다.... hp가 감소했습니다.\n",hero.name);
			hero.hp-=5;
		}
		//int a = Integer.parseInt(sc.nextLine());
		String a = sc.nextLine();
		if(a.equals("1")) {
			hero.sleep=0;	
			hero.hp=100;
			System.out.println("졸림수치가 0이되었습니다, 체력이 충전되었습니다.");
			
			cave();
		}else if(a.equals("2")) {
			
			if(hero.meat>0) {
				hero.meat--;
			hero.hunger=0;
			hero.hp+=30;
			System.out.println("배고픔수치가 0이되었습니다, 체력이 충전되었습니다.");
			
			}else{
				System.out.println("고기가 없습니다. 낚시나 사냥을 시작하세요");
				
			}
			cave();
			
		}else if(a.equals("3")) {
			System.out.println("바다로 가시려면 1, 숲으로 가시려면 2 눌러주세요");
			a = sc.nextLine();
			if(a.equals("1")) {
				sea();
			}else if(a.equals("2")) {
				forest();
			}
		}else{
			System.out.println("키를 잘못입력하셨습니다.");
			cave();
		}
		
	}
	
	void sea(){
		System.out.println("이곳은 바닷가 입니다.");
		System.out.println("생선을 잡으시겠습니까?");
		String a = sc.nextLine();
		if(a.equals("y")||a.equals("y")) {
			fishing();
		}else {
			System.out.println("동굴로 되돌아갑니다.");
			cave();
		}
	}
	
	void fishing() {
		int fish_hp = (int)(Math.random()*20)+20;
		System.out.println("낚시대를 던졌습니다.");
		for(int i = 0; i<(int)(Math.random()*10000+500); i++) {
			
		}
		System.out.println("입질이왔습니다!!!!!!!!!");
		System.out.println();
		System.out.println("고기를 잡으려면 enter키를 연타해주세요");
		for(int i = 0; i<fish_hp; i++) {
			a=sc.nextLine();
			if(i==10)
				System.out.println("조금만 더 힘내세요!!");
		}
		System.out.println("고기를 +1획득했습니다.");
		System.out.println();
		System.out.println("배고픔과 졸림이 +20증가했습니다.");
		System.out.println("level up!!!");
		hero.meat++;
		hero.sleep+=20;
		hero.hunger+=20;
		hero.level++;
		if(hero.level==10) {
			System.out.println("구조대가 도착하였습니다.");
			System.out.println();
			System.out.println("당신은 성공적으로 무인도에서 살아남았습니다.");
			System.out.println();
			System.out.println("게임을 종료합니다.");
			System.exit(0);
		}
		
		cave();
		
	}
	
	void forest() {

		System.out.println("이곳은 숲입니다. 사냥을 시작하시겠습니까?");
		a=sc.nextLine();
		int pig_level = (int)(Math.random()*4)+1;
		int pig_hp = (int)(Math.random()*60)+20;
		if(a.equals("Y")||a.equals("y")) {
			
			
			System.out.println("*****************사냥감을 발견************************");
			System.out.println();
			System.out.printf("당신의 체력  :    %d          사냥감의 체력은    :    %d\n",hero.hp,pig_hp);
			System.out.println();
			System.out.printf("당신의 레벨  :    %d          사냥감의 레벨은    :    %d\n",hero.level,pig_level);
			System.out.println();
			System.out.println("사냥을 시작하겠습니까?");
			a=sc.nextLine();
			if(a.equals("Y")||a.equals("y")) {
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("사냥이 시작되었습니다.");
				System.out.println();
				while(true) {
					System.out.println("공격은 1번 방어 2번 도망가려면 3번을 눌러주세요");
					a=sc.nextLine();
					//사냥감의 공격확률을  난수로 받는 것
					int pig_atk = (int)(Math.random()*10);
					//사냥감의 공격력을 레벨에 비례해서 설정
					int pig_power = pig_level+pig_atk;
					
					
					//사냥감과 주인공의 전투현장
					if(a.equals("1")&&pig_atk>=3) {
						int attack = (int)(Math.random()*10)+hero.str;
						pig_hp-=attack;
						System.out.printf("사낭감은 %d의 피해를 입었고 %d의 hp가 남았습니다.\n\n",attack,pig_hp);
						System.out.println();
						System.out.println("사냥감에게 공격받았습니다!!!");
						System.out.println();
						System.out.printf("%s는 %d만큼의 피해를 입었고 %d의 hp가 남았습니다.\n",hero.name,pig_power,hero.hp);
						hero.hp-= pig_power;
						System.out.printf("%s의 체력  :    %d          사냥감의 체력은    :    %d\n",hero.name,hero.hp,pig_hp);
					}else if(a.equals("1")&&pig_atk<5) {
						System.out.println("공격했습니다만 사냥감이 방어했습니다.");
						System.out.println();
						int attack = (int)(Math.random()*10)+hero.str;
						System.out.printf("사낭감은 %d의 피해를 입었고 %d의 hp가 남았습니다.\n",attack/2,pig_hp);
						System.out.println();
						System.out.printf("%s의 체력  :    %d          사냥감의 체력은    :    %d\n",hero.name,hero.hp,pig_hp);
					}else if(a.equals("2")&&pig_atk>=5) {
						System.out.println("사냥감의 공격을 방어했습니다.");
						System.out.println();
						hero.hp-= pig_power/2;
						System.out.printf("%s은(는) %d의 피해를 입었고 %d의 hp가 남았습니다.\n",hero.name,pig_power/2,hero.hp);
					}else if(a.equals("2")&&pig_atk<5) {
						System.out.println("둘다 방어자세를취했습니다.");
						System.out.println();
					}else if(a.equals("3")) {
						System.out.printf("%s은(는) 사냥감의 기세에 눌려 겁쟁이처럼 동굴로 도망갔습니다.............ㅜㅜ\n",hero.name);
						cave();
					}
					
					if(hero.hp<=0) {
						System.out.println("...........GAME OVER...........");
						System.exit(0);
					}
					
					if(pig_hp<=0) {
						System.out.println("사냥에 성공했습니다!!!");
						System.out.println();
						hero.level++;
						System.out.println("레벨업을 하였습니다!!!");
						System.out.println();
						hero.meat++;
						System.out.println("고기를 얻었습니다!!!");
						System.out.println();
						System.out.println("배고픔 +30, 졸림 +30 되었습니다.");
						hero.sleep+=30;
						hero.hunger+=30;
						if(hero.level==10) {
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
							System.out.println("구조대가 도착하였습니다.");
							System.out.println("당신은 성공적으로 무인도에서 살아남았습니다.");
							System.out.println("게임을 종료합니다.");
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
							System.exit(0);
						}
						
						cave();
					}
				}
			}else {
				System.out.println("동굴로 돌아갑니다");
				cave();
			}
		}else{
			System.out.println("동굴로 되돌아갑니다.");
			cave();
		}
	}
	
	
}
	
	
