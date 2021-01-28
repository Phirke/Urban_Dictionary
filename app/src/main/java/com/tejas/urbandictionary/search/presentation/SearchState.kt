package com.tejas.urbandictionary.search.presentation

import com.tejas.urbandictionary.common.network.entity.ErrorEntity
import com.tejas.urbandictionary.search.domain.entity.AutoCompleteResult

data class SearchState(
    val autoCompleteResults: List<AutoCompleteResult> = emptyList()
)

sealed class SearchEvent {
    class ErrorEvent(private val error: ErrorEntity) : SearchEvent()
}
