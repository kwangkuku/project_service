package com.promptnow.econprice.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.promptnow.econprice.R;

/**
 * Created by Acer on 30/8/2559.
 */

public class StartActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView image = ( ImageView ) this.findViewById ( R.id.logoStart);
        image.setImageResource ( R.drawable.deer );



    }
}
