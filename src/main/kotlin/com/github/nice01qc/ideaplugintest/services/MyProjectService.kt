package com.github.nice01qc.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.nice01qc.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
