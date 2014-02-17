package beuth.se.ue4.client.common;

import beuth.se.ue4.client.view.FooterPlace;
import beuth.se.ue4.client.view.HeaderPlace;
import beuth.se.ue4.client.view.HomePlace;
import beuth.se.ue4.client.view.ImpressumPlace;
import beuth.se.ue4.client.view.NewsPlace;
import beuth.se.ue4.client.view.PortfolioPlace;
import beuth.se.ue4.client.view.ProjectsPlace;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ 
		NewsPlace.Tokenizer.class,
		PortfolioPlace.Tokenizer.class,
		ImpressumPlace.Tokenizer.class,
		ProjectsPlace.Tokenizer.class,
		HeaderPlace.Tokenizer.class,
		HomePlace.Tokenizer.class,
		FooterPlace.Tokenizer.class,
		//Start of user code beuth.se.ue4.Portfolio
		// TODO Auto generated Method
		//End of user code 
	})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
