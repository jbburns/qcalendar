package com.f3birmingham.qcalendar.repository;

import com.f3birmingham.qcalendar.database.tables.pojos.Pax;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PaxRepository extends CrudRepository<Pax,Integer> {

    Pax getByF3Name(String name);
}
