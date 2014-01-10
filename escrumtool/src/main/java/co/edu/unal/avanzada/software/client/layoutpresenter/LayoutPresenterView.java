package co.edu.unal.avanzada.software.client.layoutpresenter;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.sencha.gxt.widget.core.client.container.NorthSouthContainer;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;

public class LayoutPresenterView extends ViewImpl implements
		LayoutPresenterPresenter.MyView {
	interface Binder extends UiBinder<Widget, LayoutPresenterView> {
	}

	@UiField
	SimpleContainer contenedor;
	@UiField
	NorthSouthContainer headerContainer;

	@Inject
	public LayoutPresenterView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == LayoutPresenterPresenter.SLOT_LayoutPresenter) {
			if (content != null) {
				contenedor.clear();
				contenedor.add(content);
				contenedor.forceLayout();

			}
		} else if (slot == LayoutPresenterPresenter.HeaderSlot) {
			if (content != null) {
				if (headerContainer.getSouthWidget() != null) {
					headerContainer.setSouthWidget(null);
				}
				headerContainer.setSouthWidget(content);

			}
		}

		else {
			super.setInSlot(slot, content);
		}
	}
}
