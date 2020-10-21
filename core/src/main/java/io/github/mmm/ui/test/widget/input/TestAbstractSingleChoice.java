/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import io.github.mmm.ui.api.widget.input.UiAbstractSingleChoice;
import io.github.mmm.ui.api.widget.input.UiRadioChoice;

/**
 * Implementation of {@link UiRadioChoice} for testing.
 *
 * @param <V> type of the {@link #getValue() value} and {@link #getOptions() options}.
 * @since 1.0.0
 */
public class TestAbstractSingleChoice<V> extends TestAbstractChoice<V, V> implements UiAbstractSingleChoice<V> {

  /**
   * The constructor.
   */
  public TestAbstractSingleChoice() {

    super();
  }

  @Override
  public void setValue(V value, boolean forUser) {

    if ((value == null) || this.options.contains(value)) {
      super.setValue(value, forUser);
    }
  }

}
