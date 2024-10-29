package com.denreyes.chapter7

import android.app.Application
import com.denreyes.chapter7.di.appModules
import org.koin.core.context.startKoin

class ChapterSevenApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(appModules)
        }
    }
}