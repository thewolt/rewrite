plugins {
//    // temporary, just to write source files to test the limits of Groovy syntax
//    groovy
    id("org.openrewrite.java-library")
    id("org.openrewrite.maven-publish")
}

dependencies {
    api(project(":rewrite-java"))

    implementation("org.codehaus.groovy:groovy:latest.release")

    compileOnly("org.slf4j:slf4j-api:1.7.+")

    api("io.micrometer:micrometer-core:1.+")

    api("org.jetbrains:annotations:latest.release")

    api("com.fasterxml.jackson.core:jackson-annotations:latest.release")

    testImplementation(project(":rewrite-test"))
    testRuntimeOnly("org.codehaus.groovy:groovy-all:latest.release")
}
