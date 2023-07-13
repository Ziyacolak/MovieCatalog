package com.example.MovieCatalog.data.di

import com.example.MovieCatalog.data.remote.MovieAPI
import com.example.MovieCatalog.data.repository.MovieRepositoryImpl
import com.example.MovieCatalog.domain.repository.MovieRepository
import com.example.MovieCatalog.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.ByteArrayInputStream
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
 object AppModule {



     @Provides
     @Singleton
     fun providerMovieApi():MovieAPI {
         return Retrofit.Builder()
             .baseUrl(BASE_URL)
             .addConverterFactory(GsonConverterFactory.create())
             .build()
             .create(MovieAPI::class.java)
     }


    @Provides
    @Singleton
    fun provideMovieRepository(api: MovieAPI): MovieRepository {
        return MovieRepositoryImpl(api = api)
    }
}