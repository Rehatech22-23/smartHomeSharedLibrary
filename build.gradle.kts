import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    id("maven-publish")
    id("java")
    kotlin("plugin.serialization") version "1.8.0"
}

group = "de.rehatech"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
    testImplementation(kotlin("test"))
    testImplementation("com.google.code.gson:gson:2.10")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
publishing{
    publications {
        create<MavenPublication>("maven"){
            groupId = "de.rehatech"
            artifactId ="homeekt"
            version = "0.1.1"
            from(components["java"])
        }
    }
}

