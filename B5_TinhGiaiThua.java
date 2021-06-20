import java.util.Scanner;

public class B5_TinhGiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		nhapSoNguyen(scan);
	}

	public static void nhapSoNguyen(Scanner scan) {
		int n = 0;
		long giaiThua;
		System.out.println("Nhap vao 1 so nguyen duong: ");
		n = Integer.parseInt(scan.nextLine());
		if (n == 1 || n == 0) {
			giaiThua = 1;
		} else {
			giaiThua = tinhGiaiThua(n);
		}
		System.out.println("KET QUA: " + n + "! = " + giaiThua);
	}

	public static Long tinhGiaiThua(int a) {
		long giaiThua = 1;
		for (int i = 1; i <= a; i++) {
			giaiThua *= i;
		}
		return giaiThua;
	}
}
