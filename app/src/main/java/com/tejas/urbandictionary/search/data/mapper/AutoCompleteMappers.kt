package com.tejas.urbandictionary.search.data.mapper

import arrow.core.Either
import com.tejas.urbandictionary.common.ext.failure
import com.tejas.urbandictionary.common.ext.success
import com.tejas.urbandictionary.common.network.alias.NetworkResponse
import com.tejas.urbandictionary.common.network.entity.ErrorEntity
import com.tejas.urbandictionary.search.data.source.dto.GetAutoCompleteResultsResponse
import com.tejas.urbandictionary.search.domain.entity.AutoCompleteResult
import retrofit2.Response
import timber.log.Timber

fun Response<GetAutoCompleteResultsResponse>.toNetworkResponse(): NetworkResponse<List<AutoCompleteResult>> {
    return if (isSuccessful) {
        val list = body()?.results?.map { autoComplete ->
            AutoCompleteResult(
                preview = autoComplete.preview,
                term = autoComplete.term
            )
        }
        if (list != null) {
            Either.success(list)
        } else {
            Either.failure(ErrorEntity())
        }
    } else {
        Timber.e(errorBody()?.string())
        Either.failure(ErrorEntity())
    }
}
