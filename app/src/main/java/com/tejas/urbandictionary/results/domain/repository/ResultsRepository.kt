package com.tejas.urbandictionary.results.domain.repository

import com.tejas.urbandictionary.common.network.alias.NetworkResponse
import com.tejas.urbandictionary.results.domain.entity.ResultEntity

interface ResultsRepository {
    suspend fun getResults(term: String): NetworkResponse<List<ResultEntity>>
    suspend fun getRandomResults(): NetworkResponse<List<ResultEntity>>
}
