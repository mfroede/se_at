package beuth.se.ue4.client.view;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class HeaderPlace extends Place {
	public static class Tokenizer implements
			PlaceTokenizer<HeaderPlace> {

		@Override
		public HeaderPlace getPlace(final String token) {
			return new HeaderPlace();
		}

		@Override
		public String getToken(final HeaderPlace place) {
			return ""; //$NON-NLS-1$
		}

	}
}
