package com.github.jdavies100.service;

import com.github.jdavies100.model.Grocery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public interface GroceryService {

  List<Grocery> saveGroceries(List<Grocery> groceries);
}
