/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.number;

import io.github.mmm.base.number.NumberType;
import io.github.mmm.ui.api.widget.number.UiDoubleInput;

/**
 * Implementation of {@link UiDoubleInput} for testing.
 *
 * @since 1.0.0
 */
public class TestDoubleInput extends TestNumberInput<Double> implements UiDoubleInput {

  /**
   * The constructor.
   */
  public TestDoubleInput() {

    super();
  }

  @Override
  protected NumberType<Double> getNumberType() {

    return NumberType.DOUBLE;
  }

}
