package com.example.MovieCatalog.data.repository

import com.example.MovieCatalog.data.remote.MovieAPI
import com.example.MovieCatalog.data.remote.dto.MovieDetailDto
import com.example.MovieCatalog.data.remote.dto.Movies_dto
import com.example.MovieCatalog.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api: MovieAPI) : MovieRepository {
    override suspend fun getMovie(search: String): Movies_dto {
        return api.getMovies(searchString = search)
    }

    override suspend fun getMovieDetails(imdbID: String): MovieDetailDto {
       return api.getMoviesDetails(imdbID = imdbID)
    }

}
