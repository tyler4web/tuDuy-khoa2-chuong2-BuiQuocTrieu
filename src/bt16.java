import java.util.Scanner;

public class bt16 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = nhapN(scan);
		int a[][] = taoMangRandom(n, n, scan);
		xuatMang2chieu(a, n, n);

		InDuongCheoSongDuongCheoPhu(a, n);
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

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap N la so hang hoac so cot cua ma tran vuong. n >1");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] nhapMang2chieu(int soDong, int soCot, Scanner scan) {
		int a[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a[" + i + "]" + "[" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}

		return a;

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

	public static void xuatMang2chieu(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}

			System.out.println("\t");
		}
	}

	public static void xuatMang1chieu(int a[]) {
		for (int item : a) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}

	public static int[] bienThanh1chieu(int a[][], int soDong, int soCot) {
		int b[] = new int[soDong * soCot];
		int k = 0;
		for (int i = 0; i < soDong; i++) {
			b[k] = a[0][0];
			for (int j = 0; j < soCot; j++)
				b[k++] = a[i][j];
		}
		return b;
	}

	public static void InDuongCheoSongDuongCheoPhu(int a[][], int n) {
		System.out.println("-----------------");
		System.out.println("Cac duong cheo song song voi duong cheo phu: ");
		for (int i = 0; i < n * 2 - 1; i++) {
			if (i <= n - 1) {
				for (int j = 0; j <= i; j++) {
					System.out.print(a[j][i - j] + "\t");
				}
				System.out.println();
			} else {
				for (int j = i - (n - 1); j < n - 1; j++) {
					System.out.print(a[j][i - j] + "\t");
				}
				System.out.println();
			}
		}
	}

}
