package beuth.se.ue4.client.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface FooterView extends IsWidget {
	public interface Presenter {
	
		public void onButtonClicked(String buttonName);
			//Start of user code Footer
			// TODO Auto generated Method
			//End of user code

	}

	void setPresenter(Presenter presenter);
		//Start of user code Footer
		// TODO Auto generated Method
		//End of user code
}
