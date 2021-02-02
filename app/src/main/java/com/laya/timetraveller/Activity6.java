package com.laya.timetraveller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Activity6 extends AppCompatActivity implements View.OnClickListener {

    /*making 6 objects for 6  class views*/

    public CardView card_home, card_katholische, card31, card32, card33, card34, card35, card36;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        /*onCreate method is telling the program that when the activity is created, or when the app opens or when this activity opens, then the code inside this section will run
         * Im order to do that let's find a particular card view and sign it to do that*/

        card_home = (CardView) findViewById(R.id.home);

        card_katholische = (CardView) findViewById(R.id.katholische);

        card31 = (CardView) findViewById(R.id.c31);
        card32 = (CardView) findViewById(R.id.c32);
        card33 = (CardView) findViewById(R.id.c33);
        card34 = (CardView) findViewById(R.id.c34);
        card35 = (CardView) findViewById(R.id.c35);
        card36 = (CardView) findViewById(R.id.c36);



        /*Now let's assign an OnClickListener to every object*/

        card_home.setOnClickListener(this);

        card_katholische.setOnClickListener(this);

        card31.setOnClickListener(this);
        card32.setOnClickListener(this);
        card33.setOnClickListener(this);
        card34.setOnClickListener(this);
        card35.setOnClickListener(this);
        card36.setOnClickListener(this);


    }

    @Override
    public void onClick(View p) {

        /*Now we have to use Switch case and intent. Intent is using for going to another activity from this activity*/

        Intent q;
            /*what below code line does is when ever you click on a particular view it will the Id of the view.
            For example if you click on the card_ai, then it will get the Id which is ai*/

        switch (p.getId()) {
            /*below codeline will get the Id of a particular card*/
            case R.id.home:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                q = new Intent( this, MainActivity.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(q);
                break;

            case R.id.c31:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                q = new Intent( this, Activity38.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(q);
                break;

            /*Now we will do what we have done to the above card after the switch statement to all the 6 cards*/


            case R.id.c32:
                q = new Intent(this, Activity39.class);
                startActivity(q);
                break;

            case R.id.c33:
                q = new Intent(this, Activity40.class);
                startActivity(q);
                break;

            case R.id.c34:
                q = new Intent(this, Activity41.class);
                startActivity(q);
                break;

            case R.id.c35:
                q = new Intent(this, Activity42.class);
                startActivity(q);
                break;

            case R.id.c36:
                q = new Intent( this,Activity43.class);
                startActivity(q);
                break;

            case R.id.katholische:
                q = new Intent( this,Activity18.class);
                startActivity(q);
                break;



        }

    }

}
