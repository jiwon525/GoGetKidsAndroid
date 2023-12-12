package com.example.kotlin.ui
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

//my default ui screen state
data class UserInputScreenState(
    var nameEntered : String = "",
    var pwEntered : String = "",
    var roleSelected : String = "",
    var buttonClicked : Boolean = false
)
class UserInputViewModel : ViewModel() {

    var uiState = mutableStateOf(UserInputScreenState())
    fun onEvent(event: UserDataUiEvents){
        when (event){
            is UserDataUiEvents.ButtonClicked -> {
                uiState.value = uiState.value.copy(
                    nameEntered = event.name,
                    pwEntered = event.pw,
                    roleSelected = event.roleValue
                )
            }
        }
    }
}


sealed class UserDataUiEvents{
    data class ButtonClicked(val name:String,
        val pw:String,
        val roleValue:String,
        val button:Boolean):UserDataUiEvents()
}