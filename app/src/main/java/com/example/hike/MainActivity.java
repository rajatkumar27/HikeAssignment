package com.example.hike;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        Button b = (Button) findViewById(R.id.button);
//        b.setOnClickListener(new onClickListner(){
//
//        });
    }

    public void showText(View V){
        System.out.println("ShowText");
        System.out.println(findViewById(R.id.button));
        TextView t =new TextView(getApplicationContext());
        t.append("HIKE");
        t.setGravity(Gravity.CENTER);
        this.addContentView(t,new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
    }

}