# Kotlin AQA Framework

Пример тестового фреймворка для автоматизации API и UI тестов на Kotlin.

## Stack
- Kotlin
- JUnit 5
- Rest Assured
- Selenide
- GitHub

## Архитектура

Проект построен с разделением слоёв:

Test → Contract → Client → Assertions

### API слой
- Контракты (`api_models`) инкапсулируют HTTP-логику
- Тесты работают через контракты, а не напрямую с RestAssured

### Core слой
- `ApiClient` — базовый HTTP клиент
- `assertions` — переиспользуемые проверки

### UI слой
- Подготовлен для Page Object подхода

## Пример теста

    val response = ExampleContract.getExample()
    ApiAssertions.assertStatusCode(response, 200)

## Что демонстрирует проект

- Архитектурный подход к автотестам
- Разделение ответственности
- Переиспользуемость кода
- Подготовку под CI

## Автор

Сергей Чижов — AQA Engineer (Kotlin)
