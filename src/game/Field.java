package game;

import java.util.Scanner;


import game.Char.hero;




public class Field {
	Scanner sc = new Scanner(System.in);
	Char ch = new Char();
	String a;
	
	
	//����
	void cave() {
		
		ch.info();
		System.out.println("�̰��� �����Դϴ�. ���� �ڰų� ������ ������ �ֽ��ϴ�.");
		System.out.println("���� �ڷ��� 1, ������ �������� 2, �������� 3�� �����ּ���");
		if(hero.hunger>=70) {
			System.out.printf("%s�� �谡 ���Ŵϴ�... hp�� �����߽��ϴ�.\n",hero.name);
			hero.hp-=5;
		}
		
		if(hero.sleep>=70) {
			System.out.printf("%s�� �����ϴ�.... hp�� �����߽��ϴ�.\n",hero.name);
			hero.hp-=5;
		}
		//int a = Integer.parseInt(sc.nextLine());
		String a = sc.nextLine();
		if(a.equals("1")) {
			hero.sleep=0;	
			hero.hp=100;
			System.out.println("������ġ�� 0�̵Ǿ����ϴ�, ü���� �����Ǿ����ϴ�.");
			
			cave();
		}else if(a.equals("2")) {
			
			if(hero.meat>0) {
				hero.meat--;
			hero.hunger=0;
			hero.hp+=30;
			System.out.println("����ļ�ġ�� 0�̵Ǿ����ϴ�, ü���� �����Ǿ����ϴ�.");
			
			}else{
				System.out.println("��Ⱑ �����ϴ�. ���ó� ����� �����ϼ���");
				
			}
			cave();
			
		}else if(a.equals("3")) {
			System.out.println("�ٴٷ� ���÷��� 1, ������ ���÷��� 2 �����ּ���");
			a = sc.nextLine();
			if(a.equals("1")) {
				sea();
			}else if(a.equals("2")) {
				forest();
			}
		}else{
			System.out.println("Ű�� �߸��Է��ϼ̽��ϴ�.");
			cave();
		}
		
	}
	
	void sea(){
		System.out.println("�̰��� �ٴ尡 �Դϴ�.");
		System.out.println("������ �����ðڽ��ϱ�?");
		String a = sc.nextLine();
		if(a.equals("y")||a.equals("y")) {
			fishing();
		}else {
			System.out.println("������ �ǵ��ư��ϴ�.");
			cave();
		}
	}
	
	void fishing() {
		int fish_hp = (int)(Math.random()*20)+20;
		System.out.println("���ô븦 �������ϴ�.");
		for(int i = 0; i<(int)(Math.random()*10000+500); i++) {
			
		}
		System.out.println("�����̿Խ��ϴ�!!!!!!!!!");
		System.out.println();
		System.out.println("��⸦ �������� enterŰ�� ��Ÿ���ּ���");
		for(int i = 0; i<fish_hp; i++) {
			a=sc.nextLine();
			if(i==10)
				System.out.println("���ݸ� �� ��������!!");
		}
		System.out.println("��⸦ +1ȹ���߽��ϴ�.");
		System.out.println();
		System.out.println("����İ� ������ +20�����߽��ϴ�.");
		System.out.println("level up!!!");
		hero.meat++;
		hero.sleep+=20;
		hero.hunger+=20;
		hero.level++;
		if(hero.level==10) {
			System.out.println("�����밡 �����Ͽ����ϴ�.");
			System.out.println();
			System.out.println("����� ���������� ���ε����� ��Ƴ��ҽ��ϴ�.");
			System.out.println();
			System.out.println("������ �����մϴ�.");
			System.exit(0);
		}
		
		cave();
		
	}
	
	void forest() {

		System.out.println("�̰��� ���Դϴ�. ����� �����Ͻðڽ��ϱ�?");
		a=sc.nextLine();
		int pig_level = (int)(Math.random()*4)+1;
		int pig_hp = (int)(Math.random()*60)+20;
		if(a.equals("Y")||a.equals("y")) {
			
			
			System.out.println("*****************��ɰ��� �߰�************************");
			System.out.println();
			System.out.printf("����� ü��  :    %d          ��ɰ��� ü����    :    %d\n",hero.hp,pig_hp);
			System.out.println();
			System.out.printf("����� ����  :    %d          ��ɰ��� ������    :    %d\n",hero.level,pig_level);
			System.out.println();
			System.out.println("����� �����ϰڽ��ϱ�?");
			a=sc.nextLine();
			if(a.equals("Y")||a.equals("y")) {
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("����� ���۵Ǿ����ϴ�.");
				System.out.println();
				while(true) {
					System.out.println("������ 1�� ��� 2�� ���������� 3���� �����ּ���");
					a=sc.nextLine();
					//��ɰ��� ����Ȯ����  ������ �޴� ��
					int pig_atk = (int)(Math.random()*10);
					//��ɰ��� ���ݷ��� ������ ����ؼ� ����
					int pig_power = pig_level+pig_atk;
					
					
					//��ɰ��� ���ΰ��� ��������
					if(a.equals("1")&&pig_atk>=3) {
						int attack = (int)(Math.random()*10)+hero.str;
						pig_hp-=attack;
						System.out.printf("�糶���� %d�� ���ظ� �Ծ��� %d�� hp�� ���ҽ��ϴ�.\n\n",attack,pig_hp);
						System.out.println();
						System.out.println("��ɰ����� ���ݹ޾ҽ��ϴ�!!!");
						System.out.println();
						System.out.printf("%s�� %d��ŭ�� ���ظ� �Ծ��� %d�� hp�� ���ҽ��ϴ�.\n",hero.name,pig_power,hero.hp);
						hero.hp-= pig_power;
						System.out.printf("%s�� ü��  :    %d          ��ɰ��� ü����    :    %d\n",hero.name,hero.hp,pig_hp);
					}else if(a.equals("1")&&pig_atk<5) {
						System.out.println("�����߽��ϴٸ� ��ɰ��� ����߽��ϴ�.");
						System.out.println();
						int attack = (int)(Math.random()*10)+hero.str;
						System.out.printf("�糶���� %d�� ���ظ� �Ծ��� %d�� hp�� ���ҽ��ϴ�.\n",attack/2,pig_hp);
						System.out.println();
						System.out.printf("%s�� ü��  :    %d          ��ɰ��� ü����    :    %d\n",hero.name,hero.hp,pig_hp);
					}else if(a.equals("2")&&pig_atk>=5) {
						System.out.println("��ɰ��� ������ ����߽��ϴ�.");
						System.out.println();
						hero.hp-= pig_power/2;
						System.out.printf("%s��(��) %d�� ���ظ� �Ծ��� %d�� hp�� ���ҽ��ϴ�.\n",hero.name,pig_power/2,hero.hp);
					}else if(a.equals("2")&&pig_atk<5) {
						System.out.println("�Ѵ� ����ڼ������߽��ϴ�.");
						System.out.println();
					}else if(a.equals("3")) {
						System.out.printf("%s��(��) ��ɰ��� �⼼�� ���� ������ó�� ������ ���������ϴ�.............�̤�\n",hero.name);
						cave();
					}
					
					if(hero.hp<=0) {
						System.out.println("...........GAME OVER...........");
						System.exit(0);
					}
					
					if(pig_hp<=0) {
						System.out.println("��ɿ� �����߽��ϴ�!!!");
						System.out.println();
						hero.level++;
						System.out.println("�������� �Ͽ����ϴ�!!!");
						System.out.println();
						hero.meat++;
						System.out.println("��⸦ ������ϴ�!!!");
						System.out.println();
						System.out.println("����� +30, ���� +30 �Ǿ����ϴ�.");
						hero.sleep+=30;
						hero.hunger+=30;
						if(hero.level==10) {
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
							System.out.println("�����밡 �����Ͽ����ϴ�.");
							System.out.println("����� ���������� ���ε����� ��Ƴ��ҽ��ϴ�.");
							System.out.println("������ �����մϴ�.");
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
							System.exit(0);
						}
						
						cave();
					}
				}
			}else {
				System.out.println("������ ���ư��ϴ�");
				cave();
			}
		}else{
			System.out.println("������ �ǵ��ư��ϴ�.");
			cave();
		}
	}
	
	
}
	
	
