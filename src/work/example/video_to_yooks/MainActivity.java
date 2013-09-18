package work.example.video_to_yooks;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
	    Fragment fragment;
		Button videobtn,camerabtn;
		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		videobtn = (Button) findViewById(R.id.btnvideo);
		camerabtn = (Button) findViewById(R.id.btncamera);
		
		
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		
		VideoFragment myVideo = new VideoFragment();
		ft.add(R.id.containerfragment, myVideo);
		
		//fragment= new ProgressTab ();
		//ft.add(R.id.progfrag, fragment);		
		ft.commit();
		
	}
		
				
					public void actionButton(View view){
				
							Fragment newFragment;
				
								if(view == camerabtn){
					
									newFragment = new CameraFragment();
								}
				
				
								else{
					
									newFragment = new VideoFragment();
					
								}
				
								FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
								transaction.replace(R.id.containerfragment, newFragment);
								transaction.addToBackStack(null);
								transaction.commit();
								
						
						
				
	}
		
					public void actionChange(View v){
						Fragment newFragment2;
						newFragment2 = new ProgressTab2();
						//newFragment2 = new VideoFragment();
						FragmentTransaction transact = getSupportFragmentManager().beginTransaction();
						transact.replace(R.id.containerfragment, newFragment2);
					
						transact.commit();
						
						
						
					}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
