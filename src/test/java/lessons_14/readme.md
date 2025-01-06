# Java Dosya Var Olma Kontrolü

Bu proje, Java kullanarak dosyanın bilgisayarınızda mevcut olup olmadığını kontrol etmeyi gösteren iki farklı uygulamayı içermektedir. Selenium'un Windows uygulama testleri için kullanılmadığı durumlarda, bu teknikler dosya varlık kontrolü için kullanılabilir.

## 📚 Ders İçeriği

### **FileExits_01.java**
1. **Amaç:** Kullanıcının masaüstünde belirli bir dosyanın olup olmadığını kontrol etmek.
2. **İşlem:** 
   - Kullanıcının masaüstündeki "Test" klasöründe "deneme.txt" dosyasının varlığı kontrol edilir.
   - **`System.getProperty("user.home")`**: Kullanıcının ana dizin yolunu alır.
   - **`Files.exists(Paths.get(filePath))`**: Verilen dosyanın var olup olmadığını kontrol eder.

3. **Kullanılan Java Fonksiyonları:**
   - **`System.getProperty("user.home")`**: Kullanıcının ana dizin yolunu döndürür.
   - **`Files.exists()`**: Belirtilen dosya yolunun varlığını kontrol eder.

4. **Sonuç:** Dosyanın varlığı kontrol edilip sonucu ekrana yazdırılır.

---

### **FileExits_02.java**
1. **Amaç:** Projenin kök dizininde "pom.xml" dosyasının var olup olmadığını kontrol etmek.
2. **İşlem:** 
   - **`System.getProperty("user.dir")`**: Proje dizinini alır ve **`pom.xml`** dosyasının varlığını kontrol eder.
3. **Sonuç:** Dosyanın var olup olmadığı test edilir ve sonuç ekrana yazdırılır.

---

## 🛠️ Kullanılan Araçlar ve Teknolojiler
- **Java 8+**
- **Java NIO (New I/O)**: Dosya işlemleri için kullanılır.
- **`Files.exists()`**: Dosya varlık kontrolü için kullanılır.

## 🚀 Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza klonlayın veya indirin.
2. Java IDE (IntelliJ IDEA, Eclipse vb.) kullanarak projeyi açın.
3. **FileExits_01.java** veya **FileExits_02.java** dosyasını çalıştırarak dosyanın varlığını kontrol edin.
4. Ekranda dosyanın mevcut olup olmadığına dair sonucu görün.

## 📄 Kaynaklar
- [Java NIO Docs](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html)
- [System.getProperty() Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#getProperty-java.lang.String-)

## 🤝 Katkıda Bulunma
Her türlü katkıya açığız! Sorularınız veya geliştirme önerileriniz için lütfen iletişime geçin.

**📧 İletişim:** esmanurkaratas0@email.com

---

**Hazırlayan:** *[Esmanur Karataş]*  

