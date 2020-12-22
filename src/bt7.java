import java.util.Scanner;

public class bt7 {
	final static int MIN = -50;
	final static int MAX = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soDong = nhapSoDong(scan);
		int soCot = nhapSoCot(scan);
		int a[][] = nhapMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);

		isMaTranGiamDan(a, soDong, soCot);
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

	public static int[][] nhapMang(int soDong, int soCot, Scanner scan) {
		int a[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a[" + i + "]" + "[" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
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

	public static void isMaTranGiamDan(int a[][], int soDong, int soCot) {
		boolean flag = true;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot - 1; j++) {
				if (a[i][j] < a[i][j + 1]) {
					flag = false;
					break;
				}
			}
			if (flag == false) {
				break;
			}
		}

		if (flag == true) {
			System.out.println("YES.  Ma tran giam dan.");
		} else {
			System.out.println("NO.  Ma tran KHONG giam dan.");
		}

	}

}
