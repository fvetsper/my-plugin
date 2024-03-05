package com.github.fvetsper.myplugin.listeners

import com.intellij.openapi.application.ApplicationActivationListener
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.wm.IdeFrame

internal class MyApplicationActivationListener : ApplicationActivationListener {

    override fun applicationActivated(ideFrame: IdeFrame) {
        thisLogger().warn("123123 Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
