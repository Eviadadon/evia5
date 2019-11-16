package com.example.evia5;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class Main2Activity extends AppCompatActivity {
    LinearLayout ll2;
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"yellow");
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ll2=(LinearLayout)findViewById(R.id.ll2);
    }



    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (R.id.green == id) {
            ll2.setBackgroundColor(Color.GREEN);
        } else {
            if (id == R.id.red) {
                ll2.setBackgroundColor(Color.RED);
            }else {
                if (id == R.id.blue) {
                    ll2.setBackgroundColor(Color.BLUE);
                } else ll2.setBackgroundColor(Color.YELLOW);
            }
        }
        return true;
    }


    public void bk(View view) { finish();
    }

}
