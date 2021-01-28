package com.tejas.urbandictionary.search.domain.repository

import com.tejas.urbandictionary.common.network.alias.NetworkResponse
import com.tejas.urbandictionary.search.domain.entity.AutoCompleteResult

interface AutoCompleteRepository {
    suspend fun getAutoCompleteResults(input: String): NetworkResponse<List<AutoCompleteResult>>
}
