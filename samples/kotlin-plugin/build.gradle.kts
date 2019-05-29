
plugins {
    kotlin("jvm") version "1.2.71" apply false
    id ("com.github.rodm.teamcity-server") version "1.2" apply false
}

group = "com.github.rodm.teamcity"
version = "1.0-SNAPSHOT"

extra["teamcityVersion"] = findProperty("teamcity.version") ?: "2017.1"
