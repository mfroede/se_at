package beuth.se.ue4.client.view;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ImpressumActivity extends AbstractActivityDefaultImpl<ImpressumPlace> implements ImpressumView.Presenter{
	private final ImpressumView view;
	private final EventBus eventBus;
	private final PlaceController placeController;

	@Inject
	public ImpressumActivity(final ImpressumView view,
			final EventBus eventBus, PlaceController placeController) {
		this.view = view;
		this.eventBus = eventBus;
		this.placeController = placeController;

	}

	//TODO Ovverrides einfuegen
}
