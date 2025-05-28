# Airline Reservation Management System

This project is a Java-based Airline Reservation Management System that enables management of airline companies, airports, aircrafts, flights, and passenger reservations. It also allows customers to search for flights and make or cancel reservations.

---

## 📁 Project Structure

```
C:.
│   build.xml
│   manifest.mf
│
├───assets
│       Havalimanlari.txt
│       HavayoluSirketleri.txt
│       Kisiler.txt
│       Rezervasyonlar.txt
│       Ucaklar.txt
│       Ucuslar.txt
│
├───build
│   └───classes
│       ├───assets
│       └───odev2
│               (compiled .class files)
│
├───nbproject
│       (NetBeans project config files)
│
└───src
    ├───assets
    │       (input data text files)
    └───odev2
            (Java source files)
```

---

## 🚀 Features

### ✅ Admin Functionalities
- Add and list airline companies.
- Add and list airports.
- Add and list aircrafts.
- Add and list flights.
- List passengers who have made reservations.

### ✅ Customer Functionalities
- Search for flights based on departure/arrival airports and date.
- Make reservations for multiple passengers on a flight.
- Cancel existing reservations (status is updated in `Rezervasyonlar.txt`).

---

## 📄 Input Files (Located in /assets and /src/assets)
1. `HavayoluSirketleri.txt` - Airline code and name.
2. `Havalimanlari.txt` - Airport name, country, and city.
3. `Ucaklar.txt` - Aircraft type, capacity, and production year.
4. `Ucuslar.txt` - Flight info, including aircraft and airline.
5. `Kisiler.txt` - Personal info including type (Manager, Passenger, Crew).
6. `Rezervasyonlar.txt` - Reservation data (modifiable on cancellation).

---

## ⚙ Notes
- The first line in `.txt` files contains headers and may be ignored when processing.
- Only reservation status is updatable. All cancellations must update the status in `Rezervasyonlar.txt`.

---

## 🛠 Technologies
- Java
- NetBeans Project Structure
- Text file-based data storage

---

## 📌 Author
This project was developed as part of a university assignment and showcases object-oriented programming principles in Java.
