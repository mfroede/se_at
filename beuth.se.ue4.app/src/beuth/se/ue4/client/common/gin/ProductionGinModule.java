package beuth.se.ue4.client.common.gin;

import javax.inject.Singleton;

import beuth.se.ue4.client.common.ActivityMapperImpl;
import beuth.se.ue4.client.view.FooterView;
import beuth.se.ue4.client.view.FooterViewImpl;
import beuth.se.ue4.client.view.HeaderView;
import beuth.se.ue4.client.view.HeaderViewImpl;
import beuth.se.ue4.client.view.HomeView;
import beuth.se.ue4.client.view.HomeViewImpl;
import beuth.se.ue4.client.view.ImpressumView;
import beuth.se.ue4.client.view.ImpressumViewImpl;
import beuth.se.ue4.client.view.NewsView;
import beuth.se.ue4.client.view.NewsViewImpl;
import beuth.se.ue4.client.view.PortfolioView;
import beuth.se.ue4.client.view.PortfolioViewImpl;
import beuth.se.ue4.client.view.ProjectsView;
import beuth.se.ue4.client.view.ProjectsViewImpl;

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
		//Start of user code beuth.se.ue4.Portfolio
		// TODO Auto generated Method
		bind(HomeView.class);
		bind(NewsView.class).to(NewsViewImpl.class).in(Singleton.class);
		bind(PortfolioView.class).to(PortfolioViewImpl.class).in(Singleton.class);
		bind(ImpressumView.class).to(ImpressumViewImpl.class).in(Singleton.class);
		bind(ProjectsView.class).to(ProjectsViewImpl.class).in(Singleton.class);
		bind(HeaderView.class).to(HeaderViewImpl.class).in(Singleton.class);
		bind(HomeView.class).to(HomeViewImpl.class).in(Singleton.class);
		bind(FooterView.class).to(FooterViewImpl.class).in(Singleton.class);
		//End of user code
	}
}
