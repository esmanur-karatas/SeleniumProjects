# Selenium Mouse Actions ve Keyboard Actions Kullanımı

Bu proje, Selenium WebDriver kullanarak fare ve klavye işlemleri gerçekleştirmeyi gösteren Java tabanlı bir uygulamadır. Fare hareketleri ve klavye tuşlarına basma gibi işlemleri otomatikleştirmek için Selenium'un `Actions` sınıfı kullanılmıştır.

## 📚 Ders İçeriği

### **Mouse Actions**
Bu bölümde, mouse hareketleriyle yapılabilecek çeşitli işlemler gösterilmektedir.

#### **MouseAction_01.java**
1. **Sayfa:** [Amazon](https://www.amazon.com.tr)
2. **İşlem:** Sağ üst köşedeki "Hello, sign in" menüsüne mouse ile gelinip, "Create a List" seçeneğine tıklanır ve doğrulama yapılır.
3. **Kullanılan Actionlar:**
   - `moveToElement()`: Belirtilen web elementine mouse ile gelmek.
   - `click()`: Tıklama işlemi.

#### **MouseAction_02.java**
1. **Sayfa:** [The Internet](https://the-internet.herokuapp.com/context_menu)
2. **İşlem:** Sayfada sağ tıklama yapılır ve çıkan alert'in doğruluğu kontrol edilir.
3. **Kullanılan Actionlar:**
   - `contextClick()`: Sağ tıklama yapma.

#### **MouseAction_03.java**
1. **Sayfa:** [Click and Hold](https://selenium08.blogspot.com/2020/01/click-and-hold.html)
2. **İşlem:** Bir öğe, başka bir öğenin üzerine sürüklenip bırakılır.
3. **Kullanılan Actionlar:**
   - `clickAndHold()`: Bir öğeye tıklanıp, basılı tutulur.
   - `moveToElement()`: Bir öğe üzerinde mouse hareket ettirilir.
   - `release()`: Tıklama bırakılır.

#### **MouseAction_04.java**
1. **Sayfa:** [DemoQA - Droppable](https://demoqa.com/droppable)
2. **İşlem:** "Drag me" öğesi, "Drop here" kutusuna sürüklenip bırakılır ve öğenin değişen metni doğrulanır.
3. **Kullanılan Actionlar:**
   - `dragAndDrop()`: Bir öğeyi başka bir öğeye sürükler ve bırakır.

### **Keyboard Actions**
Bu bölümde, klavye tuşlarına basma işlemleri gösterilmektedir.

#### **KeyboardActions_01.java**
1. **Sayfa:** [Amazon](https://www.amazon.com.tr)
2. **İşlem:** Arama kutusuna "Samsung A71" yazılır ve Enter tuşuna basılarak arama yapılır.
3. **Kullanılan Actionlar:**
   - `click()`: Web elementine tıklama.
   - `keyDown()`: Klavye tuşuna basma.
   - `keyUp()`: Klavye tuşundan el çekme.
   - `sendKeys()`: Klavye ile karakter gönderme.
   - `sendKeys(Keys.ENTER)`: Enter tuşuna basma.

## 🛠️ Kullanılan Araçlar ve Teknolojiler
- **Java**
- **Selenium WebDriver**
- **ChromeDriver**

## 🚀 Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza klonlayın.
2. ChromeDriver yolunu doğru şekilde ayarlayın.
3. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
4. İlgili Java dosyasını çalıştırarak mouse ve klavye işlemlerini gözlemleyin.

## 📄 Kaynaklar
- [Selenium Resmi Dokümantasyonu](https://www.selenium.dev/documentation/en/)
- [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)

## 🤝 Katkıda Bulunma
Her türlü katkıya açığız! Sorularınız veya geliştirme önerileriniz için lütfen iletişime geçin.

**📧 İletişim:** esmanurkaratas0@email.com

---

**Hazırlayan:** *[Esmanur Karataş]*  

