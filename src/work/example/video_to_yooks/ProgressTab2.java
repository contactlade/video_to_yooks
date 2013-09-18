package work.example.video_to_yooks;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ProgressTab2 extends Fragment{
	
	FragmentTabHost mTabHost;


	  @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	        mTabHost = new FragmentTabHost(getActivity());
	        mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.containerfragment);
	
	    	mTabHost.addTab(mTabHost.newTabSpec("upload").setIndicator("Upload"), UploadFragment.class, null);
			mTabHost.addTab(mTabHost.newTabSpec("queue").setIndicator("Queue"), QueueFragment.class, null);
			mTabHost.addTab(mTabHost.newTabSpec("history").setIndicator("History"), HistoryFragment.class, null);	
			//mTabHost.setBackgroundColor(R.drawable.button_custom);
		
			return mTabHost;
	}
	  
	
	  /*
	  TabHost.OnTabChangeListener tabhost = new TabHost.OnTabChangeListener(){
		  
		  public void onTabChanged(String tabId){
			  Fragment newf;
			  
			  if (tabId.equalsIgnoreCase(view1)){
				  
				  newf = new UploadFragment();
				  
			  }
			  
			  else if (tabId.equalsIgnoreCase(view2)){
				  
				  newf =  new QueueFragment();
			  }
			  
			  else newf = new HistoryFragment();
			  
			  
			  FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
				transaction.replace(R.id.progfrag, newf);
				transaction.addToBackStack(null);
				transaction.commit();
				
			  
		  }
	  };
	  */

	  @Override
	    public void onDestroyView() {
	        super.onDestroyView();
	        mTabHost = null;
	    }


}
