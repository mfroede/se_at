package beuth.se.ue4.client.common;

import beuth.se.ue4.client.view.MyHeaderActivity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class MyHeaderViewActivityMapper implements ActivityMapper {

	
	@Inject
	Provider<MyHeaderActivity> myHeaderActivityProvider;
	
	@Override
	public Activity getActivity(Place place) {
		return myHeaderActivityProvider.get();
	}

}
