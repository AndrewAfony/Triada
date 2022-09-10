package com.andrewafony.triada

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andrewafony.triada.domain.Timer
import kotlinx.coroutines.flow.*

class MainViewModel: ViewModel() {

    private val timer = Timer.Base()

    private val _time = MutableStateFlow(60)
    val time: StateFlow<Int> = _time

    fun startTimer() {
        timer.start()
            .onEach {
                _time.value = it
            }.launchIn(viewModelScope)
    }

    fun pauseTimer() {
        timer.pause()
    }
}