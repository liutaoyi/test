package com.example.test.service;

import com.example.test.entity.Location;

import java.util.List;

public interface LocationService {
    Location add(Location location);

    List queryAll();
}
