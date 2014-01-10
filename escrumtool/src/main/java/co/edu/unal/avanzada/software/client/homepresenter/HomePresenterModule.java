package co.edu.unal.avanzada.software.client.homepresenter;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class HomePresenterModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		bindPresenter(HomePresenterPresenter.class,
				HomePresenterPresenter.MyView.class, HomePresenterView.class,
				HomePresenterPresenter.MyProxy.class);
	}
}
