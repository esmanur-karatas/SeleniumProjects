# Selenium JavaScriptExecutor Kullanımı

Bu proje, Selenium WebDriver ile JavaScriptExecutor kullanarak sayfa üzerindeki öğelere nasıl etkileşimde bulunulacağını gösterir. JavaScriptExecutor, sayfa içeriğini manipüle etmek veya belirli öğelere JavaScript komutları göndermek için kullanılır.

## 📚 Ders İçeriği

### **JavaScriptExecuter_01.java**
1. **Amacı:** Bu program, JavaScriptExecutor kullanarak bir öğeye nasıl tıklanacağına dair bir örnek sunar.
2. **İşlem:**
   - **Amazon Türkiye** (`https://www.amazon.com.tr`) sayfasına gidilir.
   - Sayfadaki "Markanızı Koruyun ve Oluşturun" metnini içeren öğeye tıklanır.
   - Tıklama işlemi JavaScriptExecutor kullanılarak yapılır.
   - Son olarak, öğe etkinse testin geçtiği mesajı yazdırılır.
   
3. **Ana Fonksiyonlar:**
   - **`JavascriptExecutor`**: Sayfadaki öğelere JavaScript komutları göndermek için kullanılır.
   - **`executeScript`**: JavaScript komutlarını çalıştırmak için kullanılır.
   
---

### **JavaScriptExecuter_02.java**
1. **Amacı:** Bu program, JavaScriptExecutor kullanarak öğeyi görünür hale getirme (`scrollIntoView`) ve tıklama işlemini yapmayı gösterir.
2. **İşlem:**
   - **Amazon Türkiye** (`https://www.amazon.com.tr`) sayfasına gidilir.
   - "Markanızı Koruyun ve Oluşturun" metnini içeren öğeye kaydırılır ve tıklanır.
   - Tıklama işlemi JavaScriptExecutor kullanılarak yapılır.
   - Son olarak, öğe etkinse testin geçtiği mesajı yazdırılır.
   
3. **Ana Fonksiyonlar:**
   - **`scrollIntoView`**: Sayfadaki öğeyi görünür hale getirmek için kullanılır.
   - **`executeScript`**: JavaScript komutlarını çalıştırmak için kullanılır.

---

## 🛠️ Araçlar ve Teknolojiler
- **Selenium WebDriver**: Web uygulamaları için tarayıcı otomasyonu yapar.
- **Java 8+**: Scriptlerin yazıldığı programlama dilidir.
- **`JavascriptExecutor`**: Sayfa üzerinde JavaScript komutlarını çalıştırmak için kullanılır.
- **`executeScript`**: JavaScript komutlarını uygulamak için kullanılır.

## 🚀 Projeyi Çalıştırma
1. Projeyi bilgisayarınıza klonlayın veya indirin.
2. Projeyi bir IDE (IntelliJ IDEA, Eclipse, vb.) ile açın.
3. **ChromeDriver**'ı bilgisayarınızda uygun şekilde ayarlayın.
4. `JavaScriptExecuter_01.java` veya `JavaScriptExecuter_02.java` sınıflarından birini çalıştırarak JavaScriptExecutor kullanımını gözlemleyin.
5. Tarayıcı açılır ve belirtilen öğeye tıklanır, ardından kontrol işlemi yapılır.

## 🤝 Katkıda Bulunma
Katkılarınız memnuniyetle karşılanır! Sorularınız veya önerileriniz varsa, benimle iletişime geçebilirsiniz.

**📧 İletişim:** esmanurkaratas0@email.com

---

**Oluşturan:** *[Esmanur Karataş]*  
