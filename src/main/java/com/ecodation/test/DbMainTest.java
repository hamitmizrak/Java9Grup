package com.ecodation.test;

import com.ecodation.utils.DatabaseConnectionDb;

public class DbMainTest {

	public static void main(String[] args) {
		DatabaseConnectionDb connectionDb = new DatabaseConnectionDb();
		connectionDb.getConnection();
	}
}

// user yanlışsa
// java.sql.SQLException: Access denied for user 'root44'@'localhost' (using password: YES)

// passworrd yanlışsa
// java.sql.SQLException: Access denied for user 'root'@'localhost' (using password: YES)

// port yanlışsa
// com.mysql.jdbc.exceptions.jdbc4.CommunicationsException: Communications link failure

// mysql yanlış girilmişse
// java.sql.SQLException: No suitable driver found for
// jdbc:mysql44://localhost:3306/hastane_otomasyonu?useUnicode=yes&characterEncoding=UTF-8

// database adı yanlış girilmişse
// com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Unknown database 'hastane_otomasyonu44'
