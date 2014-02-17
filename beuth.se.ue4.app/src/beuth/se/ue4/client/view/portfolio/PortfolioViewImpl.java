package beuth.se.ue4.client.view.portfolio;

//import AbstractView
import beuth.se.ue4.client.common.AbstractView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class PortfolioViewImpl extends AbstractView implements PortfolioView {
	private static PortfolioViewImplUiBinder uiBinder = GWT
			.create(PortfolioViewImplUiBinder.class);

	interface PortfolioViewImplUiBinder extends UiBinder<Widget, PortfolioViewImpl> {
		// TODO Generated by GWT
			//Start of user code PortfolioViewImplUiBinder
			// TODO Auto generated Method
			//End of user code
	}
	//Start of user code Portfolio
	// TODO Auto generated Method



	
	private Presenter presenter;
	//End of user code
	@Inject
	public PortfolioViewImpl() {
		content.add(uiBinder.createAndBindUi(this));
		
			//Start of user code PortfolioViewImpl
			// TODO Auto generated Method
			//End of user code
	}

	@Override
	public void setPresenter(final Presenter presenter) {
		this.presenter = presenter;
	}
		//Start of user code Portfolio
		// TODO Auto generated Method
		//End of user code
}
