package com.dedge.login.periphery.service

import com.dedge.login.core.boundary.enter.ValidateAuthenticationDataService
import io.reactivex.Single

class JsonSchemaValidateAuthenticationDataService :ValidateAuthenticationDataService {
    override fun validate(user:String,password:String):Single<Boolean>{
        return Single.just(true)
    }
}