plugins {
    id("java")
    id("jacoco")
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

jacoco {
    toolVersion = "0.8.9"
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(jacocoTestReport) // report is always generated after tests run
}
jacocoTestReport {grad
    dependsOn(test) // tests are required to run before generating the report
    reports {
        xml.required.set(true)
    }
}


