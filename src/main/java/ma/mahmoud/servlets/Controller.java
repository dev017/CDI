package ma.mahmoud.servlets;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ma.mahmoud.services.IMessageService;

@Named("controller")
@RequestScoped
public class Controller {

	@Inject
	private IMessageService messageService;

	private String message;

	@PostConstruct
	public void init() {
		message = messageService.getMessage();
	}

	// GETTERS AND SETTERS
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessageService(IMessageService messageService) {
		this.messageService = messageService;
	}

}
