package com.napps.popflix.models;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 *
 * @author Faraz Ahmad
 */
@Parcel
public class Movie {

    String backDropPath; // Image of the movie poster
    String posterPath; // Image of the movie poster
    String title; // Movie Title
    String overview; // Movie Description
    double rating; // Movie Rating

    /**
     *
     */
    public Movie() {
    }

    /**
     *
     * @param jsonObject
     * @throws JSONException
     */
    public Movie(JSONObject jsonObject) throws JSONException {
        // Parsing JSON Array Approved
        backDropPath = jsonObject.getString("backdrop_path");
        posterPath = jsonObject.getString("poster_path");
        title = jsonObject.getString("title");
        overview = jsonObject.getString("overview");
        rating = jsonObject.getDouble("vote_average");

    }

    /**
     *
     * @param movieJsonArray
     * @return
     * @throws JSONException
     */
    public static List<Movie> fromJsonArray(JSONArray movieJsonArray) throws JSONException {
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < movieJsonArray.length(); i++) {
            movies.add(new Movie(movieJsonArray.getJSONObject(i)));
        }
        return movies;
    }

    /**
     *
     * @return
     */
    public String getPosterPath() {
        return String.format("https://image.tmdb.org/t/p/w342/%s", posterPath);
    }

    /**
     *
     * @return
     */
    public String getBackdroppath() {
        return String.format("https://image.tmdb.org/t/p/w342/%s", backDropPath);
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return
     */
    public String getOverview() {
        return overview;
    }

    /**
     *
     * @return
     */
    public double getRating() {
        return rating;
    }
}
