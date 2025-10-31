# 🚀 EazyJava

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-11%2B-orange.svg)](https://www.oracle.com/java/)
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)](https://github.com/dvchinx/EazyJava)
[![Version](https://img.shields.io/badge/version-1.0.0-blue.svg)](https://github.com/dvchinx/EazyJava/releases)

**A powerful Java library that adds and simplifies methods to make Java easier to work with.**

---

## 📋 Table of Contents

- [🌟 Features](#-features)
- [📦 Installation](#-installation)
- [🔧 API Reference](#-api-reference)
- [📖 Usage Examples](#-usage-examples)
- [🧪 Testing](#-testing)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)
- [👨‍💻 Author](#-author)

---

## 🌟 Features

| Feature | Description | Status |
|---------|-------------|--------|
| **Print Functions** | Python-like `print()` and `println()` methods | ✅ Complete |
| **Type Casting** | Advanced type conversion utilities | ✅ Complete |
| **Number Base Conversion** | Binary, Hexadecimal, and Octal parsing | ✅ Complete |
| **Text-to-Number** | Literal text number conversion | ✅ Complete |
| **Error Handling** | Built-in exception handling with informative messages | ✅ Complete |
| **Zero Dependencies** | Lightweight library with no external dependencies | ✅ Complete |
| **Multiple Data Types** | Support for all primitive types and objects | ✅ Complete |

---

## 📦 Installation

### Gradle (Kotlin DSL)
```kotlin
dependencies {
    implementation("org.florez:eazyjava:1.0.0")
}
```

### Gradle (Groovy)
```groovy
dependencies {
    implementation 'org.florez:eazyjava:1.0.0'
}
```

### Maven
```xml
<dependency>
    <groupId>org.florez</groupId>
    <artifactId>eazyjava</artifactId>
    <version>1.0.0</version>
</dependency>
```

---

## � API Reference

### 🖨️ Print Methods

| Method | Parameters | Description | Example |
|--------|------------|-------------|---------|
| `print()` | `String` | Print string without newline | `print("Hello")` |
| `print()` | `int/long/double/boolean/char` | Print primitive types without newline | `print(42)` |
| `print()` | `Object` | Print object using toString() without newline | `print(new Date())` |
| `print()` | `String delimiter, Object...` | Print multiple values with custom delimiter | `print(", ", 1, 2, 3)` |
| `println()` | Same as print + newline | All print methods with automatic newline | `println("Hello World")` |
| `println()` | None | Print empty line | `println()` |

### 🔄 Type Conversion Methods

| Method | Input | Output | Description | Example |
|--------|-------|--------|-------------|---------|
| `toText()` | `int, boolean` | `String` | Convert integer to literal text | `toText(250, true)` → `"Two hundred fifty"` |
| `toText()` | `boolean` | `String` | Convert boolean to text | `toText(true)` → `"true"` |
| `toText()` | `double` | `String` | Convert double to text | `toText(3.14)` → `"3.14"` |
| `toInt()` | `String, boolean` | `int` | Convert string/literal to integer | `toInt("two hundred", true)` → `250` |

### 🔢 Base Conversion Methods

| Method | Input Format | Description | Example |
|--------|--------------|-------------|---------|
| `toIntFromBin()` | Binary string | Convert binary to integer | `toIntFromBin("1010")` → `10` |
| `toIntFromHex()` | Hexadecimal string | Convert hexadecimal to integer | `toIntFromHex("FF")` → `255` |
| `toIntFromOct()` | Octal string | Convert octal to integer | `toIntFromOct("755")` → `493` |

#### Supported Input Formats

| Base | Supported Formats | Examples |
|------|------------------|----------|
| **Binary** | `"1010"`, `"0b1010"` | `toIntFromBin("0b1010")` |
| **Hexadecimal** | `"FF"`, `"0xFF"`, `"0XFF"` | `toIntFromHex("0xFF")` |
| **Octal** | `"755"`, `"0755"`, `"0o755"` | `toIntFromOct("0o755")` |

---

## 🏗️ Building from Source

```bash
# Clone the repository
git clone https://github.com/dvchinx/EazyJava.git
cd EazyJava

# Build the project
./gradlew build

# Generate documentation
./gradlew javadoc

# Publish to local repository
./gradlew publishToMavenLocal
```

### Build Requirements

| Requirement | Version | Status |
|-------------|---------|--------|
| **Java** | 11+ | ✅ Required |
| **Gradle** | 7.0+ | ✅ Included |
| **Dependencies** | None | ✅ Zero external deps |

---

## 🤝 Contributing

We welcome contributions! Here's how you can help:

### 📋 Contribution Guidelines

| Step | Action | Command |
|------|--------|---------|
| 1 | Fork the repository | [Fork on GitHub](https://github.com/dvchinx/EazyJava/fork) |
| 2 | Create feature branch | `git checkout -b feature/amazing-feature` |
| 3 | Commit changes | `git commit -m 'Add amazing feature'` |
| 4 | Push to branch | `git push origin feature/amazing-feature` |
| 5 | Open Pull Request | [Create PR](https://github.com/dvchinx/EazyJava/pulls) |

### 🎯 Areas for Contribution

- [ ] Additional number base conversions
- [ ] Internationalization support
- [ ] Performance optimizations
- [ ] Extended literal text support
- [ ] Additional formatting options

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Contributors

Special thanks to all contributors who have helped make EazyJava better!

For a complete list, see [CONTRIBUTORS.md](CONTRIBUTORS.md).

---

<div align="center">

**Made with ❤️ by [dvchinx](https://github.com/dvchinx)**

*If this library helped you, please consider giving it a ⭐!*

</div>