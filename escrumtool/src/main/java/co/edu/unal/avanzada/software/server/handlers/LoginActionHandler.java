package co.edu.unal.avanzada.software.server.handlers;

import co.edu.unal.avanzada.software.shared.actions.LoginAction;
import co.edu.unal.avanzada.software.shared.actions.LoginResult;

import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

public class LoginActionHandler implements
		ActionHandler<LoginAction, LoginResult> {

	@Override
	public LoginResult execute(LoginAction action, ExecutionContext context)
			throws ActionException {
		// TODO Auto-generated method stub
		return new LoginResult("Prueba hermano");
	}

	@Override
	public Class<LoginAction> getActionType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void undo(LoginAction action, LoginResult result,
			ExecutionContext context) throws ActionException {
		// TODO Auto-generated method stub

	}

}
