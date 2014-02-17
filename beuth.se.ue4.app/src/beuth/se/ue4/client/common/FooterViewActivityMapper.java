package beuth.se.ue4.client.common;

import beuth.se.ue4.client.view.FooterActivity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class FooterViewActivityMapper implements ActivityMapper {

	
	@Inject
	Provider<FooterActivity> footerActivityProvider;
		//Start of user code beuth.se.ue4.Portfolio
		// TODO Auto generated Method
		//End of user code

	@Override
	public Activity getActivity(Place place) {
			//Start of user code getActivity
			// TODO Auto generated Method
			//End of user code
		return footerActivityProvider.get();

	}

}
