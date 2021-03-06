plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
}

group = "br.danielfalcao"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":moviee-shared"))
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "br.danielfalcao.moviee"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}