package com.sd.springbootgqltest.repository;

import com.sd.springbootgqltest.model.DataItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author subha
 */
@Repository
public interface DataRepository extends JpaRepository<DataItem, Long>{}
