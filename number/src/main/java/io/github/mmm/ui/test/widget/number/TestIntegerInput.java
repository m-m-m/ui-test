/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.number;

import io.github.mmm.base.number.NumberType;
import io.github.mmm.ui.api.widget.number.UiIntegerInput;

/**
 * Implementation of {@link UiIntegerInput} for testing.
 *
 * @since 1.0.0
 */
public class TestIntegerInput extends TestNumberInput<Integer> implements UiIntegerInput {

  /**
   * The constructor.
   */
  public TestIntegerInput() {

    super();
  }

  @Override
  protected NumberType<Integer> getNumberType() {

    return NumberType.INTEGER;
  }

}
