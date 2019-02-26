package com.dedge.login.periphery.service

import com.dedge.login.core.boundary.enter.ValidateAuthenticationDataService
import org.junit.Before

import org.junit.Test

import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.koin.test.inject

class JsonSchemaValidateAuthenticationDataServiceTest: KoinTest {
    @Before
    fun setUp() {
        val myModule = module{
            // Define a single instance
            single { JsonSchemaValidateAuthenticationDataService() }
        }

        startKoin {
            modules(myModule)
        }
        //startKoin(listOf(myModule))
    }

    @Test
    fun myTest() {
        val c = { x:Boolean -> println("Aqui está el resultado:" + x) }

        val objeInjected : JsonSchemaValidateAuthenticationDataService by inject()
        objeInjected.validate("gros","password")
            .subscribe(c);

        //println(objeInjected.validate())
        assert(1==1)
    }

    /*
    @Test
    fun addition_isCorrect() {
        assert(1==1)
    }
    */
}