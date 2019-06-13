package com.hfut.service.impl;

import com.hfut.mapper.AirportMapper;
import com.hfut.pojo.Airport;
import com.hfut.service.AirportService;

import java.util.List;

public class AirportServiceImpl implements AirportService {
    private AirportMapper airportMapper;

    public AirportMapper getAirportMapper() {
        return airportMapper;
    }

    public void setAirportMapper(AirportMapper airportMapper) {
        this.airportMapper = airportMapper;
    }

    @Override
    public List<Airport> show() {

        List<Airport>list= airportMapper.selAll();
        System.out.println(list);
        return list;
    }
}
