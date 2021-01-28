package com.tejas.urbandictionary.search.data.repository

import com.tejas.urbandictionary.common.network.alias.NetworkResponse
import com.tejas.urbandictionary.search.data.mapper.toNetworkResponse
import com.tejas.urbandictionary.search.data.source.AutoCompleteRemoteSource
import com.tejas.urbandictionary.search.domain.entity.AutoCompleteResult
import com.tejas.urbandictionary.search.domain.repository.AutoCompleteRepository
import javax.inject.Inject

class AutoCompleteRepositoryImpl @Inject constructor(
    private val autoCompleteRemoteSource: AutoCompleteRemoteSource
) : AutoCompleteRepository {

    override suspend fun getAutoCompleteResults(input: String): NetworkResponse<List<AutoCompleteResult>> {
        val response = autoCompleteRemoteSource.getAutoCompleteResults(input)
        return response.toNetworkResponse()
    }
}
