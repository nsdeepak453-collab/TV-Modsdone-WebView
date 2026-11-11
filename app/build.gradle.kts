plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "in.modsdone.tvwebview"
    compileSdk = 35

    defaultConfig {
        applicationId = "in.modsdone.tvwebview"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
