package com.asgradle.local;

import org.gradle.api.Plugin
import org.gradle.api.Project

public class LocalPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "========================"
        println "这是第二个本地插件插件!"
        println "========================"
    }
}