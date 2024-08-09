package com.code.sample.di

import com.code.sample.utils.notifications.INotificationService
import com.code.sample.utils.notifications.NotificationService
import com.code.sample.utils.permissions.IPermissionService
import com.code.sample.utils.permissions.PermissionService
import org.koin.dsl.module


object AppModule {

    private val coreModules =
        listOf(
            CoroutinesModule.module,
            RepositoriesModule.module,
            LocalStorageModule.module,
            WebServiceModule.module
        )

    private val myModule = module {

        single<INotificationService> { NotificationService() }

        single<IPermissionService> { PermissionService() }

    }

    private val databaseModule = listOf(
        DatabaseModule.module
    )

    private val viewModelsModules = listOf(
        ViewModelsModule.module
    )

    private val useCasesModule = listOf(
        UseCasesModule.module
    )

    val modules =
        coreModules + myModule + viewModelsModules + useCasesModule + databaseModule
}