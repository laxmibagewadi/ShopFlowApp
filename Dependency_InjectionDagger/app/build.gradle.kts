plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.example.dependency_injectiondagger"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dependency_injectiondagger"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)



    //dagger2 dependency
    implementation ("com.google.dagger:dagger:2.50")
    kapt ("com.google.dagger:dagger-compiler:2.50")

    //dagger2 support library
    implementation ("com.google.dagger:dagger-android:2.50")
    implementation ("com.google.dagger:dagger-android-support:2.50") // if you use the support libraries
    kapt ("com.google.dagger:dagger-android-processor:2.50")
}