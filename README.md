# PyJava

A Python-style print library for Java that provides simplified printing methods with built-in error handling and support for multiple data types.

## 🚀 Features

- **Simple Syntax**: Python-like `print()` and `println()` methods
- **Type Support**: Built-in support for all primitive types and objects
- **Error Handling**: Automatic exception handling with informative error messages
- **Multiple Values**: Print multiple values with custom delimiters
- **Zero Dependencies**: Lightweight library with no external dependencies

## 📦 Installation

### Gradle (Kotlin DSL)
```kotlin
dependencies {
    implementation("org.agusdevs:pyjava:1.0.0")
}
```

### Gradle (Groovy)
```groovy
dependencies {
    implementation 'org.agusdevs:pyjava:1.0.0'
}
```

### Maven
```xml
<dependency>
    <groupId>org.agusdevs</groupId>
    <artifactId>pyjava</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 📖 Usage

### Basic Examples

```java
import static org.agusdevs.PyJava.*;

public class Example {
    public static void main(String[] args) {
        // Print without newline
        print("Hello, ");
        print("World!");
        
        // Print with newline
        println("Hello, World!");
        
        // Print numbers
        println(42);
        println(3.14159);
        println(1000000000L);
        
        // Print boolean and characters
        println(true);
        println('A');
        
        // Print objects
        println(new Date());
    }
}
```

### Advanced Features

```java
import static org.agusdevs.PyJava.*;

public class AdvancedExample {
    public static void main(String[] args) {
        // Print multiple values with delimiter
        println(" | ", "Name", "Age", "City");
        println(" | ", "John", 25, "New York");
        println(" | ", "Jane", 30, "London");
        
        // Print table-like data
        print(", ", 1, 2, 3, 4, 5);
        println(); // Empty line
        
        // Mix different data types
        println(" - ", "Score:", 95.5, "Grade:", 'A', "Passed:", true);
    }
}
```

### Output
```
Name | Age | City
John | 25 | New York
Jane | 30 | London
1, 2, 3, 4, 5

Score: - 95.5 - Grade: - A - Passed: - true
```

## 🔧 API Reference

### Methods

| Method | Description |
|--------|-------------|
| `print(String)` | Print string without newline |
| `print(int)` | Print integer without newline |
| `print(long)` | Print long without newline |
| `print(double)` | Print double without newline |
| `print(boolean)` | Print boolean without newline |
| `print(char)` | Print character without newline |
| `print(Object)` | Print object (using toString()) without newline |
| `println(...)` | Same as print methods but with newline |
| `println()` | Print empty line |
| `print(String delimiter, Object... values)` | Print multiple values with delimiter |
| `println(String delimiter, Object... values)` | Print multiple values with delimiter and newline |

### Error Handling

All methods include built-in exception handling. If an error occurs, it will be printed to `System.err` with a descriptive message:

```
PyJava Error (String): [error message]
```

## 🧪 Testing

Run the tests using Gradle:

```bash
./gradlew test
```

The library includes comprehensive unit tests covering all methods and edge cases.

## 🏗️ Building from Source

1. Clone the repository:
```bash
git clone https://github.com/dvchinx/pyjava.git
cd pyjava
```

2. Build the project:
```bash
./gradlew build
```

3. Generate documentation:
```bash
./gradlew javadoc
```

4. Publish to local repository:
```bash
./gradlew publishToMavenLocal
```

## 📋 Requirements

- Java 11 or higher
- No external dependencies

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📝 Changelog

### v1.0.0
- Initial release
- Basic print/println methods for all primitive types
- Object printing support
- Multiple values printing with custom delimiters
- Comprehensive error handling
- Full test coverage

## 👨‍💻 Author

**Agus Developer** - [agusdevs](https://github.com/agusdevs)

## 🙏 Acknowledgments

- Inspired by Python's simple and intuitive print function
- Built for Java developers who want simplified console output