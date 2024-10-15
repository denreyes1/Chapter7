package com.denreyes.chapter7.views

import com.denreyes.chapter7.data.Cat

data class PetsUIState(
    val isLoading: Boolean = false,
    val pets: List<Cat> = emptyList(),
    val error: String? = null
)