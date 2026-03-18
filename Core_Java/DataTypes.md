# Java Data Types: A Comprehensive Guide

In Java, data types are divided into two main categories: **Primitive** and **Non-Primitive (Reference)** types. Java is a strongly typed language, meaning every variable must be declared with a specific type before it can be used.

---

## 1. Primitive Data Types
Primitive types are the most basic data types available in Java. They serve as the building blocks for data manipulation and are predefined by the language.

| Data Type | Size | Description | Range |
| :--- | :--- | :--- | :--- |
| **byte** | 1 byte | Very small integer | -128 to 127 |
| **short** | 2 bytes | Small integer | -32,768 to 32,767 |
| **int** | 4 bytes | Standard integer | $-2^{31}$ to $2^{31}-1$ |
| **long** | 8 bytes | Large integer | $-2^{63}$ to $2^{63}-1$ |
| **float** | 4 bytes | Single-precision floating point | Up to 7 decimal digits |
| **double** | 8 bytes | Double-precision floating point | Up to 15 decimal digits |
| **boolean** | 1 bit* | Logical value | `true` or `false` |
| **char** | 2 bytes | Single Unicode character | '\u0000' (0) to '\uffff' (65,535) |

> **Note:** While a `boolean` represents 1 bit of information, its size in memory is not strictly defined by the JVM specification and can vary based on the implementation.

---

## 2. Non-Primitive (Reference) Data Types
Non-primitive data types are called **reference types** because they store the memory address (reference) of the objects they point to, rather than the value itself.

### Common Reference Types:
* **Strings:** Represents a sequence of characters (e.g., `String name = "Java";`).
* **Arrays:** Used to store multiple values of the same type in a single variable.
* **Classes:** User-defined templates for creating objects.
* **Interfaces:** Abstract types used to specify behavior that classes must implement.

### Key Differences:
1.  **Memory Location:** Primitives are stored on the **Stack**, while objects (Reference types) are stored on the **Heap**.
2.  **Nullability:** Reference types can be initialized as `null`. Primitives cannot be null; they always have a default value (e.g., `0` for `int`).
3.  **Methods:** Reference types have methods that can be called (e.g., `string.length()`), whereas primitives do not.

---

## 3. Default Values
If a primitive variable is declared as a class member (instance variable) but not initialized, Java assigns a default value:

* **byte, short, int:** `0`
* **long:** `0L`
* **float:** `0.0f`
* **double:** `0.0d`
* **char:** `'\u0000'`
* **boolean:** `false`
* **All Reference Types:** `null`