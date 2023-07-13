package com.example.MovieCatalog.presentation.movie_detail

import com.example.MovieCatalog.domain.model.MovieDetail

data class MovieDetailState (
    val  isLoading: Boolean = false,
    val movie : MovieDetail? = null,
    val error : String = ""
)