package com.david.vitali.www.web.main.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.david.vitali.www.domain.model.User;

/**
 * User API RestController.
 * 
 * @author rapalisv Date: 01.08.2017
 *
 */
@RestController
@RequestMapping("api/users")
public class UserRestController {
  
  /**
   * Create User.
   * 
   * @param User user
   * @return User user
   */
  @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = {"application/json"})
  public User createUser(@RequestBody User user) {
    return null;
  }
}
