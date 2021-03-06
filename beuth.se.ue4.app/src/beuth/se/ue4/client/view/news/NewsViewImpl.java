package beuth.se.ue4.client.view.news;

//import AbstractView
import beuth.se.ue4.client.common.AbstractView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class NewsViewImpl extends AbstractView implements NewsView {
	private static NewsViewImplUiBinder uiBinder = GWT
			.create(NewsViewImplUiBinder.class);

	interface NewsViewImplUiBinder extends UiBinder<Widget, NewsViewImpl> {
		// TODO Generated by GWT
			//Start of user code NewsViewImplUiBinder
			// TODO Auto generated Method
			//End of user code
	}
	//Start of user code News
	// TODO Auto generated Method

	
	private Presenter presenter;
	//End of user code
	@Inject
	public NewsViewImpl() {
		content.add(uiBinder.createAndBindUi(this));
		
			//Start of user code NewsViewImpl
		HTML html = new HTML("<div><h1>Brandhei&szlig;e News</h1>"
							+"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet."
							+"<div/>");
		content.add(html);
			//End of user code
	}

	@Override
	public void setPresenter(final Presenter presenter) {
		this.presenter = presenter;
	}
		//Start of user code News
		// TODO Auto generated Method
		//End of user code
}
