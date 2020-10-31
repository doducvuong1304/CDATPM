/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.HideMessage.maHoa;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author kingb
 */
public class DeleteMessage {
    
    // ham ghi file
    // ghi them noi dung, khong ghi de len noi dung da co
    public static void ghiDeFile(Path duongDan) throws IOException {
        File file = new File(String.valueOf(duongDan));
        boolean newFile = file.createNewFile(); // tao file moi
        String content = new String(Files.readAllBytes(duongDan), StandardCharsets.UTF_8).trim(); // xoa khoang trang thua
        Files.write(duongDan, content.getBytes());
    }
    
    // tinh nang giau tin
    public static void giauTin(Path duongDan) throws IOException {
        ghiDeFile(duongDan); // ghi noi dung
        System.out.println("Log: Giau tin thanh cong!!");
    }
    
}
