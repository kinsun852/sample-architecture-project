/*
 * Copyright (c) 2018 Oky Nugroho Kusumo - Open Source Project
 */

package com.okynk.archproject.core.mapper

import com.okynk.archproject.core.api.model.response.ListWrapperResponse
import com.okynk.archproject.core.api.model.response.ProfileResponse
import com.okynk.archproject.core.entity.PaginatedListEntity
import com.okynk.archproject.core.entity.ProfileEntity
import com.okynk.archproject.core.util.parseInt

class ProfileListResponseEntityMapper(val profileMapper: Mapper<ProfileResponse, ProfileEntity>) :
    Mapper<ListWrapperResponse<ProfileResponse>, PaginatedListEntity<ProfileEntity>> {
    override fun map(from: ListWrapperResponse<ProfileResponse>): PaginatedListEntity<ProfileEntity> {
        val listEntity = from.results.map { profileMapper.map(it) }
        return PaginatedListEntity(
            listEntity,
            parseInt(from.info.results),
            parseInt(from.info.page)
        )
    }
}