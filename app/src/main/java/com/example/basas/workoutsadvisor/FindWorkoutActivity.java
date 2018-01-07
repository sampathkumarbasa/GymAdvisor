package com.example.basas.workoutsadvisor;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;


import java.util.List;


public class FindWorkoutActivity extends AppCompatActivity {

    private WorkoutExpert expert = new WorkoutExpert();

    Button b;

    RelativeLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_find_workout);

        final TextView workouts = (TextView) findViewById(R.id.workouts);
        final Spinner workoutType = (Spinner) findViewById(R.id.workoutType);
        mainLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        b = (Button) findViewById(R.id.findworkout);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String workout = String.valueOf(workoutType.getSelectedItem());
                workouts.setText(workout);
                List<String> workoutList = expert.getWorkouts(workout);

                StringBuilder workoutsFormatted = new StringBuilder();
                for(String work : workoutList){
                    workoutsFormatted.append(work).append('\n').append('\n');
                }
                workouts.setText(workoutsFormatted);


            }


        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_find_workout,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.menu_red:

                if(item.isChecked())

                    item.setChecked(false);


                else
                    item.setChecked(true);
                mainLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.menu_blue:

                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.menu_green:

                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menu_white:

                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainLayout.setBackgroundColor(Color.WHITE);
                return true;

            default: return super.onOptionsItemSelected(item);

        }


    }




}




