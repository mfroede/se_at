package beuth.se.ue4.client.view;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class MyFooterPlace extends Place {
	public static class Tokenizer implements
			PlaceTokenizer<MyFooterPlace> {

		@Override
		public MyFooterPlace getPlace(final String token) {
			return new MyFooterPlace();
		}

		@Override
		public String getToken(final MyFooterPlace place) {
			return ""; //$NON-NLS-1$
		}

	}
}
