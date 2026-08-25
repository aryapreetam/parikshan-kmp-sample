# Parikshan Compose Multiplatform (KMP) Sample

[![Kotlin](https://img.shields.io/badge/Kotlin-2.4.10-blue.svg?logo=kotlin)](https://kotlinlang.org)
[![Compose Multiplatform](https://img.shields.io/badge/Compose_Multiplatform-1.11.1-purple.svg)](https://www.jetbrains.com/lp/compose-multiplatform/)
[![Parikshan](https://img.shields.io/badge/E2E-Parikshan_0.0.8-green.svg)](https://aryapreetam.github.io/parikshan)

This repository is the official Compose Multiplatform (KMP) companion sample for the [Parikshan E2E Testing Framework](https://aryapreetam.github.io/parikshan). It demonstrates writing multiplatform UI tests in `commonTest` that execute natively across Desktop (JVM), Web (WasmJs), Android, and iOS with **zero modifications to production UI code**.

## Tutorial & Documentation
This project accompanies the [Your First Test (KMP Guide)](https://aryapreetam.github.io/parikshan/guides/your-first-test/).

## Project Architecture
A standard multiplatform project layout targeting Desktop (JVM), Web (Wasm), Android, and iOS:
* `shared/` — Core business logic and Compose Multiplatform UI (`commonMain`) and E2E tests (`commonTest`).
* `desktopApp/` — Desktop JVM application entry point.
* `androidApp/` — Android application wrapper.
* `webApp/` — Web WasmJs entry point.
* `iosApp/` — iOS Xcode wrapper.

## Running E2E Tests

### 1. Fast Local Feedback (Desktop JVM)
Executes in under 2 seconds without starting emulators or browser runtimes:
```bash
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