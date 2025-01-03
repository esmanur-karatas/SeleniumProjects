package lessons_14;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExits_02 {
    public static void main(String[] args) {
        // Projemizde pom.xml olduğunu test edin
        String filePath = System.getProperty("user.dir") + "\\pom.xml";
        Boolean result = Files.exists(Paths.get(filePath));
        if (result) {
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
    }
}
