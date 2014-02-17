package beuth.se.ue4.client.common;

import beuth.se.ue4.client.view.FooterPlace;
import beuth.se.ue4.client.view.HeaderPlace;
import beuth.se.ue4.client.view.home.HomePlace;
import beuth.se.ue4.client.view.impressum.ImpressumPlace;
import beuth.se.ue4.client.view.news.NewsPlace;
import beuth.se.ue4.client.view.portfolio.PortfolioPlace;
import beuth.se.ue4.client.view.projects.ProjectsPlace;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ 
		ProjectsPlace.Tokenizer.class,
		ImpressumPlace.Tokenizer.class,
		NewsPlace.Tokenizer.class,
		PortfolioPlace.Tokenizer.class,
		HomePlace.Tokenizer.class,
		HeaderPlace.Tokenizer.class,
		FooterPlace.Tokenizer.class,
		//Start of user code beuth.se.ue4.Portfolio
		// TODO Auto generated Method
		//End of user code 
	})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
