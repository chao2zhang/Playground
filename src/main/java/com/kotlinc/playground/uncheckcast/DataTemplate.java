package com.kotlinc.playground.uncheckcast;

import org.jetbrains.annotations.Nullable;

public interface DataTemplate<T extends DataTemplate<T>> {
  @Nullable
  T accept();

  @Nullable
  String id();
}
