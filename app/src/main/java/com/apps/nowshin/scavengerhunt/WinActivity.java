package com.apps.nowshin.scavengerhunt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.apps.nowshin.scavengerhunt.DataObjects.Clue;

public class WinActivity extends AppCompatActivity {

    public static int CLUE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
    }

    public void resetPage(View view)
    {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        CLUE = 0;
        SharedPreferences.Editor reset = sharedPreferences.edit();
        reset.putInt(Clue.CLUEKEY, CLUE);
        reset.commit();

        Intent intent = new Intent(this, StartDescriptionActivity.class);
        startActivity(intent);
    }
}
