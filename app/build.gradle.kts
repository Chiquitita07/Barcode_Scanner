plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.barcodescanner"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.barcodescanner"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {


    implementation (libs.barcode.scanning)
    implementation (libs.camera.core)
    implementation(libs.androidx.camera.view)
    implementation (libs.androidx.camera.lifecycle)
    implementation("androidx.camera:camera-camera2:1.3.0")
    implementation (libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}