plugins {
    id("java-library")
    id("maven-publish")
    id("signing")
}

group = "org.agusdevs"
version = "1.0.0"
description = "PyJava - A Python-style print library for Java"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    withJavadocJar()
    withSourcesJar()
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}

// Configure the jar task
tasks.jar {
    manifest {
        attributes(
            "Implementation-Title" to project.name,
            "Implementation-Version" to project.version,
            "Implementation-Vendor" to "agusdevs"
        )
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            
            pom {
                name.set("PyJava")
                description.set("A Python-style print library for Java with simplified syntax and built-in error handling")
                url.set("https://github.com/dvchinx/pyjava")
                
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                
                developers {
                    developer {
                        id.set("agusdevs")
                        name.set("Agus Developer")
                        email.set("agus@example.com")
                    }
                }
                
                scm {
                    connection.set("scm:git:git://github.com/dvchinx/pyjava.git")
                    developerConnection.set("scm:git:ssh://github.com/dvchinx/pyjava.git")
                    url.set("https://github.com/dvchinx/pyjava")
                }
            }
        }
    }
    
    repositories {
        maven {
            name = "local"
            url = uri(layout.buildDirectory.dir("repos"))
        }
    }
}