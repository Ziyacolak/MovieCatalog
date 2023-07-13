package com.example.MovieCatalog.domain.repository

import com.example.MovieCatalog.data.remote.dto.MovieDetailDto
import com.example.MovieCatalog.data.remote.dto.Movies_dto
import com.example.MovieCatalog.data.remote.dto.Search

interface MovieRepository {
    suspend fun getMovie(search: String): Movies_dto

    suspend fun getMovieDetails(imdbID: String): MovieDetailDto

}