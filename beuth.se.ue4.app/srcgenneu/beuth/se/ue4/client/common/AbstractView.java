package beuth.se.ue4.client.common;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class AbstractView implements IsWidget {
	protected LayoutPanel content;

	public AbstractView() {
		content = new LayoutPanel();
		content.getElement().getStyle().setWidth(/*width here*/, Unit.PC);
		content.getElement().getStyle().setHeight(/*height here*/, Unit.PC);
	}

	@Override
	public Widget asWidget() {
		return content;
	}

}
