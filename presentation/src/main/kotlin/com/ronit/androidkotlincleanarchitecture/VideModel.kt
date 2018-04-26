package com.ronit.androidkotlincleanarchitecture

enum class DataState { LOADING, SUCCES, ERROR }

data class Data<out T> constructor(val dataState: DataState, val data: T? = null, val message: String? = null)

