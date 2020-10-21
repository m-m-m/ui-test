/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import io.github.mmm.ui.api.widget.input.UiComboBox;

/**
 * Implementation of {@link UiComboBox} for testing.
 *
 * @param <V> type of the {@link #getValue() value} and {@link #getOptions() option}.
 * @since 1.0.0
 */
public class TestComboBox<V> extends TestAbstractSingleChoice<V> implements UiComboBox<V> {

  private String autocomplete;

  /**
   * The constructor.
   */
  public TestComboBox() {

    super();
  }

  @Override
  public String getAutocomplete() {

    return this.autocomplete;
  }

  @Override
  public void setAutocomplete(String autocomplete) {

    this.autocomplete = autocomplete;
  }

}
