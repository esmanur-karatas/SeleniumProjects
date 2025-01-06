# SeleniumFirstProject

Bu proje, Selenium WebDriver kullanarak basit bir otomasyon senaryosu gerçekleştirmeyi amaçlamaktadır. Java programlama dili ve ChromeDriver kullanılarak bir web sayfasına erişim, bekleme ve tarayıcı kapatma işlemleri gerçekleştirilmiştir.

## 🚀 Projenin Amacı
Bu proje, Selenium WebDriver'ın temel kullanımını anlamak ve bir web sayfasına otomatik olarak erişim sağlamak için oluşturulmuştur. Örnek senaryo olarak [Amazon Türkiye](https://www.amazon.com.tr) ana sayfası ziyaret edilmiştir.

## 🛠️ Kullanılan Teknolojiler
- **Java**: Kodlama dili
- **Selenium WebDriver**: Tarayıcı otomasyonu
- **ChromeDriver**: Chrome tarayıcısı için sürücü

## 📑 Proje Açıklaması
Kodun gerçekleştirdiği adımlar:
1. ChromeDriver yapılandırması yapılır.
2. WebDriver nesnesi oluşturulur.
3. Belirtilen URL üzerinden Amazon Türkiye ana sayfası açılır.
4. Sayfa 3 saniye boyunca açık kalır.
5. Tarayıcı kapatılır.

## 📦 Gereksinimler
Projenin çalıştırılması için aşağıdaki araçların sistemde yüklü olması gerekir:
- Java JDK
- Selenium Java Kütüphanesi
- ChromeDriver

## 💻 Projenin Çalıştırılması
1. Proje dosyalarını bilgisayarınıza klonlayın.
```bash
 git clone https://github.com/kullaniciadi/SeleniumFirstProject.git
```
2. IDE'nizde projeyi açın.
3. ChromeDriver yolunu kendi sisteminize göre ayarlayın.
4. Projeyi çalıştırın.

## 📝 Kod Açıklaması
```java
System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
```
- ChromeDriver'ın sistemdeki yolu tanımlanır.

```java
WebDriver driver = new ChromeDriver();
```
- Chrome tarayıcısı başlatılır.

```java
driver.get("https://www.amazon.com.tr");
```
- Belirtilen URL'ye gidilir.

```java
Thread.sleep(3000);
```
- Sayfa 3 saniye boyunca görüntülenir.

```java
driver.close();
```
- Tarayıcı kapatılır.

## 🤝 Katkıda Bulunma
Katkıda bulunmak için lütfen bir `Pull Request` gönderin.


## 🧑‍💻 Yazar
- **[Esmanur Karataş]**

Bu proje, Selenium'un temel özelliklerini öğrenmek için oluşturulmuş bir örnektir. Daha gelişmiş projeler için takipte kalın! 🚀


![image](https://github.com/user-attachments/assets/e60d9f00-120a-43c8-a835-ea801fab54bc)
