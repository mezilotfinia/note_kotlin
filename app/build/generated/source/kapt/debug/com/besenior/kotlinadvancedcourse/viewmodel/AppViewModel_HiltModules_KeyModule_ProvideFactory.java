// Generated by Dagger (https://dagger.dev).
package com.besenior.kotlinadvancedcourse.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static AppViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(AppViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final AppViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new AppViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
