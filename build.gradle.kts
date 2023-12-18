plugins {
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"

val kotlinVersion = extra.properties["kotlin.version"] as String

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-compiler:$kotlinVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}