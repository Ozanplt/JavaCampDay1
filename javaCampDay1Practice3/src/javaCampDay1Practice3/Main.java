package javaCampDay1Practice3;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World");

		System.out.println("---------------------");
		// VARIABLES
		int number = 10;
		String message = "Öğrenci Sayısı: ";
		System.out.println(message + number);
		System.out.println("---------------------");
		double num = 12.5;
		int intnum = -129;
		char ch = 'A';
		System.out.println(num);
		System.out.println(intnum);
		System.out.println(ch);
		System.out.println("---------------------");
		int number1 = 30;
		if (number1 > 25) {
			System.out.println("Sayı 25'den büyüktür");
		} else if (number1 == 25) {
			System.out.println("Sayı 25'ye eşittir.");
		} else {
			System.out.println("Sayı 25'den küçüktür");
		}
		System.out.println("---------------------");
		// en büyük sayı
		int sayi1 = 32;
		int sayi2 = 16;
		int sayi3 = 85;
		int biggest = sayi1;

		if (biggest < sayi2) {
			biggest = sayi2;
		} else if (biggest < sayi3) {
			biggest = sayi3;
		}
		System.out.println("En büyük sayı: " + biggest);
		System.out.println("---------------------");
		// switch-case
		int day = 2;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;

		}

		System.out.println("---------------------");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);// 1'den 10'kadar yazdırma

		}
		// tek sayilar
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);

		}
		// while
		int a = 0;
		while (a < 10) {
			System.out.println(a);
			a++;
		}
		// do-while
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("---------------------");
		// for
		String[] students = new String[] { "Ali", "Veli", "Osman", "Fatma", "Ayşe" };
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		// foreach
		for (String student : students) {
			System.out.println(student);
		}
		System.out.println("---------------------");
		double[] myList = { 1, 10.3, 15, 5.4, 8 };
		double total = 0;
		double max = myList[0];
		for (double sayi : myList) {
			if (max < sayi) {
				max = sayi;
			}
			total = total + sayi;
			System.out.println(sayi);
		}
		System.out.println("total: " + total);
		System.out.println("Max : " + max);
		System.out.println("---------------------");
		String[][] cities = new String[3][3];
		cities[0][0] = "İzmir";
		cities[0][1] = "İstanbul";
		cities[0][2] = "Ankara";
		cities[1][0] = "Adana";
		cities[1][1] = "Bursa";
		cities[1][2] = "Balıkesir";
		cities[2][0] = "Kayseri";
		cities[2][1] = "Konya";
		cities[2][2] = "Gaziantep";
		for (int i = 0; i < 3; i++) {
			System.out.println("--------------");
			for (int k = 0; k < 3; k++) {
				System.out.println(cities[i][k]);
			}
		}
		System.out.println("---------------------");

		String mesaj = "bugün hava çok güzel.";
		System.out.println("5. eleman: " + mesaj.charAt(5)); // parantez içindeki indexin değerini öğrenmek için
		System.out.println(mesaj.concat("yaşasın")); // .concat methodu ile stringe ekleme yapılabilir
		char[] characters = new char[5];
		mesaj.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(mesaj.indexOf('a')); // parantez içindeki değerin indexini öğrenmek için
		System.out.println(mesaj.lastIndexOf('a')); // parantez içindeki değerin stringteki son indexini öğrenmek için
		String yeniMesaj = mesaj.replace(' ', '-'); // yer değiştirme işlemi için
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5)); // parantez içinde belirtilen sayılar arasını almak için
		for (String kelime : mesaj.split(" ")) { // parantez içinde belirtilen değer ile kesme işlemi yapabilmek için
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase()); // küçük karakterlere dönüştürmek için
		System.out.println(mesaj.toUpperCase()); // büyük karaketerlere dönüştürmek için
		System.out.println(mesaj.trim()); // başta ve sondaki boşlukları kırpmak için

		int k = 23;
		boolean check = false;
		for (int p = 2; p < k; p++) {
			if (k % p == 0) {
				check = true;
				break;
			}
		}
		if (!check) {
			System.out.println(k + " sayısı asaldır");
		} else {
			System.out.println(k + " sayısı asal değildir");
		}
		System.out.println("----------------------");
		int sayiDeneme = 6;
		int sayiToplam = 0;
		for (int i = 1; i < sayiDeneme; i++) {

			if (sayiDeneme % i == 0) {
				sayiToplam = sayiToplam + i;
			}
		}
		if (sayiToplam == sayiDeneme) {
			System.out.println("Sayı mükemmel sayıdır.");
		} else {
			System.out.println("Sayı mükemmel sayı değildir.");
		}
		System.out.println("----------------------");
		int sayia = 220;
		int sayib = 284;
		int sayiatoplam = 0;
		int sayibtoplam = 0;

		for (int i = 1; i < sayia; i++) {
			if (sayia % i == 0) {
				sayiatoplam = sayiatoplam + i;
			}
		}
		for (int i = 1; i < sayib; i++) {
			if (sayib % i == 0) {
				sayibtoplam = sayibtoplam + i;
			}

		}
		if (sayiatoplam == sayib && sayibtoplam == sayia) {
			System.out.println("Sayılar arkadaş sayıdır.");
		} else {
			System.out.println("Sayılar arkadaş sayı değildir");
		}

		System.out.println("----------------------");

		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		int aranacaksayi = 14;
		int sayac = 0;
		for (int deneme : sayilar) {
			if (deneme == aranacaksayi) {
				sayac++;
				break;
			}
		}
		if (sayac != 0) {
			System.out.println(aranacaksayi + " vardır");
		} else {
			System.out.println(aranacaksayi + " yoktur");
		}

	}

}
