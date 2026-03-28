rootProject.name = "GSit"

include(":core")

listOf(
    "v26_1"
).forEach {
    include(":$it")
    project(":$it").projectDir = file("mcv/$it")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}