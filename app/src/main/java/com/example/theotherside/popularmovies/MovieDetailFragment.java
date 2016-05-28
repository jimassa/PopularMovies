package com.example.theotherside.popularmovies;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by theotherside on 5/28/16.
 */
public class MovieDetailFragment extends Fragment {

    private Movie mMovie;
    TextView titleTextview,imageTextview,overviewTextview,ratingTextview,releaseTextview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_movie_detail,container,false);

        Intent detailIntent = getActivity().getIntent();
        mMovie = detailIntent.getParcelableExtra(MovieListFragment.EXTRA_MOVIES);

        titleTextview = (TextView) rootView.findViewById(R.id.movie_title);
        imageTextview = (TextView) rootView.findViewById(R.id.movie_image);
        overviewTextview = (TextView) rootView.findViewById(R.id.movie_overview);
        ratingTextview = (TextView) rootView.findViewById(R.id.movie_rating);
        releaseTextview = (TextView) rootView.findViewById(R.id.movie_release);

        titleTextview.setText(mMovie.getTitle());
        imageTextview.setText(mMovie.getImage());
        overviewTextview.setText(mMovie.getOverview());
        ratingTextview.setText(mMovie.getRating());
        releaseTextview.setText(mMovie.getReleaseDate());

        return rootView;
    }
}
