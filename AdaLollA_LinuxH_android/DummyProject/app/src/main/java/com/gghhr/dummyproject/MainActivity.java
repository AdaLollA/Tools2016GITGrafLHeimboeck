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
    
<<<<<<< HEAD
    public void thisIsANewMethod() {
		Log.d("debug", "called method");
    	int i = 0;
    }
>>>>>>> a7ee65bfef9f7333ac263f708f7c22f3dd6ff25f
}
