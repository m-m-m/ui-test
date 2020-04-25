/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import io.github.mmm.base.lang.ToStringFormatter;
import io.github.mmm.ui.api.widget.input.UiRadioChoice;

/**
 * Implementation of {@link UiRadioChoice} for testing.
 *
 * @param <V> type of the {@link #getValue() value} and {@link #getOptions() option}.
 * @since 1.0.0
 */
public class TestRadioChoice<V> extends TestInput<V> implements UiRadioChoice<V> {

  private List<V> options;

  private Function<V, String> formatter;

  /**
   * The constructor.
   */
  public TestRadioChoice() {

    super();
    this.options = Collections.emptyList();
    this.formatter = ToStringFormatter.get();
  }

  @Override
  public List<V> getOptions() {

    return this.options;
  }

  @Override
  public void setOptions(List<V> options) {

    if (options == null) {
      options = Collections.emptyList();
    }
    this.options = options;
  }

  @Override
  public void setValue(V value, boolean forUser) {

    if ((value == null) || this.options.contains(value)) {
      super.setValue(value, forUser);
    }
  }

  @Override
  public Function<V, String> getFormatter() {

    return this.formatter;
  }

  @Override
  public void setFormatter(Function<V, String> formatter) {

    if (formatter == null) {
      this.formatter = ToStringFormatter.get();
    } else {
      this.formatter = formatter;
    }
  }

}
