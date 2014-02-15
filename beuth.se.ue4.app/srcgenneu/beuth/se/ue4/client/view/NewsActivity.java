package beuth.se.ue4.client.view;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class NewsActivity extends AbstractActivityDefaultImpl<NewsPlace> implements NewsView.Presenter{
	private final NewsView view;
	private final EventBus eventBus;
	private final PlaceController placeController;

	@Inject
	public NewsActivity(final NewsView view,
			final EventBus eventBus, PlaceController placeController) {
		this.view = view;
		this.eventBus = eventBus;
		this.placeController = placeController;

	}

	//TODO Overrides einfuegen
}
