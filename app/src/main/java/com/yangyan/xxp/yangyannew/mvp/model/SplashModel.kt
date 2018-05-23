package com.yangyan.xxp.yangyannew.mvp.model

import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel
import com.yangyan.xxp.yangyannew.mvp.contract.SplashContract
import javax.inject.Inject

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/5/23
 * Description :
 */
@ActivityScope
class SplashModel @Inject
constructor(repositoryManager: IRepositoryManager)
    : BaseModel(repositoryManager),SplashContract.Model {
}