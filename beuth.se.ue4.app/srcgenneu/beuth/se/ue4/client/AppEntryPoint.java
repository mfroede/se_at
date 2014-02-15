package beuth.se.ue4.client;

import beuth.se.ue4.client.common.AppPlaceHistoryMapper;
import beuth.se.ue4.client.gin.AppGinjector;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.Label;
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

		ActivityMapper activityMapperMyHeader = injector
				.getNavigationViewActivityMapper();
		SimplePanel myHeader = new SimplePanel();

		ActivityManager contentActivityManagerMyHeader = new ActivityManager(
				activityMapperMyHeader, eventBus);
		contentActivityManagerMyHeader.setDisplay(myHeader);
		ActivityMapper activityMapperMyFooter = injector
				.getNavigationViewActivityMapper();
		SimplePanel myFooter = new SimplePanel();

		ActivityManager contentActivityManagerMyFooter = new ActivityManager(
				activityMapperMyFooter, eventBus);
		contentActivityManagerMyFooter.setDisplay(myFooter);

//--------------------------------------------------

		RootPanel.get().add( myHeader );
		RootPanel.get().add( content );
		RootPanel.get().add( myFooter );

		AppPlaceHistoryMapper historyMapper = GWT
				.create(AppPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(
				historyMapper);
		historyHandler.register(injector.getPlaceController(), eventBus,
				new YourStartHerePlace());

		historyHandler.handleCurrentHistory();
	}
}

