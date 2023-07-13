package com.example.MovieCatalog.data.remote

import com.example.MovieCatalog.data.remote.dto.MovieDetailDto
import com.example.MovieCatalog.data.remote.dto.Movies_dto
import com.example.MovieCatalog.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {


    // https://www.omdbapi.com/?i=tt3896198&apikey=3759e23d

    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString: String ,
        @Query("apikey") apiKey: String = API_KEY
    ) : Movies_dto

    @GET(".")
    suspend fun getMoviesDetails(
        @Query("i") imdbID: String,
        @Query("apikey") apiKey: String = API_KEY
    ) : MovieDetailDto

}