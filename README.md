# Parikshan Compose Multiplatform (KMP) Sample

[![Kotlin](https://img.shields.io/badge/Kotlin-2.4.10-blue.svg?logo=kotlin)](https://kotlinlang.org)
[![Compose Multiplatform](https://img.shields.io/badge/Compose_Multiplatform-1.11.1-purple.svg)](https://www.jetbrains.com/lp/compose-multiplatform/)
[![Parikshan](https://img.shields.io/badge/E2E-Parikshan_0.0.8-green.svg)](https://aryapreetam.github.io/parikshan)

This branch demonstrates how to test interactive forms, keyboard text inputs, and explicit Compose `Modifier.testTag` identifiers using the [Parikshan E2E Testing Framework](https://aryapreetam.github.io/parikshan).

## Tutorial & Documentation
This branch accompanies the [Testing Forms & User Inputs Guide](https://aryapreetam.github.io/parikshan/guides/forms-and-inputs/).

## Key Code Components
* `shared/src/commonMain/kotlin/org/parikshankmpsample/App.kt` — Greeting form with `OutlinedTextField` (`Modifier.testTag("name_input")`) and Greet button.
* `shared/src/commonTest/kotlin/org/parikshankmpsample/SimpleGreetTest.kt` — Multiplatform test verifying text input, button clicking, and visibility assertions.

## Running Tests
```bash
# Run on Desktop JVM
./gradlew :shared:e2eJvmTest
```
### 2. Multi-Target Orchestrated Execution
Run tests across multiple platforms concurrently:
```bash
# Run Desktop JVM, Web (Wasm), and Android concurrently
./gradlew :shared:e2eTest --targets=jvm,wasm,android

# Run for all configured targets (Desktop JVM, Web Wasm, Android, iOS)
./gradlew :shared:e2eTest

# Or run individual targets:
./gradlew :shared:e2eWasmTest     # Web Wasm (Playwright)
./gradlew :shared:e2eAndroidTest  # Android (Emulator / Device)
./gradlew :shared:e2eIosTest      # iOS (macOS host only)
```

### Sample Branches
- **main**: Quickstart baseline testing the default template (AppTest.kt).
- **feature/greeting-form** (this branch): Interactive form testing (SimpleGreetTest.kt).