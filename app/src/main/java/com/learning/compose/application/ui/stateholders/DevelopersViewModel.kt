package com.learning.compose.application.ui.stateholders

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.learning.compose.application.data.Result.Error
import com.learning.compose.application.data.Result.Success
import com.learning.compose.application.domain.model.Developer
import com.learning.compose.application.domain.usecase.GetDevelopersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DevelopersViewModel @Inject constructor(
    private val getDevelopersUseCase: GetDevelopersUseCase
) : ViewModel() {

    private val _developers = MutableLiveData<List<Developer>>()
    val developers: LiveData<List<Developer>>
        get() = _developers

    init {

        getMeliComponentDevelopers()
    }

    private fun getMeliComponentDevelopers() {

        getDevelopersUseCase().let { result ->
            when (result) {
                is Error -> Log.e(this.javaClass.simpleName, result.message!!)
                is Success -> _developers.value = result.data
            }
        }
    }
}
