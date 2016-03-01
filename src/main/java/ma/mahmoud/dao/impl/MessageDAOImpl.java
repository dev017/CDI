package ma.mahmoud.dao.impl;

import javax.enterprise.context.RequestScoped;

import ma.mahmoud.dao.IMessageDAO;

@RequestScoped
public class MessageDAOImpl implements IMessageDAO {

	public MessageDAOImpl() {
	}

	@Override
	public String getMessage() {
		return "Hello World DAO ...";
	}
}
