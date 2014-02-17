package beuth.se.ue4.client.common;
import beuth.se.ue4.client.view.home.HomeActivity;
import beuth.se.ue4.client.view.home.HomePlace;
import beuth.se.ue4.client.view.impressum.ImpressumActivity;
import beuth.se.ue4.client.view.impressum.ImpressumPlace;
import beuth.se.ue4.client.view.news.NewsActivity;
import beuth.se.ue4.client.view.news.NewsPlace;
import beuth.se.ue4.client.view.portfolio.PortfolioActivity;
import beuth.se.ue4.client.view.portfolio.PortfolioPlace;
import beuth.se.ue4.client.view.projects.ProjectsActivity;
import beuth.se.ue4.client.view.projects.ProjectsPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ActivityMapperImpl implements ActivityMapper {
	
		//Start of user code beuth.se.ue4.Portfolio
		// TODO Auto generated Method
		//End of user code
	@Inject
	Provider<ProjectsActivity> projectsActivityProvider;	
	@Inject
	Provider<ImpressumActivity> impressumActivityProvider;	
	@Inject
	Provider<NewsActivity> newsActivityProvider;	
	@Inject
	Provider<PortfolioActivity> portfolioActivityProvider;	
	@Inject
	Provider<HomeActivity> homeActivityProvider;	
	
	@Override
	public Activity getActivity(Place place) {
	if (place instanceof ProjectsPlace) {
			return projectsActivityProvider.get();
		}
	if (place instanceof ImpressumPlace) {
			return impressumActivityProvider.get();
		}
	if (place instanceof NewsPlace) {
			return newsActivityProvider.get();
		}
	if (place instanceof PortfolioPlace) {
			return portfolioActivityProvider.get();
		}
	if (place instanceof HomePlace) {
			return homeActivityProvider.get();
		}
			//Start of user code getActivity
			// TODO Auto generated Method
			//End of user code
		return null;
	}

}
