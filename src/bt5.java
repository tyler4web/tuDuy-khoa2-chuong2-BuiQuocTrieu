import java.util.Scanner;

public class bt5 {
	final static int MIN = -50;
	final static int MAX = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soDong = nhapSoDong(scan);
		int soCot = nhapSoCot(scan);
		int a[][] = taoMangRandom(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);

		inSoNguyenToDauTien(a, soDong, soCot);
	}

	public static int nhapSoDong(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị Dong>1");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int nhapSoCot(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị Cot >1");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] taoMangRandom(int soDong, int soCot, Scanner scan) {
		int a[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			}
		}

		return a;

	}

	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}

			System.out.println("\t");
		}
	}

	public static boolean timSoNguyenTo(int n) {
		boolean laSoNguyenTo = true;
		// Neu n < 2 thi khong phai la SNT
		if (n < 2) {
			laSoNguyenTo = false;
		}

		for (int i = 2; i < (n - 1); i++) {
			if (n % i == 0) {
				laSoNguyenTo = false;
				break;
			}
		}

		return laSoNguyenTo;

	}

	public static void inSoNguyenToDauTien(int a[][], int soDong, int soCot) {
		boolean soNguyenTo = false;

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				soNguyenTo = timSoNguyenTo(a[i][j]);

				if (soNguyenTo == true) {
					System.out.println("So nguyen to dau tien: " + a[i][j]);
					soNguyenTo = true;
					break;
				}

			}
			if (soNguyenTo == true) {
				break;
			}

		}
		if (soNguyenTo == false) {
			System.out.println("Khong co so nguyen to");

		}

	}

}
