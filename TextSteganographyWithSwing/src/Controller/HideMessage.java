/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author kingb
 */
public class HideMessage {
    
    // chuyen doan van ban (String) sang dang nhi phan (String)
    public static String chuyenThanhNhiPhan(String vanBan) {
        byte[] bytes = vanBan.getBytes(); // tao mang byte
        StringBuilder binary = new StringBuilder(); // tao StringBuilder
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1); // so sanh bit cua val va bit cua 128, chi tra ve 1 hoac 0
                val <<= 1;
            }
//            System.out.println(val);
            //binary.append(' '); // cach ra moi ki tu duoc chuyen thanh nhi phan
        }
        return binary.toString(); // tra ve chuoi nhi phan
    }


    // chuyen chuoi nhi phan thanh chuoi ky tu space va tab
    public static String chuyenThanhKhoangTrang(String chuoiNhiPhan) {
        // khoi tao cac ky tu
        String Tab = "\t";
        String Space = " ";
        String Zero = "0";
        String One = "1";
        String vanBanMaHoa = "";
        char[] arrayBinary = chuoiNhiPhan.toCharArray(); // chuyen thanh mang ky tu
        for (int i = 0; i < arrayBinary.length; i++) { // quy tac: 0 => space, 1 => tab
            if (String.valueOf(arrayBinary[i]).equals(Zero)) {
                vanBanMaHoa += Space; // 0 => space
            } else {
                vanBanMaHoa += Tab; // 1 => tab
            }
        }
        return vanBanMaHoa; // tra ve chuoi cac khoang trang bang space va tab
    }


    // ma hoa van ban de giau tin
    public static String maHoa(String vanBan) {
        String nhiPhan = chuyenThanhNhiPhan(vanBan);
        String khoangTrang = chuyenThanhKhoangTrang(nhiPhan);
        return khoangTrang;
    }
    
    // ham ghi file
    // ghi them noi dung, khong ghi de len noi dung da co
    public static void ghiFile(Path duongDan, String noiDung) throws IOException {
        File file = new File(String.valueOf(duongDan));
        boolean newFile = file.createNewFile(); // tao file moi
        if (newFile) { // neu file chua ton tai
            Files.write(duongDan, noiDung.getBytes());
        } else { // neu file da ton tai - ghi tiep noi dung
            String content = new String(Files.readAllBytes(duongDan), StandardCharsets.UTF_8).trim(); // xoa khoang trang thua
            String noiDungMoi = content.concat(noiDung);
            Files.write(duongDan, noiDungMoi.getBytes());
        }
    }
    
    // tinh nang giau tin
    public static void giauTin(String tinGiau, Path duongDan) throws IOException {
        String tinGiauKhoangTrang = maHoa(tinGiau); // ma hoa tin giau
        ghiFile(duongDan, tinGiauKhoangTrang); // giau tin vao file cover-text

        System.out.println("Log: Giau tin thanh cong!!");
    }
    
}
