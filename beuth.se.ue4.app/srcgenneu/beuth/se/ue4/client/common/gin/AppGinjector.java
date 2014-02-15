package beuth.se.ue4.client.common.gin;

import beuth.se.ue4.client.common.ActivityMapperImpl;
import beuth.se.ue4.client.common.MyHeaderViewActivityMapper;
import beuth.se.ue4.client.common.MyFooterViewActivityMapper;


import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

@GinModules(ProductionGinModule.class)
public interface AppGinjector extends Ginjector {

	public EventBus getEventBus();

	public PlaceController getPlaceController();

	public ActivityMapperImpl getActivityMapper();
	public MyHeaderViewActivityMapper getMyHeaderViewActivityMapper();
	public MyFooterViewActivityMapper getMyFooterViewActivityMapper();
}
