#  Java Exception Handling (İstisna Yönetimi) Proje Portfolyosu

Bu repo, Java programlama dilinde **Hata Yönetimi (Exception Handling)** yetkinliklerimi geliştirmek amacıyla çözdüğüm **Bölüm 12** sorularının (12.1 - 12.10) çözümlerini içermektedir. Proje; standart hataların yakalanması, veri doğrulama ve özel (custom) hata sınıflarının oluşturulmasını kapsamaktadır.

---

##  Çözülen Problemler ve İçerikleri

| Soru No | Başlık | Kullanılan Exception | Açıklama |
| :--- | :--- | :--- | :--- |
| **12.1** | Hesap Makinesi | `NumberFormatException` | Sayısal olmayan girişleri kontrol ederek programın çökmesini engelleme. |
| **12.2** | Ay ve Gün Bulucu | `ArrayIndexOutOfBoundsException` | Dizi sınırları dışında bir değer girildiğinde hatayı yakalama. |
| **12.3** | Input Denetimi | `InputMismatchException` | Scanner ile sayı beklenen yere farklı karakter girilmesini yönetme. |
| **12.4** | Kredi Doğrulama | `IllegalArgumentException` | Loan sınıfında tutar/faiz oranının sıfır veya negatif olma durumunu engelleme. |
| **12.5** | Üçgen Kuralı | `IllegalTriangleException` | **Özel Hata:** Üçgen eşitsizliğine uymayan kenarlar için özel hata fırlatma. |
| **12.6** | Hex Dönüştürücü | `NumberFormatException` | Onaltılık sayı dizgelerinde geçersiz karakter denetimi. |
| **12.7** | Kesir Kontrolü | `NullDenominatorException` | Paydanın 0 olması durumunu kontrol eden **Checked Exception** yapısı. |
| **12.8** | Özel Hex Hatası | `HexFormatException` | Projeye özgü özelleştirilmiş Hexadecimal hata sınıfı uygulaması. |
| **12.9** | Binary Denetimi | `BinaryFormatException` | İkilik sayı sistemine uygun olmayan girişler için özel hata sınıfı. |
| **12.10**| Kesir Uygulaması | `Fraction Class` | Hazırlanan `NullDenominatorException` yapısının bir sınıf içinde kullanılması. |

---

##  Teknik Kazanımlar

Bu projeyi tamamlarken şu temel yazılım prensiplerini uyguladım:

* **Try-Catch Yönetimi:** Hataları yakalayarak kullanıcıya anlamlı geri bildirimler verme.
* **Custom Exceptions:** `Exception` veya `RuntimeException` sınıflarını genişleterek projeye özel hata tipleri tasarlama.
* **Checked vs Unchecked:** Derleme ve çalışma zamanı hataları arasındaki farkı ve ne zaman `throws` kullanılacağını kavrama.
* **Veri Güvenliği (Data Validation):** Programın hatalı verilerle bile güvenli (robust) kalmasını sağlama.

---

##  Nasıl Çalıştırılır?

1. Bu projeyi bilgisayarınıza indirin.
2. Herhangi bir Java IDE'sinde (NetBeans, IntelliJ veya Eclipse) projeyi açın.
3. İlgili soruya ait `.java` dosyasını çalıştırın.
4. Konsol ekranından hatalı veriler girerek (örneğin paydaya 0 girerek veya harf yazarak) hata yönetimini test edin.

---