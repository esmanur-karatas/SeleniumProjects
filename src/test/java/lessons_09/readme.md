# Selenium Basic Authentication Testi

Bu proje, Selenium WebDriver kullanarak temel kimlik doğrulama (Basic Authentication) gerektiren bir web sayfasına nasıl giriş yapılacağını gösteren bir Java uygulamasını içermektedir. Bu uygulama, URL'ye kullanıcı adı ve şifre bilgilerini ekleyerek giriş yapmayı sağlar.

## 📚 Ders İçeriği

### **BasicAuthentication.java**

**Amaç:**
- Web sayfasına kullanıcı adı ve şifre ile temel kimlik doğrulaması yaparak giriş yapmak.

**Adımlar:**
1. `https://the-internet.herokuapp.com/basic_auth` adresine gidilir.
2. Kimlik doğrulaması için kullanıcı adı ve şifre URL'ye eklenir: `https://username:password@URL`.
3. Kullanıcı adı ve şifre (`admin:admin`) URL'ye entegre edilerek giriş yapılır.

**Kod Açıklaması:**
- **`driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");`**: Bu komut, URL'yi kullanıcı adı ve şifre bilgileriyle birlikte açarak, giriş yapılmasını sağlar. Burada `admin:admin` kısmı, kullanıcı adı ve şifredir. URL'yi doğrudan bu bilgilerle erişmek, giriş işlemini otomatikleştirir.

---

## 🛠️ Kullanılan Araçlar ve Teknolojiler
- **Java**
- **Selenium WebDriver**
- **ChromeDriver**

## 🚀 Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza klonlayın.
2. ChromeDriver yolunu doğru şekilde ayarlayın.
3. Projeyi bir IDE (IntelliJ IDEA, Eclipse vb.) ile açın.
4. `BasicAuthentication.java` dosyasını çalıştırarak, giriş yapılan sayfanın doğru şekilde açıldığını gözlemleyin.

## 📄 Kaynaklar
- [Selenium Resmi Dokümantasyonu](https://www.selenium.dev/documentation/en/)
- [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)

## 🤝 Katkıda Bulunma
Her türlü katkıya açığız! Sorularınız veya geliştirme önerileriniz için lütfen iletişime geçin.

**📧 İletişim:** esmanurkaratas@email.com

---

**Hazırlayan:** *[Eesmanur Karataş]*  

