package com.xayah.databackup.ui.activity.main

import androidx.compose.animation.core.MutableTransitionState
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val isRemoteFileInitialized = MutableTransitionState(false)
}