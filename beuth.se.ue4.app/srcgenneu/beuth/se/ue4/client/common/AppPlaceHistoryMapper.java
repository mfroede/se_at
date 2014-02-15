package beuth.se.ue4.client.common;


import beuth.se.ue4.client.view.NewsPlace;
import beuth.se.ue4.client.view.AboutPlace;
import beuth.se.ue4.client.view.MyHeaderPlace;
import beuth.se.ue4.client.view.NewsPlace;
import beuth.se.ue4.client.view.HomePlace;
import beuth.se.ue4.client.view.MyFooterPlace;
import beuth.se.ue4.client.view.PortfolioPlace;
import beuth.se.ue4.client.view.ImpressumPlace;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ 
		NewsPlace.Tokenizer.class,
		AboutPlace.Tokenizer.class,
		MyHeaderPlace.Tokenizer.class,
		NewsPlace.Tokenizer.class,
		HomePlace.Tokenizer.class,
		MyFooterPlace.Tokenizer.class,
		PortfolioPlace.Tokenizer.class,
		ImpressumPlace.Tokenizer.class,
 })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
