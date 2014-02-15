package beuth.se.ue4.client.view;

import com.google.gwt.user.client.ui.IsWidget;

public class MyHeaderView extends IsWidget {
	public interface Presenter {

				void onHomeClicked();
				void onAboutClicked();
				void onNewsClicked();
				void onPortfolioClicked();

	}

	void setPresenter(Presenter presenter);

}
