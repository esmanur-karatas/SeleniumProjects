# Selenium Lesson 3: DriverNavigateMethods

Bu proje, Selenium WebDriver kullanarak tarayıcı navigasyon metodlarının nasıl kullanıldığını göstermek amacıyla oluşturulmuştur.

## 🚀 Projenin Amacı
Selenium WebDriver'ın `navigate()` metodları kullanılarak tarayıcıda ileri, geri, yenileme ve URL geçiş işlemlerinin nasıl gerçekleştirildiğini öğrenmek.

## 🛠️ Kullanılan Teknolojiler
- **Java**: Kodlama dili
- **Selenium WebDriver**: Tarayıcı otomasyonu
- **ChromeDriver**: Chrome tarayıcısı için sürücü

## 📑 Kod Açıklaması

### **DriverNavigateMethods.java**
#### Adımlar:
1. **Amazon Ana Sayfasına Git:** `navigate().to()` metodu kullanılarak Amazon ana sayfası açılır.
2. **YouTube Sayfasına Git:** `navigate().to()` ile YouTube sayfasına gidilir.
3. **Geri Dön:** `navigate().back()` ile önceki sayfaya (Amazon) geri dönülür.
4. **İleri Git:** `navigate().forward()` ile YouTube sayfasına tekrar gidilir.
5. **Sayfayı Yenile:** `navigate().refresh()` ile sayfa yenilenir.
6. **Tarayıcıyı Kapat:** `close()` metodu ile tarayıcı kapatılır.

#### Kullanılan Metodlar:
- `navigate().to(String url)` → Belirtilen URL'ye gider.
- `navigate().back()` → Önceki sayfaya döner.
- `navigate().forward()` → Sonraki sayfaya geçer.
- `navigate().refresh()` → Sayfayı yeniler.
- `close()` → Tarayıcıyı kapatır.

## 📦 Gereksinimler
- Java JDK
- Selenium Java Kütüphanesi
- ChromeDriver

## 💻 Projenin Çalıştırılması
1. Proje dosyasını klonlayın:
```bash
 git clone https://github.com/kullaniciadi/SeleniumLesson3.git
```
2. IDE'nizde projeyi açın.
3. ChromeDriver yolunu doğru şekilde ayarlayın.
4. `DriverNavigateMethods` sınıfını çalıştırın.

## 🤝 Katkıda Bulunma
Katkıda bulunmak için lütfen bir `Pull Request` gönderin.

## 📚 Kaynaklar
- [Selenium Resmi Dokümantasyon](https://www.selenium.dev/documentation/)
- [ChromeDriver Resmi Sayfası](https://sites.google.com/a/chromium.org/chromedriver/)

## 🧑‍💻 Yazar
- **[Esmanur Karataş]**

Bu proje, Selenium navigasyon metodlarını anlamak için oluşturulmuş bir örnektir. Daha fazla içerik için takipte kalın! 🚀

![image](https://github.com/user-attachments/assets/5ba841a1-3ffd-49a8-807a-e34a2793dabf)
