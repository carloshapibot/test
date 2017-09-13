package Teste_Teste2

import Teste_Teste2.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "5e29e664-128c-4e3a-b905-d70c9910a2d0"
    extId = "Teste_Teste2"
    parentId = "Teste"
    name = "teste2"

    buildType(Teste_Teste2_Teste2config)
})
