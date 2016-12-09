package org.gradle

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.tasks.TaskAction

class HelloPlugin implements Plugin<Project> {

    @TaskAction
    void apply(Project target) {
        target.logger.error("hellohellohellohellohellohellohe" +
                "llohellohellohellohellohellohellohellohellohellohellohello")
    }
}
