package beuth.se.ue4.client.view.portfolio;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PortfolioPlace extends Place {
	public static class Tokenizer implements
			PlaceTokenizer<PortfolioPlace> {

		@Override
		public PortfolioPlace getPlace(final String token) {
			return new PortfolioPlace();
		}

		@Override
		public String getToken(final PortfolioPlace place) {
			return ""; //$NON-NLS-1$
		}

	}
}
