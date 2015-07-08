package com.example.polycap.finalbootcampapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);


        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<list> lists = new ArrayList<list>();
        {
            lists.add(new list(
                    "Automated Farming System",
                    "an autonomous machine that can plant, fertilize, irrigate and harvest"
            ));


            lists.add(new list(
                    "Project Sahara",
                    "To revert any desert to a fertile equatorial climate"
            ));

            lists.add(new list(
                    "PolyOcracy",
                    "A new government system that encompasses the technology and social knowledge that we have acquired in past 100's of years "
            ));


            lists.add(new list(
                    "Flying Exoskeleton Suit",
                    "A suit that is safe,can efficiently fly and repair the human body"
            ));

            lists.add(new list(
                    "NanoHealth",
                    "Using advancements in nanotechnology to build a computer that tracks and measure the level of homeostasis each vital cell is at"
            ));

            lists.add(new list(
                    "Civic Engagement App",
                    "An app designed to facilitates the governing process of PolyOcracy by allowing people to vote on national policies right from their phone"
            ));

            lists.add(new list(
                    "Poly.Inc",
                    "A company that creates a culture that transcends borders and unites people to a common goal"
            ));

            lists.add(new list(
                    "Create Paradise",
                    "Rebuild Africa to being the capital city of Earth"
            ));

            mAdapter = new MainAdapter(lists);
            mRecyclerView.setAdapter(mAdapter);
        }

    }
}