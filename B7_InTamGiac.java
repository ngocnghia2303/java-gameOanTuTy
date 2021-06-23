import java.util.Scanner;

public class B7_InTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap chieu cao");
		int n = Integer.parseInt(scan.nextLine());
		inTamGiacDac(n + 1);
		inTamGiacRong(n - 1);
	}

	// STEP 1: IN TAM GIAC DAC===================>
	public static void inTamGiacDac(int n) {
		int khoangTrang;
		int ngoiSao;

		for (int i = 1; i < n; i++) {
			khoangTrang = n - i;
			int soKhoangTrang = inKhoangTrang(khoangTrang);
			ngoiSao = n - khoangTrang;
			inNgoiSao(ngoiSao, khoangTrang);
			System.out.println("\n");
		}
	}

	// IN KHOANG TRANG
	public static Integer inKhoangTrang(int m) {
		int khoangTrang = 0;

		for (int i = 1; i < m; i++) {
			System.out.print(" ");
			khoangTrang = i;
		}
		return khoangTrang;
	}

	// IN NGOI SAO
	public static void inNgoiSao(int ngoiSao, int khoangTrang) {

		for (int i = 0; i < ngoiSao; i++) {
			System.out.print("*");
		}

		int n = ngoiSao - 1;

		for (int j = 0; j < n; j++) {
			System.out.print("*");
		}

		inKhoangTrang(khoangTrang);
	}

	// STEP 2 IN TAM GIAC RONG=======================>
	public static Integer inKhoangTrang2(int m) {
		int khoangTrang = 0;

		for (int i = 1; i < m; i++) {
			System.out.print(" ");
			khoangTrang = i;
		}
		return khoangTrang;
	}

	public static Integer inNgoiSao2(int ngoiSao) {
		int soNgoiSao = 0;
		System.out.print(" *");
		return soNgoiSao;

	}

	// IN TAM GIAC RONG
	public static void inTamGiacRong(int n) {
		int khoangTrang;
		int soKhoangTrang;
		int soNgoiSao;
		int khoangTrang2;
		int khoangTrang3;

		for (int i = 0; i < n; i++) {
			khoangTrang = n - i;
			soKhoangTrang = inKhoangTrang2(khoangTrang);
			soNgoiSao = inNgoiSao2(1);
			khoangTrang2 = n - (soKhoangTrang);
			inKhoangTrang2(khoangTrang2);

			khoangTrang3 = inKhoangTrang2(khoangTrang2 - 1);

			if (i >= 1) {
				System.out.println("*");
			}

			System.out.println("\n");
		}

		// In * duong cuoi
		int saoEnd = n * 2 + 1;
		for (int i = 1; i <= saoEnd; i++) {
			System.out.print("*");
			;
		}

	}
}
