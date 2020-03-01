package com.example.score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore, teamBScore;
    private TextView teamATextViewScore, teamBTextViewScore;
    private Button teamA5button, teamA10button,teamB5button,teamB10button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamATextViewScore = findViewById(R.id.team_A_Score_View);
        teamBTextViewScore = findViewById(R.id.team_B_Score_View);
        teamA5button = findViewById(R.id.team_A_5_button);
        teamA10button = findViewById(R.id.team_A_10_button);
        teamB5button = findViewById(R.id.team_B_5_button);
        teamB10button = findViewById(R.id.team_B_10_button);

        teamA5button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAScore = teamAScore + 5;
                displayScoreTeamA(teamAScore);
            }
        });

        teamA10button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAScore = teamAScore + 10;
                displayScoreTeamA(teamAScore);
            }
        });

        teamB5button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamBScore = teamBScore + 5;
                displayScoreTeamB(teamBScore);
            }
        });

        teamB10button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamBScore = teamBScore + 10;
                displayScoreTeamB(teamBScore);
            }
        });

    }
    public void displayScoreTeamA(int score){
        teamATextViewScore.setText(String.valueOf(score));
    }
    public void displayScoreTeamB(int score){
        teamBTextViewScore.setText(String.valueOf(score));
    }
}
