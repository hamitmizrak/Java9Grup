package com.ecodation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ecodation.dto.RegisterDto;
import com.ecodation.utils.IAllDbConnection;
import com.ecodation.utils.NowDateUtil;

import lombok.extern.java.Log;

@Log
public class RegisterDao implements IAllDbConnection<RegisterDto> {

	// insert delete update =executeUpdate();

	@Override
	public void create(RegisterDto registerDto) {
		try (Connection connection = getInterfaceConnection()) {
			connection.setAutoCommit(false);
			String sql = "insert admin8 (register_name,register_surname,register_email_address,register_password) values (?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, registerDto.getRegisterName());
			preparedStatement.setString(2, registerDto.getRegisterSurname());
			preparedStatement.setString(3, registerDto.getRegisterEmailAddress());
			preparedStatement.setString(4, registerDto.getRegisterPassword());
			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				log.info(RegisterDto.class + " ekleme yapıldı");
				connection.commit();
			} else {
				log.warning(RegisterDto.class + " ekleme yapılmadı !!!!!!" + NowDateUtil.DateUtil());
				connection.rollback();
				connection.setAutoCommit(true);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			log.warning(RegisterDto.class + " ekleme yapılmadı !!!!!!" + NowDateUtil.DateUtil());
			// throw.e;
		}

	}

	@Override
	public void update(RegisterDto registerDto) {
		try (Connection connection = getInterfaceConnection()) {
			connection.setAutoCommit(false);
			String sql = "update admin8 set register_name=?,register_surname=?,register_email_address=?,register_password=? where register_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, registerDto.getRegisterName());
			preparedStatement.setString(2, registerDto.getRegisterSurname());
			preparedStatement.setString(3, registerDto.getRegisterEmailAddress());
			preparedStatement.setString(4, registerDto.getRegisterPassword());
			preparedStatement.setLong(5, registerDto.getRegisterId());

			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				log.info(RegisterDto.class + " güncelleme yapıldı");
				connection.commit();
			} else {
				log.warning(RegisterDto.class + " güncelleme yapılmadı !!!!!!" + NowDateUtil.DateUtil());
				connection.rollback();
				connection.setAutoCommit(true);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			log.warning(RegisterDto.class + " güncelleme yapılmadı !!!!!!" + NowDateUtil.DateUtil());
		}

	}

	@Override
	public void delete(RegisterDto registerDto) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "delete from admin8 where register_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, registerDto.getRegisterId());

			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				log.info(RegisterDto.class + " silme yapıldı");
				// connection.commit();
			} else {
				log.warning(RegisterDto.class + " silme yapılmadı !!!!!!" + NowDateUtil.DateUtil());
				// connection.rollback();
				// connection.setAutoCommit(true);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			log.warning(RegisterDto.class + " silme yapılmadı !!!!!!" + NowDateUtil.DateUtil());

		}

	}

	@Override
	public ArrayList<RegisterDto> list() {
		ArrayList<RegisterDto> registerList = new ArrayList<>();
		RegisterDto registerDto = new RegisterDto();
		try (Connection connection = getInterfaceConnection()) {
			String sql = "select * from admin8";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				registerDto.setRegisterId(resultSet.getLong("register_id"));
				registerDto.setRegisterName(resultSet.getString("register_name"));
				registerDto.setRegisterPassword(resultSet.getString("register_password"));
				registerDto.setRegisterSurname(resultSet.getString("register_surname"));
				registerDto.setRegisterEmailAddress(resultSet.getString("register_email_address"));
				registerDto.setCreationDate(resultSet.getDate("creation_Date"));
				registerList.add(registerDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			log.warning(RegisterDto.class + " listeleme yapılmadı !!!!!!" + NowDateUtil.DateUtil());

		}
		return registerList;
	}

}
