plugins {
    java
    application
}

group = "vk.course"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.intellij:annotations:12.0")
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    testCompileOnly("org.projectlombok:lombok:1.18.24")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.24")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation(project(":models"))
    implementation("com.google.code.gson:gson:2.9.1")
}

application {
    mainModule.set("library.controller.main")
    mainClass.set("vk.course.controller.Application")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}