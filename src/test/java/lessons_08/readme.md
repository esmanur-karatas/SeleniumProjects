# Selenium JavaScript Alerts Testleri

Bu proje, Selenium WebDriver kullanarak JavaScript alertlerine (pop-up mesajlarına) nasıl etkileşimde bulunulacağını gösteren üç Java uygulamasını içermektedir. Bu testler, farklı türlerdeki alertlerle (basit alert, confirm alert, prompt alert) nasıl çalışılacağını anlamanızı sağlar.

## 📚 Ders İçeriği

### 1️⃣ **AlertButton1.java** (Basit Alert Testi)

**Amaç:**
- Basit bir JavaScript alert penceresini kabul etmek.

**Adımlar:**
1. `https://the-internet.herokuapp.com/javascript_alerts` adresine gidilir.
2. Basit alert (jsAlert) butonuna tıklanır.
3. Alert penceresi görüntülendikten sonra, `accept()` metodu ile alert kabul edilir.
4. Sonuç metni kontrol edilir ve doğrulama yapılır.

**Kod Açıklaması:**
- **`driver.switchTo().alert().accept();`**: Alert penceresindeki "Tamam" butonuna basar.
- Alert sonucu, sayfadaki `result` öğesi üzerinden kontrol edilir ve beklenen sonuç ile karşılaştırılır.

---

### 2️⃣ **AlertButton2.java** (Confirm Alert Testi)

**Amaç:**
- Confirm (onay) alert penceresini iptal etmek.

**Adımlar:**
1. `https://the-internet.herokuapp.com/javascript_alerts` adresine gidilir.
2. Confirm alert butonuna tıklanır.
3. Confirm alert penceresinde `dismiss()` metodu ile "İptal" seçeneği tıklanır.
4. Sonuç metni kontrol edilir ve doğrulama yapılır.

**Kod Açıklaması:**
- **`driver.switchTo().alert().dismiss();`**: Confirm alert penceresindeki "İptal" butonuna basar.
- Sonuç metni, sayfadaki `result` öğesi üzerinden kontrol edilir ve beklenen sonuç ile karşılaştırılır.

---

### 3️⃣ **AlertButton3.java** (Prompt Alert Testi)

**Amaç:**
- Prompt alert penceresinde input almak ve yazılan veriyi kabul etmek.

**Adımlar:**
1. `https://the-internet.herokuapp.com/javascript_alerts` adresine gidilir.
2. Prompt alert butonuna tıklanır.
3. Prompt alert penceresine `sendKeys()` metodu ile bir metin (örneğin "Esmanur Karataş") yazılır.
4. Yazılan metin, alert penceresindeki "Tamam" butonuna tıklanarak kabul edilir.
5. Sonuç metni kontrol edilir ve doğrulama yapılır.

**Kod Açıklaması:**
- **`driver.switchTo().alert().sendKeys("Esmanur Karataş");`**: Prompt alert penceresine bir metin girer.
- **`driver.switchTo().alert().accept();`**: Girilen metni "Tamam" diyerek kabul eder.
- Sonuç metni, sayfadaki `result` öğesi üzerinden kontrol edilir ve beklenen sonuç ile karşılaştırılır.

---

## 🛠️ Kullanılan Araçlar ve Teknolojiler
- **Java**
- **Selenium WebDriver**
- **ChromeDriver**

## 🚀 Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza klonlayın.
2. ChromeDriver yolunu doğru şekilde ayarlayın.
3. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
4. Her bir dosyayı (AlertButton1.java, AlertButton2.java, AlertButton3.java) ayrı ayrı çalıştırarak çıktılarını gözlemleyin.


## 🤝 Katkıda Bulunma
Her türlü katkıya açığız! Sorularınız veya geliştirme önerileriniz için lütfen iletişime geçin.

**📧 İletişim:** esmanurkaratas0@email.com

--- 

**Hazırlayan:** *[Adınız]*  
**Tarih:** *[Tarih]*
