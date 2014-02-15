package beuth.se.ue4.client.common;

import beuth.se.ue4.client.view.MyFooterActivity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class MyFooterViewActivityMapper implements ActivityMapper {

	
	@Inject
	Provider<MyFooterActivity> myFooterActivityProvider;
	
	@Override
	public Activity getActivity(Place place) {
		return myFooterActivityProvider.get();
	}

}
