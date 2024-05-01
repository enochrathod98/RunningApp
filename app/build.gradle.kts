plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.runningapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.runningapp"
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
    buildFeatures {
        viewBinding = true
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

    // Architectural Components
    implementation (libs.androidx.lifecycle.viewmodel.ktx)

    // Room
    implementation (libs.androidx.room.runtime)
    //noinspection KaptUsageInsteadOfKsp
    kapt (libs.androidx.room.compiler)

    // Kotlin Extensions and Coroutines support for Room
    implementation (libs.androidx.room.ktx)

    // Coroutine Lifecycle Scopes
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    implementation (libs.androidx.lifecycle.runtime.ktx)

    // Navigation Components
    implementation (libs.androidx.navigation.fragment.ktx)
    implementation (libs.androidx.navigation.ui.ktx)

    // Glide
    implementation (libs.glide)
    //noinspection KaptUsageInsteadOfKsp
    kapt (libs.compiler)

    // Google Maps Location Services
    implementation (libs.play.services.location)
    implementation (libs.play.services.maps)

    // Dagger Core
    implementation (libs.dagger)
    kapt (libs.dagger.compiler)

    // Dagger Android
    api (libs.dagger.android)
    api (libs.dagger.android.support)
    kapt (libs.dagger.android.processor)

    // Easy Permissions
    implementation ("pub.devrel:easypermissions:3.0.0")

    // Timber
    implementation ("com.jakewharton.timber:timber:4.7.1")

    // MPAndroidChart
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")


    implementation ("android.arch.lifecycle:extensions:1.1.1")
}