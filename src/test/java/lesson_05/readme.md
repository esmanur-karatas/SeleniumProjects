# Selenium Lesson 5: Amazon Automation Tests

Bu proje, Selenium WebDriver kullanarak Amazon üzerinde arama, sonuç kontrolü ve ürün detaylarına erişim gibi işlemlerin otomasyonunu gerçekleştirmek amacıyla oluşturulmuştur.

## 🚀 Projenin Amacı
- Amazon'da arama kutusu kullanarak ürün arama işlemleri gerçekleştirmek.
- Arama sonuçlarını kontrol etmek ve doğrulamak.
- İlk ürün detaylarına erişmek ve fiyat bilgilerini almak.
- Sayfa etkileşimlerini ve doğrulama adımlarını otomatikleştirmek.

## 🛠️ Kullanılan Teknolojiler
- **Java**: Kodlama dili
- **Selenium WebDriver**: Tarayıcı otomasyonu
- **ChromeDriver**: Chrome tarayıcısı için sürücü

---

## 📑 Practise_01: Amazon iPhone 11 Arama Testi

### **Adımlar:**
1. **Amazon Ana Sayfasına Git:** `get()` metodu kullanılarak Amazon ana sayfası açılır.
2. **Çerezleri Kabul Et:** `findElement(By.id("sp-cc-accept"))` metodu ile çerezler kabul edilir.
3. **Arama Kutusuna iPhone 11 Yaz:** `sendKeys("iPhone 11", Keys.ENTER)` kullanılarak arama yapılır.
4. **Arama Sonucunu Kontrol Et:** XPath ile arama sonuç metni alınır ve "iPhone 11" içeriği kontrol edilir.
5. **İlk Ürünün Fiyatını Yazdır:** XPath ile ilk ürünün fiyat bilgisi konsola yazdırılır.
6. **Tarayıcıyı Kapat:** `close()` metodu ile tarayıcı kapatılır.

### **Kullanılan Metodlar:**
- `findElement(By.name())`
- `sendKeys()`
- `getText()`
- `close()`

---

## 📑 Practise_02: Amazon Laptop Arama ve İlk Sonuç Detayları

### **Adımlar:**
1. **Amazon Ana Sayfasına Git:** `get()` metodu kullanılarak Amazon ana sayfası açılır.
2. **Çerezleri Kabul Et:** `findElement(By.id("sp-cc-accept"))` metodu ile çerezler kabul edilir.
3. **Arama Kutusuna Laptop Yaz:** `sendKeys("laptop")` ve `submit()` kullanılarak arama yapılır.
4. **Arama Sonucu Yazdır:** XPath ile arama sonucu sayısı alınır ve konsola yazdırılır.
5. **İlk Ürün Resmine Tıkla:** XPath kullanarak ilk ürünün resmi bulunur ve tıklanır.
6. **Tarayıcıyı Kapat:** `quit()` metodu ile tarayıcı tamamen kapatılır.

### **Kullanılan Metodlar:**
- `findElement(By.id())`
- `sendKeys()`
- `submit()`
- `click()`
- `quit()`

---

## 📦 Gereksinimler
- Java JDK
- Selenium Java Kütüphanesi
- ChromeDriver

## 💻 Projenin Çalıştırılması
1. Proje dosyasını klonlayın:
```bash
git clone https://github.com/kullaniciadi/SeleniumLessons.git
```
2. IDE'nizde projeyi açın.
3. ChromeDriver yolunu doğru şekilde ayarlayın.
4. `Practise_01` ve `Practise_02` sınıflarını çalıştırın.

## 🤝 Katkıda Bulunma
Katkıda bulunmak için lütfen bir `Pull Request` gönderin.

## 📚 Kaynaklar
- [Selenium Resmi Dokümantasyon](https://www.selenium.dev/documentation/)
- [ChromeDriver Resmi Sayfası](https://sites.google.com/a/chromium.org/chromedriver/)

## 🧑‍💻 Yazar
- **[Esmanur Karataş]**

Bu proje, Selenium kullanarak Amazon üzerinde otomasyon testleri gerçekleştirmek için oluşturulmuştur. Daha fazla içerik için takipte kalın! 🚀


![image](https://github.com/user-attachments/assets/6b2efa05-39c2-44ad-b6ba-d22c1fbcf528)

![image](https://github.com/user-attachments/assets/7a00c086-0dd7-4dad-a77a-f1f11f26deaa)
