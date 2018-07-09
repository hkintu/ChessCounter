package com.example.henry.chesscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int playerAScores = 0;
    int playerBScores = 0;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playerAPawn = (Button)findViewById(R.id.addOnePoint_a_pawn);
        Button playerABishop = (Button)findViewById(R.id.addThreePoints_a_bishop);
        Button playerAKnight = (Button)findViewById(R.id.addThreePoint_a_knight);
        Button playerARook = (Button)findViewById(R.id.addFivePoint_a_rook);
        Button playerAQueen = (Button)findViewById(R.id.addEighteenPoint_a_queen);
        Button playerBPawn = (Button)findViewById(R.id.addOnePoint_b_pawn);
        Button playerBBishop = (Button)findViewById(R.id.addThreePoints_b_bishop);
        Button playerBKnight = (Button)findViewById(R.id.addThreePoint_b_knight);
        Button playerBRook = (Button)findViewById(R.id.addFivePoint_b_rook);
        Button playerBQueen = (Button)findViewById(R.id.addEighteenPoint_b_queen);
        Button resetButton = (Button)findViewById(R.id.reset);


        playerAPawn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAScores += 1;
                showAddedPointsForPlayerA(playerAScores);

            }
        });

        playerABishop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAScores += 3;
                        showAddedPointsForPlayerA(playerAScores);
            }
        });
        playerAKnight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAScores += 3;
                showAddedPointsForPlayerA(playerAScores);

            }
        });
        playerARook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAScores += 5;
                showAddedPointsForPlayerA(playerAScores);

            }
        });
        playerAQueen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAScores += 18;
                showAddedPointsForPlayerA(playerAScores);
            }
        });
        playerBPawn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerBScores += 1;
                showAddedPointsForPlayerB(playerBScores);
            }
        });
        playerBBishop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerBScores += 3;
                showAddedPointsForPlayerB(playerBScores);

            }
        });
        playerBKnight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerBScores += 3;
                showAddedPointsForPlayerB(playerBScores);

            }
        });
        playerBRook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerBScores += 5;
                showAddedPointsForPlayerB(playerBScores);

            }
        });
        playerBQueen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerBScores += 18;
                showAddedPointsForPlayerB(playerBScores);
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAScores = 0;
                playerBScores = 0;
                showAddedPointsForPlayerA(playerAScores);
                showAddedPointsForPlayerB(playerBScores);
            }
        });
    }
    public void showAddedPointsForPlayerA(int scoreForA){

        TextView playerAScore = (TextView)findViewById(R.id.player_a_pointsTextView);

        playerAScore.setText(String.valueOf(scoreForA));
    }
    public void showAddedPointsForPlayerB(int scoreForB){

        TextView playerBScore = (TextView)findViewById(R.id.player_b_pointsTextView);

        playerBScore.setText(String.valueOf(scoreForB));
    }
}
