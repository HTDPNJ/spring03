package com.hfut.mapper;

import com.hfut.pojo.Airport;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AirportMapper {
    @Select("select * from airport")
    List<Airport>selAll();
}
