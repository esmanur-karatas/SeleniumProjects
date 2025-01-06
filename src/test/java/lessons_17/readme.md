# Selenium Ekran Görüntüsü Yönetimi - Eleman ve Tam Sayfa Ekran Görüntüleri

Bu proje, Selenium WebDriver kullanarak iki farklı şekilde ekran görüntüsü almayı gösterir: belirli bir elemanın ekran görüntüsünü alma ve tüm sayfanın ekran görüntüsünü alma.

## 📚 Ders İçeriği

### **LocateScreenShot.java**
1. **Amaç:** Bu program, bir web sayfasındaki belirli bir elemanın (bu örnekte, Amazon arama sonucu) ekran görüntüsünü alır.
2. **İşlem Adımları:**
   - **Amazon Türkiye** sayfasına (`https://www.amazon.com.tr`) gidin.
   - "Apple" için arama yapın.
   - Sayfada belirli bir elemanın (ilk arama sonucu) ekran görüntüsünü alın.
   
3. **Ana Adımlar:**
   - **Elemanı Bulma:** `XPath` kullanarak elemanı bulun.
   - **Çıktı Dosyası Oluşturma:** Ekran görüntüsünün kaydedileceği yolu belirleyin.
   - **Ekran Görüntüsü Alma:** `getScreenshotAs(OutputType.FILE)` kullanarak elemanın ekran görüntüsünü alın.
   - **Ekran Görüntüsünü Kaydetme:** Geçici ekran görüntüsünü belirlenen çıktıya kopyalayın (açıklamalı `FileUtils.copyFile` ekran görüntüsünü kaydetmek için kullanılabilir).

---

### **FullPageScreenShot.java**
1. **Amaç:** Bu program, tüm sayfanın ekran görüntüsünü almayı gösterir.
2. **İşlem Adımları:**
   - **Amazon Türkiye** sayfasına (`https://www.amazon.com.tr`) gidin.
   - "Apple" için arama yapın.
   - Sayfanın tamamının ekran görüntüsünü alın (başlık, arama çubuğu ve sonuçlar dahil).
   
3. **Ana Adımlar:**
   - **`TakesScreenshot` Nesnesi Oluşturma:** Selenium'da ekran görüntüsü almak için bu nesne kullanılır.
   - **Çıktı Yolu Belirleme:** Ekran görüntüsünün kaydedileceği yolu belirleyin.
   - **Ekran Görüntüsünü Alma:** `getScreenshotAs(OutputType.FILE)` kullanarak tüm sayfanın ekran görüntüsünü alın.
   - **Ekran Görüntüsünü Kaydetme:** Geçici ekran görüntüsünü belirtilen dosyaya kopyalayın (açıklamalı `FileUtils.copyFile` ekran görüntüsünü kaydetmek için kullanılabilir).

---

## 🛠️ Araçlar ve Teknolojiler
- **Selenium WebDriver**: Web tarayıcılarını otomatikleştirmek ve web öğeleriyle etkileşimde bulunmak için kullanılır.
- **Java I/O**: Ekran görüntülerini kaydetmek için dosya işlemleriyle ilgilenir.
- **`TakesScreenshot` Arayüzü**: Selenium'da ekran görüntüsü almak için işlevsellik sağlar.
- **`getScreenshotAs(OutputType.FILE)`**: Ekran görüntüsünü alır ve dosya olarak döner.
- **`FileUtils.copyFile`**: Ekran görüntüsünü istenen yere kopyalar.

---

## 🚀 Projeyi Çalıştırma
1. Projeyi bilgisayarınıza klonlayın veya indirin.
2. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
3. **ChromeDriver**'ınızın makinenizde kurulu olduğundan emin olun.
4. `LocateScreenShot.java` veya `FullPageScreenShot.java` dosyasını çalıştırarak ekran görüntülerini alın.
5. Çalıştırdıktan sonra, ekran görüntülerinin belirtilen yerlerde kaydedildiğini görmelisiniz.

---

## 🤝 Katkıda Bulunma
Katkılarınız bekleniyor! Sorunları veya pull request'leri gönderebilirsiniz.

**📧 İletişim:** esmanurkaratas0@email.com

---

**Oluşturan:** *[Esmanur Karataş]*  
