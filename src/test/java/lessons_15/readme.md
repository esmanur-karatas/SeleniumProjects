# Selenium ile Dosya İndirme ve Yükleme

Bu proje, Selenium WebDriver kullanarak dosya indirme ve yükleme işlemlerini gerçekleştirmeyi gösteren iki örnek uygulama içermektedir. Birinci uygulama, bir dosyanın başarılı bir şekilde indirildiğini doğrularken, ikinci uygulama, bir dosyanın yüklenmesini ve başarılı bir şekilde yüklenip yüklenmediğini kontrol eder.

## 📚 Ders İçeriği

### **FileDownload.java**
1. **Amaç:** Web sitesinden belirli bir dosyanın indirilmesini sağlamak ve indirilen dosyanın bilgisayarınızda var olup olmadığını kontrol etmek.
2. **İşlem:**
   - `https://the-internet.herokuapp.com/download` adresine gidilir.
   - "Prakash_Reddy_Resume.pdf" dosyasına tıklanarak indirilmesi sağlanır.
   - İndirilen dosyanın bilgisayarın **Downloads** klasöründe bulunduğu doğrulanır.
   
3. **Kullanılan Java Fonksiyonları:**
   - **`Files.exists()`**: Dosyanın belirtilen yolda olup olmadığını kontrol eder.

4. **Sonuç:** İndirilen dosyanın var olup olmadığı kontrol edilip sonucu ekrana yazdırılır.

---

### **FileUpload.java**
1. **Amaç:** Bir web sitesine dosya yüklemek ve yüklemenin başarılı olup olmadığını test etmek.
2. **İşlem:**
   - `https://the-internet.herokuapp.com/upload` adresine gidilir.
   - Dosya yükleme alanına dosya yolu girilir.
   - Yükleme işlemi tamamlanıp, "File Uploaded!" mesajının görünüp görünmediği test edilir.
   
3. **Kullanılan Java Fonksiyonları:**
   - **`sendKeys()`**: Dosya yolunu yükleme alanına gönderir.
   - **`isEnabled()`**: Yükleme başarılıysa mesajın görünüp görünmediğini kontrol eder.

4. **Sonuç:** Yükleme işlemi sonrasında "File Uploaded!" mesajının görünmesi doğrulanır.

---

## 🛠️ Kullanılan Araçlar ve Teknolojiler
- **Selenium WebDriver**: Web tarayıcılarını otomatikleştirmek için kullanılır.
- **Java 8+**: Java ile dosya işlemleri ve Selenium entegrasyonu yapılır.
- **`Files.exists()`**: Dosya varlık kontrolü için kullanılır.
- **`sendKeys()`**: Dosya yükleme işlemi için kullanılır.

## 🚀 Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza klonlayın veya indirin.
2. Java IDE (IntelliJ IDEA, Eclipse vb.) kullanarak projeyi açın.
3. **FileDownload.java** dosyasını çalıştırarak dosyanın başarıyla indirildiğinden emin olun.
4. **FileUpload.java** dosyasını çalıştırarak dosyanın başarılı bir şekilde yüklendiğini doğrulayın.
5. Ekranda dosyanın başarıyla indirildiği veya yüklendiği ile ilgili mesajları görmelisiniz.

## 🤝 Katkıda Bulunma
Her türlü katkıya açığız! Sorularınız veya geliştirme önerileriniz için lütfen iletişime geçin.

**📧 İletişim:** esmanurkaratas0@email.com

---

**Hazırlayan:** *[Esmanur Karataş]*  

