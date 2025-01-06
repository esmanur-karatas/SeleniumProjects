# Selenium Iframe Kullanımı

Bu proje, Selenium WebDriver kullanarak iframe (Inline Frame) elemanları ile etkileşimde bulunmayı gösteren bir Java uygulamasını içermektedir. Iframe, bir web sayfası içinde başka bir web sayfası veya HTML dökümanı gömme işlemidir. Bu uygulama, iframe içerisine nasıl erişileceğini ve içine nasıl veri yazılacağını gösterir.

## 📚 Ders İçeriği

### **Iframe.java**

**Amaç:**
- Iframe elementlerini kontrol etmek ve içindeki öğelerle etkileşimde bulunmak.
- Iframe içine nasıl geçileceği ve nasıl veri yazılacağı konularını anlamak.

**Adımlar:**
1. `https://the-internet.herokuapp.com/iframe` sayfasına gidilir.
2. Sayfadaki başlık metninin doğru olup olmadığı kontrol edilir.
3. Iframe elemanı locate edilip, iframe içerisine geçilir.
4. TextBox elemanındaki metin temizlenir ve yeni bir metin ("Merhaba Dünya!") yazılır.
5. Driver iframe'den çıkartılır.
6. Tarayıcı kapatılır.

**Kod Açıklaması:**
- **`driver.switchTo().frame(iframe);`**: Bu komut, WebDriver'ı iframe içine geçirecek şekilde ayarlayarak, iframe içindeki öğelere erişim sağlar.
- **`driver.switchTo().parentFrame();`**: Bu komut, WebDriver'ı iframe'den bir üst frame'e çıkarır.
- **`driver.switchTo().defaultContent();`**: Bu komut ise WebDriver'ı tüm iframe'lerden çıkarıp, ana sayfaya döndürüyor. (Yorum satırına alınmış)

---

## 🛠️ Kullanılan Araçlar ve Teknolojiler
- **Java**
- **Selenium WebDriver**
- **ChromeDriver**

## 🚀 Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza klonlayın.
2. ChromeDriver yolunu doğru şekilde ayarlayın.
3. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
4. `Iframe.java` dosyasını çalıştırarak iframe içindeki metnin doğru şekilde yazıldığını gözlemleyin.

## 📄 Kaynaklar
- [Selenium Resmi Dokümantasyonu](https://www.selenium.dev/documentation/en/)
- [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)

## 🤝 Katkıda Bulunma
Her türlü katkıya açığız! Sorularınız veya geliştirme önerileriniz için lütfen iletişime geçin.

**📧 İletişim:** esmanurkaratas0@email.com

---

**Hazırlayan:** *[Esmanur Karataş]*  
