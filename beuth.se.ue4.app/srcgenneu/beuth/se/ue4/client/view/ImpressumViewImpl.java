
package beuth.se.ue4.client.view;

//import AbstractView
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ImpressumViewImpl extends AbstractView implements ImpressumView {
	private static ImpressumViewImplUiBinder uiBinder = GWT
			.create(ImpressumViewImplUiBinder.class);

	interface ImpressumViewImplUiBinder extends UiBinder<Widget, ImpressumViewImpl> {
		// TODO Generated by GWT
	}
2invalid
	
	private Presenter presenter;

	@Inject
	public ImpressumViewImpl() {
		content.add(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(final Presenter presenter) {
		this.presenter = presenter;
	}
}
