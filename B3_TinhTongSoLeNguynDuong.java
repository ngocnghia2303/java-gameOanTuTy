import java.util.Scanner;

public class B3_TinhTongSoLeNguynDuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		nhapSoNguyenDuong(scan);
	}
	
	public static Integer nhapSoNguyenDuong(Scanner scan) {
		boolean flag_continue = true;
		int n;
		do {
			System.out.println("Nhap vao so nguyen duong n: ");
			n = Integer.parseInt(scan.nextLine());
			
			if(n > 0) {
				tinhTongSoLe(n);
				flag_continue = false;
			}else {
				flag_continue = true;
			}
		} while (flag_continue);
		return n;
	}
	
	//TINH TONG SO LE NGUYEN DUONG NHO HON N
	public static Integer tinhTongSoLe(int n) {
		int sum = 0;
		for (int i = 1; i < n; i+=2) {
			System.out.println("So Le: " + i );
			sum += i;
		}
		System.out.println("Tong Can Tim la: " + sum);
		return sum;
	}
	
}
