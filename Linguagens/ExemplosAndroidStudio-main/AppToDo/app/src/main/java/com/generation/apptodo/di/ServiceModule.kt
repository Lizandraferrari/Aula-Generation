package com.generation.apptodo.di

import com.generation.apptodo.api.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Provides
    @Singleton

    fun returnRepository(): Repository{
        return Repository()
    }

}