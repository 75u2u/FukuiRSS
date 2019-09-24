package com.tsuru.rssreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ArrayList<String> rssLinks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RSSを結合 https://rssunify.com/
        rssLinks.add("https://feed.rssunify.com/5d8629053023e/rss.xml");

        startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink", rssLinks.get(0)));

    }

    @Override
    public void onClick(View view) {
        /*
        switch (view.getId()) {
            case R.id.btnSTART:
                startActivity(new Intent(MainActivity.this, RSSFeedActivity.class).putExtra("rssLink", rssLinks.get(0)));
                break;
        }
         */
    }
}
