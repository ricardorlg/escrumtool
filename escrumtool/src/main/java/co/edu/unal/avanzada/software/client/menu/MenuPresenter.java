package co.edu.unal.avanzada.software.client.menu;

import co.edu.unal.avanzada.software.shared.actions.LoginAction;
import co.edu.unal.avanzada.software.shared.actions.LoginResult;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.sencha.gxt.widget.core.client.info.Info;

public class MenuPresenter extends PresenterWidget<MenuPresenter.MyView>
		implements MenuUiHandlers {
	public interface MyView extends View, HasUiHandlers<MenuUiHandlers> {
	}

	private DispatchAsync dispatcher;

	@Inject
	MenuPresenter(EventBus eventBus, MyView view,DispatchAsync dispatcher) {
		super(eventBus, view);
this.dispatcher=dispatcher;
		getView().setUiHandlers(this);
	}

	@Override
	public void sayHello() {
		LoginAction s=new LoginAction("Aaa");
		dispatcher.execute(s, new AsyncCallback<LoginResult>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(LoginResult result) {
				Info.display("Prueba", result.getOut());
				
			}
		});
	}

}
