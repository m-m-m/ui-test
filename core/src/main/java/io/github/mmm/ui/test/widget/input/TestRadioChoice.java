/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import io.github.mmm.ui.api.widget.input.UiRadioChoice;

/**
 * Implementation of {@link UiRadioChoice} for testing.
 *
 * @param <V> type of the {@link #getValue() value} and {@link #getOptions() option}.
 * @since 1.0.0
 */
public class TestRadioChoice<V> extends TestAbstractSingleChoice<V> implements UiRadioChoice<V> {

  /**
   * The constructor.
   */
  public TestRadioChoice() {

    super();
  }

}
