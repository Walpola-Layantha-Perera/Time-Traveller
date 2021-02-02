package com.laya.timetraveller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Activity32 extends AppCompatActivity implements View.OnClickListener {

    /*making 6 objects for 6  class views*/

    public CardView card_home, card_residenzschloss, card_residenzschloss_image3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_32);

        /*onCreate method is telling the program that when the activity is created, or when the app opens or when this activity opens, then the code inside this section will run
         * Im order to do that let's find a particular card view and sign it to do that*/

        card_home = (CardView) findViewById(R.id.home);

        card_residenzschloss = (CardView) findViewById(R.id.residenzschloss6);
        card_residenzschloss_image3 = (CardView) findViewById(R.id.residenzschloss_image3);


        /*Now let's assign an OnClickListener to every object*/

        card_home.setOnClickListener(this);

        card_residenzschloss.setOnClickListener(this);
        card_residenzschloss_image3.setOnClickListener(this);

    }

    @Override
    public void onClick(View vc) {

        /*Now we have to use Switch case and intent. Intent is using for going to another activity from this activity*/

        Intent ic;
            /*what below code line does is when ever you click on a particular view it will the Id of the view.
            For example if you click on the card_ai, then it will get the Id which is ai*/

        switch (vc.getId()) {
            /*below codeline will get the Id of a particular card*/
            case R.id.home:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                ic = new Intent( this, MainActivity.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(ic);
                break;

            case R.id.residenzschloss6:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                ic = new Intent( this, Activity17.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(ic);
                break;

            /*Now we will do what we have done to the above card after the switch statement to all the 6 cards*/

        }

    }

}
