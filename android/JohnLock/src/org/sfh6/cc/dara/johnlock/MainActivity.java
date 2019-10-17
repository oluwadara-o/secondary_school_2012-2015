package org.sfh6.cc.dara.johnlock;

import android.os.Bundle;
import android.app.Activity;
import android.view.Display;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WindowManager wm= getWindowManager();
        ImageView imageview = (ImageView) findViewById(R.id.imageView1);
        
        
        Display d = wm.getDefaultDisplay();
        if (d.getWidth() > d.getHeight() ) {
        	//we are in landsape veiw
        	imageview.setImageResource(R.drawable.johnandwatson);
        
        }else { 
        	imageview.setImageResource(R.drawable.watsonandjohnportrait);
        }
        	//we must be portrait
        	
        }
    }


    
    
