package com.laya.timetraveller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /*making 6 objects for 6  class views*/

    public CardView card_ai, card1, card2, card3, card4, card5, card6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*onCreate method is telling the program that when the activity is created, or when the app opens or when this activity opens, then the code inside this section will run
         * Im order to do that let's find a particular card view and sign it to do that*/

        card_ai = (CardView) findViewById(R.id.ai);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);
        card5 = (CardView) findViewById(R.id.c5);
        card6 = (CardView) findViewById(R.id.c6);



        /*Now let's assign an OnClickListener to every object*/

        card_ai.setOnClickListener(this);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);


    }

    public void onClick(View c) {

        /*Now we have to use Switch case and intent. Intent is using for going to another activity from this activity*/

        Intent j;
            /*what below code line does is when ever you click on a particular view it will the Id of the view.
            For example if you click on the card_ai, then it will get the Id which is ai*/

        switch (c.getId()) {
            /*below codeline will get the Id of a particular card*/
            case R.id.ai:
                /*below code line: ai is the card_ai. So, once we click on the card_ai it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                j = new Intent( this, LivePreviewActivity.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(j);
                break;

                /*case R.id.c1:
                    *//*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*//*
                    i = new Intent( this, Activity1.class);


                    *//*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*//*

                    startActivity(i);
                    break;*/

                /*Now we will do what we have done to the above card after the switch statement to all the 6 cards*/


                case R.id.c1:
                    j = new Intent(this, Activity2.class);
                    startActivity(j);
                    break;

                case R.id.c2:
                    j = new Intent(this, Activity3.class);
                    startActivity(j);
                    break;

                case R.id.c3:
                    j = new Intent(this, Activity4.class);
                    startActivity(j);
                    break;

                case R.id.c4:
                    j = new Intent(this, Activity5.class);
                    startActivity(j);
                    break;

                case R.id.c5 :
                    j = new Intent( this,Activity6.class);
                    startActivity(j);
                    break;

            case R.id.c6 :
                j = new Intent( this,Activity7.class);
                startActivity(j);
                break;





            }

    }

}
