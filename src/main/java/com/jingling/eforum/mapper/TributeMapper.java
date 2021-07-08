package com.jingling.eforum.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TributeMapper {
    public int ins(@Param("type") String type, @Param("name") String name, @Param("people") String people,
                   @Param("phone") String phone,@Param("email") String email, @Param("foru") String foru, @Param("product") String product) ;
}
