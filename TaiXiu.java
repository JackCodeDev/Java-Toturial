package main;

import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000;
		Scanner sc = new Scanner(System.in);
		int luaChon = 1;
		double tK = 5000000;
		do {
			System.out.println("--------- MỜI BẠN LỰA CHỌN-----------");
			System.out.println("*******Chọn 1 để tiếp tục chơi");
			System.out.println("*******Chọn (phím bất kỳ) để thoát");
			luaChon = sc.nextInt();
			if (luaChon == 1) {
				System.out.println("***************BẮT ĐẦU CHƠI******************");
				System.out.println("***********TÀI KHOẢN CỦA BẠN CÒN: " + tK + "***************");
				double datCuoc = 0;
				do {
					System.out.println("SỐ TIỀN ĐẶT CƯỢC CỦA BẠN: ");
					datCuoc = sc.nextDouble();

				} while (datCuoc <= 0 || datCuoc > tK);
				// Chon tai xiu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("LỰA CHỌN TÀI HAY XỈU: TÀI =2 **** XỈU = 1 ");
					luaChonTaiXiu = sc.nextInt();

				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				// XUC XAC
				Random xucXac = new Random();
				int giaTriL1 = xucXac.nextInt(5) + 1;
				int giaTriL2 = xucXac.nextInt(5) + 1;
				int giaTriL3 = xucXac.nextInt(5) + 1;
				int tong = giaTriL1 + giaTriL2 + giaTriL3;
				System.out.println(
						"TỔNG XÚC XẮC: " + giaTriL1 + "*****" + giaTriL2 + "*****" + giaTriL3 + "*****" + tong);

				// LUAT
				if (tong == 3 || tong == 18) {

					tK -= datCuoc;
					System.out.println("BẠN THUA CMNR!");
					System.out.println("SỐ TIỀN CÒN LẠI CỦA BẠN LÀ: " + tK);
				} else if (tong >= 4 && tong <= 10) {
					System.out.println("QUAY RA XỈU NHA: "+tong);				
					if (luaChonTaiXiu == 2) {
						
					tK -= datCuoc;
					System.out.println("BẠN THUA CMNR!");
					System.out.println("SỐ TIỀN CÒN LẠI CỦA BẠN LÀ: " + tK);
				} else {	
					if (luaChonTaiXiu ==1);
					tK += datCuoc;
					System.out.println("LẠI ĂN HÊN!");
					System.out.println("SỐ TIỀN CỦA BẠN LÀ: " + tK);
						}
				}
				else {
					System.out.println("QUAY RA TÀI NHA: "+tong);	
					if (luaChonTaiXiu == 1) {
						
					tK -= datCuoc;
					System.out.println("BẠN THUA CMNR!");
					System.out.println("SỐ TIỀN CÒN LẠI CỦA BẠN LÀ: " + tK);
				} else {
					if (luaChonTaiXiu ==2);				
					tK += datCuoc;
					System.out.println("LẠI ĂN HÊN!");
					System.out.println("SỐ TIỀN CỦA BẠN LÀ: " + tK);
				}
					}
			}
			
		} while (luaChon == 1);

	}
		}
