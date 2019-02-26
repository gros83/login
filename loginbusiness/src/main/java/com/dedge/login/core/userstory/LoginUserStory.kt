package com.dedge.login.core.userstory

import com.dedge.login.core.boundary.exit.LoginService
import io.reactivex.Single

class LoginUserStory : LoginService{
    override fun login(user:String, password:String): Single<Map<String, Object>> {
        //validateAuthenticationDataService.validate(user,password)
        //authenticateService.login(user,password)
        return Single.just(HashMap<String,Object>())
    }

    override fun getUserInfo(): Single<Map<String, Object>> {
        //authenticateService.getUserInfo()
        return Single.just(HashMap<String,Object>())
    }

    override fun getToken(): Single<Map<String, Object>> {
        //authenticateService.getToken()
        return Single.just(HashMap<String,Object>())
    }
}