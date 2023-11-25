plugins {
    id ("com.android.application")
    kotlin ("android")
}

android {
    compileSdk = App.compileSdk

    defaultConfig {
        applicationId = App.applicationId
        minSdk = App.minSdk
        targetSdk = App.targetSdk
        versionCode = App.versionCode
        versionName = App.versionName

        testInstrumentationRunner = App.androidJUnitRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile(App.proguardFile), App.proguardRule)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = Version.java
    }
}

dependencies {
    implementation (Dependency.coreKtx)
    implementation (Dependency.appcompat)
    implementation (Dependency.material)
    implementation (Dependency.constraintLayout)
    testImplementation (Dependency.junit)
    androidTestImplementation (Dependency.extJunit)
    androidTestImplementation (Dependency.espressoCore)
}