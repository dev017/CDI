package ma.exemple.dao.impl;

import javax.enterprise.context.RequestScoped;

import ma.exemple.dao.IMessageDAO;

@RequestScoped
public class MessageDAOImpl implements IMessageDAO {

	public MessageDAOImpl() {
	}

	@Override
	public String getMessage() {
		return "Hello World DAO ...";
	}
}
