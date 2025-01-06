# Selenium Bekleme Türleri - Explicit, Implicit ve Fluent Wait

Bu proje, Selenium WebDriver'da farklı bekleme türlerini kullanmayı gösterir: Explicit Wait, Implicit Wait ve Fluent Wait. Bu beklemeler, dinamik içerik yüklenmesi veya sayfa gecikmeleriyle başa çıkmak için kullanılır, böylece test scripti, sayfa yükleme sürelerinin yavaş olmasından veya öğelerin hemen mevcut olmamasından dolayı başarısız olmaz.

## 📚 Ders İçeriği

### **ExplicitWait.java**
1. **Amaç:** Bu program, `WebDriverWait` kullanarak belirli bir öğenin tıklanabilir olmasını beklemeyi gösterir. Eğer öğe tıklanabilir olana kadar belirli bir süre beklenir.
2. **İşlem Süreci:**
   - **Amazon Türkiye** sayfasına (`https://www.amazon.com.tr`) gidin.
   - Arama kutusuna "iPhone" yazın.
   - Arama butonunun (`nav-search-submit-button`) tıklanabilir olmasını bekleyin, 15 saniyeye kadar.
   - Buton tıklanabilir olduğunda, tıklayarak aramayı başlatın.
   
3. **Ana Özellikler:**
   - **`WebDriverWait`**: Bir öğe tıklanabilir hale gelene kadar beklemek için kullanılır.
   - **`ExpectedConditions.elementToBeClickable`**: Öğenin etkileşim için hazır olduğunu garanti eder.
   
---

### **FluentWaitt.java**
1. **Amaç:** Bu program, bekleme davranışını daha dinamik bir şekilde kontrol etmek için `FluentWait` kullanımını gösterir. Program, öğeyi her 5 saniyede bir, maksimum 30 saniye boyunca kontrol eder.
2. **İşlem Süreci:**
   - **Amazon Türkiye** sayfasına (`https://www.amazon.com.tr`) gidin.
   - "iPhone" araması yapın.
   - `FluentWait` kullanarak, her 5 saniyede bir, maksimum 30 saniye boyunca arama butonunun (`nav-search-submit-button`) olup olmadığını kontrol edin. Bu sırada herhangi bir hata göz ardı edilir.
   - Öğe bulunduğunda, butona tıklayarak aramayı başlatın.
   
3. **Ana Özellikler:**
   - **`FluentWait`**: Öğenin kullanılabilirliğini belirli aralıklarla kontrol eden dinamik bir bekleme mekanizması sunar.
   - **`pollingEvery`**: Beklemenin, öğeyi belirli aralıklarla (bu örnekte her 5 saniyede bir) kontrol etmesini sağlar.
   - **`ignoring(Exception.class)`**: Beklerken oluşan herhangi bir hatayı göz ardı eder.

---

### **ImplicitlyWait.java**
1. **Amaç:** Bu program, öğelerin hemen mevcut olmaması durumunda `implicitlyWait` kullanımını gösterir.
2. **İşlem Süreci:**
   - **Amazon Türkiye** sayfasına (`https://www.amazon.com.tr`) gidin.
   - Arama kutusuna "iPhone" yazarak `ENTER` tuşuna basın.
   - 10 saniyelik bir `implicit wait` uygulanır; yani Selenium, öğe hemen bulunamazsa 10 saniye boyunca aramaya devam eder ve öğe bulunduğunda işlemi hemen gerçekleştirir.
   
3. **Ana Özellikler:**
   - **`implicitlyWait`**: Öğelerin mevcut olmasını beklemek için belirli bir süre önceden bekler ve öğe bulunamazsa `NoSuchElementException` hatası fırlatır.
   - **Global Uygulama**: Bu bekleme, tüm öğelere uygulanır ve basit senaryolar için faydalı olabilir, ancak daha karmaşık beklemeler için ideal olmayabilir.

---

## 🛠️ Araçlar ve Teknolojiler
- **Selenium WebDriver**: Web uygulamalarını otomatikleştirmek için kullanılan araç.
- **Java 8+**: Scriptlerin yazılmasında kullanılan Java programlama dili.
- **`WebDriverWait`**: Öğenin kullanılabilir hale gelmesini beklemek için explicit bekleme.
- **`FluentWait`**: Dinamik ve esnek bir bekleme yöntemi, periyodik olarak öğe kontrolü sağlar ve istisna yönetimi sunar.
- **`implicitlyWait`**: Öğelerin hemen bulunmaması durumunda global bir bekleme sağlar.

## 🚀 Projeyi Çalıştırma
1. Projeyi bilgisayarınıza klonlayın veya indirin.
2. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
3. **ChromeDriver**'ınızın bilgisayarınızda kurulu olduğundan emin olun.
4. `ExplicitlyWait.java`, `FluentWaitt.java` veya `ImplicitlyWait.java` sınıflarından birini çalıştırarak beklemelerin nasıl çalıştığını gözlemleyin.
5. Scriptler, bir tarayıcıyı otomatikleştirerek Amazon Türkiye'de "iPhone" araması yapacak ve gerekli beklemeleri sağlayacaktır.


## 🤝 Katkıda Bulunma
Katkılarınız bekleniyor! Herhangi bir sorunuz veya öneriniz varsa, bizimle iletişime geçebilirsiniz.

**📧 İletişim:** esmanurkaratas0@email.com

---

**Oluşturan:** *[Esmanur Karataş]*  

