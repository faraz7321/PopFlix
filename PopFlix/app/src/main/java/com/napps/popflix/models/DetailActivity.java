package com.napps.popflix.models;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.napps.popflix.R;
import org.parceler.Parcels;

/**
 *
 * @author Faraz Ahmad
 */
public class DetailActivity extends AppCompatActivity {

    TextView MovieTitle;
    TextView MovieOverview;
    RatingBar MovieRating;
    private static final String YT_KEY = "AIzaSyAZbZhPi_D-y0M9tyl_NDuspAH8srVHhn4";

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // Setting Dynamic UI Color
        setContentView(R.layout.activity_detail);
        setContentView(R.layout.activity_detail);
        @SuppressLint("CutPasteId")
        View someView = findViewById(R.id.linearLayout);
        View root = someView.getRootView();
        root.setBackgroundColor(getResources().getColor(R.color.UIblack));
        @SuppressLint("CutPasteId")
        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        MovieTitle = findViewById(R.id.DetailedMovieTitle);
        MovieOverview = findViewById(R.id.DetailedMovieOver);
        MovieRating = findViewById(R.id.MovieRating);
        Movie movie = Parcels.unwrap(getIntent().getParcelableExtra("movie"));
        assert movie != null; //Movie may produce null pointer exception.//
        MovieTitle.setText(movie.getTitle());
        MovieOverview.setText(movie.getOverview());
        MovieRating.setRating((float) movie.getRating());
        // parse out extra additional data post
    }
}
