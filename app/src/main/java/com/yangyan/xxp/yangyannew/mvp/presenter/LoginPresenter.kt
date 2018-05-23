package com.yangyan.xxp.yangyannew.mvp.presenter

import android.app.Application

import com.jess.arms.integration.AppManager
import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.mvp.BasePresenter
import com.jess.arms.http.imageloader.ImageLoader
import com.yangyan.xxp.yangyannew.mvp.contract.LoginContract

import me.jessyan.rxerrorhandler.core.RxErrorHandler

import javax.inject.Inject

import com.yangyan.xxp.yangyannew.mvp.contract.MainContract
import com.yangyan.xxp.yangyannew.mvp.contract.MineContract
import com.yangyan.xxp.yangyannew.mvp.model.entity.CollectInfo
import com.yangyan.xxp.yangyannew.mvp.ui.adapter.MineCollectAdapter

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/5/21
 * Description : 个人
 */
@ActivityScope
class LoginPresenter @Inject
constructor(model: LoginContract.Model, rootView: LoginContract.View)
    : BasePresenter<LoginContract.Model, LoginContract.View>(model, rootView) {
    @Inject
    lateinit var mErrorHandler: RxErrorHandler
    @Inject
    lateinit var mApplication: Application
    @Inject
    lateinit var mImageLoader: ImageLoader
    @Inject
    lateinit var mAppManager: AppManager
    @Inject


    override fun onDestroy() {
        super.onDestroy()
    }
}
