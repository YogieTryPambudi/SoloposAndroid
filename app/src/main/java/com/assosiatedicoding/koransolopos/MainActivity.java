package com.assosiatedicoding.koransolopos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView male,people;
    LinearLayout textsplash, texthome, menus;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);



        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout)findViewById(R.id.texthome);
        menus = (LinearLayout) findViewById(R.id.menus);
        male = (ImageView)findViewById(R.id.male);
        people = (ImageView)findViewById(R.id.people);
        male.setOnClickListener(this);
        people.setOnClickListener(this);


        textsplash.animate().translationY(140).alpha(0).setDuration(1000).setStartDelay(1000);
        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.male:
                Intent moveIntent = new Intent(MainActivity.this, Admin.class);
                startActivity(moveIntent);
                Toast.makeText(this,"Iklan Dipilih",Toast.LENGTH_SHORT).show();
                break;
        }
        switch (v.getId()){
            case R.id.people:
                Intent moveintent = new Intent(MainActivity.this,Berita.class);
                startActivity(moveintent);
                Toast.makeText(this,"Berita Dipilih",Toast.LENGTH_SHORT).show();
        }

        }
    }
