# Selenium Checkbox ve RadioButton Kullanımı

Bu proje, Selenium WebDriver kullanarak Checkbox ve RadioButton elemanlarının nasıl otomatikleştirileceğini gösteren iki Java uygulamasını içerir.

## 📚 Proje İçeriği

### 1️⃣ **Checkbox.java**

**Amaç:**
- Checkbox elemanlarının durumunu kontrol etmek.
- Seçili olmayan kutuları otomatik olarak seçmek.

**Adımlar:**
1. `https://the-internet.herokuapp.com/checkboxes` adresine gidilir.
2. Checkbox elemanları XPath kullanarak locate edilir.
3. İlk checkbox (Checkbox1) seçili değilse tıklanır.
4. İkinci checkbox (Checkbox2) seçili değilse tıklanır.
5. Tarayıcı kapatılır.

**Kod Açıklaması:**
- `isSelected()` metodu kullanılarak checkbox'ın seçili olup olmadığı kontrol edilir.
- `click()` metodu ile checkbox seçilir.

---

### 2️⃣ **RadioButton.java**

**Amaç:**
- RadioButton elemanlarını kontrol etmek ve uygun olanı seçmek.

**Adımlar:**
1. `https://www.facebook.com/` adresine gidilir.
2. "Yeni Hesap Oluşturun" butonuna tıklanır.
3. RadioButton elemanları XPath kullanarak locate edilir.
4. Eğer ilgili RadioButton seçili değilse, tıklanarak seçilir.
5. Tarayıcı kapatılır.

**Kod Açıklaması:**
- `isSelected()` metodu kullanılarak radio butonların seçili olup olmadığı kontrol edilir.
- `click()` metodu ile uygun radio butonu seçilir.

---

## 🛠️ Kullanılan Araçlar ve Teknolojiler
- **Java**
- **Selenium WebDriver**
- **ChromeDriver**

## 🚀 Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza klonlayın.
2. ChromeDriver yolunu doğru şekilde ayarlayın.
3. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
4. Her bir dosyayı ayrı ayrı çalıştırarak çıktıları gözlemleyin.

## 🤝 Katkıda Bulunma
Her türlü katkıya açığız! Sorularınız veya geliştirme önerileriniz için lütfen iletişime geçin.

**📧 İletişim:** esmanurkaratas@email.com

---

**Hazırlayan:** *[Esmanur]*
**Tarih:** *[06.01.2025]*

