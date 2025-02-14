# Toplu Taşıma Güzergah Planlama
Bu proje, şehir içindeki toplu taşıma güzergahlarını planlamak için Softmax algoritmasını kullanan bir uygulamadır. Uygulama, 3 farklı durağa ait veriler üzerinden en uygun güzergahı hesaplar ve bu güzergahı sıralar.

## Giriş
Toplu taşıma güzergahlarının verimli bir şekilde belirlenmesi, şehir içindeki ulaşımın daha hızlı ve rahat olmasına olanak sağlar. Bu proje, birkaç durak arasındaki en uygun güzergahı bulmak amacıyla durakların kriterlerine dayalı bir değerlendirme yapar. Softmax algoritması, her bir durak için puan hesaplayarak en uygun güzergahı sıralar.

## Kullanım
1. Durak Verilerini Tanımlama
Her bir durak için, ismi ve kriter verileri belirlenir. Kriterler, durakların çeşitli özelliklerini (örneğin mesafe, yoğunluk, vb.) temsil eder.

2. Güzergah Hesaplama
Softmax algoritması kullanılarak, her bir durak için hesaplanan puanlar üzerinden en uygun güzergah sıralanır.

3. Sonuçları Görüntüleme
Hesaplanan sonuçlar, sıralanmış durak isimleri ve Softmax puanları ile ekrana yazdırılır.
