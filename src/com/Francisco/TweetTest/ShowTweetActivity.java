package com.Francisco.TweetTest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowTweetActivity extends Activity
{
   public void onCreate(Bundle icicle)
   {
      super.onCreate(icicle);
      setContentView(R.layout.main);
      
      Bundle bundle = this.getIntent().getExtras();
      Tweet param1 = (Tweet) bundle.getSerializable("param1");
      
      TextView b = (TextView) findViewById(R.id.textViewTweet);
      b.setText(param1.message);
   }
}
