package com.yangyan.xxp.yangyannew.mvp.presenter

import android.app.Application

import com.jess.arms.integration.AppManager
import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.mvp.BasePresenter
import com.jess.arms.http.imageloader.ImageLoader

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
@FragmentScope
class MinePresenter @Inject
constructor(model: MineContract.Model, rootView: MineContract.View)
    : BasePresenter<MineContract.Model, MineContract.View>(model, rootView) {
    @Inject
    lateinit var mErrorHandler: RxErrorHandler
    @Inject
    lateinit var mApplication: Application
    @Inject
    lateinit var mImageLoader: ImageLoader
    @Inject
    lateinit var mAppManager: AppManager
    @Inject
    lateinit var mAdapter: MineCollectAdapter
    @Inject
    lateinit var mDatas: MutableList<CollectInfo>

    /**
     * 获取收藏信息
     */
    fun getCollectList() {
        for (i in 1..5) {
            mDatas.add(CollectInfo("", "", "", ""))
        }
        mAdapter.notifyDataSetChanged()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
