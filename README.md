# Ecommerce-Fawry

This is a **Java console-based e-commerce cart simulation** developed for the **Fawry Quantum Rise Internship Challenge (Task 3)**.

---

## ✅ Features

- Define and manage different product types:
  - Expirable items (e.g., Cheese, Biscuits)
  - Non-expirable items (e.g., TV, Scratch Cards)
- Stock tracking and quantity limits
- Expiration date validation
- Shippable vs. non-shippable product support
- Per-unit weight tracking for shipping
- Flat shipping fee (10 EGP/kg) applied only to shippable items
- Detailed **shipping notice** with grouped item weights
- **Checkout receipt** shows:
  - Subtotal
  - Shipping fees
  - Total amount
  - Customer’s remaining balance
- Error handling for:
  - Empty cart
  - Expired items
  - Out-of-stock items
  - Insufficient customer balance
- Designed using clean **Object-Oriented Principles**:
  - `Product` as an abstract base class
  - `Shippable` interface for shipping behavior
  - Inheritance for specific product types (`Expirable`, `NonExpirable`)

---

## 💻 Technologies Used

- Java 8+
- Console-based input/output
- No external libraries
- Arrays only (no Collections or Streams)

---

## 📦 Usage

1. **Compile all `.java` files** in the project directory:
   ```bash
   javac *.java
