// Delete Message Class
package Controller;

import static Controller.HideMessage.encodeString;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Do Duc Vuong - N16DCAT063
 */

public class DeleteMessage {
    
    // ghi de noi dung vao file
    public static void overwriteFile(Path duongDan) throws IOException {
        File file = new File(String.valueOf(duongDan));
        boolean newFile = file.createNewFile(); // tao file moi
        // xoa khoang trang trong noi dung file
        String content = new String(Files.readAllBytes(duongDan), StandardCharsets.UTF_8).trim();
        // ghi de
        Files.write(duongDan, content.getBytes());
    }
    
    // tinh nang xoa tin giau
    public static void deleteMessage(Path duongDan) throws IOException {
        overwriteFile(duongDan); // ghi de noi dung
        System.out.println("xóa thông điệp thành công!");
    }
    
}
