package com.example.basas.workoutsadvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by basas on 05-01-2018.
 */

public class WorkoutExpert {
    List<String> getWorkouts (String workouttypes)
    {
        List<String> workout = new ArrayList<String>();

        if(workouttypes.equals("Chest"))
        {
            workout.add("Bench Press");
            workout.add("Cable Flys");
        }
        else if (workouttypes.equals("Triceps"))
        {
            workout.add("Tricep Extension");
            workout.add("Tricep PullDown");

        }
        else if (workouttypes.equals("Shoulders"))
        {
         workout.add("Military Press");
         workout.add("Lateral Shoulder Raise");
        }

        else if(workouttypes.equals("Biceps"))
        {
            workout.add("Bicep Curl");
            workout.add("Concentration Curl");
        }
        return workout;
    }
}
