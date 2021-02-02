package com.laya.timetraveller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    /*making 6 objects for 6  class views*/

    public CardView card_home, card_frauenkirche, card13, card14, card15, card16, card17, card18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        /*onCreate method is telling the program that when the activity is created, or when the app opens or when this activity opens, then the code inside this section will run
         * Im order to do that let's find a particular card view and sign it to do that*/

        card_home = (CardView) findViewById(R.id.home);

        card_frauenkirche = (CardView) findViewById(R.id.frauenkirche);

        card13 = (CardView) findViewById(R.id.c13);
        card14 = (CardView) findViewById(R.id.c14);
        card15 = (CardView) findViewById(R.id.c15);
        card16 = (CardView) findViewById(R.id.c16);
        card17 = (CardView) findViewById(R.id.c17);
        card18 = (CardView) findViewById(R.id.c18);



        /*Now let's assign an OnClickListener to every object*/

        card_home.setOnClickListener(this);

        card_frauenkirche.setOnClickListener(this);

        card13.setOnClickListener(this);
        card14.setOnClickListener(this);
        card15.setOnClickListener(this);
        card15.setOnClickListener(this);
        card16.setOnClickListener(this);
        card17.setOnClickListener(this);
        card18.setOnClickListener(this);


    }

    @Override
    public void onClick(View d) {

        /*Now we have to use Switch case and intent. Intent is using for going to another activity from this activity*/

        Intent e;
            /*what below code line does is when ever you click on a particular view it will the Id of the view.
            For example if you click on the card_ai, then it will get the Id which is ai*/

        switch (d.getId()) {
            /*below codeline will get the Id of a particular card*/
            case R.id.home:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                e = new Intent( this, MainActivity.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(e);
                break;

            case R.id.c13:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                e = new Intent( this, Activity20.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(e);
                break;

            /*Now we will do what we have done to the above card after the switch statement to all the 6 cards*/


            case R.id.c14:
                e = new Intent(this, Activity21.class);
                startActivity(e);
                break;

            case R.id.c15:
                e = new Intent(this, Activity22.class);
                startActivity(e);
                break;

            case R.id.c16:
                e = new Intent(this, Activity23.class);
                startActivity(e);
                break;

            case R.id.c17:
                e = new Intent(this, Activity24.class);
                startActivity(e);
                break;

            case R.id.c18:
                e = new Intent( this,Activity25.class);
                startActivity(e);
                break;

            case R.id.frauenkirche:
                e = new Intent( this, Activity15.class);
                startActivity(e);
                break;





        }

    }

}
