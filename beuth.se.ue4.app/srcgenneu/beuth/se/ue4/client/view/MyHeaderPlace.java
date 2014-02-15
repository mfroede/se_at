package beuth.se.ue4.client.view;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class MyHeaderPlace extends Place {
	public static class Tokenizer implements
			PlaceTokenizer<MyHeaderPlace> {

		@Override
		public MyHeaderPlace getPlace(final String token) {
			return new MyHeaderPlace();
		}

		@Override
		public String getToken(final MyHeaderPlace place) {
			return ""; //$NON-NLS-1$
		}

	}
}
