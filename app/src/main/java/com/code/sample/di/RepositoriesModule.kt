package com.code.sample.di


import com.code.sample.repositories.user.IUserDataSource
import com.code.sample.repositories.user.UserLocalDataSource
import com.code.sample.repositories.user.UserRemoteDataSource
import com.code.sample.repositories.user.UserRepository
import org.koin.dsl.module

object RepositoriesModule {

    val module = module {

        //Pokemon Repository

        single<IUserDataSource.Repository> { UserRepository(get(), get()) }

        single<IUserDataSource.Remote> { UserRemoteDataSource(get()) }

        single<IUserDataSource.Local> { UserLocalDataSource() }

    }
}