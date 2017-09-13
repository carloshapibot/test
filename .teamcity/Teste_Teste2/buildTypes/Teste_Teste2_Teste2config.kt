package Teste_Teste2.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Teste_Teste2_Teste2config : BuildType({
    uuid = "63903218-a68f-4fd3-84b0-21d961e6e895"
    extId = "Teste_Teste2_Teste2config"
    name = "teste2_config"

    vcs {
        root(Teste.vcsRoots.Teste_Local)

    }

    steps {
        powerShell {
            name = "teste step"
            enabled = false
            scriptMode = script {
                content = "#"
            }
        }
    }
})
