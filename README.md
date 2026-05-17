<p align="center">
<img src="https://readme-typing-svg.herokuapp.com?font=Poppins&size=30&pause=1000&color=6EC1E4&center=true&vCenter=true&width=700&lines=Introduction+to+Software+Development;Learning+Software+Engineering+Concepts;SDLC+%7C+Programming+%7C+Development+✨" />
</p>

## 🌷 Introduction to Software Development
### Module 1 — Foundations of Software Development

#### The Software Development Life Cycle (SDLC)

The SDLC is a structured framework that guides how software is built from start to finish. It ensures quality, reduces risk, and keeps development organized.

1. **Planning** — Define the project goals, scope, timeline, and resources. This phase answers *what* we're building and *why*. Poor planning is one of the leading causes of project failure.
2. **Design** — Architects and developers create the system's blueprint: database structure, user interface layout, and how components interact. Think of it as the "blueprint before construction."
3. **Implementation (Coding)** — Developers write the actual source code based on the design. This is where languages like Java come in. Code should be clean, readable, and follow the project's standards.
4. **Testing** — The software is verified against requirements. Types of testing include:
    - *Unit testing* — testing individual components
    - *Integration testing* — testing how parts work together
    - *User acceptance testing (UAT)* — testing with real users
5. **Deployment** — The software is released to a live environment (production). This can be done all at once or gradually (e.g., rolling deployments or beta releases).
6. **Maintenance** — After launch, the software needs ongoing updates: bug fixes, performance improvements, and new features based on user feedback.

> 💡 **Key Insight:** The SDLC is not always linear. Modern teams often use *Agile* methodology, where these phases repeat in short cycles called *sprints*, allowing continuous improvement.
> 

#### Java Development Environment

Before writing any Java code, you need to set up your environment properly.

- **IDE (Integrated Development Environment):** A software application that provides tools for writing, testing, and debugging code in one place. It saves time and reduces errors.
    - Popular Java IDEs: **Eclipse**, **IntelliJ IDEA**, **NetBeans**
    - IDEs offer features like syntax highlighting, auto complete, and built-in debuggers.
- **Java SDK (Software Development Kit):** The core toolkit needed to compile and run Java programs. Must be installed before using any IDE.
- **Setup order:** Install Java SDK → Install IDE → Configure IDE to use the SDK → Start coding.

> 💡 **Tip:** IntelliJ IDEA is widely used in industry and has a free Community Edition — a great choice for learning.
> 

#### Java Syntax and Structure

Java is a **strongly-typed, object-oriented language**. Every program follows a strict structure.

- **Classes:** The building blocks of Java. All code lives inside a class.
- **Methods:** Functions defined inside a class that perform actions. The most important one is `main`.
- **Entry point:** Every Java application starts execution from the `main` method:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- **Key syntax rules:**
    - Java is **case-sensitive** (`main` ≠ `Main`)
    - Every statement ends with a **semicolon** `;`
    - Code blocks are wrapped in **curly braces** `{}`
    - Indentation improves readability but is not enforced by the compiler

#### Variables and Data Types

Variables are named storage locations in memory. In Java, you must declare the **type** before using a variable.

| Data Type | Description | Example |
| --- | --- | --- |
| `int` | Whole numbers | `int age = 25;` |
| `double` | Decimal numbers | `double price = 9.99;` |
| `char` | Single character | `char grade = 'A';` |
| `String` | Text (sequence of characters) | `String name = "Sara";` |
| `boolean` | True or false | `boolean isActive = true;` |

> 💡 **Note:** `String` starts with a capital letter because it's an **object** in Java, not a primitive type.
> 

#### Operators

Operators are symbols that tell the program to perform specific operations.

- **Arithmetic:** `+` (add), `-` (subtract), `*` (multiply), `/` (divide), `%` (modulus — remainder)
- **Assignment:** `=` assigns a value to a variable (e.g., `int x = 5;`)
- **Comparison:** `==` (equal), `!=` (not equal), `<`, `>`, `<=`, `>=` — return `true` or `false`
- **Logical:** `&&` (AND), `||` (OR), `!` (NOT) — used to combine conditions

> 💡 **Common mistake:** Confusing `=` (assignment) with `==` (comparison). `x = 5` sets x to 5; `x == 5` checks *if* x equals 5.
> 

#### Writing and Running Simple Java Programs

Once your environment is set up, you can write and run your first program.

**Example — Adding two numbers:**

```java
public class AddNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum); // Output: Sum: 30
    }
}
```

**Running a Java program:**

1. Save the file as `AddNumbers.java` (filename must match the class name)
2. **Compile** using terminal: `javac AddNumbers.java` → creates `AddNumbers.class`
3. **Run** using terminal: `java AddNumbers`
4. Or use your IDE's **Run button** to do both steps automatically.

#### Java Basics (Variables & Operators)

#### What is Java?

Java is a **high-level, object-oriented programming language** first released in **1995** by Sun Microsystems (now owned by Oracle).

- It uses **classes** as blueprints to create **objects** — the core concept of object-oriented programming (OOP).
- Encourages **modular, reusable, and maintainable** code, making it well-suited for building large, complex applications.
- Java follows the principle: **"Write Once, Run Anywhere"** — compiled Java code can run on any device with a Java Virtual Machine (JVM).

#### Java's Ubiquity and Usage

Java is one of the most widely used programming languages in the world.

- Powers **billions of devices** — including smartphones, credit cards, smart TVs, and computers.
- Used across many domains:
    - **Enterprise applications** — large-scale business software (e.g., banking systems)
    - **Web development** — back-end servers and APIs
    - **Android apps** — the primary language for Android development for many years
    - **Desktop software** — games, productivity tools, and more

> 💡 **Fun fact:** As of recent years, Java consistently ranks in the top 3 most popular programming languages globally.
> 

#### Key Features of Java

- **Robust:** Built-in error handling (exceptions) and **automatic garbage collection** — Java manages memory for you, reducing crashes and memory leaks.
- **Secure:** Designed with security in mind; the JVM acts as a sandbox that prevents malicious code from harming the host system.
- **Rich standard library:** Comes with thousands of pre-built classes and methods, so you don’t have to build everything from scratch.
- **Strong community:** One of the largest developer communities worldwide — extensive documentation, tutorials, and open-source libraries are readily available.
- **Platform-independent:** Java code compiles to **bytecode**, which runs on the JVM on any operating system (Windows, macOS, Linux).

#### Variables in Java (Declaring & Initializing)

Variables are like **labeled jars/containers** in a kitchen: you store a value inside, give it a clear label (name), and you can reuse or change what’s inside later.

Variables are **named containers** that store data so you can reuse it and update it while the program runs.

- **Declare a variable** = choose a **data type** + **name** (creates the container).
    - Example: `int playerScore;`
- **Initialize a variable** = assign the **first value** using `=`.
    - Example: `playerScore = 150;`
- **Declare + initialize in one step**:
    - `int playerScore = 150;`

#### Why variables are useful

- **Reusable:** avoid repeating the same value many times.
- **Flexible:** values can change while the program runs (based on inputs/conditions).
- **Readable:** descriptive names make code easy to understand.

#### Key takeaways (from the video)

- Variables store **specific types** of data (example: `int` is for whole numbers).
- Declaring = create name + type, initializing = give the first value.
- Good naming conventions make your code easier to read and maintain.

#### Common Java data types (examples)

- `int` — whole numbers
Example: `int age = 25;`
- `double` — decimal numbers
Example: `double currencyInUsd = 34.25;`
- `char` — single character (use single quotes)
Example: `char answer = 'A';`
- `String` — text (use double quotes)
Example: `String name = "Margaret Hamilton";`
- `boolean` — true/false
Example: `boolean isAbsent = true;`

#### Variable naming conventions (best practices)

- Use clear, meaningful names (e.g., `distanceInMeters`, `isGameOver`).
- Use **camelCase** for variable names (first word lowercase, next words Capitalized): `totalAmount`, `userName`, `numberOfItems`.
- Use only letters, numbers, and `_` (underscore). Do **not** start with a number, and do not use spaces/special symbols.
- Java is **case-sensitive**: `totalAmount` is different from `TotalAmount`.

#### Operators in Java (Arithmetic, Relational, Logical)

Operators help you **do calculations**, **compare values**, and **make decisions** in your code (like building a game leaderboard).

#### 1) Arithmetic operators (math + string concatenation)

Used for calculations such as addition/subtraction (and more: `*`, `/`, `%`).

- **Numbers:** `5 + 7` → `12`
- **Strings:** `"Tom" + "Harry"` → `"TomHarry"` (this is called **concatenation**)
    - Important: `"5" + "7"` → `"57"` (because they are strings, not numbers)

**Examples:**

```java
int playerOneLevel1 = 50;
int playerOneLevel2 = 45;
int sum = playerOneLevel1 + playerOneLevel2; // 95
System.out.println("Sum: " + sum);
```

```java
int playerOneScore = 95;
int playerOnePenalties = 7;
int finalScore = playerOneScore - playerOnePenalties; // 88
```

#### 2) Relational (comparison) operators

Used to compare two values and the result is always a **boolean** (`true` or `false`).

Examples: `>`, `<`, `>=`, `<=`, `==`, `!=`

```java
int playerOneScore = 95;
int playerTwoScore = 85;
System.out.println(playerOneScore > playerTwoScore); // true
System.out.println(playerOneScore < playerTwoScore); // false
```

#### 3) Logical operators (combine conditions)

Used to combine multiple conditions (useful when you have more than one rule).

- `&&` (AND): true only if **both** conditions are true
- `||` (OR): true if **at least one** condition is true
- `!` (NOT): reverses the boolean value (true ↔ false)

**Example (highest score among 3 players):**

```java
int p1 = 95, p2 = 85, p3 = 73;
System.out.println(p1 > p2 && p1 > p3); // true if p1 is highest
```

**Example (premium access):**

```java
boolean isAdmin = false;
boolean hasPremium = true;
System.out.println(isAdmin || hasPremium); // true
```

**Example (NOT):**

```java
boolean isAuthenticated = true;
System.out.println(!isAuthenticated); // false
```

#### Key takeaways

- Arithmetic operators do math and can also join strings using `+`.
- Relational operators compare values and return `true`/`false`.
- Logical operators combine conditions using `&&`, `||`, and `!`.

---

### 📘 Reference: Commonly used data types and operators in Java

This is a quick reference list to keep nearby while coding (especially helpful when choosing the right **memory size** and the right **operator**).

#### Commonly used data types

| **Data type** | **Description** | **Size (bits)** | **Number range (approx.)** | **Default value** |
| --- | --- | --- | --- | --- |
| `byte` | 8-bit signed integer (useful when memory is a concern) | 8 | -128 to 127 | 0 |
| `short` | 16-bit signed integer (bigger range than byte) | 16 | -32,768 to 32,767 | 0 |
| `int` | 32-bit signed integer (most common for whole numbers) | 32 | -2,147,483,648 to 2,147,483,647 | 0 |
| `long` | 64-bit signed integer (use when int is not enough) | 64 | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 0L |
| `float` | Single-precision floating point (saves memory in large arrays) | 32 | ≈ ±3.40282347E+38 (6–7 digits) | 0.0f |
| `double` | Double-precision floating point (default for decimals) | 64 | ≈ ±1.7976931348623157E+308 (15 digits) | 0.0d |
| `char` | Single 16-bit Unicode character | 16 | Any single character |  |
| `boolean` | True/false value (size not precisely defined) | — | `true` / `false` | false |
| `String` | Text (uses memory as required) | — | Any text | null |

#### Commonly used operators

| **Operator** | **Title** | **What it does** | **Example** | **Result** |
| --- | --- | --- | --- | --- |
| `+` | Addition / concatenation | Adds numbers OR joins strings | `5 + 3`
`"Hello " + "World"` | `8`
`"Hello World"` |
| `-` | Subtraction | Subtracts numbers | `10 - 4` | `6` |
| `*` | Multiplication | Multiplies numbers | `7 * 2` | `14` |
| `/` | Division | Divides numbers | `20 / 4`
`21 / 4`
`21 / 4.0` | `5`
`5` (int ÷ int → int)
`5.25` |
| `%` | Modulus | Remainder after division | `10 % 3` | `1` |
| `++` | Increment | Adds 1 (post vs pre changes when the value is used) | `int n = 5; int x = n++;`
`int n = 5; int x = ++n;` | `n=6, x=5`
`n=6, x=6` |
| `--` | Decrement | Subtracts 1 (post vs pre) | `int n = 5; int x = n--;`
`int n = 5; int x = --n;` | `n=4, x=5`
`n=4, x=4` |
| `=` | Assignment | Assigns a value | `int n = 10;` | `n=10` |
| `+=` | Addition assignment | `n = n + value` | `int n=5; n += 3;` | `8` |
| `-=` | Subtraction assignment | `n = n - value` | `int n=5; n -= 2;` | `3` |
| `*=` | Multiplication assignment | `n = n * value` | `int n=5; n *= 2;` | `10` |
| `/=` | Division assignment | `n = n / value` | `int n=5; n /= 2;` | `2` |
| `%=` | Modulus assignment | `n = n % value` | `int n=5; n %= 3;` | `2` |
| `==` | Equal to | Checks equality (boolean result) | `5 == 5` | `true` |
| `!=` | Not equal to | Checks inequality (boolean result) | `5 != 3` | `true` |
| `>` | Greater than | Checks if left is bigger (boolean result) | `6 > 4` | `true` |
| `<` | Less than | Checks if left is smaller (boolean result) | `3 < 5` | `true` |
| `>=` | Greater than or equal | Checks if left is bigger or equal | `7 >= 7` | `true` |
| `<=` | Less than or equal | Checks if left is smaller or equal | `8 <= 10` | `true` |
| `&&` | Logical AND | True if **both** conditions are true | `(5 > 3) && (8 > 5)` | `true` |
| `||` | Logical OR | True if **any** condition is true | `(5 > 8) || (8 > 5)` | `true` |
| `!` | Logical NOT | Reverses a boolean value | `!(5 > 3)` | `false` |

#### Conclusion

- Choosing the right **data type** helps you use memory efficiently and avoid storing more (or less) than you need.
- Choosing the right **operator** helps you get the correct result and avoid unexpected behavior (especially with integers vs decimals, and strings vs numbers).

#### **Java Strings: The Essentials**

#### What is a String?

in Java, a `String` is an **object** that represents a sequence of characters.

- **Internal Structure:** Internally, Java treats a string as an array of the `char` data type.
- **Content:** Can include letters, numbers, symbols, spaces, and even empty text (`""`).
- **Declaration:** Always use **double quotes** (e.g., `"Hello"`). Single quotes are reserved for single `char` types (e.g., `'A'`).

#### The immutability Principle

**Crucial Concept:** Strings in Java are **immutable**. Once created, they cannot be changed.

- **How it works:** If you "modify" a string (like changing a username in a file path), Java actually discards the old reference and creates a brand-new string object in memory.
- **Benefit:** This makes strings thread-safe and secure for use in various parts of your program.

#### String Indexing

Java uses **zero-based indexing**. This means the first character is always at position `0`.

- **Formula:** The last character is always at `length - 1`.

| Character  | J | A | V | A |
| --- | --- | --- | --- | --- |
| Index | 0 | 1 | 2 | 3 |

#### Core String Methods

| Method | Description | Example (`String s = "Java"; String a = "Language";`) |
| --- | --- | --- |
| length() | Returns the number of characters as an `int`. | `s.length()` returns `4` |
| charAt(index) | Returns the `char` at the specific index. | `s.charAt(0)` returns `'J'` |
| toUpperCase() | Converts the entire string to uppercase. | `s.toUpperCase()` returns `"JAVA"` |
| toLowerCase() | Converts the entire string to lowercase. | `s.toLowerCase()` returns `"java"` |
| substring(start, end) | This method gives you a part of the String from the start to the end position  | `s.substring(1,4)` returns `"ava"` |
| equals(anotherString) | This method checks if two Strings are the same. It's like comparing two necklaces to see if they have the same beads in the same order. | `s.equals(a)` returns `false` |
| contains(sequence) | This method checks if a sequence of characters is present in the String. It’s like checking if your necklace has a certain sequence of beads. | `s.contains("ava")` return `true`  |
| replace(oldChar, newChar) | This method replaces all occurrences of a character with a new character. It’s like swapping one kind of bead on your string for another. | `s.replace('v', 'n')` returns `"Jana"` |
|  |  |  |

> 💡 **Note:** replace(oldChar, newChar) method returns a new updated String. Since Strings are immutable, you cannot replace characters in existing Strings—the output is a new String.
> 

#### **🔗 Concatenation (Joining Strings)**

Concatenation is the process of linking two or more strings together using the **plus (`+`) operator**.

#### **The "Space" Trap**

When joining a first and last name, Java doesn't automatically add a space. You must include it manually:

```jsx
String fullName = firstName + " " + lastName;
```

#### The Order of Operations (String vs. Math)

The `+` symbol is overloaded. It performs **addition** for numbers and **concatenation** for strings.

- **The Issue:** If you "add" a string to a number, Java converts the number to a string and joins them.
    - `"Score: " + 5 + 10` → `"Score: 510"`
- **The Fix:** Use **parentheses** to force math to happen first.
    - `"Score: " + (5 + 10)` → `"Score: 15"`

#### Pro-Tips for Your Social Media App

- **Username Validation:** Use `.length()` to enforce your 10-character limit before saving a user to your database.
- **Standardizing Data:** Always use `.toLowerCase()` or `.toUpperCase()` when storing emails or usernames. This prevents "User123" and "user123" from being treated as two different accounts.
- **Memory Efficiency:** Because strings are immutable, frequently changing a string in a loop (like building a long message) can be slow. In those cases, Java developers use a class called `StringBuilder`.
- **Comparison Warning:** In Java, **never** compare strings using `==` (e.g., `if (name == "Charlie")`). This compares the memory address, not the text. Always use `.equals()`:
    - `if (name.equals("Charlie"))`

> 💡Concatenation is joining wo or more Strings into one String
> 

#### Summary Checklist

- [ ]  Use `""` for Strings. Single quotes `' '` are for `char` only.
- [ ]  Start counting at `0`. The first character of any string is index 0.
- [ ]  Use `.length()` for size. Note that the last index is always `length - 1`.
- [ ]  Manually add spaces: Remember `firstName + lastName` will look like `KellySwagger`. Use `+ " " +`.
- [ ]  Protect Math with Parentheses: Use `( )` when combining addition and text to avoid the "510" error.
- [ ]  Use .equals() for comparison: Never use `==` for text; it compares memory locations, not characters.
- [ ]  Avoid Non-Plus Operators: Never use `-`, `*`, or `/` with strings.

---

#### **🔗 String Concatenation: Joining Text in Java**

Concatenation is the fundamental process of linking things in a series. In Java, this specifically refers to joining two or more strings into one.

**The Concatenation Operator**: The plus symbol (`+`) is used to join strings.
• Example: `"Kelly"` + `" "` + `"Swagger"` results in `"Kelly Swagger"`.

- **The "Space" Requirement**: Java does not automatically add spaces between concatenated strings. You must manually include a space string (`" "`) between variables.
- **Overloading the Plus (+) Symbol**: The `+` symbol is unique because it serves two distinct purposes:
    1. **Addition**: Performs mathematical calculations on numeric types (int, double).
    2. **Concatenation**: Links strings together.
- **Order of Operations & The "510" Trap**:
- If you concatenate a string with two numbers (e.g., `"Sum: " + 5 + 10`), Java treats the numbers as strings, resulting in `"Sum: 510"`.
- **The Fix**: Use **parentheses** to force Java to evaluate the math first: `"Sum: " + (5 + 10)` results in `"Sum: 15"`.
- **Operator Limitations**: Only the plus (`+`) operator works with strings. Using minus (), asterisk (), or backslash (`/`) on strings will result in a compilation error.

#### 🛠️ Practical Application: Standardizing User Data

To maintain consistency in applications (like creating workshop name tags), you can combine transformation methods with concatenation.

1. **Step 1**: Convert variables to the desired case using `.toUpperCase()` or `.toLowerCase()`.
2. **Step 2**: Concatenate the results with a space.
    - *Example*: `firstName.toUpperCase() + " " + lastName.toUpperCase()`.

---

### Module 2 - Decision Making in Java

#### **🛣️ Control Flow: Sequential vs. Conditional**

In programming, “Control Flow” refers to the order in which individual statements are executed.

- **Sequential Flow**: The program moves from one line to the next in a linear fashion (e.g., Tony moving from Stop 1 to Stop 2 to Stop 3).
- **Conditional Flow**: The program changes its path based on specific conditions.

#### The `if` and `else` Statements

Decisions in Java are handled using conditions that evaluate to either `true` or `false`.

**1. The `if` Statement**

The `if` statement executes a block of code **only if** the condition inside the parentheses is true.

- **Syntax**:

```jsx
if (condition) {
    // Code to execute if true
}
```

**Example**: `if (amountOfMoney >= 300) { System.out.println("Go to Las Vegas"); }`.

#### The `else` Statement

The `else` statement provides an alternative path. It executes only when the `if` condition fails (`false`).

- **Rule**: An `else` statement **cannot exist alone**; it must always follow an `if`.
- **Example**:
    
    ```java
    if (amountOfMoney >= 300) {
        System.out.println("Go to Las Vegas");
    } else {
        System.out.println("Think of the money spent");
    }
    ```
    

> **💡Note**: An `else` statement cannot exist on its own; it must be attached to an `if`.
> 

#### Multiple Conditions: `else if`

When you have more than two possible outcomes, you use `else if` to check additional conditions in order.

- **Execution Logic**:
    1. Java checks the first `if`. If true, it runs that code and **skips everything else** in the chain.
    2. If false, it moves to the first `else if`.
    3. If all `if` and `else if` conditions are false, the final `else` block executes.

#### **Example: Tony’s Diversion Plan**

| Money Range | Destination | Java Logic |
| --- | --- | --- |
| $300$ | Las Vegas | `if (money >= 300)` |
| $200 - 299$ | Hoover Dam | `else if (money >= 200)` |
| $100 - 199$ | Area 51 | `else if (money >= 100)` |
| $< 100$ | Parents' House | `else` |
<img width="1024" height="1024" alt="Image" src="https://github.com/user-attachments/assets/0fe4d818-c970-49c3-b740-dcaed9c543f6" />
#### 💡 Key Insights

- **Timing Matters**: There are a specific place and time for checking conditions. You cannot check for change until you have actually bought the item.
- **Efficiency**: Using logical paths (like the "orange route" in Tony's trip) eliminates "doubling back" and makes the program execute more effectively.
- **Binary Choices**: Every condition in an `if` statement must result in a **boolean** (true or false).

---

#### String Manipulation

#### Understanding String Indexing

In Java, every character in a String is assigned a specific position called an **index number**.

- **Zero-Based Indexing**: Indexing always starts at **0** for the first character.
- **Index vs. Length**: While indexing starts at 0, counting the **length** (total characters) starts at **1**.
    - *Example*: In the string `"Toni is nice"`, the character 'i' is at index 3, 5, and 9, but the total length is 12.
- **The -1 Result**: If you search for a substring that doesn't exist using `indexOf()`, Java returns **1**. This indicates the item was "not found" because -1 is not a valid index.

#### 🔍 Identifying & Isolating Text

Java provides several built-in methods to identify or extract specific parts of a string (substrings).

| **Method** | **Purpose** | **Example Result | Key Detail**  |
| --- | --- | --- |
| `startsWith(prefix)` | Checks if a string begins with specific text. | `"Java".startsWith("J")` → `true` |
| `endsWith(suffix)` | Checks if a string ends with specific text. | `"Java".endsWith("a")` → `true` |
| `isEmpty()` | Returns `true` if the string has a length of 0. | `"".isEmpty()` → `true` |
| `indexOf(subString)` | Finds the first index position of a substring. | `"Test".indexOf("est")` → `1` |
| `substring(index)` | Extracts text starting from the given index to the end. | `"Apple".substring(1)` → `"pple"` |
| `trim()` | Removes spaces **only** from the beginning and end. | `" Java ".trim()` → `"Java"` |
| `contains(subString)` | Checks if a specific sequence of characters exists anywhere inside the string. | Returns `true` even if the substring is in the middle of the text. |
| `equals(string)` | Checks if two strings are **exactly** the same, including matching case. | Use this instead of `==` for comparing content. |
| `toUpperCase()` | Converts every character in the string to uppercase. | Helpful for standardizing input before comparing it. |
| `toLowerCase()` | Converts every character in the string to lowercase. | Often used in "search" features to make them user-friendly. |

#### ⚖️ String Comparison Techniques

Comparing strings is vital for tasks like password validation or filtering.

- **`equals()` vs `==`**: Never use `==` to compare the text content of strings. Use `.equals()` for case-sensitive comparison.
- **`equalsIgnoreCase()`**: Use this when capitalization doesn't matter (e.g., comparing "JAVA" to "java").
- **`compareTo()`**: Returns an **integer** rather than a boolean.
    - Returns **0** if the strings are exactly equal.
    - Returns a **non-zero** value if they are different.

### 🛠️ Practical Examples (Logic Implementation)

#### **1. Password Validation**

When checking passwords, case sensitivity is critical. You only need the method name in the `if` statement because it already returns `true` or `false`.

```jsx
if (password.equals("secRetOfM3*@")) {
    System.out.println("Welcome");
}
```

#### **2. Case-Insensitive Search**

To standardize user input, you can convert everything to one case before comparing:

```jsx
String input = "sara";
if (input.toUpperCase().equals("SARA")) {
    System.out.println("Match found!");
}
```

#### **3. The "contains" Check**

This is perfect for searching for specific data within a larger record, like finding a surname in a full name.

```jsx
String fullName = "Tim Berners Lee";
String familyName = "Lee";

if (fullName.contains(familyName)) {
    System.out.println("Match found!"); // This will execute
}
```
<img width="1024" height="559" alt="Image" src="https://github.com/user-attachments/assets/a1132079-9859-434e-bfdf-98d9e90af6bf" />
### **Advanced Control Flow: Nested Conditions**

**Nested Conditional Statements**

Nested conditions occur when you place one decision inside another. This allows the program to handle complex, multi-layered scenarios where a second choice depends entirely on the outcome of the first.

- **The Concept**: Like a roadmap where each turn is guided by the one before it. You can't decide whether to add milk to your coffee until you've first chosen coffee over tea.
- **Structure**: You can nest an `if` statement inside another `if`, or even inside an `else` block.
    - **Level 1 (Outer)**: The primary condition that determines if the sub-path is even accessible.
    - **Level 2 (Inner)**: The nested condition that further refines the decision.

```jsx
public class Main {
public static void main (String[] args){
     // 1st level if-stetement
     if(condition1){
          // do something when 1st level if-statement is true
          // 2nd level if-statement inside 1st level if-statement
          if(condition2){
          // do something when 2nd level if-statement 
          }
     } else {
          // do something when 1st level if-statement is false 
     }
  }
}
```

#### Example:

```jsx
public class conditionalStatement {
    public static void main(String[] args){
        int amountOfMoney = 299;
        // 1st level if-statement
        if (amountOfMoney < 300){
            // 2nd level if-statement inside 1st level if-statement
            if (amountOfMoney < 200){
                // code executed when 2nd level if-statement if true
                System.out.println("No Diversions.");
            } else {
                // 2nd level else-statement of 2nd level if-statement
                boolean hasInterestInHistory = false;
                if (hasInterestInHistory){
                    System.out.println("Go to hoover Dam");
                } else {
                    System.out.println("Go to Area 51");
                }
            }
        } else {
            // 1st level else-statement which executes when 1st level if-statement is false
            System.out.println("Go to las vegas.");
        }
        // Note: Avoid nesting more than three levels
    }
}

```

#### **The Flow of Nesting**

Understanding how Java moves through nested blocks is key to avoiding logic errors.

- **Progression**: If the outer `if` is **true**, the program "enters" the block and evaluates the nested `if`.
- **Skipping**: If the outer `if` is **false**, Java skips the entire block—including all nested logic—and moves to the corresponding `else` or the next line of code.
- **The Boolean Flag**: Often, nested conditions rely on "flags" (boolean variables like `hasInterestInHistory`) to determine the final output.

#### **Clean Code & The "Three-Level" Rule**

While nesting is powerful, it can make code difficult to read (often called "Spaghetti Code").

- **The Golden Rule**: Your code should be easy to understand for others and your future self.
- **The Limit**: It is a best practice to avoid nesting more than **three levels deep**. If you need more, it's usually time to simplify your logic or break the code into smaller methods.

**Identifying Unreachable Code**
Unreachable code is a common mistake where a block of code is written but can **never** be executed because of the logic preceding it.

- **The "Roadmap" Analogy**: It's a destination on a map that has no road leading to it.
- **Example**: If you check `if (number > 200)` first, and then inside its `else` you check `if (number > 300)`, the second check is unreachable because any number over 300 would have already been "caught" by the first `if`.

#### **💡 Key Insights**

- **Hierarchy Matters**: In nesting, the order of your checks defines the "prerequisites" for your logic.
- **Nearest-Else Rule**: Remember that an `else` always belongs to the closest `if` above it within the same block of code.
- **Simplicity Wins**: If your nesting looks like a staircase moving too far to the right, look for ways to use logical operators (`&&`, `||`) to flatten the logic.
- **Standardization**: Just like with Strings, using Booleans and clear naming (like `amountOfMoney`) makes nested paths much easier to debug.
<img width="1198" height="1313" alt="Image" src="https://github.com/user-attachments/assets/119eeb05-9844-4b5e-8c5f-ae1d2f2d3e9e" />
#### User Input with the Scanner Class

---

## 💡 Key Concepts

- **Software Development Life Cycle (SDLC):** A structured process that guides software from idea to deployment — covering planning, design, development, testing, and maintenance.
- **Integrated Development Environment (IDE):** An all-in-one tool that combines a code editor, debugger, and compiler to streamline writing and testing code.
- **Java Syntax:** The set of rules that define how Java programs are written — including how statements, classes, and methods must be structured.
- **Variables & Data Types:** Named containers that hold values in a program. Data types define what kind of value is stored (e.g., `int` for whole numbers, `String` for text).
- **Operators:** Special symbols that perform operations on variables and values — such as arithmetic (`+`, `-`), comparison (`==`, `>`), and logical (`&&`, `||`) operations.
- **Object-oriented programming (OOP)** in java is a programming approach that organizes code using classes and objects.
- **Class:** is like a blueprint that defines properties (attributes) and behaviors (methods) common to all objects of that type.
- **Objects:** is an instance created from a class, representing a specific entity with its own values for the properties.
- **Variable:** a named container that stores a value of a specific data type.
- **Declaring a variable:** creating it by specifying its data type and name (e.g., `int playerScore;`).
- **Initializing a variable:** giving it its first value (e.g., `playerScore = 150;`).
- **Data type:** defines what kind of value the variable can store (e.g., `int`, `double`, `char`, `String`, `boolean`).
- **camelCase naming:** standard Java style for variable names (e.g., `totalAmount`), and Java is case-sensitive.
- **Arithmetic operators:** `+`, `-`, `*`, `/`, `%` (math); `+` can also concatenate strings.
- **Relational operators:** compare values (e.g., `>`, `<`, `==`) and return `true`/`false`.
- **Logical operators:** combine conditions (`&&` AND, `||` OR, `!` NOT).
- **String:** A sequence of characters (letters, numbers, symbols) used to represent text, stored internally as an array of `char` types.
- **Immutability:** A core Java concept where String objects cannot be changed once created; any modification results in the creation of an entirely new String.
- **Index:** The numerical position of a character within a string, starting at **0** and ending at **length - 1**.
- **charAt() Method:** A built-in function used to retrieve a single character from a specific index within a string (e.g., `name.charAt(0)`).
- **length() Method:** A function that returns the total count of characters in a string as an integer value.
- **Concatenation:** The process of joining two or more strings together into one using the `+` operator.
- **Space Concatenation:** Manually adding an empty space string (`" "`) between variables during concatenation to ensure readability (e.g., `firstName + " " + lastName`).
- **Operator Precedence (Parentheses):** Using `()` to force numerical addition to occur before the result is converted and concatenated into a string.
- **toUpperCase() / toLowerCase() Methods:** Built-in functions that convert all characters in a string to either all capital or all small letters for data consistency.
- **String Comparison:** The practice of using `.equals()` instead of `==` to compare the actual text content of two strings rather than their memory addresses.
- **Agile Flexibility**: The SDLC is rarely a straight line; modern teams repeat these phases in "sprints" for continuous improvement.
- **Strong Typing**: You must always declare a variable's type before use—Java is strict about this to prevent errors.
- **The Plus Operator as a Multi-Tool**: The `+` symbol is the only arithmetic operator that can handle strings. Its behavior changes based on whether it's touching a String or a Number.
- **Sequential Flow**: The linear progression of a program where code executes line-by-line from top to bottom.
- **Conditional Flow**: A non-linear execution path where certain parts of the code are either run or skipped based on specific criteria.
- **The `if` Statement**: A structure that checks a condition in parentheses; if the condition is **true**, the code inside the following curly braces `{}` executes.
    - **Syntax**: `if (condition) { // code }`.
- **The `else` Statement**: Used immediately after an `if` statement to provide an alternative block of code that runs only if the `if` condition is **false**.
- **The `else if` Statement**: A way to check multiple conditions in a sequence.
    - If the first `if` fails, the program moves to the `else if`. If that is true, it executes that block and then jumps to the end of the entire decision chain, skipping any remaining conditions.
- **Decision Timing**: The principle that conditions must be checked at an appropriate "point" in the program logic—for example, you cannot check your change until after you have received it.
- **Boolean Logic**: Every condition in a decision statement must evaluate to a simple **true** or **false** outcome.
- **Substring**: A smaller string that exists inside a larger string (e.g., "Toni" is a substring of "Toni is nice").
- **Built-in Methods**: Pre-defined functions in the Java Standard Library (like a "toaster") that perform tasks efficiently without you needing to write them from scratch.
- **The Caller**: The specific variable or value that invokes a method (e.g., in `name.toUpperCase()`, `name` is the caller).
- **Immutability in Practice**: Methods like `trim()` or `toUpperCase()` do not change the original string; they return a **new** updated string.
- **Nested Statement**: A conditional statement residing inside another, used to create complex "decision trees."
- **Outer Statement**: The "parent" condition that acts as a gatekeeper for all logic contained within its curly braces `{}`.
- **Inner Statement**: The "child" or nested condition that is only evaluated if the outer statement allows it.
- **Logic Depth**: Refers to how many levels of nesting are used; deeper levels increase complexity and reduce readability.
- **Unreachable Code**: Code that stays in the program but is never used because previous conditions make it impossible to reach.
- **Boolean Flag**: A `true`/`false` variable used to store a user's preference or a state to be checked later in a nested block.
- **Dry Run**: A manual technique where you "act like the computer" to trace the path of a program through nested levels to find logic bugs.
