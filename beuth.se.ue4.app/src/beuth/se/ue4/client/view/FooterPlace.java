package beuth.se.ue4.client.view;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class FooterPlace extends Place {
	public static class Tokenizer implements
			PlaceTokenizer<FooterPlace> {

		@Override
		public FooterPlace getPlace(final String token) {
			return new FooterPlace();
		}

		@Override
		public String getToken(final FooterPlace place) {
			return ""; //$NON-NLS-1$
		}

	}
}
