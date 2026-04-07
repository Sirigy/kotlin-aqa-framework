plugins {
    kotlin("jvm") version "1.9.22"
}

group = "qa.auto"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")

    // Rest Assured
    testImplementation("io.rest-assured:rest-assured:5.4.0")

    // Selenide
    testImplementation("com.codeborne:selenide:7.2.2")

    // Kotlin test
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
