ÖDEV İÇERİĞİ
------------

Bir oyun yazmak istiyorsunuz. Bu yazılım için backend kodlarını JAVA ile geliştirmeyi planlıyoruz. Yeni üye, satış ve kampanya yönetimi yapılması isteniyor. Nesnelere ait özellikleri istediğiniz gibi verebilirsiniz. Burada amaç yazdığınız kodun kalitesidir. Ödevde gereksinimleri tam anlamadığınız durum benim için önemli değil, kendinize göre mantık geliştirebilirsiniz. Dediğim gibi kod kalitesiyle ilgileniyoruz şu an :)



<b>Gereksinimler</b>

1.	Oyuncuların sisteme kayıt olabileceği, bilgilerini güncelleyebileceği, kayıtlarını silebileceği bir ortamı simule ediniz. Müşteri bilgilerinin doğruluğunu e-devlet sistemlerini kullanarak doğrulama yapmak istiyoruz. (E-devlet sistemlerinde doğrulama TcNo, Ad, Soyad, DoğumYılı bilgileriyle yapılır. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)

2.	Oyun satışı yapılabilecek satış ortamını simule ediniz.( Yapılan satışlar oyuncu ile ilişkilendirilmelidir. Oyuncunun parametre olarak metotta olmasını kastediyorum.)

3.	Sisteme yeni kampanya girişi, kampanyanın silinmesi ve güncellenmesi imkanlarını simule ediniz.

4.	Satışlarda kampanya entegrasyonunu simule ediniz.

5.	Ödevinizi Github’a yükleyiniz. Github linkinizi paylaşınız.

6.	Diğer arkadaşlarınınız Github kodlarını inceleyiniz. Ona yıldız vermeyi unutmayınız :)

-------------

ÖDEV FAYDASI:
-------------
Ödev ile interface, abstract ve concrete tiplerin kullanımı amaçlanmaktadır.

------------
KPS Servisi:
------------
Ödevde MERNIS sisteminin KPS servisine erişim sağlandı. Ödevin asıl amacı bu olmamakla birlikte
Java Web Servis Client geliştirmesi yapılmış olması ek bir fayda olarak görülebilir.

Servis: <a href="https://tckimlik.nvi.gov.tr/service/kpspublic.asmx?op=TCKimlikNoDogrula">https://tckimlik.nvi.gov.tr/service/kpspublic.asmx?op=TCKimlikNoDogrula</a>
<br>
Servis wsdl: <a href="https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl">https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl</a>