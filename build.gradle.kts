import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
}

group = "io.github.kurenairyu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

object Versions {
    const val jackson = "2.13.1"
    const val log4j = "2.17.1"
    const val disruptor = "3.4.4"
}

dependencies {

    implementation("org.apache.logging.log4j:log4j-core:${Versions.log4j}")
    implementation("org.apache.logging.log4j:log4j-api:${Versions.log4j}")

    implementation("com.lmax:disruptor:${Versions.disruptor}")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "17"
}