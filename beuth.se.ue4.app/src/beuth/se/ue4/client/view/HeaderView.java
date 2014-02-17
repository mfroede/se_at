package beuth.se.ue4.client.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface HeaderView extends IsWidget {
	public interface Presenter {
	
				public void onProjectsClicked();
				public void onToNewsClicked();
				public void onToImpressumClicked();
				public void onToPortfolioClicked();
				public void onToHomeClicked();
			//Start of user code Header
			// TODO Auto generated Method
			//End of user code

	}

	void setPresenter(Presenter presenter);
		//Start of user code Header
		// TODO Auto generated Method
		//End of user code
}
