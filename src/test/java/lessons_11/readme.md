# Selenium Window Handle Kullanımı

Bu proje, Selenium WebDriver kullanarak farklı pencere ve sekmeler arasında nasıl geçiş yapılacağını gösteren bir Java uygulamasıdır. Uygulama, birden fazla pencere açıldığında bu pencerelere nasıl geçiş yapılacağı ve pencere başlıklarının doğrulanması gibi işlemleri içermektedir.

## 📚 Ders İçeriği

### **WindowHandle.java**

**Amaç:**
- Birden fazla pencereyi yönetmek.
- Pencereler arasında geçiş yapmak.
- Pencere başlıklarının doğruluğunu kontrol etmek.

**Adımlar:**
1. `https://the-internet.herokuapp.com/windows` sayfasına gidilir.
2. Sayfadaki "Click Here" butonuna tıklanır ve yeni bir pencere açılır.
3. Açılan yeni pencerenin başlığının "New Window" olduğu doğrulanır.
4. İlk pencereye geri dönülür ve başlığın "The Internet" olduğu kontrol edilir.
5. "Elemental Selenium" linkine tıklanır, yeni bir pencere açılır.
6. Açılan pencerenin başlığının "Elemental Selenium" içerdiği doğrulanır.
7. İlk pencereye geri dönülür ve başlığın tekrar "The Internet" olduğu kontrol edilir.
8. Tarayıcı kapatılır.

**Kod Açıklaması:**
- **`driver.getWindowHandle();`**: Bu komut, mevcut pencerenin handle değerini alır.
- **`driver.getWindowHandles();`**: Bu komut, açık olan tüm pencerelerin handle değerlerini döndürür.
- **`driver.switchTo().window(handle);`**: Bu komut, belirtilen pencereye geçiş yapar.
- **`driver.getTitle();`**: Bu komut, geçerli pencerenin başlığını alır.

---

## 🛠️ Kullanılan Araçlar ve Teknolojiler
- **Java**
- **Selenium WebDriver**
- **ChromeDriver**

## 🚀 Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza klonlayın.
2. ChromeDriver yolunu doğru şekilde ayarlayın.
3. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
4. `WindowHandle.java` dosyasını çalıştırarak, pencereler arası geçişi gözlemleyin.


## 🤝 Katkıda Bulunma
Her türlü katkıya açığız! Sorularınız veya geliştirme önerileriniz için lütfen iletişime geçin.

**📧 İletişim:** esmanurkaratas0@email.com

---

**Hazırlayan:** *[Esmanur Karataş]*  



![image](https://github.com/user-attachments/assets/03a8d641-0d53-4507-9921-d8850efed1bf)
