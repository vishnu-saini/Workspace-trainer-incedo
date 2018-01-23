package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

	@Mapper
	public interface BookMapper {
	
	  @Select("SELECT * FROM Book") //SQL
	  List<Book> findAll( );
	
	  @Select("SELECT * FROM Book WHERE author = #{author}")
	  List<Book> findByAuthor(@Param("author") String author);
	
	}

