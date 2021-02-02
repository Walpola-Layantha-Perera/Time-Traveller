package com.laya.timetraveller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Activity4 extends AppCompatActivity implements View.OnClickListener {

    /*making 6 objects for 6  class views*/

    public CardView card_home, card_zwinger, card19, card20, card21, card22, card23, card24;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        /*onCreate method is telling the program that when the activity is created, or when the app opens or when this activity opens, then the code inside this section will run
         * Im order to do that let's find a particular card view and sign it to do that*/

        card_home = (CardView) findViewById(R.id.home);

        card_zwinger = (CardView) findViewById(R.id.zwinger);

        card19 = (CardView) findViewById(R.id.c19);
        card20 = (CardView) findViewById(R.id.c20);
        card21 = (CardView) findViewById(R.id.c21);
        card22 = (CardView) findViewById(R.id.c22);
        card23 = (CardView) findViewById(R.id.c23);
        card24 = (CardView) findViewById(R.id.c24);



        /*Now let's assign an OnClickListener to every object*/

        card_home.setOnClickListener(this);

        card_zwinger.setOnClickListener(this);

        card19.setOnClickListener(this);
        card20.setOnClickListener(this);
        card21.setOnClickListener(this);
        card22.setOnClickListener(this);
        card23.setOnClickListener(this);
        card24.setOnClickListener(this);


    }

    @Override
    public void onClick(View f) {

        /*Now we have to use Switch case and intent. Intent is using for going to another activity from this activity*/

        Intent k;
            /*what below code line does is when ever you click on a particular view it will the Id of the view.
            For example if you click on the card_ai, then it will get the Id which is ai*/

        switch (f.getId()) {
            /*below codeline will get the Id of a particular card*/
            case R.id.home:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                k = new Intent( this, MainActivity.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(k);
                break;

            case R.id.c19:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                k = new Intent( this, Activity26.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(k);
                break;

            /*Now we will do what we have done to the above card after the switch statement to all the 6 cards*/


            case R.id.c20:
                k = new Intent(this, Activity27.class);
                startActivity(k);
                break;

            case R.id.c21:
                k = new Intent(this, Activity28.class);
                startActivity(k);
                break;

            case R.id.c22:
                k = new Intent(this, Activity29.class);
                startActivity(k);
                break;

            case R.id.c23:
                k = new Intent(this, Activity30.class);
                startActivity(k);
                break;

            case R.id.c24:
                k = new Intent( this,Activity31.class);
                startActivity(k);
                break;

            case R.id.zwinger:
                k = new Intent( this,Activity16.class);
                startActivity(k);
                break;





        }

    }

}
