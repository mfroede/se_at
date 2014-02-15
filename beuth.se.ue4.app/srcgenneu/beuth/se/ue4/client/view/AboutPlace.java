package beuth.se.ue4.client.view;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class AboutPlace extends Place {
	public static class Tokenizer implements
			PlaceTokenizer<AboutPlace> {

		@Override
		public AboutPlace getPlace(final String token) {
			return new AboutPlace();
		}

		@Override
		public String getToken(final AboutPlace place) {
			return ""; //$NON-NLS-1$
		}

	}
}
