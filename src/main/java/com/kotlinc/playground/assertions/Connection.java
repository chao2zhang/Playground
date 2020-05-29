package com.kotlinc.playground.assertions;

import java.util.ArrayList;
import java.util.List;


public class ConnectionManager {

  public List<String> getConnections(int i) {
    List<String> array = new ArrayList<>();
    for (int j = 0; j < i; j++) {
      array.add("Int" + j);
    }
    return array;
  }

  public String hello(int i) {
    if (i == 1) {
      return null;
    } else {
      return "112233";
    }
  }
}