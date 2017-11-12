package com.anisdroid.Material_Design;

import android.app.*;
import android.os.*;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import android.view.*;
import android.content.*;

public class MainActivity extends ActionBarActivity 
{
	private Toolbar ttt;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		ttt = (Toolbar) findViewById(R.id.app_bar);
		setSupportActionBar(ttt);
		
		
		
    }

	@Override
	public boolean onCreateOptionsMenu(Menu aaa)
	{
		MenuInflater bbb = getMenuInflater();
		bbb.inflate(R.menu.my_menu,aaa);
		
		// TODO: Implement this method
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem ccc)
	{
		if(ccc.getItemId() == R.id.about){
			startActivity(new Intent(this,About.class));
		}
		
		// TODO: Implement this method
		return true;
	}
	
	
	
}
