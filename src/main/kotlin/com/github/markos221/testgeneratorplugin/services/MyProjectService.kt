package com.github.markos221.testgeneratorplugin.services

import com.github.markos221.testgeneratorplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
