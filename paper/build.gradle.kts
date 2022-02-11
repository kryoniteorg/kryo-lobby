repositories {
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    val paperVersion = "1.18.1-R0.1-SNAPSHOT"

    compileOnly("io.papermc.paper:paper-api:$paperVersion")

    testImplementation("io.papermc.paper:paper-api:$paperVersion")
    testImplementation("org.awaitility:awaitility:4.1.1")
}