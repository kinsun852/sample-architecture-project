package com.okynk.archproject.core.di.component

import com.okynk.archproject.core.di.module.ActivityPresenterModule
import com.okynk.archproject.core.di.scope.PerActivity
import dagger.Component

@PerActivity
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityPresenterModule::class]
)
interface ActivityComponent {

}