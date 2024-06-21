package com.besenior.kotlinadvancedcourse.hilt.module;

import android.app.Application;
import androidx.room.Room;
import com.besenior.kotlinadvancedcourse.room.AppDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Named;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/hilt/module/AppModule;", "", "()V", "provideDatabase", "Lcom/besenior/kotlinadvancedcourse/room/AppDatabase;", "application", "Landroid/app/Application;", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.besenior.kotlinadvancedcourse.hilt.module.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.besenior.kotlinadvancedcourse.room.AppDatabase provideDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
}