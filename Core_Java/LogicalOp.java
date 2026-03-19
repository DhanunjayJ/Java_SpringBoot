public class LogicalOp {
    public static void main(String[] args) {
        int x = 7;
        int y = 8;
        int a = 5;
        int b = 9;
        //(&) -> This is the Logical AND (when used with booleans) or the Bitwise AND (when used with integers).
        //Non-Short-Circuiting: If you use & to join two boolean conditions, Java evaluates both sides, no matter what. Even if the first condition is false (meaning the whole thing is guaranteed to be false), 
        //it will still check the second condition.
        // boolean result = (x<y) & (a<b);
        //The Double Ampersand (&&)
        //This is the Conditional-AND, often called the Short-Circuit operator
        //Short-Circuiting: This is the "lazy" (and efficient) version. If the left side is false, 
        //Java doesn't even look at the right side because it knows the final result must be false.
        //Boolean Only: You cannot use && for bit manipulation or on integer types; it only works with boolean values.
        boolean result = (x>y) && (a<b);
        System.out.println(result);
    }
}


/*

Why Short-Circuiting Matters
The && operator is often used for safety checks. If you use &, your code might crash.

Example:

Java

String text = null;

// This will CRASH with a NullPointerException because it checks text.length()
if (text != null & text.length() > 0) { ... }

// This is SAFE. Because text is null, it stops immediately and never calls .length()
if (text != null && text.length() > 0) { ... }

*/

/*
1. The Single Pipe (|)This is the Logical OR or Bitwise OR.Non-Short-Circuiting: Just like &, the single | 
will always evaluate both sides of the expression.Bitwise Operation: When used with integers, 
it compares bits and returns a $1$ if at least one bit is $1$. For example, $4 | 1$ (binary $100 | 001$) 
results in $5$ (binary $101$).2. 
The Double Pipe (||)This is the Conditional-OR (Short-Circuit).
Short-Circuiting: If the left side is true, Java already knows the entire expression is true. 
Therefore, it skips the right side entirely.
Efficiency: This is the standard choice for if statements because it saves processing time.

boolean userIsAdmin = true;

// Using || (Short-circuit)
// Because userIsAdmin is true, performUpdate() is NEVER called!
if (userIsAdmin || performUpdate()) { 
    System.out.println("Access Granted"); 
}

// Using | (Logical)
// Even though userIsAdmin is true, performUpdate() WILL be executed.
if (userIsAdmin | performUpdate()) { 
    System.out.println("Access Granted"); 
}
*/
