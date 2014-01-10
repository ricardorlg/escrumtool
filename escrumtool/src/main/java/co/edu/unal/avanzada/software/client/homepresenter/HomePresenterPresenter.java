package co.edu.unal.avanzada.software.client.homepresenter;

import co.edu.unal.avanzada.software.client.layoutpresenter.LayoutPresenterPresenter;
import co.edu.unal.avanzada.software.client.place.NameTokens;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;

public class HomePresenterPresenter
		extends
		Presenter<HomePresenterPresenter.MyView, HomePresenterPresenter.MyProxy> {
	interface MyView extends View {
	}

	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_HomePresenter = new Type<RevealContentHandler<?>>();

	@NameToken(NameTokens.home)
	@ProxyCodeSplit
	public interface MyProxy extends ProxyPlace<HomePresenterPresenter> {
	}

	@Inject
	public HomePresenterPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy,
				LayoutPresenterPresenter.SLOT_LayoutPresenter);

	}

}
