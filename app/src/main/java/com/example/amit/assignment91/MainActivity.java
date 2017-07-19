package com.example.amit.assignment91;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.txt);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.red:
           text.setTextColor(getColor(R.color.Red));
                Toast.makeText(this,"Click On Red",Toast.LENGTH_SHORT).show();
                break;
            case R.id.green:
                text.setTextColor(getColor(R.color.Green));
                Toast.makeText(this,"Click On Green",Toast.LENGTH_SHORT).show();
                break;
            case R.id.blue:
                text.setTextColor(getColor(R.color.Blue));
                Toast.makeText(this,"Click On Blue",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
