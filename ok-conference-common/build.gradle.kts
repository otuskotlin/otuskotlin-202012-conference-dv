plugins {
    kotlin("jvm") version "1.4.21"
}

group = "ru.otus.otuskotlin.conference"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}
