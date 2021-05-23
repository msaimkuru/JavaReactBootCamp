ÖDEV İÇERİĞİ
------------
<p>
Aşağıda bir e-ticaret sisteminde sisteme kayıt ve sisteme giriş için gerekli gereksinim ve kabul kriterlerini yazdım. 
<br>
Bu sisteme ait Java backend yazmak istiyoruz.
<br>
<p>
<b>Gereksinimler</b>
<br>
<p>
* Kullanıcılar sisteme bilgilerini girerek üye olabilmelidir.

* Sisteme temel kullanıcı bilgileri , e-posta ve parolayla üye olunabilmelidir. Temel kullanıcı bilgileri : ad, soyad, e-posta, parola. Temel bilgilerin tamamı zorunludur.
* Parola en az 6 karakterden oluşmalıdır.
* E-posta alanı e-posta formatında olmalıdır. (Regex ile yapınız. Araştırma konusu)
* E-Posta daha önce kullanılmamış olmalıdır.
* Ad ve soyad en az iki karakterden oluşmalıdır.
* Üyelik sonucu kullanıcıya doğrulama e-postası gönderilmelidir. (Simulasyon)
* Doğrulama linki tıklandığında üyelik tamamlanmalıdır. (Simulasyon)
* Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
* Kullanıcılar sisteme Google hesapları ile üye olabilmelidir. (Simulasyon)

* İlerleyen zamanlarda başka yetkilendirme servisleri de kullanılabilir. (Sistemi dış servis entegrasyonu olacak şekilde yapılandırınız.)
* Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
* Kullanıcılar e-posta ve parola bilgisiyle sisteme giriş yapabilmelidir.

* E-posta ve parola zorunludur
* Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.


Bu isterleri katmanlı mimaride simüle ediniz.

Github adresinizi paylaşınız.
<p>
<br>
-------------

ÖDEV FAYDASI:
-------------
Ödev ile katmanlı mimaride geliştirme, dış servislerin entagrasyonu modellemesi amaçlanmaktadır.

-------------
ÖDEV NOTU:
-------------
Bu ödev <a href="https://github.com/Sanchklyc/JavaKampProject/tree/master/eCommerceSimulation/src/eCommerceSimulation">Halit Enes Kahyacı'nın kodları</a> örnek alınarak ve üzerinde dil, logic, ve model revizyonları yapılarak geliştirildi.

Temel revizyonlar:
--------------------------
1) AuthService core paketinden business paketine çekildi.<br>
2) UserService ve UserDao interfacelerinin tanımladığı ortak metotlar için bir super interface tanımlandı: UserServicesCommonOperations
