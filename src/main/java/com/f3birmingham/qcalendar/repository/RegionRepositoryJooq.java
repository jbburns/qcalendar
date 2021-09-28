package com.f3birmingham.qcalendar.repository;

import com.f3birmingham.qcalendar.database.tables.pojos.Region;

import java.util.List;

public interface RegionRepositoryJooq {

    List<Region> getRegions();
}
