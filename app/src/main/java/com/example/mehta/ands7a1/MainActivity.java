package com.example.mehta.ands7a1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openWebPage(View v) {

        // reading the search text from textbox and searching using google as per assignment.
        EditText txtSearch = (EditText) findViewById(R.id.editText2);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ch/search?q=" + txtSearch.getText()));
        startActivity(webIntent);
    }
}
