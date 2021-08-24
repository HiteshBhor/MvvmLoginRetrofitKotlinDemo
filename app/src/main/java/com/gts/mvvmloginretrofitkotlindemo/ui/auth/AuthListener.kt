package com.gts.mvvmloginretrofitkotlindemo.ui.auth

interface AuthListener {

    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}