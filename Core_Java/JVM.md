# The Java Execution Process: From Source Code to Machine Code

Java is unique because it is both **compiled** and **interpreted**. This process allows Java to follow the "Write Once, Run Anywhere" (WORA) philosophy.

---

## 1. The Java Development Hierarchy (JDK vs. JRE vs. JVM)

To understand how Java works, you must understand the nested relationship between these three core components:

### Visual Representation


* **JVM (Java Virtual Machine):** The "engine" that actually runs the Java bytecode. It is platform-dependent (different for Windows, Mac, and Linux).
* **JRE (Java Runtime Environment):** Contains the JVM + Library files (jars) and other files that Java needs to run. It’s what you need to **run** Java apps.
* **JDK (Java Development Kit):** Contains the JRE + Development tools (like `javac` and `jdb`). It’s what you need to **write and compile** Java apps.

---

## 2. The Execution Workflow

The journey of a Java program happens in four distinct stages:

### Step 1: Writing the Code (.java)
The programmer writes source code in a text editor or IDE (like IntelliJ or VS Code). 
* **File Extension:** `Main.java`

### Step 2: Compilation (.class)
The developer runs the Java Compiler (`javac`). Instead of turning the code into machine-specific instructions (like C++ does), it turns it into **Bytecode**.
* **Command:** `javac Main.java`
* **Result:** `Main.class` (Platform-independent bytecode)

### Step 3: Loading and Verification
When you run the program, the JVM’s **ClassLoader** puts the `.class` file into memory. The **Bytecode Verifier** checks the code for security violations and illegal code to ensure it won't crash the host system.

### Step 4: Execution (JIT Compilation)
The JVM interprets the bytecode. However, to make it faster, it uses a **JIT (Just-In-Time) Compiler**.
* The JIT compiler analyzes the code as it runs and compiles "hot spots" (frequently used code) directly into native **Machine Code** for the specific processor you are using.

---

## 3. Summary Flowchart



1.  **Source Code** (`.java`) 
2.  ➜ *Compiled by* **JDK (javac)** 3.  ➜ **Bytecode** (`.class`) 
4.  ➜ *Executed by* **JRE (JVM)** 5.  ➜ *Interpreted/JIT Compiled to* **Native Machine Code** (0101...)

---

## 4. Why this matters?
Because of the **JVM**, the same `.class` file you compile on a Windows machine can be moved to a Linux server or a Mac laptop and it will run exactly the same way, as long as that machine has a JRE installed.