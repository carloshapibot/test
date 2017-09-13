package Teste

import Teste.buildTypes.*
import Teste.vcsRoots.*
import Teste.vcsRoots.Teste_Local
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "a131c6f9-e01b-4d96-8d36-622c9dc2e767"
    extId = "Teste"
    parentId = "_Root"
    name = "TESTE"

    vcsRoot(Teste_Local)

    buildType(Teste_Teste)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = Teste_Local.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            param("credentialsStorageType", "credentialsJSON")
        }
    }
})
