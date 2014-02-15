package beuth.se.ue4.client.view;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class AboutActivity extends AbstractActivityDefaultImpl<AboutPlace> implements AboutView.Presenter{
	private final AboutView view;
	private final EventBus eventBus;
	private final PlaceController placeController;

	@Inject
	public AboutActivity(final AboutView view,
			final EventBus eventBus, PlaceController placeController) {
		this.view = view;
		this.eventBus = eventBus;
		this.placeController = placeController;

	}

	//TODO Ovverrides einfuegen
}
