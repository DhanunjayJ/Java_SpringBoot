When using Lombok's `@Builder` pattern, setting default values requires a small adjustment. By default, if you use `@Builder` and do not explicitly pass a value for a field when constructing the object, Java defaults kick in (`null` for objects, `false` for booleans, `0` for numbers)—even if you initialized the field directly in your class definition!

To make the builder respect your default values, Lombok provides a dedicated annotation: **`@Builder.Default`**.

---

### The Right Way: Using `@Builder.Default`

To ensure your default values are preserved when using a builder, place `@Builder.Default` right above the initialized field:

```java
import lombok.Builder;
import lombok.Getter;
import lombok.Builder.Default;

@Getter
@Builder
public class Task {
    private String title;
    private String description;

    @Default 
    private boolean isComplete = false; // Works perfectly with the builder now

    @Default 
    private String priority = "LOW";    // Works perfectly with the builder now
}

```

#### How it behaves in practice:

```java
// 1. Using the default values
Task taskWithDefaults = Task.builder()
        .title("Buy groceries")
        .build();

System.out.println(taskWithDefaults.isComplete()); // Outputs: false
System.out.println(taskWithDefaults.getPriority());   // Outputs: "LOW"

// 2. Overriding the default values
Task highPriorityTask = Task.builder()
        .title("Fix production bug")
        .isComplete(true)
        .priority("HIGH")
        .build();

System.out.println(highPriorityTask.isComplete()); // Outputs: true
System.out.println(highPriorityTask.getPriority());   // Outputs: "HIGH"

```

---

### ⚠️ What happens if you forget `@Builder.Default`?

If you initialize your variables like this without the annotation:

```java
@Builder
public class Task {
    private boolean isComplete = false;
    private String priority = "LOW";
}

```

And then build it without specifying those fields:

```java
Task task = Task.builder().build();

```

Lombok's generated builder will completely bypass your field initializers, resulting in `priority` being **`null`** instead of `"LOW"`. Always double-check that `@Builder.Default` is present on fields that need a baseline fallback value!