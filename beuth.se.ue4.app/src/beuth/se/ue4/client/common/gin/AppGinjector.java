package beuth.se.ue4.client.common.gin;

import beuth.se.ue4.client.common.ActivityMapperImpl;
import beuth.se.ue4.client.common.FooterViewActivityMapper;
import beuth.se.ue4.client.common.HeaderViewActivityMapper;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

@GinModules(ProductionGinModule.class)
public interface AppGinjector extends Ginjector {

	public EventBus getEventBus();

	public PlaceController getPlaceController();

	public ActivityMapperImpl getActivityMapper();
	public HeaderViewActivityMapper getHeaderViewActivityMapper();
	public FooterViewActivityMapper getFooterViewActivityMapper();
		//Start of user code beuth.se.ue4.Portfolio
		// TODO Auto generated Method
		//End of user code
}
