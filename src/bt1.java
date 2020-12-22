import java.util.Scanner;

public class bt1 {
	final static int MIN = -50;
	final static int MAX = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soDong = nhapSoDong(scan);
		int soCot = nhapSoCot(scan);
		int a[][] = taoMangRandom(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		timSoChanDauTien(a, soDong, soCot);
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

	public static void timSoChanDauTien(int a[][], int soDong, int soCot) {
		boolean coSoChan = false;
		for (int i = 0; i < soDong; i++) {
			if (coSoChan == false) {
				for (int j = 0; j < soCot; j++) {
					if (a[i][j] % 2 == 0) {
						System.out.println("So chan dau tien: " + a[i][j]);
						coSoChan = true;
						break;

					}
				}
			}
		}
		if (coSoChan == false) {
			System.out.println("Ham khong co so chan!");
		}

	}
}
