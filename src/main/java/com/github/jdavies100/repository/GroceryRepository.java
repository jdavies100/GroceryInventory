package com.github.jdavies100.repository;

import com.github.jdavies100.model.Grocery;
import java.util.ArrayList;
import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryRepository extends CrudRepository<Grocery, String> {

}
