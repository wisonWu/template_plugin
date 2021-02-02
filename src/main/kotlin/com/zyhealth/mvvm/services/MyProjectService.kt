package com.zyhealth.mvvm.services

import com.intellij.openapi.project.Project
import com.zyhealth.mvvm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
