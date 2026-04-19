Git Hub Codespace setup

jdk version update 

sdk install java 21.0.3-tem

If SDK Not available 
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 21.0.3-tem


Install These Extensions
Extension Pack for Java
Spring Boot Extension Pack


Ctrl+Shift+P -> command Pallete Opening. 
search spring init...


creating maven project


### 1. Essential Extensions
Before you start, you need the **Extension Pack for Java** by Microsoft. This is a bundle that includes:
* **Language Support for Java™** (by Red Hat)
* **Debugger for Java**
* **Maven for Java** (This is the one that does the heavy lifting)

### 2. Creating the Project
1.  Open VS Code and press **`Ctrl + Shift + P`** (to open the Command Palette).
2.  Type **"Java: Create Java Project"** and select it.
3.  Choose **"Maven"** from the list of build tools.
4.  Select a **"maven-archetype-quickstart"**. 
    * *Tip: This is the most basic template for a console-based Java application.*
5.  Select the **version** (usually `1.4` or the latest available).
6.  **Input Group Id:** Use something professional like `com.bank`.
7.  **Input Artifact Id:** Name your project (e.g., `banking-system`).
8.  Choose a folder on your computer where the project will live.



### 3. The "Terminal" Interaction
Once you select the folder, a terminal will open at the bottom. Maven might ask you to confirm the properties:
* It will show the `groupId`, `artifactId`, and `version`.
* Press **`Enter`** to confirm or type `Y` if prompted.

### 4. Project Structure
VS Code will then generate the standard Maven structure for you:
* `src/main/java`: Your source code.
* `src/test/java`: Where your unit tests go.
* `pom.xml`: Your configuration file where you will add your PostgreSQL and other dependencies.

---

### Pro-Tips for your Banking Project:
* **Adding Dependencies:** To add the JDBC driver for Postgres, you don't need to download a `.jar` manually. Just open your `pom.xml`, and inside the `<dependencies>` tag, add the Postgres dependency. VS Code will detect the change and ask to synchronize the project.
* **Running the App:** You can just click the **"Run"** or **"Debug"** text that appears floating above your `public static void main` method.


This is a very common issue when using the default Maven template (archetype). It defaults to **Java 7**, but modern environments (like your workspace) require at least **Java 8** or higher.

The fix is simple. You just need to tell Maven to use a newer version of Java in your `pom.xml`.

### The Fix

1. Open your `pom.xml` file.
2. Look for the `<properties>` section. It usually looks like this:
   ```xml
   <properties>
     <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
     <maven.compiler.source>1.7</maven.compiler.source>
     <maven.compiler.target>1.7</maven.compiler.target>
   </properties>
   ```
3. Change the `1.7` to **`1.8`** (or `11` or `17` if you prefer, but `1.8` is the standard for most learning projects).

**Update it to look like this:**
```xml
<properties>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  <maven.compiler.source>1.8</maven.compiler.source>
  <maven.compiler.target>1.8</maven.compiler.target>
</properties>
```

### What to do next:
1. Save the `pom.xml`.
2. Run the command again:
   ```bash
   mvn clean install
   ```

Since you are using VS Code, it usually detects changes in the `pom.xml` and asks to synchronize. However, it is a great habit to run a manual build to ensure the dependency is actually downloaded and recognized by your local repository.

### 1. Build and Download
In your VS Code terminal, run:
```bash
mvn clean install
```
* **`clean`**: Removes the `target` folder (old compiled files).
* **`install`**: Downloads the PostgreSQL driver from the internet and puts it in your local `.m2` folder.

If you see **BUILD SUCCESS**, your Java code is now officially "aware" of the PostgreSQL classes.