package com.david.vitali.www.web.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.david.vitali.www.domain.model.User;
import com.david.vitali.www.persistance.service.UserService;

/**
 * User API RestController.
 * 
 * @author rapalisv Date: 01.08.2017
 *
 */
@RestController
@RequestMapping("api/users")
@CrossOrigin(origins="http://localhost:8080")
public class UserRestController {
  @Autowired
  private UserService userService;

  /**
   * Create User.
   * 
   * @param User user
   * @return User user
   */
  @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = {"application/json"})
  public ResponseEntity<User> createUser(@RequestBody User user) {
    try {
      user = userService.createUser(user);
      return new ResponseEntity<User>(user, HttpStatus.CREATED);
    } catch (Exception ex) {
      return new ResponseEntity<User>(user, HttpStatus.EXPECTATION_FAILED);
    }
  }
}
