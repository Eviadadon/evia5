package com.example.evia5;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class Main2Activity extends AppCompatActivity {
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ll=(LinearLayout)findViewById(R.id.ll);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
       menu.add(0,0,400,"yellow");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (R.id.green == id) {
            ll.setBackgroundColor(Color.GREEN);
        } else {
            if (id == R.id.red) {
                ll.setBackgroundColor(Color.RED);
            }else {
                if (id == R.id.blue) {
                    ll.setBackgroundColor(Color.BLUE);
                } else ll.setBackgroundColor(Color.YELLOW);
            }
        }
        return true;
    }


    public void bk(View view) { finish();
    }

}
