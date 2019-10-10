package com.kotlinc.playground.uncheckcast;

import org.jetbrains.annotations.Nullable;

public interface ListUpdateCallback {

  void onInserted(int position, int count);
  void onRemoved(int position, int count);
  void onMoved(int fromPosition, int toPosition);
  void onChanged(int position, int count, @Nullable Object payload);
}
