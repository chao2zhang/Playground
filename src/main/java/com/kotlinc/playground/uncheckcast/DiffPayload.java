package com.kotlinc.playground.uncheckcast;

import org.jetbrains.annotations.Nullable;

public interface DiffPayload<T> {
  @Nullable
  T getItem(int position);
}
