/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import io.github.mmm.ui.api.widget.input.UiTextualInput;

/**
 * Implementation of {@link UiTextualInput} for testing.
 *
 * @param <V> type of {@link #getValue() value}.
 * @since 1.0.0
 */
public abstract class TestTextualInput<V> extends TestInput<V> implements UiTextualInput<V> {

  private String autocomplete;

  /**
   * The constructor.
   */
  public TestTextualInput() {

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
