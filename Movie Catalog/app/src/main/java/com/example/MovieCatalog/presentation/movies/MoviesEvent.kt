package com.example.MovieCatalog.presentation.movies

sealed class MoviesEvent {
    data class Search(val searchString : String) : MoviesEvent()
}
