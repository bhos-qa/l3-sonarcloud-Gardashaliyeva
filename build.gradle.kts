plugins {
    id("java")
    id("org.sonarqube") version "4.3.1.3277"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
}

sonar {
  properties {
    property("sonar.projectKey", "bhos-qa_l3-sonarcloud-Gardashaliyeva")
    property("sonar.organization", "bhos-qa")
    property("sonar.host.url", "https://sonarcloud.io")
  }
}

tasks.test {
    useJUnitPlatform()
}
