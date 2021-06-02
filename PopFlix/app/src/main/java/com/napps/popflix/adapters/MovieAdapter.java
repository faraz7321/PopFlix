package com.napps.popflix.adapters;

import com.napps.popflix.models.DetailActivity;
import com.napps.popflix.models.Movie;

import java.util.List;

public class MovieAdapter {
    List<Movie> movies;
    String context;

    public MovieAdapter(String context, List<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    public class ViewHolder {


    }
}


