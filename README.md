# Java Console Pizza Order System

A fully functional, console-based Pizza Ordering System developed in Java. This project demonstrates core Object-Oriented Programming (OOP) principles, utilizing data structures like `ArrayList` for memory-based data management, and implementing dynamic pricing based on user selections.

### Key Features
* **Authentication System:** Users can register and log in. User credentials are dynamically validated and stored in memory during runtime.
* **Dynamic Cart & Pricing:** Calculates the total cost in real-time. Selecting different pizza sizes (Small, Medium, Large) dynamically overrides base prices.
* **Menu Options:** Includes pre-defined pizzas (Extravaganza, Mexicano, etc.) with specific ingredient lists.
* **Extra Items:** Users can add side dishes and beverages (Fries, Souffle, Drinks) to their final cart.
* **Encapsulation & POJO:** Clean separation of concerns using distinct model classes (`Pizza`, `Kullanici`, `EkstraUrun`).

### Tech Stack
* **Language:** Java (JDK 8+)
* **Concepts:** Object-Oriented Programming (OOP), Collections Framework (`List`, `ArrayList`), Control Flow, Scanner Input Handling.

## Context
This is a personal academic project developed to solidify Java backend logic, memory-based state management, and console UI architecture during my Computer Engineering studies at Pamukkale University.

---

# Türkçe (Turkish Version)

Bu proje, Java ile geliştirilmiş konsol tabanlı bir Pizza Sipariş Sistemidir. Sınıf (class) yapıları, listeler ve kapsülleme (encapsulation) gibi Temel Nesne Yönelimli Programlama (OOP) mantığını pratiğe dökmek için yazılmıştır.

### Özellikler
* **Kullanıcı Girişi ve Kayıt:** `Scanner` ile konsoldan veri alarak bellekte (ArrayList) kullanıcı tutma ve doğrulama işlemi.
* **Dinamik Fiyatlandırma:** Seçilen pizzanın boyutuna göre (Küçük, Orta, Büyük) anlık fiyat hesaplama.
* **Sepet Mantığı:** Sadece pizza değil, yan ürünler ve içeceklerin de eklenip genel toplamın hesaplandığı fatura ekranı.
* **Temiz Kod Mimarisi:** Veriler ve işlemler `Main`, `PizzaSiparisEkrani`, `Pizza` ve `Kullanici` gibi farklı sınıflara bölünerek modüler bir yapı kuruldu.
