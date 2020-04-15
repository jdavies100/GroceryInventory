package com.github.jdavies100.service.impl;

import com.github.jdavies100.model.Grocery;
import com.github.jdavies100.repository.GroceryRepository;
import com.github.jdavies100.service.GroceryService;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryServiceImpl implements GroceryService {

  private GroceryRepository repository;

  @Autowired
  public GroceryServiceImpl(GroceryRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Grocery> saveGroceries(List<Grocery> groceries) {
    return (List<Grocery>) repository.saveAll(groceries);
  }
}
