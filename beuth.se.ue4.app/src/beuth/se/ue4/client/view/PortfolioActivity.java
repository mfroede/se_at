package beuth.se.ue4.client.view;

import beuth.se.ue4.client.common.AbstractActivityDefaultImpl;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class PortfolioActivity extends AbstractActivityDefaultImpl<PortfolioPlace> implements PortfolioView.Presenter{
	private final PortfolioView view;
	private final EventBus eventBus;
	private final PlaceController placeController;

	@Inject
	public PortfolioActivity(final PortfolioView view,
			final EventBus eventBus, PlaceController placeController) {
		this.view = view;
		this.eventBus = eventBus;
		this.placeController = placeController;

	}
	@Override
	public void start(final AcceptsOneWidget panel,
			final com.google.gwt.event.shared.EventBus pEventBus) {
			//Start of user code start
			// TODO Auto generated Method
			//End of user code
		view.setPresenter(this);

		panel.setWidget(view);

	}
	//Start of user code Portfolio
	// TODO Auto generated Method
	//End of user code
}
