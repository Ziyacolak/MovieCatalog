package com.example.MovieCatalog.presentation.movies

import com.example.MovieCatalog.domain.model.Movie

data class MoviesState(
    val isLoading: Boolean = false,
    val movies: List<Movie> = emptyList(),
    val errorMessage: String = "",
    val search: String = "Batman",
)

