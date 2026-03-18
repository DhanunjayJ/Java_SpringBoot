# Type Conversion and Type Casting in Java

In Java, type conversion occurs when you assign a value of one data type to another. There are two main types of conversion: **Widening (Automatic)** and **Narrowing (Explicit)**.

---

## 1. Widening Casting (Implicit Conversion)
Widening casting happens automatically when you pass a value of a **smaller** capacity type to a **larger** capacity type. There is no risk of data loss here.



### The Order of Widening:
`byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`

### Example:
```java
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}