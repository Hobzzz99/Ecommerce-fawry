# Ecommerce-fawry
This is a Java console-based e-commerce cart simulation developed for the Fawry Quantum Rise Internship Challenge (Task 3).

✅ Features

## ✅ Features
- Add products (Cheese, TV, Scratch Cards, Snacks) with stock tracking
- Validate expiration dates
- Apply flat shipping fee only to shippable items (Cheese, TV)
- Display total shipping weight in shipping notice
- Print receipt with subtotal, shipping, total, and remaining balance
- supports shippable vs. non‑shippable items and per‑unit weight;  
* lets customers add items to a cart (quantity ≤ stock);  
* performs checkout with error handling for
  * empty cart,
  * expired items,
  * out‑of‑stock items,
  * insufficient customer balance;  
* prints a shipment notice (for shippable items) and a detailed receipt.
- Designed using clean OOP principles:
  - Product as abstract base class
  - Shippable interface
  - Inheritance for specific product types

## 💻 Technologies Used
- Java 8+
- Console-based input/output

## 📦 Usage
Compile and run the main class to simulate customer interaction with the cart system.

## 📌 Note
This project was developed and submitted as part of the Fawry Internship coding task to demonstrate object-oriented design, date handling, and business logic implementation in Java.

