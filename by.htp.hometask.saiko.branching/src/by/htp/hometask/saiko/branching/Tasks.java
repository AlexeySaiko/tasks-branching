package by.htp.hometask.saiko.branching;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
		task21();
		task22();
		task23();
		task24();
		task25();
		task26();
		task27();
		task28();
		task29();
		task30();
		task31();
		task32();
		task33();
		task34();
		task35();
		task36();
		task37();
		task38();
		task39();
		task40();
		
	}
	
	public static void task01() {
		
		// ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 - ������� �� ����� ����� 7, � ��������� ������ - ����� 8.
		
		int a1 = 3;
		int b1 = 2; 
		
		if (a1 < b1) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}
	}
	
	public static void task02() {
		
		//��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 - ������� �� ����� ����� "yes", � ��������� ������ - ����� "no".
		
		int a2 = 1;
		int b2 = 2;
		
		if (a2 < b2) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
	public static void task03() {
		
		// ��������� ��������� ��������� ���������� ����� � � ����� 3. ������� �� ����� ����� �yes�, ���� ����� � ������ 3; ���� ������, �� ������� ����� �no�. 
	
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� a:");
	
		int a = sc.nextInt();
	
		if (a < 3) {
		System.out.println("yes");
		} else {
		System.out.println("no");
		}
	}
	
	public static void task04() {
	
		//  ��������� ���������:  ����� �� ��� ����� � � b?
		
		int a4 = 5;
		int b4 = 6;
		
		if (a4 == b4) {
			System.out.println("a ����� b");
		} else {
			System.out.println("a �� ����� b");
		}
	}
	
	public static void task05() {
		
		// ��������� ���������: ����������� ����������� �� ���� ����� � � b. 
		
		int a5 = 10;
		int b5 = 12;
		
		if (a5 < b5) {
			System.out.println("����� a ���������� �� ���� �����");
		} else {
			System.out.println("����� b ���������� �� ���� �����");
		}
	}
	
	public static void task06() {
		
		// ��������� ���������: ����������� ����������� �� ���� ����� � � b. 
		
		int a5 = 10;
		int b5 = 12;
		
		if (a5 > b5) {
			System.out.println("����� a ���������� �� ���� �����");
		} else {
			System.out.println("����� b ���������� �� ���� �����");
		}
	}
	
	public static void task07() {
		
		// ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ��� �������� ��������� a, b, c � �  
	
		int a7 = 2;
		int b7 = -7;
		int x7 = 10;
		int c7 = -3;
		
		int result7 = Math.abs(a7 * x7 * x7 + b7 * x7 + c7);
		
		System.out.println(result7);
	}
	
	public static void task08() {
		
		//	��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b. 
	
		int a8 = 10;
		int b8 = 20;
		
		if (a8 * a8 < b8 * b8) { 
			System.out.println("������� ����� a ������ �������� ����� b");
		} else {
			System.out.println("������� ����� a ������ �������� ����� b");
		}
	}
	
	public static void task09() {
		
		// ��������� ���������, ������� ��������� �� ���� ��������� ��������, �������� �� ������ ����������� ��������������. 
		
		int a9 = 10;
		int b9 = 10;
		int c9 = 10;
		
		if (a9 == b9 && b9 == c9) {
			System.out.println("����������� ��������������");
		} else {
			System.out.println("����������� �� ��������������");
		}
	}
		
	public static void task10() {
		
		// ��������� ���������, ������� ��������� ������� ������ ����� ������. 
		
		int rad10n1 = 20;
		int rad10n2 = 15;
		
		double s10n1 = Math.PI * rad10n1 * rad10n1;
		double s10n2 = Math.PI * rad10n2 * rad10n2;
		
		if (s10n1 < s10n2) {
			System.out.println("������� ������� ����� ������");
		} else {
			System.out.println("������� ������� ����� ������");
		}
	}
	
	public static void task11() {
		
		// ��������� ���������, ������� ��������� ������� ������ ������������ ������. 
		
		int a11n1 = 22;
		int a11n2 = 12;
		int h11n1 = 10;
		int h11n2 = 9;
		
		double s11n1 = 0.5 * a11n1 * h11n1;
		double s11n2 = 0.5 * a11n2 * h11n2;
		
		if (s11n1 > s11n2) {
			System.out.println("������� ������� ������������ ������");
		} else {
			System.out.println("������� ������� ������������ ������");
		}
	}
	
	public static void task12 () {
		
		// ���� ��� �������������� �����. �������� � ������� �� �� ���, �������� ������� ��������������, � � ��������� ������� � �������������. 
	
		double a12 = 12.23;
		double b12 = -13.66;
		double c12 = 9.76;
		
		if (a12 > 0) { 
			System.out.println(a12 * a12);
		} else {
			System.out.println(Math.pow(a12, 4));
		}
		
		if (b12 > 0) { 
			System.out.println(b12 * b12);
		} else {
			System.out.println(Math.pow(b12, 4));
		}
		
		if (c12 > 0) { 
			System.out.println(c12 * c12);
		} else {
			System.out.println(Math.pow(c12, 4));
		}
	}

	public static void task13() {
		
		// ���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������, ������� �� ����� ��������� ����� � ������ ���������. 
	
		int x13n1 = 2;
		int y13n1 = 4;
		int x13n2 = 5;
		int y13n2 = 7;
		
		double r13n1 = Math.sqrt(x13n1 * x13n1 + y13n1 * y13n1);
		double r13n2 = Math.sqrt(x13n2 * x13n2 + y13n2 * y13n2);
		
		if (r13n1 < r13n2) {
			System.out.println("����� A ��������� ����� � ������ ���������");
		} else {
			System.out.println("����� B ��������� ����� � ������ ���������");
		}
	}
	
	public static void task14() {
		
		// ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������. 
	
		int corner14n1 = 90;
		int corner14n2 = 80;
		
		int corner14n3 = 180 - corner14n1 - corner14n2;
		
		if (corner14n3 > 0) {
			System.out.println("����������� ����������");
			if (corner14n1 == 90 || corner14n2 == 90 || corner14n3 == 90) 
				System.out.println("����������� �������� �������������");
		} else {
			System.out.println("����������� �� ����������");
		}
	}
	
	public static void task15() {
		
		// ���� �������������� ����� � � �, �� ������ ���� �����. ������� �� ���� ���� ����� �������� ��������� �� �����, � ������� � �� ��������� �������������. 
	
		double x15 = 19.2;
		double y15 = 13.6;
		
		if (x15 != y15) {
			if (x15 < y15) {
				System.out.println(x15 = (x15 + y15) / 2);
				System.out.println(y15 = 2 * x15 * y15);
			} else {
				System.out.println((y15 = x15 + y15) / 2);
				System.out.println(x15 = 2 * x15 * y15);
			}
		} else {
			System.out.println("������� �� ���������");
		}
	}
	
	public static void task16() {
		
		//�� ��������� ��Y ������ ������ ������������ ����� �. �������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����). 
		
		int x16 = 5;
		int y16 = -2;
		
		if (x16 == 0 && y16 == 0) {
			System.out.println("����� � ��������� � ������ ��������� ��������� XOY");
		} else if (x16 == 0 && y16 != 0) {
			System.out.println("����� � ��������� �� ��� x");
		} else if (x16 != 0 && y16 == 0) {
			System.out.println("����� � ��������� �� ��� Y");
		} else if (x16 > 0 && y16 > 0) {
			System.out.println("����� � ����������� � ������ ������������ ����");
		} else if (x16 < 0 && y16 > 0) {
			System.out.println("����� � ����������� �� ������ ������������ ����");
		} else if (x16 <0 && y16 < 0) {
			System.out.println("����� � ����������� � ������� ������������ ����");
		} else if (x16 > 0 && y16 < 0) {
			System.out.println("����� � ����������� � ��������� ������������ ����");
		}
	}
	
	public static void task17() {
		
		//	���� ����� ����� m, n. ���� ����� �� �����, �� �������� ������ �� ��� ����� � ��� �� ������, ������ �������� �� ��������, � ���� �����, �� �������� ����� ������. 
		
		int m17 = 13;
		int n17 = 23;
		
		if (m17 != n17) {
			if (m17 > n17) {
				n17 = m17;
			} else if (m17 < n17) {
				m17 = n17;
			}
		} else if (m17 == n17) {
			m17 = 0;
			n17 = 0;
		}
		System.out.println("m = " + m17 + " n = " + n17);
	}
	
	public static void task18() {
		
		// ���������� ���������� ������������� ����� ����� �, b, �. 
		
		int a18 = -2;
		int b18 = -3;
		int c18 = 9;
		
		if (a18 < 0 && b18 < 0 && c18 < 0) {
			System.out.println("���������� ������������� ����� : 3");
		} else if (a18 < 0 && b18 < 0 || a18 < 0 && c18 < 0 || b18 < 0 && c18 < 0) {
			System.out.println("���������� ������������� ����� : 2");
		} else if (a18 < 0 || b18 < 0 || c18 < 0) {
			System.out.println("���������� ������������� ����� : 1");
		}
	}
	
	public static void task19() {
		
		// ���������� ���������� ������������� ����� ����� �, b, �. 
	
		int a19 = 8;
		int b19 = 5;
		int c19 = -9;
		
		if (a19 > 0 && b19 > 0 && c19 > 0) {
			System.out.println("���������� ������������� �����: 3");
		} else if (a19 > 0 && b19 > 0 || a19 > 0 && c19 > 0 || b19 > 0 && c19 > 0) {
			System.out.println("���������� ������������� ����� : 2");
		} else if (a19 > 0 || b19 > 0 || c19 > 0) {
			System.out.println("���������� ������������� ����� : 1");
		}
	}
	
	public static void task20() {
		
		// ����������, ��������� ����� ����� �, b, � �������� ����� k. 
		
		int a20 = 10;
		int b20 = 12;
		int c20 = 20;
		int k20 = 3;
		
		if (a20 % k20 == 0) {
			System.out.println("����� " + k20 + " �������� ��������� ��� ����� " + a20);
		} if (b20 % k20 == 0) {
			System.out.println("����� " + k20 + " �������� ��������� ��� ����� " + b20);
		} if (c20 % k20 == 0) {
			System.out.println("����� " + k20 + " �������� ��������� ��� ����� " + c20);
		}
	}
	
	public static void task21() {
		
		// ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ��� �������? ����� � ��� ̻. � ����������� �� ������ �� ������ ������ ��������� ����� ���� �������� �������!� ��� ���� �������� ��������!�. 
		
		Scanner sc = new Scanner(System.in);
        System.out.println("��� ��: ������� ��� �������? ����� � ��� �");
        char answer = sc.next().charAt(0);

        switch (answer) {
            case '�':
                System.out.println("��� �������� ��������!");
                break;
            case '�':
                System.out.println("��� �������� �������!");
                break;
            default:
                System.out.println("�������� ��������!");
        }
	}
	
	public static void task22() {
		
		// ���������������� �������� ���������� � � � ���, ����� � � ��������� ������� �� ���� ��������, � � y - �������. 
		
		int x22 = 10;
		int y22 = 20;
		int z22 = x22;
		
		if (x22 < y22) {
			x22 = y22;
			y22 = z22;
		}
		System.out.println("x = " + x22 + " y = " + y22);
	}
	
	public static void task23() {
		
		// ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� � �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����:");
		
		int a23 = sc.nextInt();
		int b23 = sc.nextInt();
		
		if (a23 > 1 && a23 < 31 && b23 > 1 && b23 < 12) {
		System.out.println("���� �����");
		} else {
		System.out.println("������� ������������ ������");
		}
	}
	
	public static void task24() {
		
		// ��������� ���������, ������������ ��������� ������� �� ������� � �������� �����, ���� �� �������� ������ ���������� ��������� �. 

		int n24 = 12;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ��������:");
		
		int a24 = sc.nextInt();
		if (a24 <= n24) {
			if (a24 % 2 == 0) {
				System.out.println("�����");
		    } else {
				System.out.println("�� �����");
		    }
		}
	}	
	
	public static void task25() {
		
		// �������� ��������� � ������ ������� ��������� ������� � ���������, ������� ������� ��������� �������������� �������� �, ���� ����������� � ������� ��������� 60� �. 
		
		int a25 = (int) (Math.random() * 80);
		
		if (a25 > 60) {
			System.out.println("�����!!!");
		} else {
			System.out.println("�� ����� =)");
		}
	}
	
	public static void task26() {
	
		// �������� ��������� ���������� ����� �������� � �������� �� ���� �����. 
	
		int a26 = 20;
		int b26 = 10;
		int c26 = 9;
		int max26;
		int min26;
		
		if (a26 == b26 && b26 == c26) {
			System.out.println("����� �����");
		} if (a26 > b26 && a26 > c26) {
				max26 = a26;
			} else if (b26 > c26 && b26 > a26) {
				max26 = b26;
			} else {
				max26 = c26;
			}
			if (a26 < b26 && a26 < c26) {
				min26 = a26;
			} else if (b26 < c26 && b26 < a26) {
				min26 = b26;
			} else {
				min26 = c26;
			}
		int result26 = max26 + min26;
		
		System.out.println("result = " + result26);
	}
	
	public static void task27() {
		
		// ����� max{min(a, b), min(c, d)}. 
		
		int a27 = 2;
		int b27 = 3;
		int c27 = 4;
		int d27 = 5;
		int min27ab;
		int min27cd;
		int max27;
		
		if (a27 < b27) {
			min27ab = a27;
		} else {
			min27ab = b27;
		}
		if (c27 < d27) {
			min27cd = c27;
		} else {
			min27cd = d27;
		}
		if (min27ab > min27cd) {
			max27 = min27ab;
		} else {
			max27 = min27cd;
		}
		System.out.println("max = " + max27);
	}
	
	public static void task28() {
		
		// ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� �� ����� d, �� ����� max(d � a, d � b, d � c). 
		
		int a28 = 2;
		int b28 = 7;
		int c28 = 10;
		int d28 = 7;
		int max28;
		
		int max28da = d28 - a28;
		int max28db = d28 - b28;
		int max28dc = d28 - c28;
		
		if (a28 == d28) {
			System.out.println("����� a ����� d");
		} else if (b28 == d28) {
			System.out.println("����� b ����� d");
		} else if (c28 == d28) {
			System.out.println("����� c ����� d");
		} else {
			if (max28da > max28db && max28da > max28dc) {
				max28 = max28da;
			} else if (max28db > max28da && max28db > max28dc) {
				max28 = max28db;
			} else {
				max28 = max28dc;
			}
			System.out.println("max = " + max28);
		}
	}
	
	public static void task29() {
		
		// ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.  
		
		int x29a = 2;
		int y29a = 3;
		int x29b = 4;
		int y29b = 1;
		int x29c = 6;
		int y29c = 9;
		
		if((x29a - x29c)*(y29b - y29c) == (x29b - x29c)*(y29a - y29c)) {
			System.out.println("����� ����� �� ����� ������");
		} else {
			System.out.println("����� �� ����� �� ����� ������");
		}
	}
	
	public static void task30() {
		
		// ���� �������������� ����� �,b,�. ������� ��� �����, ���� � > b > �, � �������� �� ����������� ����������, ���� ��� �� ���. 
		
		double a30 = 5.13;
		double b30 = 4.12;
		double c30 = -5.21;
		
		if (a30 > b30 && b30 > c30) {
			a30 = a30 * 2;
			b30 = b30 * 2;
			c30 = c30 * 2;
		} else {
			a30 = Math.abs(a30);
			b30 = Math.abs(b30);
			c30 = Math.abs(c30);
		}
		System.out.println("a = " + a30 + " b = " + b30 + " c = " + c30);
	}
	
	public static void task31() {
		
		// ������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ ����� ���������. 
		
		int a31 = 10;
		int b31 = 20;
		int x31 = 9;
		int y31 = 18;
		int z31 = 40;
		
		int s31o = a31 * b31;	// ������� ���������.
		int s31k1 = x31 * y31;
		int s31k2 = x31 * z31;
		int s31k3 = y31 * z31;	// ������� ������ �������.
		
		if (s31o > s31k1 || s31o > s31k2 || s31o > s31k3) {
			System.out.println("������ ������ ����� ���������");
		} else {
			System.out.println("������ �� ������ ����� ���������");
		}
	}
	
		public static void task32() {
		
		// �������� ���������, ������� �� �������� ���� ������ ����������, �������� �� ����� �����-���� ���� �� ��� �������������.  
	
		int a32 = 10;
		int b32 = 20;
		int c32 = -1;
		
		if (a32 + b32 > 0) {
			System.out.println("����� ����� a � b �������� �������������");
		} if (a32 + c32 > 0) {
			System.out.println("����� ����� a � c �������� �������������");
		} if (b32 + c32 > 0) {
			System.out.println("����� ����� b � c �������� �������������");
		}
	}
		
		public static void task33() {
			
			// �������� ���������, ������� �� ������ ����� ���������� ������� ������� ���������� � ��������� ���������� � ���� ������. ������ � ���� ����� ������ ����� �������, �������� �� ��� ������ �� ������� �������. ��� ����� ��������� ������: 9583, 1747 � �������� ������ ��� �, �, �; 3331, 7922 � �������� ������ ��� �, �; 9455, 8997 � �������� ������ ���� �.
			
			Scanner sc = new Scanner(System.in);
			System.out.println("������� ������:");
			
			int a33 = sc.nextInt();
			
			if (a33 == 9583 || a33 == 1747) {
				System.out.println("�������� ������ ��� A, B, C");
			} else if (a33 == 3331 || a33 == 7922) {
				System.out.println("�������� ������ ��� B, C");
			} else if (a33 == 9455 || a33 == 8997) {
				System.out.println("�������� �����m ��� C");
			} else {
				System.out.println("������ ��������");
			}
		}
		
		public static void task34() {
			
			// ��������� ���������, ����������� ������ ���������� ���������� � ������� ��������. ��������� ����������� ��������� ����, ����� �����, ��������� �����������; ���� ����� �� ���������, �������� �� ������ ��������; ���� ����� ������� ������, ��� ����������, �� �������� ��������� ����� � ��������� ����� �����; ���� ����� ������������, �� �������� ��������� �� ���� � ��������� ������ ����������� �����.
			
			Scanner sc = new Scanner(System.in);
			System.out.println("������� ��������� ����: ");
			int a34 = sc.nextInt();
			
			System.out.println("������� �����������: ");
			int b34 = sc.nextInt();
			
			if (a34 == b34) {
				System.out.println("�������");
			} else if (b34 > a34) {
				int x34 = b34 - a34;
				System.out.println("�������� �����: " + x34);
			} else if (b34 < a34) {
				int n34 = a34 - b34;
				System.out.println("������������ �������: " + n34);
			}
		}
		
		public static void task35() {
			
			// ��������� ����� � ����� � ������������ ���� �� ������ ���. 
			
			Scanner sc = new Scanner(System.in);
	        System.out.println("������� ����� ���: ");
	        int a35 = sc.nextInt();
	            
	        System.out.println(a35 + "-� ���� � ������������ ���� - ��� ");
			if (a35 <= 31) {
				System.out.println(a35 + " ������");
			} else if (a35 <= 59) {
				a35 = a35 - 31;
				System.out.println(a35 + " �������");
			} else if (a35 <= 90) {
				a35 = a35 - 59;
				System.out.println(a35 + " �����");
			} else if (a35 <= 120) {
				a35 = a35 - 90;
				System.out.println(a35 + " ������");
			} else if (a35 <= 151) {
				a35 = a35 - 120;
				System.out.println(a35 + " ���");
			} else if (a35 <= 181) {
				a35 = a35 - 151;
				System.out.println(a35 + " ����");
			} else if (a35 <= 212) {
				a35 = a35 - 181;
				System.out.println(a35 + " ����");
			} else if (a35 <= 243) {
				a35 = a35 - 212;
				System.out.println(a35 + " �������");
			} else if (a35 <= 273) {
				a35 = a35 - 243;
				System.out.println(a35 + " ��������");
			} else if (a35 <= 304) {
				a35 = a35 - 273;
				System.out.println(a35 + " �������");
			} else if (a35 <= 334) {
				a35 = a35 - 304;
				System.out.println(a35 + " ������");
			} else if (a35 <= 365) {
				a35 = a35 - 334;
				System.out.println(a35 + " �������");
			} else {
				System.out.println("������");
	        }
		}
		
		public static void task36() {
			
			// ��������� �������� �������.
			
			double x36 = 2.2;
			double y36;
			
			if (x36 <= 3) {
				y36 = x36 * x36 - 3 * x36 + 9;
			} else {
				y36 = 1 / (Math.pow(x36, 3) + 6);
			}
			System.out.println("y = " + y36);
		}
		
		public static void task37() {
			
			// ��������� �������� �������.
			
			double x37 = 9.9;
			double y37;
			
			if (x37 >= 3) {
				y37 = -x37 * -x37 + 3 * x37 + 9;
			} else {
				y37 = 1 / (Math.pow(x37, 3) - 6);
			}
			System.out.println("y = " + y37);
		}
		
		public static void task38() {
			
			// ��������� �������� �������.
			
			double x38 = 2.9;
			double y38;
			
			if (x38 >= 0 && x38 <= 3) {
				y38 = x38 * x38;
			} else {
				y38 = 4;
			}
			System.out.println("y = " + y38);
		}
		
		public static void task39() {
	
			// ��������� �������� �������.
			
			double x39 = 9.5;
			double y39;
			
			if (x39 >= 8) {
				y39 = -x39 * -x39 + x39 - 9;
			} else {
				y39 = 1 / (Math.pow(x39, 4) - 6);
			}
			System.out.println("y = " + y39);
		}

		public static void task40() {
			
			// ��������� �������� �������.
			
			double x40 = 1.5;
			double y40;
			
			if (x40 <= 13) {
				y40 = -x40 * -x40 + 9;
			} else {
				y40 = -(3 / (x40 + 1));
			}
			System.out.println("y = " + y40);
		}
}
	
	