package com.ronit.androidkotlincleanarchitecture

import android.app.Application
import com.pacoworks.rxpaper2.RxPaperBook
import io.reactivex.plugins.RxJavaPlugins
import timber.log.Timber

class App : Application() {


    override fun onCreate() {
        super.onCreate()


        initTimber()
        initRxPaper()
        initRxJavaPluginsErrorHandler()
    }


    private fun initTimber(){
        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun initRxPaper() = RxPaperBook.init(this)

    private fun initRxJavaPluginsErrorHandler() = RxJavaPlugins.setErrorHandler { Timber.e(it) }

}