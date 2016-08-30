package com.promptnow.econprice.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import com.promptnow.econprice.R;


/**
 * Created by Acer on 29/8/2559.
 */

public class GuideOilPriceActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_oilprice);

        ImageView image = ( ImageView ) this.findViewById ( R.id.oil_price);
        image.setImageResource ( R.drawable.pic_oil_price );



    }

}
