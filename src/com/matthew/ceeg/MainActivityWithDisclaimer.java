package com.matthew.ceeg;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivityWithDisclaimer extends ActionBarActivity implements OnClickListener{	
	
	
	
	Button btn;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_disclaimer);
        btn=(Button) findViewById (R.id.agree);
        btn.setOnClickListener(this);
              
        
       /* Button agree = (Button)findViewById (R.id.agree);
        agree.setOnClickListener (new OnClickListener(){
	
        		public void onClick(View view) {
        			
        			Intent myIntent = new Intent (view.getContext(), Instructions.class);
        			startActivityForResult (myIntent, 0);
        		}
	});
	*/
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

   public void FullText (View view){
	   Intent i = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.google.com") );
	   startActivity(i);
   }

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	Intent myintent = new Intent (this, Instructions.class);
	startActivity (myintent);
}




		
	}


    
        



