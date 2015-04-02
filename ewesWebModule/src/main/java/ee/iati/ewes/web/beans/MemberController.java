package ee.iati.ewes.web.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import ee.iati.ewes.dto.DTOUser;
import ee.iati.ewes.ejb.ManagementBean;

@Model
public class MemberController {

	@EJB private ManagementBean mgtSvc;
	@Inject private FacesContext facesContext;

	private DTOUser newMember;
	private DTOUser member;

	@Named public DTOUser getNewMember() {
		return newMember;
	}

	@Named public DTOUser getMember() {
		return member;
	}

	public void setMember(DTOUser member) {
		this.member = member;
	}

	@PostConstruct
	public void initNewMember() {
		newMember = new DTOUser();
	}

	public void register() throws Exception {
		try {
			//memberRegistration.register(newMember);
			FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Registered!", "Registration successful");
			facesContext.addMessage(null, m);
			initNewMember();
		} catch (Exception e) {
			String errorMessage = getRootErrorMessage(e);
			FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					errorMessage, "Registration unsuccessful");
			facesContext.addMessage(null, m);
		}
	}

	private String getRootErrorMessage(Exception e) {
		// Default to general error message that registration failed.
		String errorMessage = "Registration failed. See server log for more information";
		if (e == null) {
			// This shouldn't happen, but return the default messages
			return errorMessage;
		}

		// Start with the exception and recurse to find the root cause
		Throwable t = e;
		while (t != null) {
			// Get the message from the Throwable class instance
			errorMessage = t.getLocalizedMessage();
			t = t.getCause();
		}
		// This is the root cause message
		return errorMessage;
	}

}
