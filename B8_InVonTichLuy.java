import java.util.Scanner;

public class B8_InVonTichLuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		nhapGiaTri1(scan);
		System.out.println("=================================");
		nhapGiaTri2(scan);
	}

	public static void nhapGiaTri1(Scanner scan) {
		System.out.println("Nhap lai suat nam %, tien von p, thoi han nam (vi du: 2.7,15000,3)");
		float a, b;
		int c;
		String chuoiNhap;
		String[] giaTri;

		chuoiNhap = scan.nextLine();
		//ngan cach gia tri bang dau ","
		giaTri = chuoiNhap.split(",");


		a = Float.parseFloat(giaTri[0])/100;
		b = Float.parseFloat(giaTri[1]);
		c = Integer.parseInt(giaTri[2]);

		System.out.println("Lai suat   = " + a + " %");
		System.out.println("Tien Von   = " + b + " VND");
		System.out.println("Thoi han   = " + c + " Nam");
		tinhVonTichLuy(a, b, c);

	}
	
	public static void tinhVonTichLuy(float laiSuat, float tienVon, int nam) {
		float tienLai = tienVon * laiSuat;
		float tienVonTichLuy = tienVon + tienLai;
		System.out.println("Nam \t\t Von");
		for (int i = 1; i <= nam; i++) {
			System.out.println(i + "\t\t" + tienVonTichLuy);
			tienLai = tienVonTichLuy * laiSuat;
			tienVonTichLuy = tienVonTichLuy + tienLai;
		}
	}

	
	public static void nhapGiaTri2(Scanner scan) {
		System.out.println("Nhap Lai Suat: (vi du: 2.7)");
		float a = Float.parseFloat(scan.nextLine());
		float laiSuat = a / 100;
		System.out.println("Nhap Von Ban Dau:");
		float vonBanDau = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap Thoi Han Gui: ");
		int nam = Integer.parseInt(scan.nextLine());
		tinhVonTichLuy(laiSuat, vonBanDau, nam);
	}

}
