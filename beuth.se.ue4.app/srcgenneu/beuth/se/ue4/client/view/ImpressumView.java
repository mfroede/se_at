package beuth.se.ue4.client.view;

import com.google.gwt.user.client.ui.IsWidget;

public class ImpressumView extends IsWidget {
	public interface Presenter {

				void onButtonClicked(String buttonName);

	}

	void setPresenter(Presenter presenter);

}
