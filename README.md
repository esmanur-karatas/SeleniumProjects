# Selenium WebDriver Proje Reposu

Bu repo, **Selenium WebDriver** kullanarak çeşitli web otomasyonu senaryolarını içeren bir dizi Java örneği sunmaktadır. Her bir proje, farklı Selenium tekniklerini ve araçlarını kullanarak web uygulamalarını test etmek için tasarlanmıştır. Projeler, çeşitli etkileşim türlerinden (butonlar, alertler, dosya yüklemeleri) dinamik içerik beklemelerine (Explicit, Fluent ve Implicit Wait) kadar geniş bir yelpazeye sahiptir.

## 📚 Proje İçeriği

### **1. SeleniumFirst Project**
İlk Selenium WebDriver projesi olarak temel kullanım senaryolarını içerir.

---

### **2. DriverGetMethod**
Bu örnek, `get()` metodunun kullanımını gösterir. WebDriver'ın tarayıcıyı açıp bir URL'yi nasıl yüklediğiyle ilgilidir.

---

### **3. example_01**
İlk Selenium örneği. Web sayfasına nasıl gidileceği, öğelere nasıl tıklanacağı gibi temel işlemleri içerir.

---

### **4. DriverNNNavigateMethods**
Bu proje, WebDriver'ın çeşitli gezinme metodlarını (`navigate().to()`, `navigate().back()`, vb.) içerir.

---

### **5. Example_01**
Selenium WebDriver kullanarak sayfa başlığı ve URL gibi temel bilgilerin alınması ile ilgili bir örnek.

---

### **6. Example_02**
Sayfadaki öğeleri bulma ve etkileşimde bulunma (örneğin butona tıklama) ile ilgili başka bir örnek.

---

### **7. Practise_01**
Öğelerin etkileşimli olarak test edilmesiyle ilgili ilk pratik örneği.

---

### **8. Practise_02**
Bir web sayfasında çeşitli öğelerle etkileşimde bulunarak kullanıcı aksiyonları simüle etme üzerine pratik örnek.

---

### **9. Checbox**
Web sayfasındaki checkbox öğelerinin nasıl bulunup işaretlendiği ile ilgili bir örnek.

---

### **10. RdioButton**
Radio button öğelerinin seçilmesi ve işaretlenmesi ile ilgili örnek.

---

### **11. Dropdown**
Dropdown menülerinin açılması, seçeneklerin seçilmesi ve etkileşimde bulunulması üzerine bir örnek.

---

### **12. AlertButton**
Alert butonlarına tıklama ve alert ile etkileşimde bulunma üzerine bir örnek.

---

### **13. AlertButton2**
Farklı tipteki alertler ile etkileşimde bulunma (örneğin, onay, uyarı alertleri).

---

### **14. AlertButton3**
Alertleri iptal etme ve okuma işlemlerinin nasıl yapıldığına dair bir örnek.

---

### **15. BasicAuthentication**
Temel kimlik doğrulama kullanılan bir web sayfasında login olma işlemi.

---

### **16. Iframe**
Iframe'ler ile etkileşimde bulunma; iframe içine geçiş yapma ve öğelere tıklama.

---

### **17. WindowHandle**
Birden fazla pencereyi yönetme; pencereler arası geçiş ve etkileşim.

---

### **18. KeyboardAction_01**
Klavye tuşlarına basma ve klavye aksiyonlarını simüle etme.

---

### **19. MouseAction_01**
Fare hareketlerini simüle etme ve öğelere tıklama işlemleri.

---

### **20. MouseAction_02**
Fare ile bir öğe üzerine sürükleyip bırakma işlemi.

---

### **21. MouseAction_03**
Fare ile öğe üzerinde sağ tıklama işlemi.

---

### **22. MouseAction_04**
Fare ile öğe üzerine çift tıklama işlemi.

---

### **23. Practise_02**
İleri düzey Selenium kullanımı ve farklı etkileşimlerin pratikte uygulanması.

---

### **24. FileExits_01**
Dosyanın var olup olmadığını kontrol etme işlemi.

---

### **25. FileExits_02**
Dosyanın bulunduğu dizini kontrol etme ve dosya varlığını doğrulama.

---

### **26. FileDownload**
Bir dosyanın web sayfasından indirilmesi ile ilgili bir örnek.

---

### **27. FileUpload**
Bir dosyanın web sayfasına yüklenmesi işlemi.

---

### **28. ExplicitlyWait**
Bu program, `WebDriverWait` kullanarak belirli bir öğenin tıklanabilir hale gelmesini bekler. Öğenin hazır olana kadar beklenmesi sağlanır.

---

### **29. FluentWait**
Bu programda, `FluentWait` kullanarak bir öğeyi her 5 saniyede bir kontrol eder ve en fazla 30 saniye bekler.

---

### **30. ImplicitlyWait**
Bu program, `implicitlyWait` kullanarak öğelerin sayfada hemen bulunmaması durumunda belirli bir süre boyunca bekler.

---

### **31. FullPageScreenShot**
Sayfanın tamamının ekran görüntüsünün alınması ile ilgili bir örnek.

---

### **32. LocateScreenShot**
Web sayfasındaki belirli bir öğenin ekran görüntüsünün alınması.

---

### **33. JavaScriptsExecuter_01**
JavaScriptExecutor kullanarak sayfada JavaScript komutlarını çalıştırarak öğelere tıklama işlemi.

---

### **34. JavaScripttExecuter_02**
JavaScriptExecutor ile sayfa öğelerine kaydırma (`scrollIntoView`) ve tıklama işlemi.

---

## 🛠️ Araçlar ve Teknolojiler
- **Selenium WebDriver**: Web uygulamalarını otomatikleştirmek için kullanılır.
- **Java 8+**: Java programlama dili.
- **ChromeDriver**: Selenium ile Chrome tarayıcısının kullanılması için gerekli sürücü.
- **`WebDriverWait`**, **`FluentWait`**, **`implicitlyWait`**: Web öğelerinin beklenmesi için kullanılan çeşitli bekleme metodları.
- **`JavascriptExecutor`**: JavaScript komutlarını tarayıcıda çalıştırmak için kullanılır.

## 🚀 Projeyi Çalıştırma
1. Bu projeyi bilgisayarınıza klonlayın veya indirin.
2. IDE'nizde projeyi açın (IntelliJ IDEA, Eclipse, vb.).
3. **ChromeDriver**'ı bilgisayarınızda doğru şekilde ayarlayın.
4. `src` klasöründeki örnek projelerden birini çalıştırarak Selenium WebDriver kullanımını gözlemleyin.


## 🤝 Katkıda Bulunma
Katkılarınızı bekliyoruz! Sorularınız veya önerileriniz varsa, bizimle iletişime geçebilirsiniz.

**📧 İletişim:** esmanurkaratas0@email.com

---

**Yaratan:** *[Esmanur Karataş]*  

