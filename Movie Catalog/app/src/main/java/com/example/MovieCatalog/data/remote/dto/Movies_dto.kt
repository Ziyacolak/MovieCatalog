package com.example.MovieCatalog.data.remote.dto

import com.example.MovieCatalog.domain.model.Movie

data class Movies_dto(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)

fun Movies_dto.toMovieList(): List<Movie> {
    return Search.map{search -> Movie(search.Poster,search.Title,search.Year,search.imdbID) }
}