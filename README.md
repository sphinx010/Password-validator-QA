# 🔐 Password Validator

A modular, object-oriented Java project that validates password streongth and enforces user-specific security rules. Built with clean code principles, the **Strategy Pattern**, and ready for test-driven development.

Part of the [`qa-java-lab`](https://github.com/sphinx010/java-QA-Lab.git) — a curated collection of microprojects for aspiring QA automation engineers.

---

## 🚀 Features

- ✅ Clean object-oriented design
- 🧩 Pluggable rule system (Strategy Pattern)
- 📥 Interactive Scanner-based input with input abstraction
- ❌ Human-readable validation feedback
- 🧪 Easily extendable for unit tests and UI upgrades

---

## 🔍 Validation Rules Implemented

| Rule | Description |
|------|-------------|
| **LengthRule** | Must be at least 8 characters |
| **UppercaseRule** | Must include at least one uppercase letter |
| **SpecialCharacterRule** | Must contain at least one special character |
| **NoUsernameRule** | Must not include the username |
| **NotOldPasswordRule** | Must not be the same as the previous password |

---

## 🛠️ How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/qa-java-lab.git
   cd qa-java-lab/password-validator
2. Compile and run:
javac MainApp.java
java MainApp



📁 password-validator/
├── InputService.java
├── MainApp.java
├── PasswordValidator.java
├── UserContext.java
└── rules/
    ├── LengthRule.java
    ├── UppercaseRule.java
    ├── SpecialCharacterRule.java
    ├── NoUsernameRule.java
    └── NotOldPasswordRule.java


---
== SAMPLE OUTPUT ==
=== Password Validator ===
Enter your username: john
Enter your old password: John@123
Enter your new password: john@123

❌ Password must contain at least one uppercase letter.
❌ Password must not contain your username.
❌ Password must not be the same as your old password.

Please try again with a stronger password.
