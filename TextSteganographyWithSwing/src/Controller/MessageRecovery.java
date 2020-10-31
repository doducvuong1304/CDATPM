/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author kingb
 */
public class MessageRecovery {
    
    public static String chuyenKhoangTrangThanhChuoiNhiPhan(String content) {
        StringBuilder binarySecretContent = new StringBuilder();
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            binarySecretContent.append(c == ' ' ? 0 : 1);
        }
        return binarySecretContent.toString();
    }

    public static String layThongDiepAnTrongFile(Path path) throws IOException {
        StringBuilder thongDiep = new StringBuilder();
        if (Files.exists(path)) {
            String noiDungFile = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
            String[] contentArr = noiDungFile.split("\\S");
            String khoangTrang = contentArr[contentArr.length - 1];
            String chuoiBinary = chuyenKhoangTrangThanhChuoiNhiPhan(khoangTrang);

            String[] split = chuoiBinary.split("(?<=\\G.{8})");
            for (String s : split) {
                thongDiep.append((char) Integer.parseInt(s, 2));
            }
        }
        return thongDiep.toString();
    }
    
    public static String khoiPhuc(Path duongDan) throws IOException {
		return layThongDiepAnTrongFile(duongDan);
    }
    
}
