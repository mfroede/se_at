package beuth.se.ue4.client.common.gin;

import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;

public class PlaceControllerProvider implements Provider<PlaceController> {

	private final EventBus eventBus;

	@Inject
	public PlaceControllerProvider(EventBus eventBus) {
		this.eventBus = eventBus;
			//Start of user code PlaceControllerProvider
			// TODO Auto generated Method
			//End of user code
	}

	@Override
	public PlaceController get() {
		return new PlaceController(eventBus);
	}

}
