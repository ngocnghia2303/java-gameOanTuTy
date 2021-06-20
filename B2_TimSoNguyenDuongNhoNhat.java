import java.util.Scanner;
public class B2_TimSoNguyenDuongNhoNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timSoNhoNhat_Cach1();
		timSoBeNhat_Cach2();
	}
	
	public static Integer timSoNhoNhat_Cach1() {
		int sum = 0;
		int soCanTim = 0;
		for (int i = 1; sum < 10000; i++) {
			sum += i;
			soCanTim = i;
			System.out.print(i + "\t");
			System.out.println("Tong = " + sum);

		}
		System.out.println("So Nguyen Duong Lon Nhat de 1+2+...+n > 10000 la: \t" + soCanTim);
		return soCanTim;
	}

	public static Integer timSoBeNhat_Cach2() {
		int sum = 0;
		int soCanTim2 = 0;
		boolean flag_exit = false;
		do {
			soCanTim2 ++;
			sum += soCanTim2;

			if(sum < 10000 ) {
			}else {
				flag_exit = true;
			}
			
			System.out.print(soCanTim2 + "\t");
			System.out.println("Tong = " + sum);

		} while (!flag_exit);
		System.out.println("=======> So can Tim la: \t" + soCanTim2);
		return soCanTim2;
	}
}
