package com.f3birmingham.qcalendar.repository;

import com.f3birmingham.qcalendar.database.tables.pojos.Ao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AoRepository extends CrudRepository<Ao,Integer> {

}
