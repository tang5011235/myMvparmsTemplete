package com.github.tang5011235.mymvparmstemplete.services

import com.intellij.openapi.project.Project
import com.github.tang5011235.mymvparmstemplete.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
