package co.edu.unal.avanzada.software.client.layoutpresenter;

import co.edu.unal.avanzada.software.client.menu.MenuPresenter;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;

public class LayoutPresenterPresenter
		extends
		Presenter<LayoutPresenterPresenter.MyView, LayoutPresenterPresenter.MyProxy> {
	interface MyView extends View {
	}

	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_LayoutPresenter = new Type<RevealContentHandler<?>>();
	@ContentSlot
	public static final Type<RevealContentHandler<?>> HeaderSlot = new Type<RevealContentHandler<?>>();

	@ProxyCodeSplit
	public interface MyProxy extends Proxy<LayoutPresenterPresenter> {
	}

	@Inject
	public LayoutPresenterPresenter(EventBus eventBus, MyView view,
			MyProxy proxy, MenuPresenter menu) {
		super(eventBus, view, proxy, RevealType.RootLayout);
		setInSlot(HeaderSlot, menu);
	}

}
