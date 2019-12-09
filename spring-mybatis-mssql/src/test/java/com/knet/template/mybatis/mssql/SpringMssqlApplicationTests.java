package com.knet.template.mybatis.mssql;

import com.knet.template.mybatis.mssql.dto.Table1Dto;
import com.knet.template.mybatis.mssql.mapper.Table1Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author 한승룡
 * @since 2019-12-09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMssqlApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	Table1Mapper table1Mapper;

	@Test
	public void test() throws SQLException {
		System.out.println("----------------------------");

		System.out.println(dataSource.getConnection().getCatalog());

		Table1Dto table1Dto = new Table1Dto();
		table1Dto.setId(4);
		table1Dto.setVal1(4);
		table1Dto.setVal2(4);

		table1Mapper.add(table1Dto);

		for (Table1Dto table1Dto1 : table1Mapper.getAll()) {
			System.out.println(table1Dto1.getId());
		}

		System.out.println("----------------------------");
	}

}
