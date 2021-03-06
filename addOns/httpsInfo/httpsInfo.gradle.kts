version = "12"
description = "Displays HTTPS configuration information."

zapAddOn {
    addOnName.set("HttpsInfo")
    zapVersion.set("2.7.0")

    manifest {
        author.set("ZAP Dev Team")
    }
}

dependencies {
    implementation(files("lib/dvAPI_5.0.3.jar"))
    implementation("org.slf4j:slf4j-log4j12:1.7.6") {
        // Bundled in Deep Violet JAR.
        exclude(group = "org.slf4j", module = "slf4j-api")
    }
}
