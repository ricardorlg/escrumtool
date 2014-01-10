package co.edu.unal.avanzada.software.client.layoutpresenter;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import co.edu.unal.avanzada.software.client.homepresenter.HomePresenterModule;
import co.edu.unal.avanzada.software.client.menu.MenuModule;

public class LayoutPresenterModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		install(new MenuModule());
		install(new HomePresenterModule());
		bindPresenter(LayoutPresenterPresenter.class,
				LayoutPresenterPresenter.MyView.class,
				LayoutPresenterView.class,
				LayoutPresenterPresenter.MyProxy.class);
	}
}
