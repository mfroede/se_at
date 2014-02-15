package beuth.se.ue4.client.common;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ActivityMapperImpl implements ActivityMapper {
	
	@Inject
	Provider<ActualNewsActivity> newsActivityProvider;	
	@Inject
	Provider<AboutActivity> aboutActivityProvider;	
	@Inject
	Provider<TestNewsActivity> newsActivityProvider;	
	@Inject
	Provider<HomeActivity> homeActivityProvider;	
	@Inject
	Provider<PortfolioActivity> portfolioActivityProvider;	
	@Inject
	Provider<ImpressumActivity> impressumActivityProvider;	
	
	@Override
	public Activity getActivity(Place place) {
	if (place instanceof NewsPlace) {
			return newsActivityProvider.get();
		}
	if (place instanceof AboutPlace) {
			return aboutActivityProvider.get();
		}
	if (place instanceof NewsPlace) {
			return newsActivityProvider.get();
		}
	if (place instanceof HomePlace) {
			return homeActivityProvider.get();
		}
	if (place instanceof PortfolioPlace) {
			return portfolioActivityProvider.get();
		}
	if (place instanceof ImpressumPlace) {
			return impressumActivityProvider.get();
		}
		return null;
	}

}
