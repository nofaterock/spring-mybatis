package com.nofaterock.mybatis.mssql.mapper;

import com.nofaterock.mybatis.mssql.dto.Table1Dto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 한승룡
 * @since 2019-02-14
 */
@Mapper
public interface Table1Mapper {

	void add(Table1Dto table1Dto);

	List<Table1Dto> getAll();

}
