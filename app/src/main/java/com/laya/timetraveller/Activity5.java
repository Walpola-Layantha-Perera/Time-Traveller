package com.laya.timetraveller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Activity5 extends AppCompatActivity implements View.OnClickListener {

    /*making 6 objects for 6  class views*/

    public CardView card_home, card_residenzschloss, card25, card26, card27, card28, card29, card30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        /*onCreate method is telling the program that when the activity is created, or when the app opens or when this activity opens, then the code inside this section will run
         * Im order to do that let's find a particular card view and sign it to do that*/

        card_home = (CardView) findViewById(R.id.home);

        card_residenzschloss = (CardView) findViewById(R.id.residenzschloss);

        card25 = (CardView) findViewById(R.id.c25);
        card26 = (CardView) findViewById(R.id.c26);
        card27 = (CardView) findViewById(R.id.c27);
        card28 = (CardView) findViewById(R.id.c28);
        card29 = (CardView) findViewById(R.id.c29);
        card30 = (CardView) findViewById(R.id.c30);



        /*Now let's assign an OnClickListener to every object*/

        card_home.setOnClickListener(this);

        card_residenzschloss.setOnClickListener(this);

        card25.setOnClickListener(this);
        card26.setOnClickListener(this);
        card27.setOnClickListener(this);
        card28.setOnClickListener(this);
        card29.setOnClickListener(this);
        card30.setOnClickListener(this);


    }

    @Override
    public void onClick(View h) {

        /*Now we have to use Switch case and intent. Intent is using for going to another activity from this activity*/

        Intent m;
            /*what below code line does is when ever you click on a particular view it will the Id of the view.
            For example if you click on the card_ai, then it will get the Id which is ai*/

        switch (h.getId()) {
            /*below codeline will get the Id of a particular card*/
            case R.id.home:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                m = new Intent( this, MainActivity.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(m);
                break;

            case R.id.c25:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                m = new Intent( this, Activity32.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(m);
                break;

            /*Now we will do what we have done to the above card after the switch statement to all the 6 cards*/


            case R.id.c26:
                m = new Intent(this, Activity33.class);
                startActivity(m);
                break;

            case R.id.c27:
                m = new Intent(this, Activity34.class);
                startActivity(m);
                break;

            case R.id.c28:
                m = new Intent(this, Activity35.class);
                startActivity(m);
                break;

            case R.id.c29:
                m = new Intent(this, Activity36.class);
                startActivity(m);
                break;

            case R.id.c30:
                m = new Intent( this,Activity37.class);
                startActivity(m);
                break;

            case R.id.residenzschloss:
                m = new Intent( this,Activity17.class);
                startActivity(m);
                break;





        }

    }

}
