/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.sql.Date;
import java.util.Map;

public class EmployeeFactory {

  // prevent direct instantiation - this is an all-static factory class
  private EmployeeFactory() {
  }

  /**
   * TODO: given the input map, create and return the correct object (with its properties set).
   * If the input map's "type" value is not "HE" or "SE", throw IllegalArgumentException with a suitable message.
   */
  public static Employee createEmployee(Map<String, String> inputMap)
      throws IllegalArgumentException {
    // return value
    Employee emp = null;
    String type= inputMap.get("type");
    if (!inputMap.get("type").equals("SE") || !inputMap.get("type").equals("HE")) {
      throw new IllegalArgumentException("Employee must be hourly or salary");
    }else {
      String nameOfEmployee = inputMap.get("name");
      Date hireDateOfEmployee = Date.valueOf(inputMap.get("hireDate"));
    }
    //OUR CODE GOES HERE
    // TODO: 9/26/2022 if type is not equal to HE or SE, then throw illegalArgExcept
    // TODO: 9/26/2022 read the name and hire date from input map. All values are strings
    // TODO: 9/26/2022 if equal to HE or SE then read and parse rate/hours and salary inputMap 
    // TODO: 9/26/2022 create and return an insatnce of hourly/salary emp with values read 

    return emp;
  }
}