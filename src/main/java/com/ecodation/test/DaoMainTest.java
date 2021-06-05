package com.ecodation.test;

import java.util.ArrayList;

import com.ecodation.dao.RegisterDao;
import com.ecodation.dto.RegisterDto;

public class DaoMainTest {

	public static void main(String[] args) {
		RegisterDto registerDto = new RegisterDto();
		registerDto.setRegisterEmailAddress("hamitmizrak@gmail.com");
		registerDto.setRegisterName("Hamit 44");
		registerDto.setRegisterPassword("123456");
		registerDto.setRegisterSurname("Mızrak");

		RegisterDao dao = new RegisterDao();

		// ekleme
		// dao.create(dto);

		// güncelleme
		// registerDto.setRegisterId(1L);
		// dao.update(registerDto);

		// silme
		// registerDto.setRegisterId(4L);
		// dao.delete(registerDto);

		ArrayList<RegisterDto> list = dao.list();
		for (RegisterDto dto : list) {
			System.out.println(dto);
		}

	}

}
