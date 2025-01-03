package lessons_14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExits_01 {
    public static void main(String[] args) {
        //Selenium ile windows uyg test edemiyoruz.
        //Bilgisayarımızda bir dosyanın olup olmadığını kontrol etmek istediğimiz de java'dan yararlanıyoruz.

        //=> System.getProperty("user.dir"): İçinde bulunan klasörün yolunu(path) verir.
        //=> System.getProperty("user.home"): Bilgisayarımızda bulunan user(kullanıcının) path verir.
        //=> File.exists(Paths.get(filePath)): Bilgisayarımızda dosyanın olup olmadığını kontrol eder.
        //=> İndirilen bir dosyanın indirme klasöründe olup olmadığını kontrol etmek için bu java methodları kullanırız.


        //Masaüstünde Test Klasoru içerisinde deneme.txt isminde bir dosya oluşturun C:\Users\Huawei\Desktop\Test.deneme.txt
        String filePath = System.getProperty("user.home") + "\\Desktop\\Test\\deneme.txt";
        //Daha sonra bu dosyanın pc de olduğunu test edin.
        Boolean result = Files.exists(Paths.get(filePath));
        if (result) {
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }


        //bu uygulama dosyasının localde ki yolunu verir.
        System.out.println(System.getProperty("user.dir"));
        //kullanıcının yolunu verir.
        System.out.println(System.getProperty("user.home"));
    }
}
