plugins {
    id("java")
    id("jacoco")
    id("org.sonarqube") version "4.3.1.3277"
}

sonar {
    properties {
        property("sonar.projectKey", "bhos-qa_l3-sonarcloud-Gardashaliyeva")
        property("sonar.organization", "bhos-qa")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


jacocoTestReport {
    reports {
        xml.required = true
        html.required = true
    }
}

dependencies {
    testImplementation (platform("org.junit:junit-bom:5.9.1"))
    testImplementation ("org.junit.jupiter:junit-jupiter")
}


tasks.test {
    useJUnitPlatform()
}