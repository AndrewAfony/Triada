package com.andrewafony.triada

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow

class MainViewModel: ViewModel() {

    private val _time = MutableStateFlow(60)
    val time: StateFlow<Int> = _time

    suspend fun handleTime() = flow {
        val startingTime = 60
        var currentValue = startingTime
        emit(startingTime)
        while (currentValue >= 0) {
            delay(1000L)
            currentValue--
            emit(currentValue)
        }
    }.collectLatest {
        _time.value = it
    }
}