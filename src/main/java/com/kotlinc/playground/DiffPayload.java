package com.kotlinc.playground;

import org.jetbrains.annotations.Nullable;

public interface DiffPayload<T> {
  @Nullable
  T getItem(int position);
}
