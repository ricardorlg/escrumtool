package co.edu.unal.avanzada.software.shared.actions;

import com.gwtplatform.dispatch.annotation.GenDispatch;
import com.gwtplatform.dispatch.annotation.In;
import com.gwtplatform.dispatch.annotation.Out;

@GenDispatch(isSecure = false)
public class Login {
	@In(1)
	String urlf;
	@Out(2)
	String out;
}
