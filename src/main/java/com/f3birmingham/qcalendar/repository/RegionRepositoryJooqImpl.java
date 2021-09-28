package com.f3birmingham.qcalendar.repository;

import com.f3birmingham.qcalendar.database.tables.pojos.Region;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.f3birmingham.qcalendar.database.Tables.REGION;

public class RegionRepositoryJooqImpl implements RegionRepositoryJooq {
    @Autowired  DSLContext dslContext;

    @Override
    public List<Region> getRegions() {
        return this.dslContext.select().from(REGION).fetchInto(Region.class);
    }
}
