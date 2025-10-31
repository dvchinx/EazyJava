plugins {
    id("java-library")
    id("maven-publish")
    id("signing")
}

group = "org.florez"
version = "1.0.0"
description = "EazyJava - A library for Java to make it easier to work with"

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
            "Implementation-Vendor" to "florez"
        )
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            
            pom {
                name.set("EazyJava")
                description.set("EazyJava - A library for Java to make it easier to work with")
                url.set("https://github.com/dvchinx/eazyjava")
                
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                
                developers {
                    developer {
                        id.set("dvchinx")
                        name.set("Jesus Florez")
                        email.set("none@example.com")
                    }
                }
                
                scm {
                    connection.set("scm:git:git://github.com/dvchinx/eazyjava.git")
                    developerConnection.set("scm:git:ssh://github.com/dvchinx/eazyjava.git")
                    url.set("https://github.com/dvchinx/eazyjava")
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