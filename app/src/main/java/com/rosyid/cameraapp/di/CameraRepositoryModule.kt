package com.rosyid.cameraapp.di

import com.rosyid.cameraapp.data.repository.CameraRepositoryImpl
import com.rosyid.cameraapp.domain.repository.CameraRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CameraRepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCameraRepositoryModule(
        cameraRepositoryImpl: CameraRepositoryImpl
    ): CameraRepository

}