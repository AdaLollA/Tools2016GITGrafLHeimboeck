package com.gghhr.dummyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		int i = 1;
		int b = 2 * i;
    }
    
    public�void�thisIsANewMethod()�{
		Log.d("debug", "called method");
    	int i = 0, b = 1;
		while(i < Math.sqr(b,2)){
			i++;
			b++;
		}
    }

}
