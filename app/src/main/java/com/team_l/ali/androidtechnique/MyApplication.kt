package com.team_l.ali.androidtechnique

import android.app.Application
import com.squareup.leakcanary.LeakCanary

/**
 * Created by ali on 4/30/2018.
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
    }
}