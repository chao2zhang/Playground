package com.kotlinc.playground.assertions;

import org.jetbrains.annotations.Nullable;


public class ConnectionManager {

  @Nullable
  public Connection connection(int i) {
    if (i == 1) {
      return null;
    } else {
      return new Connection(i);
    }

  }
}