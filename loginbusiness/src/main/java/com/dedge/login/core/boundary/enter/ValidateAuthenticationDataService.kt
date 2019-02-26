package com.dedge.login.core.boundary.enter

import io.reactivex.Single

interface ValidateAuthenticationDataService {
    fun validate(user:String,password:String):Single<Boolean>
}