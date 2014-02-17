package beuth.se.ue4.client.common;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class AbstractView implements IsWidget {
	protected LayoutPanel content;

	public AbstractView() {
		content = new LayoutPanel();
		//Start of user code beuth.se.ue4.Portfolio
		// TODO Auto generated Method
		content.getElement().getStyle().setWidth(80, Unit.PC);
		content.getElement().getStyle().setHeight(30, Unit.PC);
		//End of user code
	}

	@Override
	public Widget asWidget() {
		return content;
	}

}
