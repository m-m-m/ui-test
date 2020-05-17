/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.number;

import io.github.mmm.base.number.NumberType;
import io.github.mmm.ui.api.widget.number.UiLongInput;

/**
 * Implementation of {@link UiLongInput} for testing.
 *
 * @since 1.0.0
 */
public class TestLongInput extends TestNumberInput<Long> implements UiLongInput {

  /**
   * The constructor.
   */
  public TestLongInput() {

    super();
  }

  @Override
  protected NumberType<Long> getNumberType() {

    return NumberType.LONG;
  }

}
