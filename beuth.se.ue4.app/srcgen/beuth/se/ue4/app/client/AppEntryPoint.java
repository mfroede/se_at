package beuth.se.ue4.app.client;

import beuth.se.ue4.app.client.common.AppPlaceHistoryMapper;
import beuth.se.ue4.app.client.gin.AppGinjector;
import beuth.se.ue4.app.client.modules.start.StartPlace;
import org.fusesource.restygwt.client.Defaults;

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
	static {
		// if you don't do this, on JSON response you'll get something like
		// this:
		// "Could not parse response: org.fusesource.restygwt.client.ResponseFormatException: Response was NOT a valid JSON document"
		Defaults.setDateFormat(null);
	}

	@Override
	public void onModuleLoad() {

		AppGinjector injector = GWT.create(AppGinjector.class);
		EventBus eventBus = injector.getEventBus();

		ActivityMapper activityMapper = injector.getActivityMapper();

		SimplePanel content = new SimplePanel();
		ActivityManager contentActivityManager = new ActivityManager(
				activityMapper, eventBus);
		contentActivityManager.setDisplay(content);

		ActivityMapper activityMapper2 = injector
				.getNavigationViewActivityMapper();
		SimplePanel navigation = new SimplePanel();

		ActivityManager contentActivityManager2 = new ActivityManager(
				activityMapper2, eventBus);
		contentActivityManager2.setDisplay(navigation);

		RootPanel.get().add(navigation);
		RootPanel.get().add(content);

		AppPlaceHistoryMapper historyMapper = GWT
				.create(AppPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(
				historyMapper);
		historyHandler.register(injector.getPlaceController(), eventBus,
				new StartPlace());

		historyHandler.handleCurrentHistory();
	}
}

