/*
 * Copyright (c) 2019 Oky Nugroho Kusumo - Open Source Project
 */

package com.okynk.archproject.core.repository.database

import com.okynk.archproject.core.datasource.database.DatabaseDataSource
import io.reactivex.Completable

class DatabaseRepositoryImpl(private val dataSource: DatabaseDataSource) :
    DatabaseRepository {
    override fun clear(): Completable {
        return dataSource.clear()
    }
}