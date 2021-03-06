package com.tejas.urbandictionary.results.domain.usecase

import com.tejas.urbandictionary.common.network.alias.NetworkResponse
import com.tejas.urbandictionary.results.domain.entity.ResultEntity
import com.tejas.urbandictionary.results.domain.repository.ResultsRepository
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class GetRandomResults @Inject constructor(
    private val resultsRepository: ResultsRepository
) {
    suspend operator fun invoke(): NetworkResponse<List<ResultEntity>> {
        return resultsRepository.getRandomResults()
    }
}
