package com.f3birmingham.qcalendar.repository;

import com.f3birmingham.qcalendar.database.tables.pojos.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RegionRepository extends CrudRepository<Region,Integer>, RegionRepositoryJooq {

    Region getByName(String name);
}
