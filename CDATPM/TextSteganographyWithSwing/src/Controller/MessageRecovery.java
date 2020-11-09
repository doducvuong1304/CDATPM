// Message Reocovery Class
package Controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Do Duc Vuong - N16DCAT063
 */

public class MessageRecovery {
    
    // chuyen khoang trang thanh chuoi nhi phan
    public static String spaceToBinary(String content) {
        StringBuilder binarySecretContent = new StringBuilder();
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            binarySecretContent.append(c == ' ' ? 0 : 1);
        }
        return binarySecretContent.toString();
    }

    // lay thong diep da giau trong file
    public static String getMessageInFile(Path path) throws IOException {
        StringBuilder thongDiep = new StringBuilder();
        if (Files.exists(path)) {
            String noiDungFile = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
            String[] contentArr = noiDungFile.split("\\S");
            String khoangTrang = contentArr[contentArr.length - 1];
            String chuoiBinary = spaceToBinary(khoangTrang);

            String[] split = chuoiBinary.split("(?<=\\G.{8})");
            for (String s : split) {
                thongDiep.append((char) Integer.parseInt(s, 2));
            }
        }
        return thongDiep.toString();
    }
    
    // khoi phuc tin da giau
    public static String recoveryMessage(Path duongDan) throws IOException {
	return getMessageInFile(duongDan);
    }
    
}
