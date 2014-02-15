package beuth.se.ue4.client.view;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class MyFooterActivity extends AbstractActivityDefaultImpl<MyFooterPlace> implements MyFooterView.Presenter{
	private final MyFooterView view;
	private final EventBus eventBus;
	private final PlaceController placeController;

	@Inject
	public MyFooterActivity(final MyFooterView view,
			final EventBus eventBus, PlaceController placeController) {
		this.view = view;
		this.eventBus = eventBus;
		this.placeController = placeController;

	}

	//TODO Ovverrides einfuegen
}
