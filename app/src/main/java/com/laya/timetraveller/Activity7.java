package com.laya.timetraveller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Activity7 extends AppCompatActivity implements View.OnClickListener {

    /*making 6 objects for 6  class views*/

    public CardView card_home, card_japanesepalace, card37, card38, card39, card40, card41, card42;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        /*onCreate method is telling the program that when the activity is created, or when the app opens or when this activity opens, then the code inside this section will run
         * Im order to do that let's find a particular card view and sign it to do that*/

        card_home = (CardView) findViewById(R.id.home);

        card_japanesepalace = (CardView) findViewById(R.id.japanesepalace);

        card37 = (CardView) findViewById(R.id.c37);
        card38 = (CardView) findViewById(R.id.c38);
        card39 = (CardView) findViewById(R.id.c39);
        card40 = (CardView) findViewById(R.id.c40);
        card41 = (CardView) findViewById(R.id.c41);
        card42 = (CardView) findViewById(R.id.c42);



        /*Now let's assign an OnClickListener to every object*/

        card_home.setOnClickListener(this);

        card37.setOnClickListener(this);
        card38.setOnClickListener(this);
        card39.setOnClickListener(this);
        card40.setOnClickListener(this);
        card41.setOnClickListener(this);
        card42.setOnClickListener(this);

        card_japanesepalace.setOnClickListener(this);


    }

    @Override
    public void onClick(View r) {

        /*Now we have to use Switch case and intent. Intent is using for going to another activity from this activity*/

        Intent z;
            /*what below code line does is when ever you click on a particular view it will the Id of the view.
            For example if you click on the card_ai, then it will get the Id which is ai*/

        switch (r.getId()) {
            /*below codeline will get the Id of a particular card*/
            case R.id.home:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                z = new Intent( this, MainActivity.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(z);
                break;

            case R.id.c37:
                /*below code line: c1 is the card1. So, once we click on the card1 it has to go to the activity one. Therefore, we write One.class for go to the activity one*/
                z = new Intent( this, Activity44.class);


                /*above we have defined the Intent, and now we have to start the activity. Therefore, we use: startActivity(i);*/

                startActivity(z);
                break;

            /*Now we will do what we have done to the above card after the switch statement to all the 6 cards*/


            case R.id.c38:
                z = new Intent(this, Activity45.class);
                startActivity(z);
                break;

            case R.id.c39:
                z = new Intent(this, Activity46.class);
                startActivity(z);
                break;

            case R.id.c40:
                z = new Intent(this, Activity47.class);
                startActivity(z);
                break;

            case R.id.c41:
                z = new Intent(this, Activity48.class);
                startActivity(z);
                break;

            case R.id.c42:
                z = new Intent( this,Activity49.class);
                startActivity(z);
                break;

            case R.id.japanesepalace:
                z = new Intent( this,Activity19.class);
                startActivity(z);
                break;



        }

    }

}
