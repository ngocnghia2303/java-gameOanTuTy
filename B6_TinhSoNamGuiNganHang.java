
import java.util.Scanner;

public class B6_TinhSoNamGuiNganHang {
	static final float LAI_SUAT = (float) 0.07;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		guiTienTietKiem(scan);
	}
	
	public static Long guiTienTietKiem(Scanner scan) {
		boolean flag_continue = true;
		long tienBanDau;
		long tienMuaOto;
		
		do {
			System.out.println("Nhap vao so TIEN CAN CO MUA O-TO: ");
			tienMuaOto = Long.parseLong(scan.nextLine());
			System.out.println("Nhap vao so TIEN GUI TIET KIEM: ");
			tienBanDau = Long.parseLong(scan.nextLine());
			if(tienBanDau > 0 || tienMuaOto > 0) {
				tinhTienNhan(tienBanDau, tienMuaOto);
				flag_continue = false;
			}else {
				flag_continue = true;
			}
		} while (flag_continue);
		
		return tienBanDau;
	}
	
	public static void tinhTienNhan(long n, long m) {
		long tienBanDau = n;
		long tienMuaOto = m;

		long tienNhanDuoc = 0;
		int year = 0;

		
//		tienNhanDuoc = tienBanDau + tienBanDau * LAI_SUAT;
		boolean flag_exit = false;
		
		do {
			if(tienNhanDuoc >= tienMuaOto) {
				flag_exit = true;
			}else {
				year ++;
				tienNhanDuoc = (long) (tienBanDau + (tienBanDau * LAI_SUAT));
				tienBanDau = tienNhanDuoc;
				System.out.println("Tien Von + Lai: \t" + tienNhanDuoc + " VND \t sau: " + year + "Nam");
				flag_exit = false;
			}

			
		} while (!flag_exit);
		
		System.out.println(" ==> Sau: " + year + " Nam \t Tien Von & Lai nhan duoc: \t" + tienNhanDuoc + "VND");

	}

}
