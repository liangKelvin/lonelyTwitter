package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        // get habit obj
        Intent intent = getIntent();
        Tweet currentTweet = (Tweet) intent.getSerializableExtra("tweet");
        String tweetName = currentTweet.getMessage();

        TextView textView = (TextView) findViewById(R.id.AddHabitTitle);
        textView.setText(tweetName);
    }
}
