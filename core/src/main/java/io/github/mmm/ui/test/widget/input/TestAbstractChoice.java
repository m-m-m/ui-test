/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.input;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import io.github.mmm.base.lang.ToStringFormatter;
import io.github.mmm.ui.api.widget.input.UiAbstractChoice;
import io.github.mmm.ui.api.widget.input.UiRadioChoice;
import io.github.mmm.ui.spi.DefaultFormatter;

/**
 * Implementation of {@link UiRadioChoice} for testing.
 *
 * @param <O> type of the {@link #getOptions() option}.
 * @param <V> type of the {@link #getValue() value}.
 * @since 1.0.0
 */
public class TestAbstractChoice<O, V> extends TestInput<V> implements UiAbstractChoice<O, V> {

  /** @see #getOptions() */
  protected List<O> options;

  private Function<O, String> formatter;

  /**
   * The constructor.
   */
  public TestAbstractChoice() {

    super();
    this.options = Collections.emptyList();
    this.formatter = ToStringFormatter.get();
  }

  @Override
  public List<O> getOptions() {

    return this.options;
  }

  @Override
  public void setOptions(List<O> options) {

    if (options == null) {
      options = Collections.emptyList();
    }
    this.options = options;
  }

  @Override
  public Function<O, String> getFormatter() {

    return this.formatter;
  }

  @Override
  public void setFormatter(Function<O, String> formatter) {

    if (formatter == null) {
      this.formatter = DefaultFormatter.get();
    } else {
      this.formatter = formatter;
    }
  }

}
