/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget;

import io.github.mmm.ui.api.widget.input.UiInput;
import io.github.mmm.ui.api.widget.value.UiValuedWidget;

/**
 * Implementation of {@link UiInput} using JavaFx.
 *
 * @param <V> type of {@link #getValue() value}.
 * @since 1.0.0
 */
public abstract class TestValuedWidget<V> extends TestActiveWidget implements UiValuedWidget<V> {

  private V value;

  /**
   * The constructor.
   */
  public TestValuedWidget() {

    super();
  }

  @Override
  public V getValue() {

    return this.value;
  }

  @Override
  public void setValue(V value) {

    this.value = value;
  }

}
