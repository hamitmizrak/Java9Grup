package com.ecodation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.java.Log;
//import java.util.logging.Logger;

@Log
public class DatabaseConnectionDb {

	private String url = "jdbc:mysql://localhost:3306/hastane_otomasyonu?useUnicode=yes&characterEncoding=UTF-8";
	private String user = "root";
	private String password = "root";
	private Connection connection;

	// private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionDb.class.getName());

	// connection
	public Connection getConnection() {
		try {
			if (this.connection == null || this.connection.isClosed()) {
				Class.forName("com.mysql.jdbc.Driver");
				// System.out.println("Driver yüklendi");
				log.info("Driver yüklendi");
				connection = DriverManager.getConnection(url, user, password);
				// System.out.println("Bağlantı kuruldu");
				log.info("Bağlantı kuruldu");
			} else {
				return connection;
			}
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
			log.warning("errors !!!! more errors" + DatabaseConnectionDb.class);
			log.warning("date" + NowDateUtil.DateUtil());
		}
		return connection;
	}

}
