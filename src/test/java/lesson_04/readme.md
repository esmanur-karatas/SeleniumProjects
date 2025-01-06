# Selenium Lesson 4: DriverNavigateMethods & Window Management

Bu proje, Selenium WebDriver kullanarak tarayıcı navigasyon metodlarının ve pencere yönetim işlemlerinin nasıl kullanıldığını göstermek amacıyla oluşturulmuştur.

## 🚀 Projenin Amacı
Tarayıcı pencere boyutları ve konumlarını yönetmek, belirli konum ve boyutlara ayarlamak ve doğrulama işlemlerini gerçekleştirmek.

## 🛠️ Kullanılan Teknolojiler
- **Java**: Kodlama dili
- **Selenium WebDriver**: Tarayıcı otomasyonu
- **ChromeDriver**: Chrome tarayıcısı için sürücü

---

## 📑 Lesson 4: Window Management

### **Example_01.java**
#### Adımlar:
1. **YouTube Sayfasına Git:** `navigate().to()` ile YouTube sayfası açılır.
2. **Sayfa Konumu ve Boyutu Yazdırılır:** `getPosition()` ve `getSize()` metodları kullanılır.
3. **Simge Durumuna Getirme:** Tarayıcı simge durumuna getirilir.
4. **Maksimum Duruma Getirme:** Tarayıcı maksimum duruma getirilir.
5. **FullScreen Modu:** Tarayıcı tam ekran moduna alınır.
6. **Konum ve Boyut Yazdırılır:** Her aşamada konum ve boyut yazdırılır.
7. **Tarayıcı Kapatılır:** `close()` metodu ile tarayıcı kapatılır.

### **Example_02.java**
#### Adımlar:
1. **YouTube Sayfasına Git:** `navigate().to()` ile YouTube sayfası açılır.
2. **Sayfa Konumu ve Boyutu Yazdırılır:** `getPosition()` ve `getSize()` metodları kullanılır.
3. **Konum ve Boyut Ayarı:** `setPosition()` ve `setSize()` metodları ile tarayıcı pencere konumu ve boyutu ayarlanır.
4. **Doğrulama Testi:** Belirtilen konum ve boyut değerleri doğrulanır.
5. **Tarayıcı Kapatılır:** `close()` metodu ile tarayıcı kapatılır.

#### Kullanılan Metodlar:
- `getPosition()` → Sayfa konumunu döner.
- `getSize()` → Sayfa boyutunu döner.
- `setPosition()` → Sayfa konumunu ayarlar.
- `setSize()` → Sayfa boyutunu ayarlar.

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
4. `DriverNavigateMethods`, `Example_01`, `Example_02` sınıflarını çalıştırın.

## 🤝 Katkıda Bulunma
Katkıda bulunmak için lütfen bir `Pull Request` gönderin.

## 📚 Kaynaklar
- [Selenium Resmi Dokümantasyon](https://www.selenium.dev/documentation/)
- [ChromeDriver Resmi Sayfası](https://sites.google.com/a/chromium.org/chromedriver/)

## 🧑‍💻 Yazar
- **[Esmanur Karataş]**

Bu proje, Selenium navigasyon ve pencere yönetim metodlarını anlamak için oluşturulmuş bir örnektir. Daha fazla içerik için takipte kalın! 🚀

![image](https://github.com/user-attachments/assets/949a93e3-f718-4d8d-9c2b-da45b81aa25e)

![image](https://github.com/user-attachments/assets/bb01146c-a007-4111-9efd-9eeaa0e1755f)
