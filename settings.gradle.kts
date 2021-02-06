rootProject.name = "otuskotlin-conference"

pluginManagement {
    val kotlinVersion: String by settings
    plugins{
        kotlin("jvm") version kotlinVersion
    }
}

