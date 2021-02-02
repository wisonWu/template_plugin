package com.github.wisonwu.templateplugin.services

import com.github.wisonwu.templateplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
