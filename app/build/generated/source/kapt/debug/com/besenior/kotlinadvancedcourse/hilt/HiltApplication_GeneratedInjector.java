package com.besenior.kotlinadvancedcourse.hilt;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = HiltApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface HiltApplication_GeneratedInjector {
  void injectHiltApplication(HiltApplication hiltApplication);
}
