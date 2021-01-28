package com.tejas.urbandictionary.common.network.alias

import arrow.core.Either
import com.tejas.urbandictionary.common.network.entity.ErrorEntity

typealias NetworkResponse<T> = Either<ErrorEntity, T>
