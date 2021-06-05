package com.ecodation.utils;

import java.sql.Connection;
import java.util.ArrayList;

public interface IAllDbConnection<T> {

	// CRUD
	public void create(T t);

	public void update(T t);

	public void delete(T t);

	public ArrayList<T> list();

	default Connection getInterfaceConnection() {
		DatabaseConnectionDb connectionDb = new DatabaseConnectionDb();
		return connectionDb.getConnection();
	}

}
