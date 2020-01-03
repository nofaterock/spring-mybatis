package com.nofaterock.mybatis.h2.mapper;

import com.nofaterock.mybatis.h2.dto.Table1Dto;
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
