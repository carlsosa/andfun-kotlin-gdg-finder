package com.example.android.gdgfinder.add

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;

class AddGdgViewModel : ViewModel() {


    private var _showSnackbarEvent = MutableLiveData<Boolean?>()


    val showSnackBarEvent: LiveData<Boolean?>
        get() = _showSnackbarEvent


    fun doneShowingSnackbar() {
        _showSnackbarEvent.value = null
    }

    fun onSubmitApplication() {
        _showSnackbarEvent.value = true

    }
}
