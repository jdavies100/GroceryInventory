package com.github.jdavies100.controller;

import com.github.jdavies100.model.Grocery;
import com.github.jdavies100.service.GroceryService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroceryController {

  private GroceryService service;

  @Autowired
  public GroceryController(GroceryService groceryService) {
    this.service = groceryService;
  }

  @PostMapping(value = "groceries")
  @ResponseStatus(HttpStatus.CREATED)
  public @ResponseBody
  List<Grocery> postGroceries(@RequestBody List<Grocery> groceries) {
    return service.saveGroceries(groceries);
  }
}
