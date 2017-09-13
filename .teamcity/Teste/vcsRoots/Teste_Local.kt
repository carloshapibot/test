package Teste.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Teste_Local : GitVcsRoot({
    uuid = "a333fe03-87a2-4c05-ad76-3699c592d9e7"
    extId = "Teste_Local"
    name = "Local"
    url = "https://github.com/carloshapibot/test.git"
    pushUrl = "https://github.com/carloshapibot/test.git"
    branch = "master"
    branchSpec = "+:refs/heads/(master)"
    agentCleanPolicy = GitVcsRoot.AgentCleanPolicy.ALWAYS
    authMethod = password {
        userName = "carloshapibot"
        password = "credentialsJSON:3f341982-f92a-4c8f-8e6f-57a1c2df2a3c"
    }
})
