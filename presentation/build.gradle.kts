@file:Suppress("UnstableApiUsage")

plugins {
    `android-base-lib`
    id(Deps.BuildPlugins.googleMapsSecrets)
}

android {
    namespace = "it.unibolss.smartparking.presentation"
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Deps.BuildPlugins.Versions.compilerExtensionVersion
    }
}

dependencies {
    implementation(project(":domain"))

    implementation(Deps.Libraries.koin)
    implementation(Deps.Libraries.koinAndroid)
    implementation(Deps.Libraries.koinAndroidCompose)

    implementation(Deps.Libraries.androidXCore)
    implementation(Deps.Libraries.androidXLifecycleRuntime)
    implementation(Deps.Libraries.androidXActivity)
    implementation(Deps.Libraries.androidXComposeUi)
    implementation(Deps.Libraries.androidXComposeUiToolingPreview)
    implementation(Deps.Libraries.androidXComposeMaterial)
    implementation(Deps.Libraries.androidXComposeNavigation)
    implementation(Deps.Libraries.androidLifecycleCompose)

    implementation(Deps.Libraries.googleMaps)
    implementation(Deps.Libraries.playServicesMaps)
    implementation(Deps.Libraries.playServicesLocation)
    implementation(Deps.Libraries.accompanistPermissions)

    testImplementation(Deps.TestLibraries.junit)
    testImplementation(Deps.TestLibraries.koin)
    testImplementation(Deps.TestLibraries.kotlinCoroutines)
    testImplementation(Deps.TestLibraries.mockk)
    testImplementation(Deps.TestLibraries.turbine)
    testImplementation(Deps.TestLibraries.espressoCore)
    testImplementation(Deps.TestLibraries.roboelectric)
    testImplementation(Deps.TestLibraries.uiTestJunit4)
    testImplementation(Deps.DebugLibraries.composeUiTestManifest)

    debugImplementation(Deps.DebugLibraries.composeUiTooling)
    debugImplementation(Deps.DebugLibraries.composeUiTestManifest)
}
