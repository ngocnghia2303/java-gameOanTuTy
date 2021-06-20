import java.util.Scanner;

public class B4_TinhTongLuyThua {
	
	static final int CONST_X = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		nhapSoNguye(scan);
	}
	
	//THONG BAO NHAP GIA TRI N
	public static Integer nhapSoNguye(Scanner scan) {
		int n = 0;
		System.out.println("Nhap 1 so nguyen n");
		n = Integer.parseInt(scan.nextLine());
		tinhTongLuyThua(n);
		return n;
	}

	//TINH TONG LUY THUA TU 1 - N CUA X
	public static void tinhTongLuyThua(int n) {
		float sum = 0;
		int luyThua;
		
		for (int i = 1; i <= n; i++) {
			luyThua = (int) Math.pow(CONST_X, i);
			System.out.println("x^" + i + " = " + luyThua);
			sum += luyThua;
		}
		System.out.println("S(n) = x + x^1 + x^2 + ... + x^" + n + " = \t" + sum);
	}

}
