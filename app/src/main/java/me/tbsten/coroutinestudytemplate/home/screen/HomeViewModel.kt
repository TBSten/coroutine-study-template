package me.tbsten.coroutinestudytemplate.home.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class HomeViewModel @Inject constructor() : ViewModel() {
    suspend fun onTestButtonClick() {
        // TODO
    }
}
