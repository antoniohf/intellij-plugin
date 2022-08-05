package com.github.antoniohf.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.antoniohf.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
