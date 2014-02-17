package beuth.se.ue4.client.view.home;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class HomePlace extends Place {
	public static class Tokenizer implements
			PlaceTokenizer<HomePlace> {

		@Override
		public HomePlace getPlace(final String token) {
			return new HomePlace();
		}

		@Override
		public String getToken(final HomePlace place) {
			return ""; //$NON-NLS-1$
		}

	}
}
