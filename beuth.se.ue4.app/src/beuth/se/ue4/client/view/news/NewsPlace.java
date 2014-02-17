package beuth.se.ue4.client.view.news;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class NewsPlace extends Place {
	public static class Tokenizer implements
			PlaceTokenizer<NewsPlace> {

		@Override
		public NewsPlace getPlace(final String token) {
			return new NewsPlace();
		}

		@Override
		public String getToken(final NewsPlace place) {
			return ""; //$NON-NLS-1$
		}

	}
}
