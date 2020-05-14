package com.kanneki.githubusers.provider

import android.app.Application
import android.content.Context

class ApplicationContextProvider: Application() {

    companion object {
        var _context: Application? = null
        fun getContext(): Context = _context!!
    }


    override fun onCreate() {
        super.onCreate()
        _context = this
    }
}