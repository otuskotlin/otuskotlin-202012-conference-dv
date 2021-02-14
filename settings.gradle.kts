rootProject.name = "otuskotlin-conference"

pluginManagement {
    val kotlinVersion: String by settings
    plugins{
        kotlin("jvm") version kotlinVersion
    }
}

include("ok-conference-common")
include("ok-conference-common-multiplatform")
