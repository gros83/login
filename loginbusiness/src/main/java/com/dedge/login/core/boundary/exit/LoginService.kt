package com.dedge.login.core.boundary.exit
import io.reactivex.Single

interface LoginService {
    //fun configuration(data:Map<String,Object>)
    fun login(user:String, password:String):Single<Map<String,Object>>
    fun getUserInfo():Single<Map<String,Object>>
    fun getToken():Single<Map<String,Object>>
}