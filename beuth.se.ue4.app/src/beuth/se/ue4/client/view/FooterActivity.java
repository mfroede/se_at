package beuth.se.ue4.client.view;

import beuth.se.ue4.client.common.AbstractActivityDefaultImpl;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class FooterActivity extends AbstractActivityDefaultImpl<FooterPlace> implements FooterView.Presenter{
	private final FooterView view;
	private final EventBus eventBus;
	private final PlaceController placeController;

	@Inject
	public FooterActivity(final FooterView view,
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
	//Start of user code Footer
	// TODO Auto generated Method
	@Override
	public void onButtonClicked(String buttonName){
		switch(buttonName) {
		case "toImpressum":
			placeController.goTo(new ImpressumPlace());
			break;
		}
	}
	//End of user code
}
