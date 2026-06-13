<p align="center">
<img src="https://readme-typing-svg.herokuapp.com?font=Poppins&size=30&pause=1000&color=6EC1E4&center=true&vCenter=true&width=700&lines=Introduction+to+Software+Development;Learning+Software+Engineering+Concepts;SDLC+%7C+Programming+%7C+Development+✨" />
</p>

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

> **Key Insight:** The SDLC is not always linear. Modern teams often use *Agile* methodology, where these phases repeat in short cycles called *sprints*, allowing continuous improvement.
> 

#### Java Development Environment

Before writing any Java code, you need to set up your environment properly.

- **IDE (Integrated Development Environment):** A software application that provides tools for writing, testing, and debugging code in one place. It saves time and reduces errors.
    - Popular Java IDEs: **Eclipse**, **IntelliJ IDEA**, **NetBeans**
    - IDEs offer features like syntax highlighting, auto complete, and built-in debuggers.
- **Java SDK (Software Development Kit):** The core toolkit needed to compile and run Java programs. Must be installed before using any IDE.
- **Setup order:** Install Java SDK → Install IDE → Configure IDE to use the SDK → Start coding.

> 💡 **Tip:** IntelliJ IDEA is widely used in industry and has a free Community Edition — a great choice for learning.

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

### 🔎 Identifying & Isolating Text

| Method | Purpose | Example Result | Key Detail |
|---|---|---|---|
| `startsWith(prefix)` | Checks if string begins with text | `"Java".startsWith("J")` → true | Beginning check |
| `endsWith(suffix)` | Checks if string ends with text | `"Java".endsWith("a")` → true | Ending check |
| `isEmpty()` | Returns true if length = 0 | `"".isEmpty()` → true | Empty string |
| `indexOf(subString)` | Finds first index | `"Test".indexOf("est")` → 1 | Position search |
| `substring(index)` | Extract part of text | `"Apple".substring(1)` → "pple" | Text slicing |
| `trim()` | Removes spaces start/end | `" Java ".trim()` → "Java" | Clean spaces |
| `contains(subString)` | Checks existence | `"Hello".contains("ell")` → true | Anywhere search |
| `equals(string)` | Exact comparison | `"A".equals("a")` → false | Case sensitive |
| `toUpperCase()` | Convert to uppercase | `"java"` → "JAVA" | Standardizing |
| `toLowerCase()` | Convert to lowercase | `"JAVA"` → "java" | Search friendly |
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

### Advanced Control Flow: Nested Conditions

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

#### **Key Insights**

- **Hierarchy Matters**: In nesting, the order of your checks defines the "prerequisites" for your logic.
- **Nearest-Else Rule**: Remember that an `else` always belongs to the closest `if` above it within the same block of code.
- **Simplicity Wins**: If your nesting looks like a staircase moving too far to the right, look for ways to use logical operators (`&&`, `||`) to flatten the logic.
- **Standardization**: Just like with Strings, using Booleans and clear naming (like `amountOfMoney`) makes nested paths much easier to debug.
<img width="1198" height="1313" alt="Image" src="https://github.com/user-attachments/assets/119eeb05-9844-4b5e-8c5f-ae1d2f2d3e9e" />
#### User Input with the Scanner Class
#### What is User Input?

User input allows a program to receive data from the user during execution.

Instead of using fixed values written inside the code, the program becomes **interactive**, meaning it can change behavior depending on what the user enters.
**Simple Analogy:**

- Receiving the same food every day → **Fixed values**
- A waiter asking what you want → **User input**

Programming works the same way.

The program asks → the user responds → the program processes the data.

#### 🎯 Why User Input is Important

User input enables programs to:

- Interact with users
- Collect information dynamically
- Perform calculations
- Make decisions
- Build real applications instead of static programs

Without input, programs are limited and predictable.

#### 📦 The Scanner Class

Java provides many built-in libraries.

To read keyboard input, we use the **Scanner** class.

The Scanner class belongs to:

```jsx
java.util package
```

#### Step 1 — Import Scanner

Before using Scanner, you must import it at the top of the program.

```jsx
import java.util.Scanner;
```

👉 This tells Java to include the Scanner tools.

Think of it as preparing the program to **listen** to the user.

#### Step 2 — Create a Scanner Object

Inside the `main` method:

```jsx
Scanner keyboard = newScanner(System.in);
```

### Explanation

| Part | Meaning |
| --- | --- |
| `Scanner` | Data type |
| `keyboard` | Object name (any name allowed) |
| `System.in` | Input source (keyboard) |

Now the program can read user input.

#### Step 3 — Reading User Input

Scanner provides different methods depending on the data type.

**🔢 Reading Numbers**

```jsx
int age = keyboard.nextInt();
```

Reads an integer.

```jsx
double price = keyboard.nextDouble();
```

Reads decimal numbers.

```jsx
float money = keyboard.nextFloat();
```

Reads float values.

**📝 Reading Text (String)**

```jsx
String name = keyboard.nextLine();
```

Reads an entire line of text.

#### 📊 Common Scanner Methods

| Method | Data Type |
| --- | --- |
| `nextInt()` | int |
| `nextDouble()` | double |
| `nextFloat()` | float |
| `next()` | single word |
| `nextLine()` | full sentence |
| `nextBoolean()` | true / false |

#### Example

```jsx
import java.util.Scanner;

public class UserInputExample {

public static void main(String[]args) {

Scanner keyboard = newScanner(System.in);

System.out.print("Enter your age: ");
int age = keyboard.nextInt();

System.out.print("Enter your salary: ");
double salary = keyboard.nextDouble();

keyboard.nextLine();// clears buffer

System.out.print("Enter your name: ");
String name = keyboard.nextLine();

System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Salary: " + salary);
    }
}
```

#### ⚠️ Very Important — The `nextLine()` Problem

### Problem

After reading numbers, Java sometimes skips string input.

Example:

```jsx
int age = keyboard.nextInt();
String name = keyboard.nextLine();// skipped!
```

The program doesn't wait for input.

#### Why It Happens

`nextInt()` reads the number **but leaves the Enter key (`\n`) in memory**.

`nextLine()` immediately reads that leftover newline.

#### ✅ Solution

Add an extra `nextLine()`:

```jsx
keyboard.nextLine();// clear buffer
```

Then read the string normally.

#### 🔄 How Input Works Internally

1. Program displays a prompt.
2. User types input.
3. Input is stored temporarily in memory (input buffer).
4. Scanner reads the value.
5. Value is assigned to a variable.
6. Program continues execution.

#### 💡 Best Practices

✔ Always import Scanner

✔ Create only one Scanner object when possible

✔ Use meaningful variable names

✔ Display clear prompts before input

✔ Handle newline issues with `nextLine()`

✔ Close Scanner when finished:


```jsx
keyboard.close();
```


#### 🚫 Common Beginner Mistakes

- Forgetting `import java.util.Scanner`
- Creating Scanner outside `main`
- Using wrong input method
- Mixing `nextInt()` and `nextLine()` incorrectly
- Not showing instructions to the user

#### Real-World Usage

User input is used in:

- Login systems
- Registration forms
- Banking applications
- Games
- Data entry systems
- Console-based tools
<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/38dffeb0-4062-4175-852e-80552ebce5f4" />
#### Java Switch Statement

#### What is a Switch Statement?

A **switch statement** in Java is a control structure used to execute different blocks of code depending on the value of a variable or expression.

Instead of writing many `if-else` conditions, `switch` provides a cleaner and more organized way to handle **multiple equality comparisons**.

👉 Think of it like choosing an ice cream flavor:

- Each flavor = `case`
- Your choice = variable value
- No matching flavor = `default`

#### Why Use Switch Instead of If-Else?

When checking many possible values:

❌ Long chained `if-else` statements become messy.

✅ `switch` makes the code:

- Cleaner
- Easier to read
- More organized
- Easier to maintain

Best used when comparing **one variable** against **multiple fixed values**.

#### Basic Syntax of Switch

```jsx
switch(variable) {

casevalue1:
// code
break;

casevalue2:
// code
break;

default:
// runs if no case matches
}
```

### Keywords Explained

| Keyword | Meaning |
| --- | --- |
| `switch` | Starts comparison |
| `case` | Possible value |
| `break` | Stops execution |
| `default` | Runs if no match |

#### How Switch Works (Execution Flow)

1. Program reads a variable value.
2. Switch checks cases **from top to bottom**.
3. When a match is found:
    - The code runs.
4. Execution stops at `break`.
5. If no match → `default` runs.

#### Important Rule — Equality Only

Switch statements only perform:

✅ Equality checks (`==`)

You **cannot** use:

- `>`
- `<`
- `>=`
- `<=`

Switch compares values exactly.

#### Case Sensitivity (Very Important)

Strings inside switch are **case-sensitive**.

Example:

```jsx
case "Strawberry":
```

✅ `"Strawberry"` matches

❌ `"strawberry"` does NOT match

If no case matches → `default` executes.

#### Fall Through Problem

If you forget `break`, Java continues executing the next cases.

**❌ Without Break**

```jsx
case "Strawberry":
System.out.println("Strawberry");

case "Vanilla":
System.out.println("Vanilla");
```

**Output:**

```jsx
Strawberry
Vanilla
```

This behavior is called **Fall Through**.

 **Correct Version**

```jsx
case "Strawberry":
System.out.println("Strawberry");
break;
```

> 💡Nore: Always add `break` after each case.
> 

#### Complete Example

```jsx
import java.util.Scanner;

public class IceCreamShop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter flavor: ");
        String flavor = input.nextLine();

        switch(flavor) {

            case "Strawberry":
                System.out.println("I will have Strawberry ice cream");
                break;

            case "Vanilla":
                System.out.println("I will have Vanilla ice cream");
                break;

            case "Mango":
                System.out.println("I will have Mango ice cream");
                break;

            case "Chocolate":
                System.out.println("I will have Chocolate ice cream");
                break;

            default:
                System.out.println("I will have a glass of cold water");
        }

        input.close();
    }
}
```

#### Switch vs If-Else

| If-Else | Switch |
| --- | --- |
| Good for ranges | Good for fixed values |
| Can use conditions | Equality only |
| Can get long | Cleaner structure |

#### When Should You Use Switch?

Use switch when:

✅ Many fixed options exist

✅ Comparing one variable

✅ Equality comparison needed

✅ Code readability matters

#### Key Takeaways

- Switch simplifies multiple equality checks.
- Uses `case`, `break`, and `default`.
- Stops execution using `break`.
- Strings are case-sensitive.
- Prevent fall-through using `break`.
<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/1e1182d9-d5d8-4179-bc72-148f66e20067" />

#### Java For Loop

#### What is an Iterative Task?

An **iterative task** means repeating an action a specific or known number of times.

Examples:

- Sending emails to 20 people
- Buying 5 items
- Printing numbers from 1 to 10

> 💡Note: When repetitions are **known**, Java uses a **for loop**.
> 

#### What is a For Loop?

A **for loop** is an iterative structure used to repeat code a definite number of times.

Instead of writing the same code many times:

❌ Repeating instructions manually

✅ Use one loop to automate repetition

#### Real-Life Idea (Tony & Sidekick Robot)

Tony gives instructions to a robot:

Goal → Buy **5 turkeys**

Rules:

- Start counting
- Repeat task
- Stop after required number

If instructions are incomplete (like forgetting to increase the counter), the robot repeats forever.

⚠️ This is called a **Logical Error**.

#### Structure of a For Loop

```jsx
for(initialization; condition; change;) {
// code to repeat
}
```

The three parts are separated by **semicolon (;)**.

#### The Three Components

| Part | Purpose |
| --- | --- |
| Initialization | Starts the counter |
| Condition (Check) | Determines if loop continues |
| Change | Updates counter each repetition |

#### Initialization

Executed **only once** when the loop starts.

```jsx
inti=0;
```

👉 Sets starting value.

#### Condition (Check)

Controls when the loop stops.

```jsx
i<5
```

Loop runs **while condition is true**.

#### Change (Increment / Decrement)

Updates counter after each repetition.

**Increment**

```jsx
i++
```

Increase by 1.

**Decrement**

```jsx
i--
```

Decrease by 1.

#### Complete Example (Counting Up)

```jsx
for(inti=0;i<5;i++) {
System.out.println("Buying turkey number "+ (i+1));
}
```

**What Happens?**

| Step | Value |
| --- | --- |
| Start | i = 0 |
| Repeat | until i < 5 |
| Increase | i++ each time |
| Runs | 5 times |

#### Why Start from Zero?

Java counting begins at **0**.

Human counting:

```jsx
1 2 3 4 5
```

Computer counting:

```jsx
0 1 2 3 4
```

That is why we often write:

```jsx
(i+1)
```

to display human-friendly numbers.

#### Counting Backward (Decrement Loop)

```jsx
for(inti=5;i>=1;i--) {
System.out.println("Turkeys left: "+i);
}
```

### Loop Logic

- Start at 5
- Continue while ≥ 1
- Decrease each time

Still runs **5 repetitions**.

#### When Should You Use a For Loop?

Use a for loop when:

✅ Number of repetitions is known

✅ Fixed iteration count

✅ Controlled counting needed

Examples:

- Printing numbers
- Processing arrays
- Sending messages
- Game rounds

#### When NOT to Use For Loop

❌ When repetitions depend on a condition you don't know beforehand.

Example:

- Run until user types "exit"

(Use `while` loop instead.)

#### Common Logical Mistake

If you forget the change step:

```jsx
for (inti=0;i<5;)
```

The loop never stops → **Infinite Loop**.

#### Key Takeaways

- For loop repeats code a definite number of times.
- Has three parts:
    - Initialization
    - Condition
    - Change
- Java counts starting from zero.
- `++` increases count.
- `-` decreases count.
- Missing update causes logical errors.
<img width="1190" height="1322" alt="Image" src="https://github.com/user-attachments/assets/a9360bfb-5866-460b-bdc3-9b49de1ac7ad" />

#### While Loop & Do-While Loop in Java

#### Iterative Structures in Java

#### What Are Loops?

A **loop** is a programming structure used to **repeat a block of code** multiple times based on a condition.

Instead of writing the same instructions repeatedly, loops automate repetition.

#### Why Do We Use Loops?

Loops are used when:

- The number of repetitions is **unknown**
- A task must continue **until a condition change**
- Programs need **user interaction**
- Creating menus (like ATM systems)
- Processing data collections

#### Real-Life Example — ATM Menu

When you use an ATM:

- Deposit
- Withdraw
- Check balance
- Exit

The menu keeps appearing **until you choose Exit**.

> 💡Note: is behavior is implemented using loops.
> 

#### The While Loop

#### Definition

The **while loop** repeats code **as long as a condition is TRUE**.

When the condition becomes FALSE → the loop stops.

#### Syntax

```jsx
while (condition) {
// code to repeat
}
```

#### How While Loop Works

1. Check condition
2. If TRUE → execute code
3. Return to condition
4. Repeat
5. Stop when condition becomes FALSE

#### Example — Cleaning the Attic

Tony’s robot must remove boxes until the attic is empty.

#### Problem Conditions

- Robot carries **5 boxes per trip**
- Stop when no boxes remain

#### Code Example

```jsx
inttotalTrash=22;
inttrashToCarry=5;

while (totalTrash>0) {

if (totalTrash<5) {
trashToCarry=totalTrash;
    }

totalTrash-=trashToCarry;

System.out.println("Remaining boxes: "+totalTrash);
}

System.out.println("All boxes removed!");
```

> ⚠️Note: The loop runs **while the condition is true**, not until zero automatically.
> 

> Without checking remaining items, values may become negative.
> 

#### When to Use While Loop

Use `while` when:

✅ number of repetitions is unknown

✅ condition controls repetition

✅ building menus

✅ waiting for user input

#### ♾️ Infinite While Loop

Sometimes we want the loop to run continuously.

```jsx
while(true){
// runs forever
}
```

#### Example — ATM Menu

The program keeps running until the user exits.

⚠️ Always provide an exit condition using:

- `break`
- Boolean variable
- User choice

#### Controlling a Loop with Boolean

A common technique:

```jsx
booleanrunLoop=true;

while(runLoop){
// menu

if(userChoice==4){
runLoop=false;
    }
}
```

#### Example — Interactive Menu

```jsx
importjava.util.Scanner;

Scannersc=newScanner(System.in);
booleanrunLoop=true;

while(runLoop){

System.out.println("1. Clean Attic");
System.out.println("2. Clean Living Room");
System.out.println("3. Clean Bedroom");
System.out.println("4. Exit");

intchoice=sc.nextInt();

switch(choice){
case1:
System.out.println("Cleaning attic...");
break;
case2:
System.out.println("Cleaning living room...");
break;
case3:
System.out.println("Cleaning bedroom...");
break;
case4:
runLoop=false;
break;
default:
System.out.println("Invalid option");
    }
}
```

#### The Do-While Loop

#### Definition

The **do-while loop** executes the code **at least once**, then checks the condition.

#### Syntax

```jsx
do {
// code
}while(condition);
```

#### Key Difference

| Loop Type | Condition Checked |
| --- | --- |
| while | Before execution |
| do-while | After execution |

#### How Do-While Works

1. Execute code first
2. Check condition
3. If TRUE → repeat
4. If FALSE → stop

#### Example — Prompt User at Least Once

```jsx
intpassword;

do{
System.out.println("Enter password:");
password=sc.nextInt();

}while(password!=1234);
```

Even if the condition is false initially → code runs once.

#### Special Case Example

```jsx
inttotalTrashInRoom=0;

do {
System.out.println("I will take out some trash.");
} while(totalTrashInRoom>0);
```

✅ Message prints once even though condition is false.

#### While vs Do-While Comparison

| Feature | While Loop | Do-While Loop |
| --- | --- | --- |
| Execution | May run 0 times | Runs at least once |
| Condition Check | Before | After |
| Best Use | Unknown repetition | Mandatory first execution |
| Common Uses | Menus, validation | Password prompts |

#### Common Use Cases

#### While Loop

- ATM systems
- Game loops
- Menu systems
- Data processing
- Waiting for valid input

#### Do-While Loop

- Login systems
- Password validation
- Retry operations
- User prompts

#### ⚠️ Common Mistakes

#### 1. Infinite Loop

```jsx
while(i<10){
// forgot to increment i
}
```

✅ Always update the condition variable.

#### 2. Wrong Condition Logic

Incorrect conditions cause:

- endless loops
- skipped loops
- negative values

#### 3. Missing Exit Strategy

Every loop need:

- changing condition
- break statement
- user exit option

#### ⭐ Key Takeaways

- Loops automate repetition.
- `while` runs only if condition is true.
- `do-while` runs at least once.
- Boolean variables help control menus.
- Loops make programs **interactive**.
- Essential for real applications and user interfaces.

<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/64820b49-bf27-4bad-a30c-bcd745cfed71" />

### Module 3 - OOP programming basics

#### **What Are Methods in Java?**

A **method** in Java is a block of code that performs a specific task.

Methods help programmers organize code into smaller, reusable parts instead of writing everything inside the `main` method.

Think of methods like steps in a sandwich recipe:

1. Gather ingredients
2. Assemble sandwich
3. Serve sandwich

Each step has its own responsibility.

In Java, each step can become a separate method.
Just like your personal signature identifies you on documents, every method in Java has a **method signature** that identifies it.

A method signature tells Java:

- What the method does
- How to call it
- Whether it returns a value
- What inputs it needs

Without method signatures, Java would not know which method to execute.

#### Why Do We Use Methods?

Methods are important because they make code:

**1. Easier to Understand**

Instead of one giant block of code, the program is divided into clear tasks.

**Bad Approach**

```jsx
Makesandwich
```

**Better Approach**

```jsx
gatherIngredients()
assembleSandwich()
serveSandwich()
```

The second version is much clearer.

**2. Easier to Manage (Modularity)**

If you want to change one part of the program, you only modify one method.

Example:

- Change chicken to ham
- Only edit the ingredient method
- Other methods stay the same

This concept is called: **Modularity**

Breaking a program into smaller independent parts.

**3. Reusable**

Once a method is written, it can be used again and again without rewriting code.

Example:

```jsx
serveSandwich();
serveSandwich();
serveSandwich();
```

This concept is called: **Reusability**

Using the same code multiple times.

#### The Main Method

Every Java program starts with:

```jsx
public static void main(String[] args) {

}
```

> 💡Note: The `main` method is the starting point of the program.
> 

It runs automatically when the program starts.

#### How to Recognize a Method

Methods always have:

**1. Parentheses `()`**

Example:

```jsx
gatherIngredients()
```

**2. Curly Braces `{ }`**

They contain the method instructions.

#### Method Naming Rules

Java methods use **camelCase** naming.

### Example

```jsx
gatherIngredients()
assembleSandwich()
serveSandwich()
```

Rules:

- First word starts lowercase
- Every next word starts with a capital letter
- No spaces allowed

#### Method Syntax

Basic structure:

```jsx
public static void methodName() {

}
```

Example:

```jsx
public static void serveSandwich() {
System.out.println("Serving sandwich");
}
```

#### **Understanding the `main()`Method Signature**

**1. `public`**

**Meaning:**

An **access modifier**.

It means:
```java
The method can be accessed from anywhere.
```
Think of it like:

> “Anyone can follow these instructions.”
> 

**2. `static`**

**Meaning:**

A sharing mechanism.

It allows the method to be used without creating an object.

Think of it like:

> “These instructions are shared and always available.”
> 

**3. `void`**

**Meaning:** The method does NOT return a value.

Example:

```jsx
void
```

means:

```jsx
No result is sent back.
```

**4. `main`**

**Meaning:**

The method name.

Java looks for:

```jsx
main
```

to start the program.

**5. `(String[] args)`**

**Meaning:**

The parameter list.

It allows input values to be passed into the program.

`String[]` means:

- An array of strings
- Can contain multiple inputs
- Can also be empty

**6. `{ }`**

**Meaning:** Contains the instructions of the method. Everything inside executes when the method runs.

#### **Important Idea About Method Signatures**

A method signature tells you:

| Part | Purpose |
| --- | --- |
| What it does | Method name |
| Who can use it | Access modifier |
| Is it shared? | static |
| Does it return something? | Return type |
| Does it need inputs? | Parameter list |

#### **Technical Terms You Must Know**

| Keyword | Technical Name |
| --- | --- |
| **`public`** | Access Modifier |
| **`static`** | Sharing Mechanism |
| **`void / double / int`** | Return Type |
| **`main`** | Method Name |
| **`()`** | Parameter List |

#### **Anatomy of a Method Signature**
<img width="1672" height="941" alt="Image" src="https://github.com/user-attachments/assets/becee0b8-b98f-4272-b0bc-3ba59e489607" />


#### Example of Creating Methods

**Method 1 — Gather Ingredients**

```jsx
public static void gatherIngredients() {
System.out.println("All ingredients arranged");
}
```

**Method 2 — Assemble Sandwich**

```jsx
public static void assembleSandwich() {
System.out.println("Assembling sandwich");
}
```

**Method 3 — Serve Sandwich**

```jsx
public static void serveSandwich() {
System.out.println("Serving sandwich");
}
```
#### Two Types of Methods

Java methods are divided into two types:

**1. Non-Returning Methods**

These methods:

- Perform actions
- Do NOT return results

They use:

```jsx
void
```

Example:

```jsx
public static void gatherIngredients() {
    System.out.println("Ingredients ready");
}
```

This method performs an action only.

**2. Returning Methods**

These methods:

- Perform calculations/tasks
- Return a result

Example:

```jsx
public static double calculateArea() {
    return 25.0;
}
```

This method returns a `double` value.

#### Understanding Return Types

The return type tells Java what kind of result comes back.

| Return Type | Returns |
| --- | --- |
| `void` | Nothing |
| `int` | Integer |
| `double`  | Decimal number |
| `boolean` | true or false |
| `String` | Text |

#### Example — Square Area Calculator

**Variable Declaration**

```jsx
static double sideOfSquare;
```

Stores the square side length.

#### Non-Returning Method Example

**Setting the Side Value**

```jsx
public static void setSquareSide() {
    sideOfSquare = 5.2;
}
```

This method:

- Changes a value
- Returns nothing

So it uses:

```jsx
void
```

#### Returning Method Example

**Calculating Area**

```jsx
public static double calculateAreaOfSquare() {
    return sideOfSquare * sideOfSquare;
}
```

This method:

- Calculates the area
- Returns a decimal number

So the return type is:

```jsx
double
```

#### The `return` Statement

Used to send a value back from a method.

Example:

```jsx
return sideOfSquare * sideOfSquare;
```

#### Important Rule About `return`

The `return` statement:

- Ends the method immediately
- Must usually be the last executed statement

Anything after it will not run.

Example:

```jsx
return 5;
System.out.println("Hello");
```

This causes an error because code after `return` is unreachable.

#### Difference Between Returning and Non-Returning Methods

| Feature | Non-Returning | Returning |
| --- | --- | --- |
| Uses `void` | Yes | No |
| Returns value | No | Yes |
| Can store result | No | Yes |
| Example | print message | calculate result |
#### **Calling Methods**

A method does nothing until it is called.

**Method call syntax:**

```jsx
methodName();
```

Example:

```jsx
setSquareSide();
calculateAreaOfSquare();
```

#### Full Program Example

```jsx
public class Main {

    static double sideOfSquare;

    public static void setSquareSide() {
        sideOfSquare = 5.2;
    }

    public static double calculateAreaOfSquare() {
        return sideOfSquare * sideOfSquare;
    }

    public static void main(String[] args) {

        setSquareSide();

        double areaOfSquare = calculateAreaOfSquare();

        System.out.println(
        "Area of the square with side "
        + sideOfSquare +
        " is: " + areaOfSquare);

    }
}
```

**Program Output**

```jsx
Area of the square with side 5.2 is: 27.04
```
#### Important Point About Method Calls

When calling a method, you only write:

- Method name
- Parentheses

You DO NOT write:

- public
- static
- return type

#### Using Arrays Inside Methods

The lesson also used an array to store ingredients.

Example:

```jsx
static String[] ingredients;
```

An array stores multiple values in one variable.

#### Array Indexes

Arrays start counting from:

```jsx
0
```

Example:

```jsx
ingredients[0] = "Bread";
ingredients[1] = "Chicken";
ingredients[2] = "Cheese";
ingredients[3] = "Lettuce";
```

#### Checking Conditions Inside Methods

The program used `if` statements to verify ingredients.

Example:

```jsx
if (ingredients.length == 4)
```

This checks whether there are exactly 4 ingredients.

#### Comparing Strings in Java

Strings must use:

```jsx
.equals()
```

NOT:

```jsx
==
```

Correct:

```jsx
ingredients[0].equals("Bread")
```

#### Boolean Variables

```jsx
staticbooleansandwichReady;
```

Boolean variables only store:

- `true`
- `false`

Example:

```jsx
sandwichReady=true;
```

#### Method Execution Flow

The program worked in this order:

**Step 1**

Gather ingredients

↓

**Step 2**

Check ingredients and assemble sandwich

↓

**Step 3**

Serve sandwich if ready

#### Advantages of Methods

| Advantage | Explanation |
| --- | --- |
| Clarity | Code becomes easier to read |
| Modularity | Tasks are separated |
| Reusability | Methods can be reused |
| Easier Debugging | Errors are easier to find |
| Better Organization | Cleaner program structure |

#### Important Concepts Learned

**1. Methods perform tasks**

Each method has one responsibility.

**2. Methods improve readability**

Programs become easier to understand.

**3. Methods can call other methods**

Example:

```jsx
main()
```

calls:

```jsx
gatherIngredients()
```

**4. Methods reduce duplicated code**

Write once → use many times.

#### Real-Life Examples of Methods

| Real Life Task | Java Method |
| --- | --- |
| Login | `loginUser()` |
| Send Email | `sendEmail()` |
| Calculate Price | `calculatePrice` |
| Print Receipt | `printReceipt()` |
| Upload File | `uploadFile` |

<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/21d39493-9ed2-48da-9797-5cce25118b8a" />

#### Classes and Objects in Java

In earlier programs, all methods were written inside the `Main` class.

That worked for small programs, but as the application grows, the `Main` class becomes crowded and difficult to manage.

To solve this problem, Java uses **classes** and **objects**.

#### Why Use Classes?

Think of a game:

- The `Main` class = the game control center
- Heroes = separate characters with their own powers

Instead of defining every hero ability inside `Main`, you create a separate class for heroes.

> A **class** acts like a **blueprint**.
> 

It defines:

- Characteristics (attributes/variables)
- Actions (methods)

#### What is a Class?

A class is a template for creating objects.

Example:

```jsx
class Hero {
    String name = "Hero";
    int strength = 20;
    int health = 100;
}
```

This class defines:

| Attribute | Meaning |
| --- | --- |
| `name` | Hero name |
| `strength` | Hero power |
| `health` | Hero health points |

These are called:

- Fields
- Properties
- Attributes
- Instance variables

(All mean nearly the same thing.)

#### Methods Inside Classes

Classes can also contain methods.

Example:

```jsx
public int calculatePunchDamage() {
    return strength * 2;
}
```

This method:

- Uses the hero’s strength
- Calculates damage
- Returns the result

#### Static vs Non-Static Methods

Earlier methods were `static`.

Example:

```jsx
public static int calculatePunchDamage()
```

But now methods belong to each hero object individually.

So we remove `static`.

```jsx
public int calculatePunchDamage()
```

#### Why Remove Static?

Because every hero should have its own behavior.

Example:

| Hero | Strength |
| --- | --- |
| FireFist | 20 |
| FrostBlizzard | 35 |

Different heroes → different damage.

Non-static methods work with object-specific data.

#### What is an Object?

A class is only a blueprint.

An **object** is the real thing created from the blueprint.

Example:

```jsx
Hero fireFist = new Hero();
```

This creates a hero object.

#### Object Creation (Instantiation)

The process of creating objects is called:

#### Instantiation

Syntax:

```jsx
ClassName objectName = new ClassName();
```

Example:

```jsx
Hero fireFist = new Hero();
```

| Part | Meaning |
| --- | --- |
| `Hero` | Class name |
| `fireFist` | Reference variable |
| `new` | Creates object |
| `Hero()` | Constructor |

#### Reference Variable

```jsx
Hero fireFist
```

`fireFist` does not store the actual object directly.

It stores a **reference** (address) pointing to the object.

That’s why it’s called a: **Reference Variable**

#### Constructor

```jsx
new Hero()
```

`Hero()` is a constructor.

A constructor:

- Creates objects
- Initializes objects
- Has the same name as the class

Java automatically provides a default constructor if you don't create one.

#### Accessing Object Properties

Use the dot operator `.`

Example:

```jsx
fireFist.name = "FireFist";
```

Or:

```jsx
System.out.println(fireFist.name);
```

The dot operator accesses:

- Variables
- Methods

inside the object.

#### **Calling Methods Through Objects**

Example:

```jsx
int damage = fireFist.calculatePunchDamage();
```

The method belongs to the object.

#### Multiple Objects from One Class

One class can create many objects.

Example:

```jsx
Hero fireFist = new Hero();
Hero frostBlizzard = new Hero();
```

Each object has:

- Its own data
- Its own values
- Its own behavior

#### **Example of Different Heroes**

```jsx
fireFist.strength = 20;
frostBlizzard.strength = 35;
```

Even though both are from the same class:

- Their strengths differ
- Their damage differs

#### Special Attack Method

Example:

```jsx
public int calculateSpecialAttackDamage(String attackType)
```

This method:

- Accepts an argument
- Uses different attack types

Example:

```jsx
frostBlizzard.calculateSpecialAttackDamage("Ice Blast");
```

#### **Full Flow of the Program**

**Step 1: Create Class**

```jsx
class Hero
```

Defines blueprint.

**Step 2: Add Variables**

```jsx
String name;
int strength;
int health;
```

Defines hero properties.

**Step 3: Add Methods**

```jsx
calculatePunchDamage()
```

Defines hero actions.

**Step 4: Create Objects**

```jsx
Hero fireFist = new Hero();
```

Creates actual heroes.

**Step 5: Customize Objects**

```jsx
fireFist.name = "FireFist";
```

Changes object values.

**Step 6: Call Methods**

```jsx
fireFist.calculatePunchDamage();
```

Uses object behavior.

#### Key Differences

| Class | Object |
| --- | --- |
| Blueprint | Real instance |
| Template | Actual thing |
| Defines structure | Holds real values |

#### Summary

| Concept | Meaning |
| --- | --- |
| Class | Blueprint/template |
| Object | Real instance |
| Instantiation | Creating object |
| Constructor | Creates object |
| Reference variable | Stores object reference |
| Dot operator | Access object members |
| Non-static method | Belongs to object |
| Attribute | Object data |
| Method | Object action |

#### Why Classes Are Powerful

Classes make programs:

- Cleaner
- Organized
- Reusable
- Easier to maintain
- Scalable

Without classes, large applications become messy very quickly.
<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/3e6c4832-58b6-4630-9189-c8323d41fd51" />

#### Grouping Methods in Java

Previously, methods were placed directly inside the `Main` class.

```jsx
public static void main(String[] args) {

}
```

That works for small programs.

But as programs become larger, placing everything inside `Main` becomes:

- messy
- difficult to read
- hard to maintain

So Java introduces a better way to organize code: **Classes**

#### The main Idea

Instead of putting all methods inside one class:

Group related methods together inside their own class.

This improves:

- organization
- readability
- reusability

#### Real-World Analogy

Imagine a video game.

The `Main` class is like: **The Game Control Center**

It controls the game flow.

But hero powers should not all be written there.

Instead:

- Hero abilities belong in a `Hero` class
- BMI logic belongs in a `BMICalculator` class
- Bank logic belongs in a `BankAccount` class

Each class has its own responsibility.

#### What is a Class?

A class is: A blueprint/template

It groups together:

- variables (data)
- methods (actions)

Example:

```jsx
class Hero {

}
```

#### **Why Group Methods?**

Without grouping:

```jsx
main()
```

becomes huge and confusing.

Example problem:

```jsx
calculateBMI...
calculateDamage...
calculateSalary...
calculateTax...
```

Everything mixed together.

This is bad design.

**Better Organization**

Instead:

```jsx
class BMICalculator
class Hero
class SalaryCalculator
```

Each class handles one task.

This is called: **Separation of Responsibilities**

Very important in programming.

#### Utility Classes

A class created mainly to store reusable methods is called: **Utility Class**

Example:

```jsx
class BMICalculator
```

Its purpose:

- group BMI-related methods.

#### Reusable Methods

Example:

```jsx
calculateBmiImperial()
calculateBmiMetric()
```

These methods can be reused many times.

Write once → use everywhere.

#### Benefits of Grouping Methods

**1. Reduced Code Duplication**

Without methods:

```jsx
formula
formula
formula
formula
```

Repeated everywhere.

With grouped methods:

```jsx
calculateBMI()
```

Only once.

**2. Improved Readability**

This:

```jsx
calculateBmiImperial()
```

is easier to understand than:

```jsx
weight / (height * height) * 703
```

inside many places.

Method names explain the purpose clearly.

**3. Easier Maintenance**

Suppose the formula changes.

Without grouped methods —> Change many lines.

With grouped methods —> Update one method only.

**4. Better Scalability**

Programs grow over time.

Grouping methods keeps projects manageable.

#### Main Class Responsibility

The `Main` class should mainly:

- start the program
- create objects
- call methods

NOT contain all program logic.

#### Creating a Separate Class

Example:

```jsx
public class BMICalculator {

}
```

Now all BMI logic stays inside this class.

#### Methods Inside Classes

Example:

```jsx
public double calculateBmiImperial(...) {

}
```

The class stores related functionality.

#### Objects and Method Access

To use methods from another class:

You create an object.

Example:

```jsx
BMICalculator bmiCalculator =
    new BMICalculator();
```

**Breaking It Down**

| Part | Meaning |
| --- | --- |
| `BMICalculator` | Class |
| `bmiCalculator` | Reference variable |
| `new` | Creates object |
| `BMICalculator()` | Constructor |

#### Calling Methods Through Objects

Example:

```jsx
bmiCalculator.calculateBmiImperial(...)
```

Structure:

```jsx
objectName.methodName()
```

#### Why Use Objects?

Objects allow access to:

- methods
- variables

inside a class.

#### Constructor Concept

```jsx
BMICalculator()
```

This is a constructor.

Purpose: **Create objects**

Java automatically gives a default constructor if you do not write one.

#### Reusability Concept

Once methods exist:

```jsx
calculateBmiImperial()
```

they can be reused many times.

This avoids rewriting code.

#### Professional Programming Principle

Good programs organize code into:

- classes
- modules
- reusable methods

instead of writing everything in one place.

#### Code Structure Improvement

Bad structure:

```jsx
Main class
 ├── everything
 ├── everything
 ├── everything
```

Good structure:

```jsx
Main
 ├── Hero class
 ├── BMICalculator class
 ├── Utility classes
```

#### Important Concepts Introduced

| Concept | Meaning |
| --- | --- |
| Class | Blueprint |
| Object | Instance of class |
| Utility class | Groups helper methods |
| Reusability | Use methods repeatedly |
| Constructor | Creates object |
| Organization | Separating responsibilities |

#### Small Notes

**Method Names Should Describe Purpose**

Good:

```jsx
calculateBmiImperial()
```

Bad:

```jsx
doStuff()
```

**Classes Should Have One Responsibility**

Good:

```jsx
BMICalculator
```

contains BMI logic only.

Bad:

```jsx
BMICalculator
```

containing:

- music player
- login system
- games

#### Group Related Logic Together

This makes code:

- easier to debug
- easier to expand
- easier for teams to understand

#### Utility Classes Are Extremely Common

Professional projects use utility/helper classes everywhere.

Examples in Java:

| Class | Purpose |
| --- | --- |
| `Math` | Math methods |
| `Arrays` | Array utilities |
| `Collections` | Collection utilities |

#### Key Difference

| Without Grouping | With Grouping |
| --- | --- |
| Repeated code | Reusable methods |
| Messy main class | Organized classes |
| Hard maintenance | Easy updates |
| Poor readability | Clean structure |

#### Final Key Takeaway

As programs grow:
❌ putting everything inside `Main` becomes bad practice.
✅ grouping related methods into dedicated classes creates cleaner, reusable, scalable, and professional Java applications.

<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/e4e7206e-5a44-4f1a-ab7d-05a4628c18e8" />

#### Objects in Java

#### What is an Object in Java?

An **object** in Java is a real thing created from a class.

- A **class** is the blueprint/template.
- An **object** is the actual thing created using that blueprint.

**Example:**

- Class = Hero
- Objects = FireFist, FrostBlizzard

Think of the class as a character design sheet in a game, and the objects as the actual playable heroes.

> **Objects are independent: Changing one object does not affect another object.**
> 

#### Main Idea of Objects

An object contains:

1. **Data / Properties** → characteristics of the object
2. **Methods / Behaviors** → actions the object can perform

#### **Example from the Hero Class**

```jsx
class Hero {
    String name = "Hero";
    int strength = 20;
    int health = 100;

    int calculatePunchDamage() {
        return strength * 2;
    }
}
```

**Properties (State/Data)**

```jsx
name
strength
health
```

These describe the hero.

> **Methods use object data: Methods usually depend on object state.**
> 

#### Methods (Behavior)

```jsx
calculatePunchDamage()
```

This describes what the hero can do.

#### Three Components of an Object

Every object in Java has 3 important components:

#### **1. Identity**

**Meaning**

Identity means every object has its own unique place in memory.

Even if two objects come from the same class, Java treats them as different objects.

Example:

```jsx
Hero fireFist = new Hero();
Hero frostBlizzard = new Hero();
```

Both are created from the Hero class, but they are different objects.

**Printing Object Identity**

```jsx
System.out.println(fireFist);
System.out.println(frostBlizzard);
```

Example output:

```jsx
Hero@6e8cf4c6
Hero@12ab34cd
```

**Explanation**

**`Hero`**

The class name.

#### **`@`**

Separates class name from memory reference.

**`6e8cf4c6`**

Hexadecimal memory reference (address-like value).

This proves each object has a unique identity.

**Important Note**

The variables:

```jsx
fireFist
frostBlizzard
```

are called **reference variables** because they store references to objects, not the actual object itself.

#### 2. State

**Meaning**

State means the current values stored inside the object’s variables.

The state describes the condition of the object.

**Example:**

```jsx
fireFist.name = "Fire Fist";
fireFist.strength = 20;

frostBlizzard.name = "Frost Blizzard";
frostBlizzard.strength = 35;
```

Now both objects have different states.

**FireFist State**

| Property | Value |
| --- | --- |
| name | Fire Fist |
| strength | 20 |
| health | 100 |

**FrostBlizzard State**

| Property | Value |
| --- | --- |
| name | Frost Blizzard |
| strength | 35 |
| health | 100 |

#### Important Concept

Objects created from the same class can still have different states.

That is why games can create many heroes from one Hero class.

#### Dot Operator `.`

The dot operator is used to access object properties and methods.

**Example**

```jsx
fireFist.name
fireFist.strength
fireFist.calculatePunchDamage()
```

#### 3. Behavior

**Meaning**

Behavior means the actions an object can perform.

Behavior is defined using methods.

**Example**

```jsx
calculatePunchDamage()
calculateSpecialAttackDamage()
```

These methods define the hero’s abilities.

#### Behavior Depends on State

Methods often use object properties.

Example:

```jsx
return strength * 2;
```

The damage depends on the hero’s strength.

**Stronger Hero = More Damage**

**FireFist**

```jsx
strength = 20
damage = 40
```

**FrostBlizzard**

```jsx
strength = 35
damage = 70
```

Same method → different result because the object state is different.

#### Relationship Between Identity, State, and Behavior

| Component | Meaning | Example |
| --- | --- | --- |
| Identity | Unique object in memory | fireFist |
| State | Current values of properties | strength = 20 |
| Behavior | Actions performed by methods | calculatePunchDamage() |

#### Object Creation (Instantiation)

Creating an object is called: **Instantiation**

**Syntax**

```jsx
ClassName objectName = new ClassName();
```

**Example**

```jsx
Hero fireFist = new Hero();
```

**Breakdown**

| Part | Meaning |
| --- | --- |
| Hero | Class name |
| fireFist | Reference variable |
| new | Creates object |
| Hero() | Constructor |

#### Constructor

A constructor is a special method used to create objects.

```jsx
Hero()
```

Java automatically provides a default constructor if you do not create one.

#### Example Full Program

```jsx
class Hero {

    String name = "Hero";
    int strength = 20;
    int health = 100;

    int calculatePunchDamage() {
        return strength * 2;
    }
}

public class Main {

    public static void main(String[] args) {

        Hero fireFist = new Hero();
        fireFist.name = "Fire Fist";

        Hero frostBlizzard = new Hero();
        frostBlizzard.name = "Frost Blizzard";
        frostBlizzard.strength = 35;

        System.out.println(fireFist.name);
        System.out.println(frostBlizzard.name);

        System.out.println(fireFist.calculatePunchDamage());
        System.out.println(frostBlizzard.calculatePunchDamage());
    }
}
```

**Output**

```jsx
Fire Fist
Frost Blizzard
40
70 
```
<img width="1055" height="1491" alt="Image" src="https://github.com/user-attachments/assets/c7347fee-2877-473e-b845-e0f47d520a7a" />

#### Inheritance in Java (OOP)

**What is Inheritance?**

**Inheritance** is an Object-Oriented Programming (OOP) concept that allows a class to acquire the properties (variables) and behaviors (methods) of another class.

It helps developers **reuse existing code** instead of rewriting the same functionality multiple times.

**Real-Life Example:**

Think about a **Car**.

A car is a type of **Vehicle**.

A truck is also a type of **Vehicle**.

Both vehicles share common features:

- Make
- Model
- Color
- Speed
- Accelerate
- Brake
- Turn

Instead of writing these features again in every class, we create one **Vehicle** class and let other classes inherit from it.

#### **Key Terminology**

**1. Superclass (Parent Class)**

A superclass is the main class that contains common properties and methods.

Example:

```jsx
class Vehicle {
    String make;
    String model;
    String color;
    int speed;

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed -= 10;
    }
}
```

Vehicle is the **Superclass**.

**2. Subclass (Child Class)**

A subclass inherits everything from the superclass and can add its own features.

Example:

```jsx
class Car extends Vehicle {

    public void adjustSeat() {
        System.out.println("Adjusting seat...");
    }
}
```

Car is the **Subclass**.

#### **The extends Keyword**

Java uses the keyword:

```jsx
extends
```

to create inheritance.

Example:

```jsx
class Car extends Vehicle
```

Meaning:

> Car inherits from Vehicle.
> 

#### **The "IS-A" Relationship**

Inheritance represents an **IS-A relationship**.

Examples:

- Car IS-A Vehicle
- Truck IS-A Vehicle
- SportsCar IS-A Vehicle

If the sentence makes sense, inheritance is usually appropriate.

#### **What Does the Subclass Inherit?**

A subclass inherits:

- Variables (Fields)

```jsx
make
model
color
speed
```

- Methods

```jsx
accelerate()
brake()
turn()
```

From the superclass

#### **Adding Unique Features**

A subclass can add its own methods and variables.

Example:

```jsx
class Car extends Vehicle {

    public void adjustSeat() {
        System.out.println("Seat adjusted");
    }
}
```

Now Car has:

**Inherited Features**

```jsx
accelerate()
brake()
turn()
```

**Its Own Feature**

```jsx
adjustSeat()
```

#### **Creating an Object**

```jsx
Car gt = new Car();
```

Here:

- `Car` → class name
- `gt` → reference variable
- `new Car()` → creates an object

#### **Using Inherited Methods**

```jsx
gt.accelerate();
```

Even though accelerate() is inside Vehicle, Car can use it because of inheritance.

This is called:

**Code Reuse**

No need to rewrite the method.

#### **Example**

```jsx
Car gt = new Car();

gt.make = "Ford";
gt.model = "GT";
gt.color = "Black";

gt.accelerate();
```

Output:

```jsx
Vehicle speed increased
```

The method comes from Vehicle but is used by Car.

#### **Benefits of Inheritance**

**1. Code Reuse**

Write code once.

Use it in many subclasses.

Without inheritance:

```jsx
Car
Truck
Bus
Bike
```

would all need duplicate methods.

With inheritance:

```jsx
Vehicle
```

contains common code only once.

**2. Scalability**

Adding new vehicle types becomes easier.

Example:

```jsx
class Truck extends Vehicle
class Bus extends Vehicle
class SportsCar extends Vehicle
```

No need to rewrite common functionality.

#### **3. Maintainability**

If you update Vehicle:

```
accelerate()
```

every subclass automatically gets the update.

Only one place needs modification.

#### Polymorphism

Example:

```jsx
public void repair(Vehicle vehicle) {
    System.out.println("Repairing vehicle...");
}
```

Calling:

```jsx
Car gt = new Car();

garage.repair(gt);
```

works perfectly.

Why?

Because:

```jsx
Car IS-A Vehicle
```

A Car object can be treated as a Vehicle object.

This flexibility is called: **Polymorphism**

#### Visual Diagram
<img width="1024" height="559" alt="Image" src="https://github.com/user-attachments/assets/698d244c-b724-4f41-b979-07df2d8a8890" />
<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/ee2fc8ca-0653-4033-a49f-5a178955aa7c" />

#### **Constructors in Inheritance**

#### **What is a Constructor?**

A constructor is a special method that runs automatically when an object is created.

Its purpose is to initialize the object and prepare its data.

**Example:**

```jsx
public Car() {
    System.out.println("Car created.");
}
```

**When:**

```jsx
Car car = new Car();
```

The constructor runs automatically.

#### **Default Constructor**

If you do not create a constructor yourself, Java automatically creates one for you.

**Example:**

```jsx
class Vehicle {

}
```

Java secretly creates:

```jsx
class Vehicle {

    public Vehicle() {

    }
}
```

This is called: **Default Constructor**

#### **Constructors During Inheritance**

Suppose:

```jsx
class Vehicle {

}

class Car extends Vehicle {

}
```

When you create:

```jsx
Car car = new Car();
```

Java does NOT create the Car object immediately.

First:

1. Vehicle constructor runs.
2. Car constructor runs.

This guarantees that all inherited properties are initialized correctly.

#### **The super() Keyword**

The keyword:

```jsx
super()
```

is used to call the constructor of the superclass.

Example:

```jsx
public Car() {
    super();
}
```

Meaning:

> Call the Vehicle constructor first.
> 

#### Important Rule

The superclass constructor is ALWAYS executed before the subclass constructor.

Example:

```jsx
class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle created");
    }
}

class Car extends Vehicle {

    public Car() {
        System.out.println("Car created");
    }
}
```

Output:

```jsx
Vehicle created
Car created
```

Notice:

Vehicle constructor executes first.

#### Implicit super()

If you do not write:

```jsx
super();
```

Java automatically adds it.

Example:

```jsx
public Car() {

}
```

Java treats it as:

```jsx
public Car() {
    super();
}
```

This is called: Implicit super() Call

#### **Parameterized Constructors**

Instead of using empty constructors, we can pass data.

Vehicle constructor:

```jsx
public Vehicle(String make,
               String model,
               String color) {

    this.make = make;
    this.model = model;
    this.color = color;
    this.speed = 0;
}
```

Now every Vehicle starts with its own values.

#### **Calling a Parameterized Superclass Constructor**

Inside Car:

```jsx
public Car(String make,
           String model,
           String color) {

    super(make, model, color);

    this.seatPosition = 0;
}
```

Explanation:

```jsx
super(make, model, color);
```

sends the values to the Vehicle constructor.

**Complete Example**

**Vehicle Class**

```jsx
class Vehicle {

    String make;
    String model;
    String color;
    int speed;

    // Parameterized constructor
    public Vehicle(String make,
                   String model,
                   String color) {

        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;

        System.out.println("Vehicle created.");
    }

    // Increase vehicle speed
    public void accelerate() {
        speed += 5;
    }

    // Decrease vehicle speed
    public void brake() {
        speed -= 5;
    }

    // Return current speed
    public int getSpeed() {
        return speed;
    }
}
```

**Car Class**

```jsx
class Car extends Vehicle {

    int seatPosition;

    // Parameterized constructor
    public Car(String make,
               String model,
               String color) {

        // Call Vehicle constructor
        super(make, model, color);

        seatPosition = 0;

        System.out.println("Car created.");
    }

    // Move seat forward or backward
    public void adjustSeat(int adjustment) {

        seatPosition += adjustment;

        if(adjustment > 0) {
            System.out.println("Moving seat forward...");
        }
        else if(adjustment < 0) {
            System.out.println("Moving seat backward...");
        }
        else {
            System.out.println("Seat position unchanged.");
        }
    }
}
```

**Main Class**

```jsx
public class Main {

    public static void main(String[] args) {

        // Create a Car object
        Car tesla =
                new Car("Tesla",
                        "Model S",
                        "Red");

        // Accelerate vehicle
        tesla.accelerate();

        // Display speed
        System.out.println(
                tesla.model +
                " running at " +
                tesla.getSpeed() +
                " mph");

        // Slow down vehicle
        tesla.brake();

        // Display speed again
        System.out.println(
                tesla.model +
                " running at " +
                tesla.getSpeed() +
                " mph");

        // Adjust seat position
        tesla.adjustSeat(2);
    }
}
```

#### Constructor Chaining

**Definition**

The process where constructors call one another in an inheritance hierarchy.

Example:

```jsx
Vehicle Constructor
        ↓
Car Constructor
        ↓
SportsCar Constructor
```

This sequence is called: Constructor Chaining

#### Constructor Execution Order

When:

```jsx
SportsCar car =
        new SportsCar();
```

Execution order:

```jsx
Vehicle Constructor
        ↓
Car Constructor
        ↓
SportsCar Constructor
```

Always from parent to child.

#### **Types of Inheritance**

**1. Single-Level Inheritance**

One child inherits from one parent.

```jsx
Vehicle
   ↑
  Car
```

Code:

```jsx
class Vehicle {

}

class Car extends Vehicle {

}
```

**2. Multilevel Inheritance**

A child inherits from a child.

```jsx
Vehicle
   ↑
  Car
   ↑
SportsCar
```

Code:

```jsx
class Vehicle {

}

class Car extends Vehicle {

}

class SportsCar extends Car {

}
```

SportsCar inherits from:

- Car
- Vehicle

**Example:**

```jsx
class SportsCar extends Car {

    int turboBoost;

    // Increase turbo power
    public void activateTurboBoost(int amount) {

        turboBoost += amount;

        accelerate();
    }
}
```

**3. Hierarchical Inheritance**

Multiple subclasses inherit from one superclass.

```jsx
          Vehicle
         /      \
       Car      Truck
```

Code:

```jsx
class Vehicle {

}

class Car extends Vehicle {

}

class Truck extends Vehicle {

}
```

Both:

```jsx
Car
Truck
```

inherit Vehicle features.
<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/16f93aa2-92f9-4fa6-ac38-fa8afb4a9d49" />

#### **Calling Superclass Methods with `super` in Java**

**Introduction**

Previously, you learned that a subclass can inherit properties and methods from a superclass using the `extends` keyword.

In this lesson, you learn something more powerful:

**How to call methods and access variables from the superclass using the `super` keyword.**

This allows a subclass to reuse existing functionality while adding new behavior.

#### **The Class Hierarchy**

The example uses three classes:

```jsx
Vehicle
   ↑
   |
  Car
   ↑
   |
SportsCar
```

**Vehicle (Superclass)**

Contains common vehicle features:

```jsx
make
model
color
speed
```

Methods:

```jsx
accelerate()
brake()
turn()
getSpeed()
```

**Car (Subclass)**

Inherits from Vehicle.

Adds:

```jsx
seatPosition
adjustSeat()
```

**SportsCar (Subclass)**

Inherits from Car.

Adds:

```jsx
turboBoost
activateTurboBoost()
```

#### Why Use super?

The `super` keyword refers to the **immediate parent class**.

It allows a subclass to:

**1. Call a superclass constructor**

```jsx
super(...)
```

**2. Call a superclass method**

```jsx
super.methodName()
```

**3. Access a superclass variable**

```jsx
super.variableName
```

#### Using super with Constructors

SportsCar extends Car.

When creating a SportsCar object:

```jsx
SportsCar ferrari =
    new SportsCar("Ferrari",
                  "F8 Tributo",
                  "Yellow");
```

Java must first initialize the parent class.

Constructor:

```jsx
public SportsCar(
        String make,
        String model,
        String color) {

    super(make, model, color);

    this.turboBoost = 0;
}
```

What happens?

**Step 1:**

```jsx
super(make,model,color);
```

calls the parent constructor.

**Step 2:**

The parent constructor initializes:

```jsx
make
model
color
```

**Step 3:**

SportsCar initializes:

```jsx
turboBoost
```

#### Calling a Superclass Method

Vehicle already contains:

```jsx
public void accelerate() {
    speed += 5;
}
```

Inside SportsCar:

```jsx
public void activateTurboBoost() {

    super.accelerate();

    ...
}
```

Meaning

```jsx
super.accelerate();
```

explicitly executes the accelerate() method from the parent class.

The SportsCar reuses the Vehicle's acceleration logic instead of rewriting it.

#### Accessing a Superclass Variable

After accelerating:

```jsx
this.turboBoost += 50;
```

Now increase the inherited speed:

```jsx
super.speed += turboBoost;
```

**What happens?**

Initial speed:

```jsx
0
```

After accelerate():

```jsx
5
```

After turbo boost:

```jsx
5 + 50 = 55
```

Final speed:

```jsx
55
```

#### Complete Turbo Boost Logic

```jsx
public void activateTurboBoost() {

    super.accelerate();

    this.turboBoost += 50;

    super.speed += turboBoost;

    System.out.println(
        "Turbo boost activated");
}
```

**Flow**

```jsx
Activate Turbo
      ↓
Call accelerate()
      ↓
Speed = 5
      ↓
TurboBoost = 50
      ↓
Add TurboBoost to Speed
      ↓
Speed = 55
```

#### Creating a SportsCar Object

```jsx
SportsCar ferrari =
    new SportsCar(
        "Ferrari",
        "F8 Tributo",
        "Yellow");
```

Object created:

```jsx
Make  : Ferrari
Model : F8 Tributo
Color : Yellow
Turbo : 0
Speed : 0
```

#### Calling the Method

```jsx
ferrari.activateTurboBoost();
```

Output:

```jsx
Vehicle is speeding up
Turbo boost activated
```

**Getting the Current Speed**

```jsx
System.out.println(
    ferrari.model +
    " is running at " +
    ferrari.getSpeed() +
    " miles per hour");
```

**Output**:

```jsx
F8 Tributo is running at 55 miles per hour
```

#### Benefits of Calling Superclass Methods

**1. Code Reuse**

Reuse existing methods.

No duplication.

```jsx
super.accelerate();
```

instead of rewriting:

```jsx
speed += 5;
```

**2. Cleaner Code**

The parent class handles common functionality.

The child class focuses only on new features.

**3. Easier Maintenance**

If accelerate() changes later:

```jsx
speed += 10;
```

every subclass automatically benefits.

**4. Extensibility**

You can build more specialized classes:

```jsx
Vehicle
   ↓
Car
   ↓
SportsCar
   ↓
RaceCar
```

without rewriting common code.

#### Difference Between this and super

| Keyword | Refers To |
| --- | --- |
| `this` | Current object |
| `super` | Parent class |

**Example:**

```jsx
this.turboBoost = 50;
```

refers to SportsCar's variable.

```jsx
super.speed += turboBoost;
```

refers to Vehicle's variable.
<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/810147f9-e976-43e7-b8b0-f9efa5680485" />

#### Polymorphism in Java

#### What is Polymorphism?

**Polymorphism** comes from Greek:

- **Poly** = Many
- **Morph** = Forms

So, **Polymorphism = Many Forms**.

In Java, polymorphism allows **the same method or reference to behave differently depending on the object being used**.

#### Real-Life Example

Think of a **universal remote control**:

- One **Power** button
- Controls a TV
- Controls a Sound System
- Controls an Air Conditioner

The button is the same, but each device responds differently.

This is exactly how polymorphism works in Java.

**Definition**

Polymorphism allows:

- A superclass reference to work with subclass objects.
- The same method name to perform different actions.
- Code to become more reusable and flexible.

Example:

```jsx
Vehicle myVehicle = new Car();
```

A `Car` object is being treated as a `Vehicle`. This is polymorphism.

#### Types of Polymorphism in Java

Java mainly supports:

**1. Method Overloading**

**2. Method Overriding**

#### 1. Method Overloading

**Definition**

Method Overloading happens when:

- Methods have the **same name**
- But have **different parameters**

The compiler decides which method to call based on the arguments.

**Example:**

```jsx
class Shape {

    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void draw(String color) {
        System.out.println("Drawing a shape with color " + color);
    }
}
```

Both methods are named:

```jsx
draw()
```

But their parameter lists are different.

**Calling Them:**

```jsx
Shape shape = new Shape();

shape.draw();

shape.draw("Red");
```

**Output:**

```jsx
Drawing a shape
Drawing a shape with color Red
```

**Why It Works**

Java looks at:

```jsx
draw()
```

and

```jsx
draw("Red")
```

and notices different arguments.

Therefore, it knows which version to execute.

For overloading, you must change:

- Number of parameters

OR

- Parameter types

OR

- Parameter order

Example:

```jsx
print()
print(String name)
print(int age)
print(String name, int age)
```

All are vali overloads.

#### 2. Method Overriding

**Definition**

Method Overriding happens when:

A subclass creates its own version of a method that already exists in the superclass.

The method name, parameters, and return type remain the same.

**Example**

Superclass:

```jsx
class Shape {

    public void draw() {
        System.out.println("Drawing a shape");
    }
}
```

Subclass:

```jsx
class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
```

The Circle class replaces the original implementation.

**Calling it:**

```jsx
Shape bangle = new Circle();

bangle.draw();
```

**Output:**

```jsx
Drawing a circle
```

Even though the reference type is:

```jsx
Shape
```

Java executes the method from:

```jsx
Circle
```

because the actual object is Circle.

This is Runtime Polymorphism.

#### Why Does This Happen?

Java always checks:

**Reference Type**

```jsx
Shape bangle
```

for what methods are allowed.

But it checks:

**Actual Object Type**

```jsx
new Circle()
```

for which overridden method should run.

#### Polymorphism with Inheritance

Earlier you learned:

```jsx
Car extends Vehicle
```

This means:

```jsx
Car IS-A Vehicle
```

Therefore:

```jsx
Vehicle vehicle = newCar();
```

is valid.

Because every Car is a Vehicle.

**Garage Example**

Method:

```jsx
public void repair(Vehicle vehicle)
{
    System.out.println("Vehicle repaired");
}
```

Calling:

```jsx
Car gt = new Car();

garage.repair(gt);
```

works because:

```jsx
Car IS-A Vehicle
```

This is polymorphism.

The method expects a Vehicle.

A Car object can be used automatically.

#### Benefits of Polymorphism

**1. Code Reusability**

You can write one method and use it with many subclasses.

Example:

```jsx
repair(Vehicle vehicle)
```

works for:

- Car
- Truck
- SportsCar
- Motorcycle

without creating separate methods.

**2. Flexibility**

Adding a new subclass often requires little or no changes.

Example:

```jsx
Vehicle vehicle = new Bus();
```

Your existing code still works.

**3. Maintainability**

Changes in the superclass automatically affect subclasses.

Example:

```jsx
Vehicle
```

contains movement logic.

Update it once:

```jsx
accelerate()
```

and all vehicle types benefit.

**4. Cleaner Code**

Instead of:

```jsx
repairCar()
repairTruck()
repairBus()
repairBike()
```

You can simply write:

```jsx
repair(Vehicle vehicle)
```

#### Drawbacks of Polymorphism

Polymorphism is powerful but can make code harder to understand.

Example:

```jsx
Vehicle vehicle = new SportsCar();
```

At first glance, you may not know which method version will run.

Therefore:

- Design class hierarchies carefully.
- Use meaningful class names.
- Avoid excessive inheritance.
<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/4a48a86e-2eae-4953-98af-b2ec0c21366d" />

#### Method Overloading (Compile-Time Polymorphism)

**What is Method Overloading?**

Method Overloading is a type of **Polymorphism** in Java.

It allows a class to have **multiple methods with the same name**, but with **different parameter lists**.

Think of it like a phone camera:

- Portrait Mode
- Landscape Mode
- Night Mode

The button is still **Take Picture**, but the behavior changes depending on the settings provided.

**Camera Example**

The class contains three methods with the same name:

```jsx
takePicture(String mode)
```

```jsx
takePicture(int resolution)
```

```jsx
takePicture(String mode, int resolution)
```

Although the names are identical, Java treats them as different methods because their parameter lists are different.

**First Version**

```jsx
public void takePicture(String mode)
{
    System.out.println("Taking picture in " + mode + " mode");
}
```

**Purpose**

Allows the user to choose a camera mode.

Example:

```jsx
takePicture("Portrait");
```

Output:

```jsx
Taking picture in Portrait mode
```

**Second Version**

```jsx
public void takePicture(int resolution)
{
    System.out.println("Taking picture in " + resolution + " megapixels");
}
```

**Purpose**

Allows the user to choose image resolution.

Example:

```jsx
takePicture(12);
```

Output:

```jsx
Taking picture in 12 megapixels
```

**Third Version**

```jsx
public void takePicture(String mode, int resolution)
{
    System.out.println(
        "Taking a " + resolution +
        " megapixels picture in " +
        mode + " mode"
    );
}
```

**Purpose**

Allows the user to specify both:

- Mode
- Resolution

Example:

```jsx
takePicture("Landscape", 24);
```

Output:

```jsx
Taking a 24 megapixels picture in Landscape mode
```

#### Important Rule of Overloading

This is NOT allowed:

```jsx
public void takePicture(String mode)
{
}

public void takePicture(String resolution)
{
}
```

Why?

Because both methods have:

- Same name
- Same number of parameters
- Same parameter type

Java cannot distinguish between them.

#### **Valid Overloading Examples**

**Different Data Types**

```jsx
takePicture(String mode)
takePicture(int resolution)
```

**Different Number of Parameters**

```jsx
takePicture(String mode)
takePicture(String mode, int resolution)
```

**Different Order of Parameters**

```jsx
takePicture(String mode, int resolution)
takePicture(int resolution, String mode)
```

#### **Creating the Object**

```jsx
Camera myFavoriteCamera = new Camera();
```

This creates an object from the Camera class.

#### **Calling the Methods**

**Call #1**

```jsx
myFavoriteCamera.takePicture("Portrait");
```

Java finds:

```jsx
takePicture(String mode)
```

**Call #2**

```jsx
myFavoriteCamera.takePicture(12);
```

Java finds:

```jsx
takePicture(int resolution)
```

**Call #3**

```jsx
myFavoriteCamera.takePicture("Landscape", 24);
```

Java finds:

```jsx
takePicture(String mode, int resolution)
```

#### Compile-Time Polymorphism

Java decides **which method to execute before the program runs**, during compilation.

Example:

```jsx
takePicture("Portrait");
```

Java immediately knows:

```jsx
takePicture(String mode)
```

will be called.

This is called: **Compile-Time Polymorphism**

or **Static Polymorphism** because the decision is made at compile time.

#### Why Use Method Overloading?

**1. Better Readability**

Instead of:

```jsx
takePictureByMode()
takePictureByResolution()
takePictureByModeAndResolution()
```

you simply write:

```jsx
takePicture()
```

with different arguments.

**2. Easier to Remember**

One method name handles related tasks.

```jsx
takePicture(...)
```

for everything camera-related.

**3. More Flexible Code**

The same method can work in multiple ways.

#### Difference Between Overloading and Overriding

| Method Overloading | Method Overriding |
| --- | --- |
| Same class | Parent & Child classes |
| Same method name | Same method name |
| Different parameters | Same parameters |
| Compile-time polymorphism | Runtime polymorphism |
| No inheritance required | Inheritance required |

Example:

**Overloading**

```jsx
takePicture()
takePicture(String mode)
takePicture(int resolution)

```

**Overriding**

```jsx
class Camera
{
    void takePicture()
    {
        System.out.println("Taking picture");
    }
}

class SmartCamera extends Camera
{
    @Override
    void takePicture()
    {
        System.out.println("Taking AI picture");
    }
}
```

**Small Notes:**

**Note 1**

Method name can stay the same.

```jsx
takePicture(...)
```

Only the parameter list changes.

**Note 2**

Return type alone cannot overload methods.

Invalid:

```jsx
int takePicture()
double takePicture()
```

Same parameters → Error.

**Note 3**

Parameter list is what makes overloaded methods unique.

Java checks:

- Number of parameters
- Types of parameters
- Order of parameters

**Note 4**

Method overloading is the **first form of polymorphism** most Java developers learn.
<img width="1024" height="1536" alt="Image" src="https://github.com/user-attachments/assets/c38b2e2d-3803-4ca9-a6a1-9fbb4c2d5529" />
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
- - **Scanner** enables **interactive Java programs.**
- **Input** allows dynamic data processing.
- Different **methods** read different data types.
- Buffer handling is essential when mixing inputs.
- **Argument**: Value passed to a method.
- **Parameter**: Variable inside method definition.
- **Return Type**: Data type returned.
- **Method Signature**: Complete method definition.
- **Reusability**: Reusing methods.
- **Flexibility**: Dynamic behavior.
- **Order Matters**: Argument order is important.
- **Classes**: classes are blueprints and they define Data and behaviors
- **Objects**: objects are real instances created from classes.
- **Reference Variable:** Stores reference/address of object.
- **Instantiation**: Process of creating objects using `new`.
- **Behavior**: Methods/actions of object.
- **State**: Current property values of object.
- **Dot Operator:** Used to access properties and methods.
- **Inheritance**: Creating a new class using an existing class.
- **Superclass**: The parent class that provides common functionality.
- **Subclass**: The child class that inherits from the superclass
- **extends**: Keyword used for inheritance.
- **IS-A Relationship**: A subclass is a specialized version of the superclass.
- **Code reuse**: Using existing code instead of rewriting it.
- **Polymorphism**: A subclass object can be used where a superclass object is expected.
- **Constructor**: Special method used to initialize an object.
- **Default Constructor**: Constructor automatically created by Java.
- **Parameterized Constructor:** Constructor that receives arguments.
- **super():** Used to call the superclass constructor.
- **Constructor Chaining:** Sequence of constructor calls from superclass to subclass.
- **Single-Level Inheritance:** One parent → one child.
- **Multilevel Inheritance:** Parent → Child → Grandchild.
- **Hierarchical Inheritance:** One parent → multiple children.
