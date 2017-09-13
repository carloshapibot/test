package Teste.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Teste_Teste : BuildType({
    uuid = "efe9626e-b2f4-4756-a232-96f16741a550"
    extId = "Teste_Teste"
    name = "teste"


    vcs {
        root(Teste.vcsRoots.Teste_Local)

        checkoutMode = CheckoutMode.ON_AGENT
    }

    steps {
        powerShell {
            name = "Teste"
            scriptMode = script {
                content = "#"
            }
        }
    }
})
