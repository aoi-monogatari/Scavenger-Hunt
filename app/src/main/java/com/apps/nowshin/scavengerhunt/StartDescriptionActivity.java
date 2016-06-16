package com.apps.nowshin.scavengerhunt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.apps.nowshin.scavengerhunt.DataObjects.Clue;

public class StartDescriptionActivity extends AppCompatActivity {

    public static int CLUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_description);
    }

    public void goToCurrentClueActivity(View view)
    {
        Intent intent = new Intent(this, CurrentClueActivity.class);
        startActivity(intent);

        CLUE = 0;

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        SharedPreferences.Editor reset = sharedPreferences.edit();
        reset.putInt(Clue.CLUEKEY, CLUE);
        reset.commit();
    }
}
