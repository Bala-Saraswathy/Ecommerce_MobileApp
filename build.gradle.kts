// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()

    }
    dependencies {
        val nav_version="2.6.0"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
        classpath("com.google.gms:google-services:4.3.15")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.1")
        // classpath("com.google.dagger.hilt.android") version "2.44" apply false
    }

//allprojects{
    //  repositories{
    //    google()
    //}
//}
}


    plugins {
        id("com.android.application") version "8.1.0" apply false
        id("org.jetbrains.kotlin.android") version "1.8.10" apply false
        id("com.google.dagger.hilt.android") version "2.44" apply false
    }


