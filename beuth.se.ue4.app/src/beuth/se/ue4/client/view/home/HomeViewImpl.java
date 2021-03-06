package beuth.se.ue4.client.view.home;

//import AbstractView
import beuth.se.ue4.client.common.AbstractView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class HomeViewImpl extends AbstractView implements HomeView {
	private static HomeViewImplUiBinder uiBinder = GWT
			.create(HomeViewImplUiBinder.class);

	interface HomeViewImplUiBinder extends UiBinder<Widget, HomeViewImpl> {
		// TODO Generated by GWT
			//Start of user code HomeViewImplUiBinder
			// TODO Auto generated Method
			//End of user code
	}
	//Start of user code Home
	// TODO Auto generated Method

	
	private Presenter presenter;
	//End of user code
	@Inject
	public HomeViewImpl() {
		content.add(uiBinder.createAndBindUi(this));
		
			//Start of user code HomeViewImpl
		
			//End of user code
	}

	@Override
	public void setPresenter(final Presenter presenter) {
		this.presenter = presenter;
	}
		//Start of user code Home
		// TODO Auto generated Method
		//End of user code
}
