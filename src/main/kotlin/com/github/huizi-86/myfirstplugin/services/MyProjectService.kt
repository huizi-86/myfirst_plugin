package com.github.huizi-86.myfirstplugin.services

import com.intellij.openapi.project.Project
import com.github.huizi-86.myfirstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
