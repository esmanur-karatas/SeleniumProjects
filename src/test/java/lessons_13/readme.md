# Selenium Iframe ile Video Oynatma ve Kontrolü

Bu proje, Selenium WebDriver kullanarak bir iframe içerisindeki videoyu kontrol etmeyi gösteren bir Java uygulamasıdır. Video oynatma, duraklatma işlemleri ve sayfa kaydırma gibi işlemler otomatikleştirilmiştir.

## 📚 Ders İçeriği

### **Practise_02.java**
1. **Sayfa:** [HTML Iframe Tag](https://html.com/tags/iframe/)
2. **İşlem:** Sayfada bir iframe içinde yer alan video oynatılır ve duraklatılır. Sayfa kaydırma işlemleri ile video görünür hale getirilir.
3. **Adımlar:**
   - Sayfa iki kere aşağı kaydırılır ve bir kez yukarı kaydırılır.
   - Iframe içerisindeki video öğesi bulunur ve iframe'e geçiş yapılır.
   - Video oynatılmaya başlar ve ardından duraklatılır.
   - Video duraklatıldığında test yapılır.

### **Kullanılan Selenium Actionlar**
- **`sendKeys(Keys.PAGE_DOWN)`**: Sayfayı aşağı kaydırmak için kullanılır.
- **`sendKeys(Keys.ARROW_UP)`**: Sayfayı yukarı kaydırmak için kullanılır.
- **`click()`**: Belirtilen öğeye tıklama işlemi için kullanılır.
- **`switchTo().frame()`**: Iframe içine geçiş yapmak için kullanılır.
- **`isEnabled()`**: Bir öğenin aktif olup olmadığını kontrol eder.

## 🛠️ Kullanılan Araçlar ve Teknolojiler
- **Java**
- **Selenium WebDriver**
- **ChromeDriver**

## 🚀 Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza klonlayın.
2. ChromeDriver yolunu doğru şekilde ayarlayın.
3. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
4. İlgili Java dosyasını çalıştırarak iframe içindeki video oynatma ve duraklatma işlemlerini gözlemleyin.

## 📄 Kaynaklar
- [Selenium Resmi Dokümantasyonu](https://www.selenium.dev/documentation/en/)
- [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)

## 🤝 Katkıda Bulunma
Her türlü katkıya açığız! Sorularınız veya geliştirme önerileriniz için lütfen iletişime geçin.

**📧 İletişim:** esmanurkaratas0@email.com

---

**Hazırlayan:** *[Esmanur Karataş]*  



![image](https://github.com/user-attachments/assets/ad317746-eab4-4cc2-8edc-a1e5e4dfc178)
