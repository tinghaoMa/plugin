package com.asgradle.mth

import org.gradle.api.Plugin
import org.gradle.api.Project;


class ApkDistPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.extensions.create('apkdistconf', ApkDistExtension);
        project.afterEvaluate {

            if (!project.android) {
                throw new IllegalStateException('Must apply \'com.android.application\' or \'com.android.library\' first!')
            }

            if (project.apkdistconf.nameMap == null || project.apkdistconf.destDir == null) {
                project.logger.info('Apkdist conf should be set!')
                return
            }
            Closure nameMap = project['apkdistconf'].nameMap
            String destDir = project['apkdistconf'].destDir

            project.android.applicationVariants.all { variant ->
                variant.outputs.each { output ->
                    File file = output.outputFile
                    output.outputFile = new File(destDir, nameMap('插件测试 回调--'+file.getName()))
                    println 'file.getName = ' + file.getName()
                    println 'output.outputFile path= ' + output.outputFile
                }
            }
        }
    }
}
