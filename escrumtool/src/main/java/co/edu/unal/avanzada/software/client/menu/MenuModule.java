package co.edu.unal.avanzada.software.client.menu;

import co.edu.unal.avanzada.software.client.resources.Resources;

import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MenuModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		bind(Resources.class).in(Singleton.class);
		bindPresenterWidget(MenuPresenter.class, MenuPresenter.MyView.class,
				MenuView.class);
	}
}
