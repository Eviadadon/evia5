package com.example.evia5;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate (R.menu.main,menu);

        return true;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=(LinearLayout)findViewById(R.id.ll);
    }



    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (R.id.green == id) {
            ll.setBackgroundColor(Color.GREEN);
        } else {
            if (id == R.id.red) {
                ll.setBackgroundColor(Color.RED);
            } else
                ll.setBackgroundColor(Color.BLUE);
        }
        return true;
    }


    public void nxt(View view) {
        Intent si=new Intent(this,Main2Activity.class);
        startActivity(si);
    }
}
