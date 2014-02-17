package beuth.se.ue4.client.view.impressum;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class ImpressumPlace extends Place {
	public static class Tokenizer implements
			PlaceTokenizer<ImpressumPlace> {

		@Override
		public ImpressumPlace getPlace(final String token) {
			return new ImpressumPlace();
		}

		@Override
		public String getToken(final ImpressumPlace place) {
			return ""; //$NON-NLS-1$
		}

	}
}
