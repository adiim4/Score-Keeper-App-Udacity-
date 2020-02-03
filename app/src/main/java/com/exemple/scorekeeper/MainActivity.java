package com.exemple.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goals = 0;
    int goala = 0;
    int goalb = 0;
    int cartResA = 0;
    int cartResB = 0;
    int cartYellowA = 0;
    int cartYellowB = 0;

    String txgoals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btna(View view) {
        goala = goala + 1;
        goals = goala + goalb;
        txgoals = "Match goals: " + goals;
        display(goala);
        displayg(txgoals);
    }

    public void btnb(View view) {
        goalb = goalb + 1;
        goals = goala + goalb;
        txgoals = "Match goals: " + goals;
        displayB(goalb);
        displayg(txgoals);
    }

    public void btnredA(View view) {
        cartResA = cartResA + 1;
        displayReda(cartResA);
    }

    public void btnredB(View view) {
        cartResB = cartResB + 1;
        displayRedb(cartResB);
    }

    public void btnYellowA(View view) {
        cartYellowA = cartYellowA + 1;
        displayYellowa(cartYellowA);
    }

    public void btnYellowB(View view) {
        cartYellowB = cartYellowB + 1;
        displayYellowb(cartYellowB);
    }

    public void btnRes (View view) {
        goals = 0;
        txgoals = "Match goals: " + goals ;
        goala = 0;
        goalb = 0;
        cartResA = 0;
        cartResB = 0;
        cartYellowA = 0;
        cartYellowB = 0;
        display(goala);
        displayg(txgoals);
        displayB(goalb);
        displayReda(cartResA);
        displayRedb(cartResB);
        displayYellowa(cartYellowA);
        displayYellowb(cartYellowB);
    }



    public void display (int score) {
        TextView scoreView = (TextView) findViewById(R.id.tva);
        scoreView.setText(String.valueOf(score));
    }

    public void displayB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.tvb);
        scoreView.setText(String.valueOf(score));
    }

    public void displayg (String txgoals) {
        TextView scoreView = (TextView) findViewById(R.id.tvgoals);
        scoreView.setText(String.valueOf(txgoals));
    }

    public void displayReda (int score) {
        TextView scoreView = (TextView) findViewById(R.id.reda);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedb (int score) {
        TextView scoreView = (TextView) findViewById(R.id.redb);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowa (int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowa);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowb (int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowb);
        scoreView.setText(String.valueOf(score));
    }
}
