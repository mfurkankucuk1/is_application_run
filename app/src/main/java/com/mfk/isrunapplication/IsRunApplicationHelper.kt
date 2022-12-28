package com.mfk.isrunapplication

import android.app.ActivityManager
import android.content.Context
import android.content.Context.ACTIVITY_SERVICE


/**
 * Created by M.Furkan KÜÇÜK on 23.12.2022
 **/
object IsRunApplicationHelper {

    fun isRunForegroundThisApplication(context: Context): Boolean {
        val manager = context.getSystemService(ACTIVITY_SERVICE) as ActivityManager
        val runningApplicationTaskInformation = manager.getRunningTasks(1)
        val componentInformation = runningApplicationTaskInformation[0].topActivity
        componentInformation?.let { info ->
            if (info.packageName == context.packageName) {
                return true
            }
        }
        return false
    }

}