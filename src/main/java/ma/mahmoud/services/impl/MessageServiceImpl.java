package ma.mahmoud.services.impl;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import ma.mahmoud.dao.IMessageDAO;
import ma.mahmoud.services.IMessageService;

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
