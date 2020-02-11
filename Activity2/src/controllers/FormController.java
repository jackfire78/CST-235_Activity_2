package controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped

public class FormController {

	public String onSubmit() {
		
		//Get user managed bean
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		//Forward to test response view
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
		
		return "TestResponse.xhtml";
		
	}
	
	public String onFlash(User user) {
		FacesContext context = FacesContext.getCurrentInstance();
		user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		//Forward to test response view
		//FacesContext.getCurrentInstance().getExternalContext().getRequestMap().getFlash().put("user", user);
		//.getSessionMap().put("user", user);
		
		return "TestResponse.xhtml?faces-redirect=true";
	}
	
	
	
	
}
