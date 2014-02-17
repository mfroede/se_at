package beuth.se.ue4.client;

import beuth.se.ue4.client.common.AppPlaceHistoryMapper;
import beuth.se.ue4.client.common.gin.AppGinjector;
import beuth.se.ue4.client.view.HomePlace;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;

public class AppEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {

		AppGinjector injector = GWT.create(AppGinjector.class);
		EventBus eventBus = injector.getEventBus();

		ActivityMapper activityMapper = injector.getActivityMapper();

		SimplePanel content = new SimplePanel();
		ActivityManager contentActivityManager = new ActivityManager(
				activityMapper, eventBus);
		contentActivityManager.setDisplay(content);

//--------------------------------------------------
		ActivityMapper activityMapperHeader = injector
				.getHeaderViewActivityMapper();
		SimplePanel header = new SimplePanel();

		ActivityManager contentActivityManagerHeader = new ActivityManager(
				activityMapperHeader, eventBus);
		contentActivityManagerHeader.setDisplay(header);
		ActivityMapper activityMapperFooter = injector
				.getFooterViewActivityMapper();
		SimplePanel footer = new SimplePanel();

		ActivityManager contentActivityManagerFooter = new ActivityManager(
				activityMapperFooter, eventBus);
		contentActivityManagerFooter.setDisplay(footer);
//--------------------------------------------------
		RootPanel.get().add( header );
		RootPanel.get().add( content );
		RootPanel.get().add( footer );
			//Start of user code beuth.se.ue4.Portfolio
			// TODO Auto generated Method
			//End of user code
		AppPlaceHistoryMapper historyMapper = GWT
				.create(AppPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(
				historyMapper);
		historyHandler.register(injector.getPlaceController(), eventBus,
				new HomePlace());

		historyHandler.handleCurrentHistory();
	}
}

