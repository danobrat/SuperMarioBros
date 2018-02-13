package com.example.android.supermariobros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.supermariobros.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  adds 3 points to the score
     */
    public void add3 (View view) {

        scoreTeamA=scoreTeamA+3;
        displayForTeamA (scoreTeamA);

    }
    /**
     *  adds 2 points to the score
     */
    public void add2 (View view) {

        scoreTeamA=scoreTeamA+2;
        displayForTeamA (scoreTeamA);

    } /**
     *  adds 1 points to the score
     */
    public void add1 (View view) {

        scoreTeamA=scoreTeamA+1;
        displayForTeamA (scoreTeamA);

    }
    /** * Displays the given score for Team B. */
    public void displayForTeamB(int score)
    { TextView scoreView = (TextView)
            findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score)); }
    /**
     *  adds 3 points to team b score
     */
    public void B3 (View view) {

        scoreTeamB=scoreTeamB+3;
        displayForTeamB (scoreTeamB);

    }
    /**
     *  adds 2 points to team b score
     */
    public void B2 (View view) {

        scoreTeamB=scoreTeamB+2;
        displayForTeamB (scoreTeamB);

    } /**
     *  adds 1 points to team b score
     */
    public void B1 (View view) {

        scoreTeamB=scoreTeamB+1;
        displayForTeamB (scoreTeamB);


    }

    /**
     *  resets score to 0 for team A and Team B
     */

    public void Reset (View view) {

        int Reset=0;
        displayForTeamA (Reset);
        displayForTeamB (Reset);

    }

}
