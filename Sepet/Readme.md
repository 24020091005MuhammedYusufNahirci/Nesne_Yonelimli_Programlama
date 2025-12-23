# Sepet Uygulaması

##  Proje Yapısı (Sınıflar ve OOP)

- **`Urun` (Ata Sınıf):** Tüm ürünlerin ortak özelliği olan `ad`, `fiyat` gibi değişkenleri ve KDV hesaplama metodunu barındırır.
- **`Ekmek` Sınıfı:** `Urun` sınıfından türetilmiştir. Ekmek türü (Tam buğday vb.) ve gramaj gibi ekstra özellikler içerir.
- **`Tekstil` Sınıfı:** `Urun` sınıfından türetilmiştir. Kumaş türü, beden ve marka bilgilerini tutar.
- **`CepTelefonu` Sınıfı:** `Urun` sınıfından türetilmiştir. Marka ve model bilgilerini içerir.

##  Uygulama Arayüzü Nasıl Çalışır?

1. **Kategori Seçimi (ComboBox 3):** Kullanıcı "Ekmek", "Tekstil" veya "Cep Telefonu" seçtiğinde, yandaki ürün listesi otomatik olarak güncellenir.
2. **Ürün Seçimi (ComboBox 4):** Seçilen kategoriye ait nesne dizileri (Array) taranır ve ComboBox içine nesne olarak eklenir.
3. **Sepete Ekle Butonu:** Seçilen nesneyi `instanceof` kontrolünden geçirerek `JTable` (Tablo) içine bir satır olarak ekler.
4. **Sepetten Çıkar Butonu:** Tabloda fareyle seçilen satırı `removeRow()` komutuyla siler.
5. **Dinamik Toplam:** Her ekleme ve çıkarma işleminde tabloyu baştan sona tarayıp fiyatları toplayan bir metot çalışır ve sonucu ekrana yansıtır.

##  Özellikler

- **Merkezi Başlatma:** Uygulama açıldığında ekranın tam ortasında konumlanır.
- **Dinamik Tablo Yönetimi:** JTable bileşeni kullanılarak veriler düzenli bir şekilde listelenir.
- **Temiz Arayüz:** Tablodaki gereksiz boş satırlar ve hücre boşlukları optimize edilmiştir.

