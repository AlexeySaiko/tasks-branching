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
		
		// Составить программу сравнения двух чисел 1 и 2. если 1 меньше 2 - вывести на экран цифру 7, в противном случае - цифру 8.
		
		int a1 = 3;
		int b1 = 2; 
		
		if (a1 < b1) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}
	}
	
	public static void task02() {
		
		//Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 - вывести на экран слово "yes", в противном случае - слово "no".
		
		int a2 = 1;
		int b2 = 2;
		
		if (a2 < b2) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
	public static void task03() {
		
		// Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no». 
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число a:");
	
		int a = sc.nextInt();
	
		if (a < 3) {
		System.out.println("yes");
		} else {
		System.out.println("no");
		}
	}
	
	public static void task04() {
	
		//  Составить программу:  равны ли два числа а и b?
		
		int a4 = 5;
		int b4 = 6;
		
		if (a4 == b4) {
			System.out.println("a равно b");
		} else {
			System.out.println("a не равно b");
		}
	}
	
	public static void task05() {
		
		// Составить программу: определения наименьшего из двух чисел а и b. 
		
		int a5 = 10;
		int b5 = 12;
		
		if (a5 < b5) {
			System.out.println("Число a наименьшее из двух чисел");
		} else {
			System.out.println("Число b наименьшее из двух чисел");
		}
	}
	
	public static void task06() {
		
		// Составить программу: определения наибольшего из двух чисел а и b. 
		
		int a5 = 10;
		int b5 = 12;
		
		if (a5 > b5) {
			System.out.println("Число a наибольшее из двух чисел");
		} else {
			System.out.println("Число b наибольшее из двух чисел");
		}
	}
	
	public static void task07() {
		
		// Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х  
	
		int a7 = 2;
		int b7 = -7;
		int x7 = 10;
		int c7 = -3;
		
		int result7 = Math.abs(a7 * x7 * x7 + b7 * x7 + c7);
		
		System.out.println(result7);
	}
	
	public static void task08() {
		
		//	Составить программу нахождения наименьшего из квадратов двух чисел а и b. 
	
		int a8 = 10;
		int b8 = 20;
		
		if (a8 * a8 < b8 * b8) { 
			System.out.println("Квадрат числа a меньше квадрата числа b");
		} else {
			System.out.println("Квадрат числа a больше квадрата числа b");
		}
	}
	
	public static void task09() {
		
		// Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним. 
		
		int a9 = 10;
		int b9 = 10;
		int c9 = 10;
		
		if (a9 == b9 && b9 == c9) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равносторонний");
		}
	}
		
	public static void task10() {
		
		// Составить программу, которая определит площадь какого круга меньше. 
		
		int rad10n1 = 20;
		int rad10n2 = 15;
		
		double s10n1 = Math.PI * rad10n1 * rad10n1;
		double s10n2 = Math.PI * rad10n2 * rad10n2;
		
		if (s10n1 < s10n2) {
			System.out.println("Площадь первого круга меньше");
		} else {
			System.out.println("Площадь второго круга меньше");
		}
	}
	
	public static void task11() {
		
		// Составить программу, которая определит площадь какого треугольника больше. 
		
		int a11n1 = 22;
		int a11n2 = 12;
		int h11n1 = 10;
		int h11n2 = 9;
		
		double s11n1 = 0.5 * a11n1 * h11n1;
		double s11n2 = 0.5 * a11n2 * h11n2;
		
		if (s11n1 > s11n2) {
			System.out.println("Площадь первого треугольника больше");
		} else {
			System.out.println("Площадь второго треугольника больше");
		}
	}
	
	public static void task12 () {
		
		// Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные. 
	
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
		
		// Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. 
	
		int x13n1 = 2;
		int y13n1 = 4;
		int x13n2 = 5;
		int y13n2 = 7;
		
		double r13n1 = Math.sqrt(x13n1 * x13n1 + y13n1 * y13n1);
		double r13n2 = Math.sqrt(x13n2 * x13n2 + y13n2 * y13n2);
		
		if (r13n1 < r13n2) {
			System.out.println("Точка A находится ближе к началу координат");
		} else {
			System.out.println("Точка B находится ближе к началу координат");
		}
	}
	
	public static void task14() {
		
		// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. 
	
		int corner14n1 = 90;
		int corner14n2 = 80;
		
		int corner14n3 = 180 - corner14n1 - corner14n2;
		
		if (corner14n3 > 0) {
			System.out.println("Треугольник существует");
			if (corner14n1 == 90 || corner14n2 == 90 || corner14n3 == 90) 
				System.out.println("Треугольник является прямоугольным");
		} else {
			System.out.println("Треугольник не существует");
		}
	}
	
	public static void task15() {
		
		// Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением. 
	
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
			System.out.println("Условие не соблюдено");
		}
	}
	
	public static void task16() {
		
		//На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле). 
		
		int x16 = 5;
		int y16 = -2;
		
		if (x16 == 0 && y16 == 0) {
			System.out.println("Точка А находится в начале координат плоскости XOY");
		} else if (x16 == 0 && y16 != 0) {
			System.out.println("Точка А находится на оси x");
		} else if (x16 != 0 && y16 == 0) {
			System.out.println("Точка А находится на оси Y");
		} else if (x16 > 0 && y16 > 0) {
			System.out.println("Точка А расположена в первом координатном угле");
		} else if (x16 < 0 && y16 > 0) {
			System.out.println("Точка А расположена во втором координатном угле");
		} else if (x16 <0 && y16 < 0) {
			System.out.println("Точка А расположена в третьем координатном угле");
		} else if (x16 > 0 && y16 < 0) {
			System.out.println("Точка А расположена в четвертом координатном угле");
		}
	}
	
	public static void task17() {
		
		//	Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями. 
		
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
		
		// Подсчитать количество отрицательных среди чисел а, b, с. 
		
		int a18 = -2;
		int b18 = -3;
		int c18 = 9;
		
		if (a18 < 0 && b18 < 0 && c18 < 0) {
			System.out.println("Количество отрицательных чисел : 3");
		} else if (a18 < 0 && b18 < 0 || a18 < 0 && c18 < 0 || b18 < 0 && c18 < 0) {
			System.out.println("Количество отрицательных чисел : 2");
		} else if (a18 < 0 || b18 < 0 || c18 < 0) {
			System.out.println("Количество отрицательных чисел : 1");
		}
	}
	
	public static void task19() {
		
		// Подсчитать количество положительных среди чисел а, b, с. 
	
		int a19 = 8;
		int b19 = 5;
		int c19 = -9;
		
		if (a19 > 0 && b19 > 0 && c19 > 0) {
			System.out.println("Количество положительных чисел: 3");
		} else if (a19 > 0 && b19 > 0 || a19 > 0 && c19 > 0 || b19 > 0 && c19 > 0) {
			System.out.println("Количество положительных чисел : 2");
		} else if (a19 > 0 || b19 > 0 || c19 > 0) {
			System.out.println("Количество положительных чисел : 1");
		}
	}
	
	public static void task20() {
		
		// Определить, делителем каких чисел а, b, с является число k. 
		
		int a20 = 10;
		int b20 = 12;
		int c20 = 20;
		int k20 = 3;
		
		if (a20 % k20 == 0) {
			System.out.println("Число " + k20 + " является делителем для числа " + a20);
		} if (b20 % k20 == 0) {
			System.out.println("Число " + k20 + " является делителем для числа " + b20);
		} if (c20 % k20 == 0) {
			System.out.println("Число " + k20 + " является делителем для числа " + c20);
		}
	}
	
	public static void task21() {
		
		// Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!». 
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
        char answer = sc.next().charAt(0);

        switch (answer) {
            case 'Д':
                System.out.println("Мне нравятся мальчики!");
                break;
            case 'М':
                System.out.println("Мне нравятся девочки!");
                break;
            default:
                System.out.println("Неверное значение!");
        }
	}
	
	public static void task22() {
		
		// Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее. 
		
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
		
		// Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		
		int a23 = sc.nextInt();
		int b23 = sc.nextInt();
		
		if (a23 > 1 && a23 < 31 && b23 > 1 && b23 < 12) {
		System.out.println("Дата верна");
		} else {
		System.out.println("Введены некорректные данные");
		}
	}
	
	public static void task24() {
		
		// Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков п. 

		int n24 = 12;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Выберите лепесток:");
		
		int a24 = sc.nextInt();
		if (a24 <= n24) {
			if (a24 % 2 == 0) {
				System.out.println("Любит");
		    } else {
				System.out.println("Не любит");
		    }
		}
	}	
	
	public static void task25() {
		
		// Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С. 
		
		int a25 = (int) (Math.random() * 80);
		
		if (a25 > 60) {
			System.out.println("ПОЖАР!!!");
		} else {
			System.out.println("Не пожар =)");
		}
	}
	
	public static void task26() {
	
		// Написать программу нахождения суммы большего и меньшего из трех чисел. 
	
		int a26 = 20;
		int b26 = 10;
		int c26 = 9;
		int max26;
		int min26;
		
		if (a26 == b26 && b26 == c26) {
			System.out.println("Числа равны");
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
		
		// Найти max{min(a, b), min(c, d)}. 
		
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
		
		// Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d — c). 
		
		int a28 = 2;
		int b28 = 7;
		int c28 = 10;
		int d28 = 7;
		int max28;
		
		int max28da = d28 - a28;
		int max28db = d28 - b28;
		int max28dc = d28 - c28;
		
		if (a28 == d28) {
			System.out.println("Число a равно d");
		} else if (b28 == d28) {
			System.out.println("Число b равно d");
		} else if (c28 == d28) {
			System.out.println("Число c равно d");
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
		
		// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.  
		
		int x29a = 2;
		int y29a = 3;
		int x29b = 4;
		int y29b = 1;
		int x29c = 6;
		int y29c = 9;
		
		if((x29a - x29c)*(y29b - y29c) == (x29b - x29c)*(y29a - y29c)) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежат на одной прямой");
		}
	}
	
	public static void task30() {
		
		// Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так. 
		
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
		
		// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие. 
		
		int a31 = 10;
		int b31 = 20;
		int x31 = 9;
		int y31 = 18;
		int z31 = 40;
		
		int s31o = a31 * b31;	// Площадь отверстия.
		int s31k1 = x31 * y31;
		int s31k2 = x31 * z31;
		int s31k3 = y31 * z31;	// Площади граней кирпича.
		
		if (s31o > s31k1 || s31o > s31k2 || s31o > s31k3) {
			System.out.println("Кирпич пройдёт через отверстие");
		} else {
			System.out.println("Кирпич не пройдёт через отверстие");
		}
	}
	
		public static void task32() {
		
		// Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.  
	
		int a32 = 10;
		int b32 = 20;
		int c32 = -1;
		
		if (a32 + b32 > 0) {
			System.out.println("Сумма числе a и b является положительной");
		} if (a32 + c32 > 0) {
			System.out.println("Сумма числе a и c является положительной");
		} if (b32 + c32 > 0) {
			System.out.println("Сумма числе b и c является положительной");
		}
	}
		
		public static void task33() {
			
			// Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите пароль:");
			
			int a33 = sc.nextInt();
			
			if (a33 == 9583 || a33 == 1747) {
				System.out.println("Доступны модули баз A, B, C");
			} else if (a33 == 3331 || a33 == 7922) {
				System.out.println("Доступны модули баз B, C");
			} else if (a33 == 9455 || a33 == 8997) {
				System.out.println("Доступны модулm баз C");
			} else {
				System.out.println("Доступ запрещен");
			}
		}
		
		public static void task34() {
			
			// Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите стоимость книг: ");
			int a34 = sc.nextInt();
			
			System.out.println("Внесено покупателем: ");
			int b34 = sc.nextInt();
			
			if (a34 == b34) {
				System.out.println("Спасибо");
			} else if (b34 > a34) {
				int x34 = b34 - a34;
				System.out.println("Возьмите сдачу: " + x34);
			} else if (b34 < a34) {
				int n34 = a34 - b34;
				System.out.println("Недостаточно средств: " + n34);
			}
		}
		
		public static void task35() {
			
			// Вычислить число и месяц в невисокосном году по номеру дня. 
			
			Scanner sc = new Scanner(System.in);
	        System.out.println("Введите номер дня: ");
	        int a35 = sc.nextInt();
	            
	        System.out.println(a35 + "-й день в невисокосном году - это ");
			if (a35 <= 31) {
				System.out.println(a35 + " января");
			} else if (a35 <= 59) {
				a35 = a35 - 31;
				System.out.println(a35 + " февраля");
			} else if (a35 <= 90) {
				a35 = a35 - 59;
				System.out.println(a35 + " марта");
			} else if (a35 <= 120) {
				a35 = a35 - 90;
				System.out.println(a35 + " апреля");
			} else if (a35 <= 151) {
				a35 = a35 - 120;
				System.out.println(a35 + " мая");
			} else if (a35 <= 181) {
				a35 = a35 - 151;
				System.out.println(a35 + " июня");
			} else if (a35 <= 212) {
				a35 = a35 - 181;
				System.out.println(a35 + " июля");
			} else if (a35 <= 243) {
				a35 = a35 - 212;
				System.out.println(a35 + " августа");
			} else if (a35 <= 273) {
				a35 = a35 - 243;
				System.out.println(a35 + " сентября");
			} else if (a35 <= 304) {
				a35 = a35 - 273;
				System.out.println(a35 + " октября");
			} else if (a35 <= 334) {
				a35 = a35 - 304;
				System.out.println(a35 + " ноября");
			} else if (a35 <= 365) {
				a35 = a35 - 334;
				System.out.println(a35 + " декабря");
			} else {
				System.out.println("Ошибка");
	        }
		}
		
		public static void task36() {
			
			// Вычислить значение функции.
			
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
			
			// Вычислить значение функции.
			
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
			
			// Вычислить значение функции.
			
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
	
			// Вычислить значение функции.
			
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
			
			// Вычислить значение функции.
			
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
	
	