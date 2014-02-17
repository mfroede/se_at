package beuth.se.ue4.client.view.projects;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class ProjectsPlace extends Place {
	public static class Tokenizer implements
			PlaceTokenizer<ProjectsPlace> {

		@Override
		public ProjectsPlace getPlace(final String token) {
			return new ProjectsPlace();
		}

		@Override
		public String getToken(final ProjectsPlace place) {
			return ""; //$NON-NLS-1$
		}

	}
}
