package beuth.se.ue4.client.common.gin;

import javax.inject.Singleton;

import beuth.se.ue4.client.common.ActivityMapperImpl;
import beuth.se.ue4.client.view.NewsView;
import beuth.se.ue4.client.view.ActualNewsViewImpl;
import beuth.se.ue4.client.view.AboutView;
import beuth.se.ue4.client.view.AboutViewImpl;
import beuth.se.ue4.client.view.MyHeaderView;
import beuth.se.ue4.client.view.MyHeaderViewImpl;
import beuth.se.ue4.client.view.NewsView;
import beuth.se.ue4.client.view.TestNewsViewImpl;
import beuth.se.ue4.client.view.HomeView;
import beuth.se.ue4.client.view.HomeViewImpl;
import beuth.se.ue4.client.view.MyFooterView;
import beuth.se.ue4.client.view.MyFooterViewImpl;
import beuth.se.ue4.client.view.PortfolioView;
import beuth.se.ue4.client.view.PortfolioViewImpl;
import beuth.se.ue4.client.view.ImpressumView;
import beuth.se.ue4.client.view.ImpressumViewImpl;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

public class ProductionGinModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(PlaceController.class).toProvider(PlaceControllerProvider.class)
				.in(Singleton.class);
		bind(ActivityMapperImpl.class).in(Singleton.class);

		bind(YourStartHereActivity.class);

		bind(NewsView.class).to(ActualNewsViewImpl.class).in(Singleton.class);
		bind(AboutView.class).to(AboutViewImpl.class).in(Singleton.class);
		bind(MyHeaderView.class).to(MyHeaderViewImpl.class).in(Singleton.class);
		// bind(NewsView.class).to(TestNewsViewImpl.class).in(Singleton.class);
		bind(HomeView.class).to(HomeViewImpl.class).in(Singleton.class);
		bind(MyFooterView.class).to(MyFooterViewImpl.class).in(Singleton.class);
		bind(PortfolioView.class).to(PortfolioViewImpl.class).in(Singleton.class);
		bind(ImpressumView.class).to(ImpressumViewImpl.class).in(Singleton.class);
	}
}
