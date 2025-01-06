# Selenium Lesson 2: DriverGetMethod & Example_01

Bu proje, Selenium WebDriver kullanarak farklı metodların kullanımını göstermek amacıyla oluşturulmuştur. İki ayrı Java sınıfı üzerinden temel tarayıcı kontrolü, URL doğrulama, sayfa başlığı doğrulama ve HTML kaynak kodu analizi gerçekleştirilmiştir.

## 🚀 Projenin Amacı
Bu projede, Selenium WebDriver metodlarının nasıl kullanıldığı ve temel otomasyon test senaryolarının nasıl yazıldığı açıklanmıştır. İki farklı senaryo üzerinden metodların görevleri örneklenmiştir.

## 🛠️ Kullanılan Teknolojiler
- **Java**: Kodlama dili
- **Selenium WebDriver**: Tarayıcı otomasyonu
- **ChromeDriver**: Chrome tarayıcısı için sürücü

## 📑 Proje Açıklaması
### 1️⃣ **DriverGetMethod.java**
#### Adımlar:
1. ChromeDriver yapılandırması yapılır.
2. Belirtilen URL'ye gidilir.
3. Sayfanın URL'si ve başlığı yazdırılır.
4. Sayfanın HTML kaynak kodu alınır ve uniq değer (Handle) yazdırılır.
5. Driver sınıfının adı konsola yazdırılır.

#### Kullanılan Metodlar:
- `get()` → URL'ye gider.
- `getCurrentUrl()` → Mevcut URL'yi döner.
- `getTitle()` → Sayfa başlığını döner.
- `getPageSource()` → Sayfanın kaynak kodunu döner.
- `getWindowHandle()` → Sayfanın benzersiz değerini döner.
- `getClass()` → Driver sınıfının adını döner.

---

### 2️⃣ **example_01.java**
#### Adımlar:
1. Amazon sayfasına gidilir.
2. Sayfa başlığı konsola yazdırılır.
3. Sayfa başlığının "Amazon" kelimesini içerip içermediği kontrol edilir.
4. Sayfa URL'si yazdırılır ve "amazon" kelimesini içerip içermediği kontrol edilir.
5. Sayfanın benzersiz Handle değeri yazdırılır.
6. Sayfa HTML kaynak kodlarında "shopping" kelimesi aranır.
7. Tarayıcı kapatılır.

#### Kullanılan Metodlar:
- `get()` → URL'ye gider.
- `getTitle()` → Sayfa başlığını döner.
- `getCurrentUrl()` → Mevcut URL'yi döner.
- `getPageSource()` → Sayfa kaynak kodunu döner.
- `getWindowHandle()` → Sayfanın benzersiz değerini döner.
- `close()` → Tarayıcıyı kapatır.

## 📦 Gereksinimler
- Java JDK
- Selenium Java Kütüphanesi
- ChromeDriver

## 💻 Projenin Çalıştırılması
1. Proje dosyalarını bilgisayarınıza klonlayın:
```bash
 git clone https://github.com/kullaniciadi/SeleniumLesson2.git
```
2. IDE'nizde projeyi açın.
3. ChromeDriver yolunu doğru şekilde ayarlayın.
4. Her iki sınıfı da ayrı ayrı çalıştırarak sonuçları gözlemleyin.

## 🤝 Katkıda Bulunma
Katkıda bulunmak için lütfen bir `Pull Request` gönderin.

## 🧑‍💻 Yazar
- **[Esmanur Karataş]**

Bu proje, Selenium'un temel metodlarını anlamak için oluşturulmuş bir örnektir. Daha fazla içerik için takipte kalın! 🚀


![image](https://github.com/user-attachments/assets/33e19a15-4b22-4b26-b232-ab9f9287b2fe)

![image](https://github.com/user-attachments/assets/467a2c8f-6c4a-45c6-bbfb-e213291c10d2)



