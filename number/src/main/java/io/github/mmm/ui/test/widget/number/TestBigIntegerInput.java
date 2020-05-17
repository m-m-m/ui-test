/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.test.widget.number;

import java.math.BigInteger;

import io.github.mmm.base.number.NumberType;
import io.github.mmm.ui.api.widget.number.UiBigIntegerInput;

/**
 * Implementation of {@link UiBigIntegerInput} for testing.
 *
 * @since 1.0.0
 */
public class TestBigIntegerInput extends TestNumberInput<BigInteger> implements UiBigIntegerInput {

  /**
   * The constructor.
   */
  public TestBigIntegerInput() {

    super();
  }

  @Override
  protected NumberType<BigInteger> getNumberType() {

    return NumberType.BIG_INTEGER;
  }

}
