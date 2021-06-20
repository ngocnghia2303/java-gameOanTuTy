
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BT1_OanTuTi1 {
	static final int KEO = 1;
	static final int BUA = 2;
	static final int BAO = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		batDauChoi(scan);

	}

	public static void batDauChoi(Scanner scan) {
		int countNguoi = 0;
		int countMay = 0;
		int hiepDau = 0;
		int start;
		boolean flag_exit = false;
		
		do {
			hiepDau ++;
			System.out.println("NHAP VAO MOT SO KHAC 0 DE BAT DAU OR TIEP TUC CHOI");
			start = Integer.parseInt(scan.nextLine());
			
			if(start == 0) {
				System.out.println("Thong Bao: \t DUNG TRO CHOI");
				flag_exit = true;
			}else {
				// B1: Nguoi Choi
//				int nguoi = nguoiChon(scan);
				int nguoi = yeuCauChon();
				// B2: may Choi
				int may = randomMachines(nguoi);
				// B3: So sanh ket qua Quan Tu Ti
				int ketQua = soSanhKetQua(nguoi, may);
				// B4: Tim Nguoi chien thang moi~ Hiep
				System.out.print("Hiep: " + hiepDau + "\t");
				switch (ketQua) {
				case 1:
					countNguoi++;
					System.out.println("==> NGUOI` THANG");
					break;
				case 2:
					countMay++;
					System.out.println("==> MAY' THANG");
					break;
				default:
					System.out.println("==> KET QUA HOA`");
					break;
				}
			}
			//Thong bao ty so chung cuoc
			System.out.println("===> TY SO SAU " + hiepDau + " HIEP: \t Nguoi " + countNguoi + " - May " + countMay);
			
		} while (!flag_exit);
	}
	
	//YEU CAU` NGUOI` CHOI OAN TU` TI`
	public static Integer yeuCauChon() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nguoi choi chon 3 phuong an sau: ");
		System.out.println("Chon 1 => ra KEO'");
		System.out.println("Chon 2 => ra BUA'");
		System.out.println("Chon 3 => ra BAO");
		return nguoiChon(scan);
	}
	
	//NGUOI` CHON. KEO'- BUA' - BAO 
	public static Integer nguoiChon(Scanner scan) {
		boolean flag_continue = false;
		int nguoiChon = Integer.parseInt(scan.nextLine());
		
		do{
			String vietSub = null;
			switch (nguoiChon) {
			case 1:
				vietSub = "KEO'";
				break;
			case 2:
				vietSub = "BUA'";
				break;
			case 3:
				vietSub = "BAO";
				break;
			default:
				System.out.println("Vui long chon gia tri 1 - 2 - 3");
				flag_continue = true;
				yeuCauChon();
				break;
			}
			break;
		}while(flag_continue);	
		
		return nguoiChon;
	}

	// MAY' CHON. KEO - BUA - BAO
	public static Integer randomMachines(int a) {
		int mayChon = 5;
		String ketQuaMay;
		String vietSub = null;
		
		for (int i = 1; i <= a; i++) {
			int ranNum = ThreadLocalRandom.current().nextInt(1, 4);
			mayChon = ranNum;
		}
		
		switch (mayChon) {
		case 1:
			vietSub = "KEO'";
			break;
		case 2:
			vietSub = "BUA'";
			break;
		case 3:
			vietSub = "BAO";
			break;

		default:
			break;
		}
		
		System.out.println("May ra: " + vietSub);
		return mayChon;
	}

	//SO SANH' KET' QUA OAN TU` TY` (NGUOI VS MAY)
	public static Integer soSanhKetQua(int nguoi, int may) {
		int ketQua = 0;

		if (nguoi == BAO && may == BUA) {
			ketQua = 1;
		} else if (nguoi == BUA && may == KEO) {
			ketQua = 1;
		} else if (nguoi == KEO && may == BAO) {
			ketQua = 1;
		} else if (nguoi == may) {
			ketQua = 0;
		} else {
			ketQua = 2;
		}
		
		return ketQua;
	}

}
