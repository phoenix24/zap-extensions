import org.zaproxy.gradle.addon.AddOnStatus

version = "9"
description = "Displays a dialog showing the differences between 2 requests or responses. It uses diffutils and diff_match_patch"

zapAddOn {
    addOnName.set("Diff")
    addOnStatus.set(AddOnStatus.BETA)
    zapVersion.set("2.7.0")

    manifest {
        author.set("ZAP Dev Team")
    }
}
