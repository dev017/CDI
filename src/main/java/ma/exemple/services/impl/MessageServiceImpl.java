package ma.exemple.services.impl;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import ma.exemple.dao.IMessageDAO;
import ma.exemple.services.IMessageService;

@RequestScoped
public class MessageServiceImpl implements IMessageService {

	public MessageServiceImpl() {
	}

	@Inject
	private IMessageDAO dao;

	@Override
	public String getMessage() {
		return dao.getMessage();
	}

	public void setDao(IMessageDAO dao) {
		this.dao = dao;
	}

}
