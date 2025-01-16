plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.mappingmodule"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.mappingmodule"
        minSdk = 31
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(files("lib\\BaiduLBS_Android.jar"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    //动态权限请求
//    implementation ("com.tbruyelle.rxpermissions2:rxpermissions:0.9.4@aar")
    implementation ("com.tbruyelle.rxpermissions2:rxpermissions:0.9.4@aar")
//    implementation ("com.tbruyelle.rxpermissions2:rxpermissions:0.10.2@aar")
    implementation ("io.reactivex.rxjava2:rxandroid:2.0.2")
    implementation ("io.reactivex.rxjava2:rxjava:2.0.0")
    implementation("com.squareup.okhttp3:logging-interceptor:3.14.7")
}